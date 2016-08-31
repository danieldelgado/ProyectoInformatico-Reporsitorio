package com.hitss.rev.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.NoSuchSolicitudRequerimientoException;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.impl.PostulacionImpl;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.rev.bean.OfertalLaboral;
import com.hitss.rev.service.PostularOfertaLaboralService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleResource;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portlet.journal.service.JournalArticleResourceLocalServiceUtil;

@Service("postularOfertaLaboralService")
public class PostularOfertaLaboralServiceImpl extends RevServiceImpl implements PostularOfertaLaboralService {

	private static Log _log = LogFactoryUtil.getLog(PostularOfertaLaboralServiceImpl.class);

	@Autowired
	private SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService;
	
	@Override
	public List<OfertalLaboral> getListaOfertaLaboral(long company,
			long groupId, long userId) {
		_log.info("getListaOfertaLaboral");
		List<OfertalLaboral>  lista = new ArrayList<OfertalLaboral>();		
		try {
			JournalArticle journalArticleObj =null;		
			JournalArticleResource journalArticleResourceObj=null;	
			OfertalLaboral ofertalLaboral = null;	
			List<SolicitudRequerimiento> listaSolicitudRequerimientos = SolicitudRequerimientoLocalServiceUtil.listaSolicitudRequerimiento(null, null, null, 0, 0, null, null);
			_log.info("listaSolicitudRequerimientos");
			_log.info(listaSolicitudRequerimientos);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			if(!listaSolicitudRequerimientos.isEmpty()){
				String journalArticulePublicacion = null;
				for (SolicitudRequerimiento solicitudRequerimiento : listaSolicitudRequerimientos) {
					journalArticulePublicacion = solicitudRequerimiento.getContenidoId();
					_log.info("journalArticulePublicacion:"+journalArticulePublicacion);
					if(Validator.isNotNull(journalArticulePublicacion)){						
						journalArticleResourceObj = JournalArticleResourceLocalServiceUtil.getJournalArticleResource(Long.valueOf(journalArticulePublicacion));
						journalArticleObj= JournalArticleLocalServiceUtil.getArticlesByResourcePrimKey(journalArticleResourceObj.getResourcePrimKey()).get(0);
						ofertalLaboral = new OfertalLaboral();
						ofertalLaboral.setTitulo(journalArticleObj.getTitleCurrentValue());
						ofertalLaboral.setStrFechaCreado(sdf.format(journalArticleObj.getModifiedDate()));
						ofertalLaboral.setResumen(journalArticleObj.getDescription());
						ofertalLaboral.setSolicitudreclutamiento(solicitudRequerimiento.getSolicitudRequerimientoId());
						ofertalLaboral.setJournalArticuleId(Long.valueOf(journalArticulePublicacion));
						lista.add(ofertalLaboral);
					}
				}
			}			
		} catch (SystemException  | NumberFormatException | PortalException e) {
			_log.error("Error al getListaOfertaLaboral " + e.getMessage(), e);
		}
		return lista;
	}

	@Override
	public void postularOferta(Long articulo, User user) {		
		Boolean colaborador = (Boolean) user.getExpandoBridge().getAttribute("Colaborador");
		System.out.println(colaborador);		
		try {
			SolicitudRequerimiento s = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimientoByContenido(articulo);
			if(Validator.isNotNull(s)){
				Postulacion p = new PostulacionImpl();
				p.setSolicitudRequerimientoId(s.getSolicitudRequerimientoId());
				p.setUsuarioId(user.getUserId());
				p.setFechaPostulacion(new Date());
				p.setEstado(Constantes.PARAMETRO_ESTADO_POSTULADO);
				p.setNew(false);
				p.setActivo(true);
				p.setUsuariomodifica(user.getUserId());
				p.setFechamodifica(new Date());
				p.setUsuariocrea(user.getUserId());
				p.setFechacrea(new Date());
				
				PostulacionLocalServiceUtil.addPostulacion(p);
			}
		
			
		} catch (NoSuchSolicitudRequerimientoException | SystemException e) {
			_log.error("Error al postularOferta " + e.getMessage(), e);
		}
	}

	
	
}
