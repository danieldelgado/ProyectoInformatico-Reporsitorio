package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.dools.ExpertoRevApi;
import com.hitss.rev.service.SeleccionarPersonalService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.RevServiceImpl;
import com.hitss.rev.util.Util;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

@Service("SeleccionarPersonalService")
public class SeleccionarPersonalServiceImpl extends RevServiceImpl implements SeleccionarPersonalService {

	private static Log _log = LogFactoryUtil.getLog(SeleccionarPersonalServiceImpl.class);

	@Autowired
	private ExpertoRevApi expertoRevApi;
	
	@Override
	public void selectPersonal() {
		expertoRevApi.test();
		
	}

	@Override
	public List<UsuarioBean> getListaPostulantes(long companyId,
			long companyGroupId, Long solicitudRequerimientoId) {
		_log.info("getListaPostulantes");
		
		List<UsuarioBean> lstReturn = new ArrayList<UsuarioBean>();
		try {
			List<Postulacion> lst = PostulacionLocalServiceUtil.listaPostulacionedsSolicitud(solicitudRequerimientoId);
			
			if (!lst.isEmpty()) {
				long[] userIds = new long[lst.size()];
				for (int i = 0; i < lst.size(); i++) {
					userIds[i] = lst.get(i).getUsuarioId();
				}
				if (userIds != null) {
					List<Usuario> lstUsuariosPostulantes = UsuarioLocalServiceUtil.findByUsuariosSeleccionados(userIds);
					if (!lstUsuariosPostulantes.isEmpty()) {						
						User user = null;
						UsuarioBean usuarioBean = null;
						Postulacion post = null;
						FasePostulacion fase = null;
						for (Usuario usuario : lstUsuariosPostulantes) {
							user = UserLocalServiceUtil.getUser(usuario.getUserId());
							for (Postulacion postulacion : lst) {
								if (postulacion.getUsuarioId() == usuario.getUserId()) {
									post = postulacion;
								}
							}							
							usuarioBean = new UsuarioBean();
							usuarioBean.setUserId(usuario.getUserId());
							usuarioBean.setFullname(user.getFullName());
							Boolean colaborador = (Boolean) user.getExpandoBridge().getAttribute("Colaborador");
							usuarioBean.setInterno(colaborador?"Si":"No");
							Date disponibildad = (Date) user.getExpandoBridge().getAttribute("Disponibilidad");
							usuarioBean.setDisponibilidad(Util.getStrFecha(disponibildad));							
							usuarioBean.setFechaPostulacion(Util.getStrFecha(post.getFechaPostulacion()));

							_log.info("solicitudRequerimientoId:"+solicitudRequerimientoId);
							_log.info("post.getSolicitudRequerimientoId():"+post.getSolicitudRequerimientoId());
							_log.info("usuario.getUserId():"+usuario.getUserId());							
//							fase = FasePostulacionLocalServiceUtil.getLastPostulacion(post.getSolicitudRequerimientoId(), usuario.getUserId());							
							long estado_parametro_id = Constantes.PARAMETRO_ESTADO_POSTULADO;
							FasePostulacion fp = null;
							fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(), Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
							if (Validator.isNotNull(fp)) {
								if(fp.isAsistio()){
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
									fase = fp;
								}
							}
							
							fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(), Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
							if (Validator.isNotNull(fp)) {
								if(fp.isAsistio()){
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
									fase = fp;
								}
							}
							
							fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(), Constantes.PARAMETRO_FASE_TECNICA);
							if (Validator.isNotNull(fp)) {
								if(fp.isAsistio()){
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
									fase = fp;
								}
							}
							
							fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);

							usuarioBean.setSolicitudId(post.getSolicitudRequerimientoId());
							
							if (Validator.isNotNull(fase)) {
								System.out.println(estado_parametro_id);
								System.out.println(parametroService.getParametro(estado_parametro_id).getValor());
								usuarioBean.setFasePostulacion(parametroService.getParametro(fase.getTipoFase()).getValor());
								usuarioBean.setEstado(parametroService.getParametro(estado_parametro_id).getValor());
							} else {
								usuarioBean.setFasePostulacion(StringPool.BLANK);
								usuarioBean.setEstado(parametroService.getParametro(Constantes.PARAMETRO_ESTADO_POSTULADO).getValor());
							}
							lstReturn.add(usuarioBean);
						}
					}
				}
			}
		} catch (SystemException | PortalException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}
		_log.info("lstReturn:"+lstReturn);
		return lstReturn;
	}

	
	
	
}
