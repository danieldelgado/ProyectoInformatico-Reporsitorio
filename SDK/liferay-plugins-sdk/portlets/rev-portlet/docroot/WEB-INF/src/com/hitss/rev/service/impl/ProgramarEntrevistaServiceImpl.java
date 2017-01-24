package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.model.impl.FasePostulacionImpl;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.layer.service.persistence.PostulacionPK;
import com.hitss.rev.bean.FasePostulacionBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.ProgramarEntrevistaService;
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

@Service("ProgramarEntrevistaService")
public class ProgramarEntrevistaServiceImpl extends RevServiceImpl implements ProgramarEntrevistaService {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);

	@Override
	public List<UsuarioBean> getListaPostulantes(long companyId, long companyGroupId, Long solicitudRequerimientoId) {

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
						FasePostulacion fp = null;
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
							usuarioBean.setInterno(colaborador ? "Si" : "No");
							Date disponibildad = (Date) user.getExpandoBridge().getAttribute("Disponibilidad");
							usuarioBean.setDisponibilidad(Util.getStrFecha(disponibildad));
							usuarioBean.setFechaPostulacion(Util.getStrFecha(post.getFechaPostulacion()));

							_log.info("solicitudRequerimientoId:" + solicitudRequerimientoId);
							_log.info("post.getSolicitudRequerimientoId():" + post.getSolicitudRequerimientoId());
							_log.info("usuario.getUserId():" + usuario.getUserId());
							// fase =
							// FasePostulacionLocalServiceUtil.getLastPostulacion(post.getSolicitudRequerimientoId(),
							// usuario.getUserId());
							long estado_parametro_id = Constantes.PARAMETRO_ESTADO_POSTULADO;
							fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(),
									Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
							if (Validator.isNotNull(fp)) {
								if (!fp.isAsistio()) {
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA;
									fase = fp;
								}
							}

							fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(),
									Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
							if (Validator.isNotNull(fp)) {
								if (!fp.isAsistio()) {
									estado_parametro_id = Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR;
									fase = fp;
								}
							}

							fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(), Constantes.PARAMETRO_FASE_TECNICA);
							if (Validator.isNotNull(fp)) {
								if (!fp.isAsistio()) {
									estado_parametro_id = Constantes.PARAMETRO_FASE_TECNICA;
									fase = fp;
								}
							}
							fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, usuario.getUserId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);
							if (Validator.isNotNull(fp)) {
								if (!fp.isAsistio()) {
									estado_parametro_id = Constantes.PARAMETRO_FASE_PSICOLOGICA;
									fase = fp;
								}
							}

							usuarioBean.setSolicitudId(post.getSolicitudRequerimientoId());

							if (Validator.isNotNull(fase)) {
								// System.out.println(estado_parametro_id);
								// System.out.println(parametroService.getParametro(estado_parametro_id).getValor());
								usuarioBean.setFasePostulacion(parametroService.getParametro(fase.getTipoFase()).getValor());
								usuarioBean.setEstado(parametroService.getParametro(estado_parametro_id).getValor());
							} else {
								usuarioBean.setFasePostulacion(StringPool.BLANK);
								usuarioBean.setEstado(parametroService.getParametro(Constantes.PARAMETRO_ESTADO_POSTULADO).getValor());
							}
							fase = null;
							fp = null;
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

	@Override
	public FasePostulacionBean getFasePsicologia(Long solicitudId, Long userId) {
		return getFasePostualcion(solicitudId, userId, Constantes.PARAMETRO_FASE_PSICOLOGICA);
	}

	@Override
	public FasePostulacionBean getFaseTecnica(Long solicitudId, Long userId) {
		return getFasePostualcion(solicitudId, userId, Constantes.PARAMETRO_FASE_TECNICA);
	}

	@Override
	public FasePostulacionBean getFaseEntreCoodRRHH(Long solicitudId, Long userId) {
		return getFasePostualcion(solicitudId, userId, Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
	}

	@Override
	public FasePostulacionBean getFaseEntreGerenteArea(Long solicitudId, Long userId) {
		return getFasePostualcion(solicitudId, userId, Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
	}

	private FasePostulacionBean getFasePostualcion(Long solicitudId, Long userId, long parametroFase) {
		FasePostulacion f = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, userId, parametroFase);
		if (Validator.isNotNull(f)) {
			FasePostulacionBean fp = new FasePostulacionBean();
			fp.setFasepostulacionId(f.getFasePostulacionId());
			fp.setSolicitudRequerimientoId(f.getSolicitudRequerimientoId());
			fp.setUsuarioId(f.getUsuarioId());
			fp.setTipoFase(f.getTipoFase());
			fp.setFechaFase(f.getFechacrea());
			fp.setStrfechaFase(Util.getStrFecha(f.getFechaFase()));
			fp.setEstado(f.getEstado());
			fp.setStrestado(parametroService.getParametro(f.getEstado()).getValor());
			fp.setPuntuacion(f.getPuntuacion());
			fp.setApruebaFase(f.isApruebaFase());
			fp.setSalario(f.getSalario());
			return fp;
		}
		return null;
	}

	@Override
	public Map<String, Object> guardarProgramacionEntevista(Long solicitudId, Long userId, User user, Boolean addEvaluaciones, FasePostulacionBean fasePsicologia,
			FasePostulacionBean faseTecnica, FasePostulacionBean faseEntreCoordRRHH, FasePostulacionBean faseEntreGerenteArea) {

		Map<String, Object> result = new HashMap<String, Object>();
		try {
			User u = UserLocalServiceUtil.getUser(userId);
			Boolean colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");
			SolicitudRequerimiento sRequerimiento = null;
			if (Validator.isNotNull(solicitudId)) {
				_log.info("guardarProgramacionEntevista addEvaluaciones:" + addEvaluaciones + " colaborador:" + colaborador);
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudId);

				long estado_parametro_id = Constantes.PARAMETRO_ESTADO_POSTULADO;

				FasePostulacion fp = null;
				fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, userId, Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
				if (Validator.isNotNull(fp)) {
					if (fp.isAsistio()) {
						estado_parametro_id = fp.getEstado();
					}
					if (fp.getEstado() == Constantes.PARAMETRO_ESTADO_POSTULADO || fp.getEstado() == Constantes.PARAMETRO_ESTADO_CANCELADO) {
						fp.setFechaFase(faseEntreGerenteArea.getFechaFase());
						fp.setActivo(true);
						fp.setUsuariomodifica(user.getUserId());
						fp.setFechamodifica(new Date());
						fp.setNew(false);
						FasePostulacionLocalServiceUtil.updateFasePostulacion(fp);
					}
				} else {
					fp = new FasePostulacionImpl();
					fp.setTipoFase(Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
					fp.setApruebaFase(false);
					fp.setUsuarioId(userId);
					fp.setNew(true);
					fp.setSolicitudRequerimientoId(solicitudId);
					fp.setEstado(Constantes.PARAMETRO_ESTADO_POSTULADO);
					fp.setFechaFase(faseEntreGerenteArea.getFechaFase());
					fp.setActivo(true);
					fp.setUsuariocrea(user.getUserId());
					fp.setUsuariomodifica(user.getUserId());
					fp.setFechacrea(new Date());
					fp.setFechamodifica(new Date());
					FasePostulacionLocalServiceUtil.addFasePostulacion(fp);
				}

				fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, userId, Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
				if (Validator.isNotNull(fp)) {
					if (fp.isAsistio()) {
						estado_parametro_id = fp.getEstado();
					}
					if (fp.getEstado() == Constantes.PARAMETRO_ESTADO_POSTULADO || fp.getEstado() == Constantes.PARAMETRO_ESTADO_CANCELADO) {
						fp.setFechaFase(faseEntreCoordRRHH.getFechaFase());
						fp.setActivo(true);
						fp.setUsuariomodifica(user.getUserId());
						fp.setFechamodifica(new Date());
						fp.setNew(false);
						FasePostulacionLocalServiceUtil.updateFasePostulacion(fp);
					}
				} else {
					fp = new FasePostulacionImpl();
					fp.setTipoFase(Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
					fp.setApruebaFase(false);
					fp.setUsuarioId(userId);
					fp.setNew(true);
					fp.setSolicitudRequerimientoId(solicitudId);
					fp.setEstado(Constantes.PARAMETRO_ESTADO_POSTULADO);
					fp.setFechaFase(faseEntreCoordRRHH.getFechaFase());
					fp.setActivo(true);
					fp.setUsuariocrea(user.getUserId());
					fp.setUsuariomodifica(user.getUserId());
					fp.setFechacrea(new Date());
					fp.setFechamodifica(new Date());
					FasePostulacionLocalServiceUtil.addFasePostulacion(fp);
				}
				if (!colaborador || addEvaluaciones) {
					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, userId, Constantes.PARAMETRO_FASE_TECNICA);
					if (Validator.isNotNull(fp)) {
						if (fp.isAsistio()) {
							estado_parametro_id = fp.getEstado();
						}
						if (fp.getEstado() == Constantes.PARAMETRO_ESTADO_POSTULADO || fp.getEstado() == Constantes.PARAMETRO_ESTADO_CANCELADO) {
							fp.setFechaFase(faseTecnica.getFechaFase());
							fp.setActivo(true);
							fp.setUsuariomodifica(user.getUserId());
							fp.setFechamodifica(new Date());
							fp.setNew(false);
							FasePostulacionLocalServiceUtil.updateFasePostulacion(fp);
						}
					} else {
						fp = new FasePostulacionImpl();
						fp.setTipoFase(Constantes.PARAMETRO_FASE_TECNICA);
						fp.setApruebaFase(false);
						fp.setUsuarioId(userId);
						fp.setNew(true);
						fp.setSolicitudRequerimientoId(solicitudId);
						fp.setEstado(Constantes.PARAMETRO_ESTADO_POSTULADO);
						fp.setFechaFase(faseTecnica.getFechaFase());
						fp.setActivo(true);
						fp.setUsuariocrea(user.getUserId());
						fp.setUsuariomodifica(user.getUserId());
						fp.setFechacrea(new Date());
						fp.setFechamodifica(new Date());
						FasePostulacionLocalServiceUtil.addFasePostulacion(fp);
					}
				}

				if (!colaborador || addEvaluaciones) {
					fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, userId, Constantes.PARAMETRO_FASE_PSICOLOGICA);
					if (Validator.isNotNull(fp)) {
						if (fp.isAsistio()) {
							estado_parametro_id = fp.getEstado();
						}
						if (fp.getEstado() == Constantes.PARAMETRO_ESTADO_POSTULADO || fp.getEstado() == Constantes.PARAMETRO_ESTADO_CANCELADO) {
							fp.setFechaFase(fasePsicologia.getFechaFase());
							fp.setActivo(true);
							fp.setUsuariomodifica(user.getUserId());
							fp.setFechamodifica(new Date());
							fp.setNew(false);
							FasePostulacionLocalServiceUtil.updateFasePostulacion(fp);
						}
					} else {
						fp = new FasePostulacionImpl();
						fp.setTipoFase(Constantes.PARAMETRO_FASE_PSICOLOGICA);
						fp.setApruebaFase(false);
						fp.setUsuarioId(userId);
						fp.setNew(true);
						fp.setSolicitudRequerimientoId(solicitudId);
						fp.setEstado(Constantes.PARAMETRO_ESTADO_POSTULADO);
						fp.setFechaFase(fasePsicologia.getFechaFase());
						fp.setActivo(true);
						fp.setUsuariocrea(user.getUserId());
						fp.setUsuariomodifica(user.getUserId());
						fp.setFechacrea(new Date());
						fp.setFechamodifica(new Date());
						FasePostulacionLocalServiceUtil.addFasePostulacion(fp);
					}

				}
				PostulacionPK postulacionPK = new PostulacionPK(solicitudId, userId);
				Postulacion postulacion = PostulacionLocalServiceUtil.getPostulacion(postulacionPK);
				postulacion.setEstado(estado_parametro_id);
				postulacion.setActivo(true);
				postulacion.setUsuariomodifica(user.getUserId());
				postulacion.setFechamodifica(new Date());
				PostulacionLocalServiceUtil.updatePostulacion(postulacion);

				sRequerimiento.setFechamodifica(new Date());
				sRequerimiento.setUsuariomodifica(user.getUserId());
				sRequerimiento.setEstado(Constantes.PARAMETRO_EVALUACION);
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sRequerimiento);

				SolicitudRequerimientoBean solicitudRequerimiento = getSolicitudRequerimiento(solicitudId);

				result.put("respuesta", Constantes.TRANSACCION_OK);
				result.put("objeto", solicitudRequerimiento);
				result.put("mensaje",
						PropiedadMensaje.getMessage(PortletProps.get("solicitud.reclutamiento.actualizado"), String.valueOf(sRequerimiento.getSolicitudRequerimientoId())));

			}

		} catch (SystemException | PortalException e) {
			_log.error("Error al guardar " + e.getMessage(), e);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PortletProps.get("portal.transaccion.error"));
		}
		return result;
	}
}