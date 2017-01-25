package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.layer.service.persistence.PostulacionPK;
import com.hitss.rev.bean.PostulacionBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.dools.ExpertoRevApi;
import com.hitss.rev.dools.impl.LogTraza;
import com.hitss.rev.dools.impl.Traza;
import com.hitss.rev.service.SeleccionarPersonalService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.PropiedadMensaje;
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
import com.liferay.util.portlet.PortletProps;

@Service("SeleccionarPersonalService")
public class SeleccionarPersonalServiceImpl extends RevServiceImpl implements SeleccionarPersonalService {

	private static Log _log = LogFactoryUtil.getLog(SeleccionarPersonalServiceImpl.class);

	@Autowired
	private ExpertoRevApi expertoRevApi;

	@Override
	public void selectPersonal() {
//		expertoRevApi.test();

	}

	@Override
	public List<UsuarioBean> getListaPostulantes(long companyId, long companyGroupId, Long solicitudRequerimientoId) {
		_log.info("getListaPostulantes");

		List<UsuarioBean> lstReturn = new ArrayList<UsuarioBean>();
		try {
			List<Postulacion> lst = PostulacionLocalServiceUtil.listaPostulacionedsSolicitud(solicitudRequerimientoId);
			System.out.println(lst);
			if (!lst.isEmpty()) {
				
				LogTraza.inicializar();
				PostulacionBean pstBean = null;
				List<PostulacionBean> lstAnalizado = expertoRevApi.analsisExperto(solicitudRequerimientoId, lst);
				List<Traza> listaList = LogTraza.getListaList();
				System.out.println(listaList);
				LogTraza.inicializar();
				
//				long[] userIds = new long[lst.size()];
//				for (int i = 0; i < lstAnalizado.size(); i++) {
//					userIds[i] = lstAnalizado.get(i).getUsuarioId();
//				}
				
				if (lstAnalizado != null) {
//					List<Usuario> lstUsuariosPostulantes = UsuarioLocalServiceUtil.findByUsuariosSeleccionados(userIds);					
					if (!lstAnalizado.isEmpty()) {
						User user = null;
						UsuarioBean usuarioBean = null;
						Postulacion post = null;
						FasePostulacion fase = null;
						for (PostulacionBean p : lstAnalizado) {
							user = UserLocalServiceUtil.getUser(p.getUsuarioId());
							for (Postulacion postulacion : lst) {
								if (postulacion.getUsuarioId() == p.getUsuarioId()) {
									post = postulacion;
								}
							}
							pstBean = getPostualcionAnalizada(p.getUsuarioId(),lstAnalizado);
							usuarioBean = new UsuarioBean();
							usuarioBean.setUserId(p.getUsuarioId());
							if(Validator.isNotNull(user.getFullName()) && !user.getFullName().equals("")){
								usuarioBean.setFullname(user.getFullName());
							}else{
								usuarioBean.setFullname(user.getFirstName() + " " + user.getLastName() );
							}
							
							
							Boolean colaborador = (Boolean) user.getExpandoBridge().getAttribute("Colaborador");
							usuarioBean.setInterno(colaborador ? "Si" : "No");
							Date disponibildad = (Date) user.getExpandoBridge().getAttribute("Disponibilidad");
							usuarioBean.setDisponibilidad(Util.getStrFecha(disponibildad));
							usuarioBean.setFechaPostulacion(Util.getStrFecha(post.getFechaPostulacion()));

							// long estado_parametro_id =
							// Constantes.PARAMETRO_ESTADO_POSTULADO;
							long estado_parametro_id = post.getEstado();

							FasePostulacion fp = null;
							try {
								fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, p.getUsuarioId(),
										Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
							} catch (Exception e) {
								_log.error("Error al getFasePostuacionByTipo " + e.getMessage(), e);
							}
							if (Validator.isNotNull(fp)) {
								if (fp.isAsistio()) {
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
									fase = fp;
								}
							}

							try {
								fp = null;
								fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, p.getUsuarioId(),
										Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
							} catch (Exception e) {
								_log.error("Error al getFasePostuacionByTipo " + e.getMessage(), e);
							}
							if (Validator.isNotNull(fp)) {
								if (fp.isAsistio()) {
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
									fase = fp;
								}
							}

							try {
								fp = null;
								fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, p.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
							} catch (Exception e) {
								_log.error("Error al getFasePostuacionByTipo " + e.getMessage(), e);
							}
							if (Validator.isNotNull(fp)) {
								if (fp.isAsistio()) {
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
									fase = fp;
								}
							}

							try {
								fase = null;
								fase = FasePostulacionLocalServiceUtil
										.getFasePostuacionByTipo(solicitudRequerimientoId, p.getUsuarioId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);
							} catch (Exception e) {
								_log.error("Error al getFasePostuacionByTipo " + e.getMessage(), e);
								estado_parametro_id = Constantes.PARAMETRO_ESTADO_POSTULADO;
							}
							usuarioBean.setSolicitudId(post.getSolicitudRequerimientoId());

							if (Validator.isNotNull(fase)) {
//								System.out.println(estado_parametro_id);
//								System.out.println(parametroService.getParametro(estado_parametro_id).getValor());
								usuarioBean.setFasePostulacion(parametroService.getParametro(fase.getTipoFase()).getValor());
								usuarioBean.setEstado(parametroService.getParametro(estado_parametro_id).getValor());
							} else {
								usuarioBean.setFasePostulacion(StringPool.BLANK);
								usuarioBean.setEstado(parametroService.getParametro(Constantes.PARAMETRO_ESTADO_POSTULADO).getValor());
							}
							if(pstBean!=null){
								usuarioBean.setCercania(pstBean.getCercania());
								usuarioBean.setDistanciaEuclidianaEntrevista(pstBean.getDistanciaEuclidianaEntrevista());
								usuarioBean.setDistanciaEuclidianaEntrevista(pstBean.getDistanciaEuclidianaEntrevista());
								usuarioBean.setDistanciaHammingEntrevista(pstBean.getDistanciaHammingEntrevista());
								usuarioBean.setDistanciaEuclidianaPsicologico( pstBean.getDistanciaEuclidianaPsicologico());
								usuarioBean.setDistanciaHammingPsicologico( pstBean.getDistanciaHammingPsicologico());
								usuarioBean.setDistanciaEuclidianaTecnico(pstBean.getDistanciaEuclidianaTecnico());
								usuarioBean.setDistanciaHammingTecnico(pstBean.getDistanciaHammingTecnico());
								usuarioBean.setRecomendableReqCum(pstBean.isRecomendableReqCum());
								usuarioBean.setPorcentajeReqCum(pstBean.getPorcentajeReqCum());
								usuarioBean.setRecomendableRequisitosCumplidoPorUsuario(pstBean.isRecomendableRequisitosCumplidoPorUsuario());
								usuarioBean.setPorcentajeRequisitosCumplidoPorUsuario( pstBean.getPorcentajeRequisitosCumplidoPorUsuario());
								if (pstBean.getPorcentajeReqCertiCum() > 0) {
									usuarioBean.setRecomendableReqCertiCum(pstBean.isRecomendableReqCertiCum());
									usuarioBean.setPorcentajeReqCertiCum(pstBean.getPorcentajeReqCertiCum());
									usuarioBean.setRecomendableCertificadoCumplidoPorUsuario(pstBean.isRecomendableCertificadoCumplidoPorUsuario());
									usuarioBean.setPorcentajeCertificadoCumplidoPorUsuario(pstBean.getPorcentajeCertificadoCumplidoPorUsuario());
								}
							}
							lstReturn.add(usuarioBean);
						}
					}
				}
			}
		} catch (SystemException | PortalException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}
		_log.info("lstReturn:" + lstReturn);
		return lstReturn;
	}

	private PostulacionBean getPostualcionAnalizada(long userId, List<PostulacionBean> lstAnalizado) {
		for (PostulacionBean postulacionBean : lstAnalizado) {
			if( userId == postulacionBean.getUsuarioId() ){
				return postulacionBean;
			}
		}
		return null;
	}

	@Override
	public Map<String, Object> seleccionarPostulaste(Long solicitudId, Long userId, User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		PostulacionPK postulacionPK = new PostulacionPK(solicitudId, userId);
		PostulacionBean pstbean = new PostulacionBean();
		try {
			Postulacion post = PostulacionLocalServiceUtil.getPostulacion(postulacionPK);
			if (Validator.isNotNull(post)) {
				post.setEstado(Constantes.PARAMETRO_ESTADO_TERMINADO);
				post.setUsuariomodifica(user.getUserId());
				post.setFechamodifica(new Date());
				post.setSeleccionado(true);
				post = PostulacionLocalServiceUtil.updatePostulacion(post);
				pstbean.setEstado(post.getEstado());
				pstbean.setFechaPostulacion(post.getFechaPostulacion());
				pstbean.setSolicitudId(solicitudId);
				pstbean.setUsuarioId(userId);
				result.put("objeto", pstbean);
				result.put("respuesta", Constantes.TRANSACCION_OK);
				result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("seleccionar.postulante.mensaje"), String.valueOf(pstbean.getSolicitudId())));
			}
		} catch (PortalException | SystemException e) {
			_log.error("Error al seleccionarPostulaste " + e.getMessage(), e);
			result.put("objeto", pstbean);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("seleccionar.postulante.error"), String.valueOf(pstbean.getSolicitudId())));
		}
		return result;
	}

}
