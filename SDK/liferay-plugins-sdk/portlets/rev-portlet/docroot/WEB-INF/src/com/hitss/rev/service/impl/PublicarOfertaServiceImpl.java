package com.hitss.rev.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.service.PublicarOfertaService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.PropiedadMensaje;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.util.portlet.PortletProps;

@Service("PublicarOfertaService")
public class PublicarOfertaServiceImpl  extends RevServiceImpl implements PublicarOfertaService {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);

	
	@Override
	public Map<String, Object> publicarOfertaLaboral(
			Long solicitudRequerimientoId, String descripcion, User user, boolean publicar ) {
		SolicitudRequerimientoBean solicitudRequerimientoBean = new SolicitudRequerimientoBean();	
		Map<String, Object> result = new HashMap<String, Object>();	
		try {
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimientoId);
			if(publicar){
				sr.setDescripcionPublicacion(descripcion);
				sr.setEstado(Constantes.PARAMETRO_PUBLICADO);
				result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("publicar.oferta.mensaje.publicar"), String.valueOf(sr.getSolicitudRequerimientoId())));
			}else{
				sr.setEstado(Constantes.PARAMETRO_FECHA_LIMITE_POSTULACION);		
				result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("publicar.oferta.mensaje.finalizar"), String.valueOf(sr.getSolicitudRequerimientoId())));		
			}
			sr.setFechamodifica(new Date());
			sr.setUsuariomodifica(user.getUserId());
			sr.setNew(false);
			SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sr);
			solicitudRequerimientoBean = getSolicitudRequerimiento(solicitudRequerimientoId);
			result.put("objeto", solicitudRequerimientoBean);
			result.put("respuesta", Constantes.TRANSACCION_OK);
			
		} catch (PortalException | SystemException e) {
			_log.error("Error al publicarOfertaLaboral " + e.getMessage(), e);
			result.put("objeto", solicitudRequerimientoBean);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("publicar.oferta.mensaje.error"), String.valueOf(solicitudRequerimientoBean.getSolicitudRequerimientoId())));
	
		}
		return result;
	}

	
}
