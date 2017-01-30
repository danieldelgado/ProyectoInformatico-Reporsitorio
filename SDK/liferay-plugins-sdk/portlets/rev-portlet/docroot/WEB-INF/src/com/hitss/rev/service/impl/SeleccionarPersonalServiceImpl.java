package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.Evaluacion;
import com.hitss.layer.model.Experiencia;
import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.UsuarioRequisito;
import com.hitss.layer.service.EvaluacionLocalServiceUtil;
import com.hitss.layer.service.ExperienciaLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.UsuarioRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.PostulacionPK;
import com.hitss.rev.bean.PostulacionBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.dools.ExpertoRevApi;
import com.hitss.rev.dools.impl.EvaluacionBean;
import com.hitss.rev.dools.impl.ExperienciaBean;
import com.hitss.rev.dools.impl.ExpertoRevApiImpl;
import com.hitss.rev.dools.impl.LogTraza;
import com.hitss.rev.dools.impl.RequisitoBean;
import com.hitss.rev.dools.impl.Traza;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.SeleccionarPersonalService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.PropiedadMensaje;
import com.hitss.rev.util.RevServiceImpl;
import com.hitss.rev.util.Util;
import com.liferay.counter.service.CounterLocalServiceUtil;
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

	// private static final int FasePostulacionPuestoEvaluacionBean = 0;

	private static Log _log = LogFactoryUtil.getLog(SeleccionarPersonalServiceImpl.class);

	@Autowired
	private ExpertoRevApi expertoRevApi;

	@Autowired
	private LiferayApiService liferayApiService;

	@Override
	public void selectPersonal() {
		// expertoRevApi.test();

	}

	@Override
	public List<UsuarioBean> getListaPostulantes(long companyId, long companyGroupId, Long solicitudRequerimientoId) {
		_log.info("getListaPostulantes");

		List<UsuarioBean> lstReturn = new ArrayList<UsuarioBean>();
		try {
			List<Postulacion> lst = PostulacionLocalServiceUtil.listaPostulacionedsSolicitud(solicitudRequerimientoId);
			Postulacion ppppp = null;
			System.out.println(lst);
			if (!lst.isEmpty()) {

				LogTraza.inicializar();
				PostulacionBean pstBean = null;
				List<PostulacionBean> lstAnalizado = expertoRevApi.analsisExperto(solicitudRequerimientoId, lst);
				// List<Traza> listaList = LogTraza.getListaList();
				LogTraza.inicializar();

				if (lstAnalizado != null) {
					if (!lstAnalizado.isEmpty()) {
						User user = null;
						UsuarioBean usuarioBean = null;
						Postulacion post = null;
						FasePostulacion fase = null;
						PostulacionPK postulacionPK  = null;
						for (PostulacionBean p : lstAnalizado) {
							user = UserLocalServiceUtil.getUser(p.getUsuarioId());
							for (Postulacion postulacion : lst) {
								if (postulacion.getUsuarioId() == p.getUsuarioId()) {
									post = postulacion;
								}
							}
							pstBean = getPostualcionAnalizada(p.getUsuarioId(), lstAnalizado);
							usuarioBean = new UsuarioBean();
							usuarioBean.setUserId(p.getUsuarioId());
							if (Validator.isNotNull(user.getFullName()) && !user.getFullName().equals("")) {
								usuarioBean.setFullname(user.getFullName());
							} else {
								usuarioBean.setFullname(user.getFirstName() + " " + user.getLastName());
							}

							postulacionPK = new PostulacionPK(solicitudRequerimientoId, p.getUsuarioId());
							ppppp = PostulacionLocalServiceUtil.getPostulacion(postulacionPK );
							
							Boolean colaborador = (Boolean) user.getExpandoBridge().getAttribute("Colaborador");
							usuarioBean.setInterno(colaborador ? "Si" : "No");
							Date disponibildad = (Date) user.getExpandoBridge().getAttribute("Disponibilidad");
							usuarioBean.setDisponibilidad(Util.getStrFecha(disponibildad));
							usuarioBean.setFechaPostulacion(Util.getStrFecha(post.getFechaPostulacion()));
							
							usuarioBean.setSeleccionado(ppppp.getSeleccionado());
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
								fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudRequerimientoId, p.getUsuarioId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);
							} catch (Exception e) {
								_log.error("Error al getFasePostuacionByTipo " + e.getMessage(), e);
								estado_parametro_id = Constantes.PARAMETRO_ESTADO_POSTULADO;
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
							if (pstBean != null) {
								usuarioBean.setCercania(pstBean.getCercania());
								usuarioBean.setDistanciaEuclidianaEntrevista(pstBean.getDistanciaEuclidianaEntrevista());
								usuarioBean.setDistanciaEuclidianaEntrevista(pstBean.getDistanciaEuclidianaEntrevista());
								usuarioBean.setDistanciaHammingEntrevista(pstBean.getDistanciaHammingEntrevista());
								usuarioBean.setDistanciaEuclidianaPsicologico(pstBean.getDistanciaEuclidianaPsicologico());
								usuarioBean.setDistanciaHammingPsicologico(pstBean.getDistanciaHammingPsicologico());
								usuarioBean.setDistanciaEuclidianaTecnico(pstBean.getDistanciaEuclidianaTecnico());
								usuarioBean.setDistanciaHammingTecnico(pstBean.getDistanciaHammingTecnico());
								usuarioBean.setRecomendableReqCum(pstBean.isRecomendableReqCum());
								usuarioBean.setPorcentajeReqCum(pstBean.getPorcentajeReqCum());
								usuarioBean.setRecomendableRequisitosCumplidoPorUsuario(pstBean.isRecomendableRequisitosCumplidoPorUsuario());
								usuarioBean.setPorcentajeRequisitosCumplidoPorUsuario(pstBean.getPorcentajeRequisitosCumplidoPorUsuario());
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
			if (userId == postulacionBean.getUsuarioId()) {
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

	@Override
	public UsuarioBean getPostulanteDetalle(Long solicitudId, Long userId) {
		UsuarioBean usuarioBean = null;
		try {
			PostulacionPK postulacionPK = new PostulacionPK(solicitudId, userId);
			Postulacion ps = PostulacionLocalServiceUtil.getPostulacion(postulacionPK);
			LogTraza.inicializar();
			PostulacionBean pstBean = null;
			List<Postulacion> lst = new ArrayList<Postulacion>();
			lst.add(ps);
			List<PostulacionBean> lstAnalizado = expertoRevApi.analsisExperto(solicitudId, lst);
			List<Traza> listaList = LogTraza.getListaList();
			LogTraza.inicializar();

			if (lstAnalizado != null) {
				if (!lstAnalizado.isEmpty()) {
					User user = null;
					usuarioBean = new UsuarioBean();
					Postulacion post = null;
					FasePostulacion fase = null;
					PostulacionBean p = lstAnalizado.get(0);
					user = UserLocalServiceUtil.getUser(p.getUsuarioId());
					for (Postulacion postulacion : lst) {
						if (postulacion.getUsuarioId() == p.getUsuarioId()) {
							post = postulacion;
						}
					}
					pstBean = getPostualcionAnalizada(p.getUsuarioId(), lstAnalizado);
					usuarioBean = new UsuarioBean();
					usuarioBean.setUserId(p.getUsuarioId());
					if (Validator.isNotNull(user.getFullName()) && !user.getFullName().equals("")) {
						usuarioBean.setFullname(user.getFullName());
					} else {
						usuarioBean.setFullname(user.getFirstName() + " " + user.getLastName());
					}
					Boolean colaborador = (Boolean) user.getExpandoBridge().getAttribute("Colaborador");
					usuarioBean.setInterno(colaborador ? "Si" : "No");
					Date disponibildad = (Date) user.getExpandoBridge().getAttribute("Disponibilidad");
					usuarioBean.setDisponibilidad(Util.getStrFecha(disponibildad));
					usuarioBean.setFechaPostulacion(Util.getStrFecha(post.getFechaPostulacion()));
					long estado_parametro_id = post.getEstado();

					List<ExperienciaBean> l = new ArrayList<ExperienciaBean>();

					List<Experiencia> expbean = ExperienciaLocalServiceUtil.getExperiencia(userId);
					ExperienciaBean ex = null;

					for (Experiencia experiencia : expbean) {
						ex = new ExperienciaBean();
						ex.setEmpresa(experiencia.getEmpresa());
						ex.setId(experiencia.getExperienciaId());
						ex.setTipoNegocioProyecto(experiencia.getTipoNegocio());
						ex.setFechaInicio(experiencia.getFechaInicio());
						ex.setFechaFin(experiencia.getFechaFin());
						l.add(ex);
					}
					usuarioBean.setListaExperienciaBean(l);

					List<RequisitoBean> listaRequisitoConocimientosBean = new ArrayList<RequisitoBean>();
					List<RequisitoBean> listaRequisitoCertificadoBean = new ArrayList<RequisitoBean>();
					List<UsuarioRequisito> urq = UsuarioRequisitoLocalServiceUtil.getUsuarioRequisito(userId);
					RequisitoBean requisitoBean = null;
					System.out.println("Conocimientos");
					for (UsuarioRequisito usuarioRequisito : urq) {
						if (usuarioRequisito.getTipoRequisito() == 66) {
							requisitoBean = new RequisitoBean(usuarioRequisito.getTagId(), usuarioRequisito.getTipoRequisito(), liferayApiService.getEtiqueta(
									usuarioRequisito.getTagId()).getValue(), ExpertoRevApiImpl.getValueAnnos(usuarioRequisito.getAnnos()));
							listaRequisitoConocimientosBean.add(requisitoBean);
						}
					}
					usuarioBean.setListaRequisitoConocimientosBean(listaRequisitoConocimientosBean);
					System.out.println("Certificados");
					for (UsuarioRequisito usuarioRequisito : urq) {
						if (usuarioRequisito.getTipoRequisito() == 67) {
							requisitoBean = new RequisitoBean(usuarioRequisito.getTagId(), usuarioRequisito.getTipoRequisito(), liferayApiService.getEtiqueta(
									usuarioRequisito.getTagId()).getValue(), ExpertoRevApiImpl.getValueAnnos(usuarioRequisito.getAnnos()));
							listaRequisitoCertificadoBean.add(requisitoBean);
						}
					}
					usuarioBean.setListaRequisitoCertificadosBean(listaRequisitoCertificadoBean);

					FasePostulacion fp = null;
					try {

						List<FasePostulacion> fspt = FasePostulacionLocalServiceUtil.listaFasesPostulacion(solicitudId, userId);

						long[] faseIds = new long[fspt.size()];
						for (int i = 0; i < fspt.size(); i++) {
							faseIds[i] = fspt.get(i).getFasePostulacionId();
						}

						fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, p.getUsuarioId(), Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);

						List<FasePostulacionPuestoEvaluacion> lfppePsicologicoBean = FasePostulacionPuestoEvaluacionLocalServiceUtil
								.getFasePostulacionPuestoEvaluacionBySolicitud(solicitudId);
						List<EvaluacionBean> listaEvaluacionP = new ArrayList<EvaluacionBean>();
						List<EvaluacionBean> listaEvaluacionT = new ArrayList<EvaluacionBean>();
						EvaluacionBean eb = null;
						Evaluacion e2 = null;
						for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : lfppePsicologicoBean) {
							if (fasePostulacionPuestoEvaluacion.getEvaluacionId() != 1 && fasePostulacionPuestoEvaluacion.getEvaluacionId() != 2) {
								e2 = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());
								if (faseIds.length > 0) {
									for (int i = 0; i < faseIds.length; i++) {
										if (fasePostulacionPuestoEvaluacion.getFasePostulacionId() == faseIds[i]) {
											if (e2.getTipoEvaluacion() == 83) {
												eb = new EvaluacionBean();
												eb.setTipoEvaluacion(e2.getTipoEvaluacion());
												eb.setStrTipoEvaluacion(parametroService.getParametro(e2.getTipoEvaluacion()).getValor());
												eb.setPuntajeObtenido(fasePostulacionPuestoEvaluacion.getResultado());
												listaEvaluacionP.add(eb);
											}
										}
									}

								}

							}
						}
						usuarioBean.setListaEvaluacionPsicologicoBean(listaEvaluacionP);

						for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : lfppePsicologicoBean) {
							if (fasePostulacionPuestoEvaluacion.getEvaluacionId() != 1 && fasePostulacionPuestoEvaluacion.getEvaluacionId() != 2) {
								e2 = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());
								if (faseIds.length > 0) {
									for (int i = 0; i < faseIds.length; i++) {
										if (fasePostulacionPuestoEvaluacion.getFasePostulacionId() == faseIds[i]) {
											if (e2.getTipoEvaluacion() == 84) {
												eb = new EvaluacionBean();
												eb.setTipoEvaluacion(e2.getTipoEvaluacion());
												eb.setStrTipoEvaluacion(parametroService.getParametro(e2.getTipoEvaluacion()).getValor());
												eb.setPuntajeObtenido(fasePostulacionPuestoEvaluacion.getResultado());
												listaEvaluacionT.add(eb);
											}
										}
									}

								}

							}
						}
						usuarioBean.setListaEvaluacionTecnicoBean(listaEvaluacionT);

						for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : lfppePsicologicoBean) {
							if (fasePostulacionPuestoEvaluacion.getEvaluacionId() == 1) {
								if (faseIds.length > 0) {
									for (int i = 0; i < faseIds.length; i++) {
										if (fasePostulacionPuestoEvaluacion.getFasePostulacionId() == faseIds[i]) {
											e2 = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());
											eb = new EvaluacionBean();
											eb.setId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
											eb.setTipoEvaluacion(e2.getTipoEvaluacion());
											eb.setStrTipoEvaluacion(parametroService.getParametro(e2.getTipoEvaluacion()).getValor());
											eb.setPuntajeObtenido(fasePostulacionPuestoEvaluacion.getResultado());
											usuarioBean.setEvaluacionEntevistaPsicologicaBean(eb);
										}
									}
								}
							}
						}

						for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : lfppePsicologicoBean) {
							if (fasePostulacionPuestoEvaluacion.getEvaluacionId() == 2) {
								if (faseIds.length > 0) {
									for (int i = 0; i < faseIds.length; i++) {
										if (fasePostulacionPuestoEvaluacion.getFasePostulacionId() == faseIds[i]) {
											e2 = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());
											eb = new EvaluacionBean();
											eb.setId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
											eb.setTipoEvaluacion(e2.getTipoEvaluacion());
											eb.setStrTipoEvaluacion(parametroService.getParametro(e2.getTipoEvaluacion()).getValor());
											eb.setPuntajeObtenido(fasePostulacionPuestoEvaluacion.getResultado());
											usuarioBean.setEvaluacionEntevistaGerenteAreaBean(eb);
										}
									}
								}
							}
						}

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
						fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, p.getUsuarioId(), Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
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
						fp = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, p.getUsuarioId(), Constantes.PARAMETRO_FASE_TECNICA);
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
						fase = FasePostulacionLocalServiceUtil.getFasePostuacionByTipo(solicitudId, p.getUsuarioId(), Constantes.PARAMETRO_FASE_PSICOLOGICA);
					} catch (Exception e) {
						_log.error("Error al getFasePostuacionByTipo " + e.getMessage(), e);
						estado_parametro_id = Constantes.PARAMETRO_ESTADO_POSTULADO;
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
					if (pstBean != null) {
						usuarioBean.setCercania(pstBean.getCercania());
						usuarioBean.setDistanciaEuclidianaEntrevista(pstBean.getDistanciaEuclidianaEntrevista());
						usuarioBean.setDistanciaEuclidianaEntrevista(pstBean.getDistanciaEuclidianaEntrevista());
						usuarioBean.setDistanciaHammingEntrevista(pstBean.getDistanciaHammingEntrevista());
						usuarioBean.setDistanciaEuclidianaPsicologico(pstBean.getDistanciaEuclidianaPsicologico());
						usuarioBean.setDistanciaHammingPsicologico(pstBean.getDistanciaHammingPsicologico());
						usuarioBean.setDistanciaEuclidianaTecnico(pstBean.getDistanciaEuclidianaTecnico());
						usuarioBean.setDistanciaHammingTecnico(pstBean.getDistanciaHammingTecnico());
						usuarioBean.setRecomendableReqCum(pstBean.isRecomendableReqCum());
						usuarioBean.setPorcentajeReqCum(pstBean.getPorcentajeReqCum());
						usuarioBean.setRecomendableRequisitosCumplidoPorUsuario(pstBean.isRecomendableRequisitosCumplidoPorUsuario());
						usuarioBean.setPorcentajeRequisitosCumplidoPorUsuario(pstBean.getPorcentajeRequisitosCumplidoPorUsuario());
						if (pstBean.getPorcentajeReqCertiCum() > 0) {
							usuarioBean.setRecomendableReqCertiCum(pstBean.isRecomendableReqCertiCum());
							usuarioBean.setPorcentajeReqCertiCum(pstBean.getPorcentajeReqCertiCum());
							usuarioBean.setRecomendableCertificadoCumplidoPorUsuario(pstBean.isRecomendableCertificadoCumplidoPorUsuario());
							usuarioBean.setPorcentajeCertificadoCumplidoPorUsuario(pstBean.getPorcentajeCertificadoCumplidoPorUsuario());
						}
					}
					usuarioBean.setListaTrazaAnalisis(listaList);
				}
			}
		} catch (PortalException | SystemException e) {
			_log.error("Error al seleccionarPostulaste " + e.getMessage(), e);
		}
		return usuarioBean;
	}

	@Override
	public Map<String, Object> extenderFechaLimite(Long solicitudId, Date fechaLimite2Val, User user, long scopeGroupId) {
		_log.debug("guardarSolicitudReclutamiento:");
		Map<String, Object> result = new HashMap<String, Object>();
		try {

			if (Validator.isNotNull(solicitudId) && Validator.isNotNull(fechaLimite2Val) ) {
				_log.debug("nuevo:");
				Long id = CounterLocalServiceUtil.increment(SolicitudRequerimiento.class.getName());
				_log.debug("id:" + id);
				SolicitudRequerimiento sRequerimiento = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudId);			
				sRequerimiento.setFechaLimite(fechaLimite2Val);
				sRequerimiento.setUsuariomodifica(user.getUserId());
				sRequerimiento.setFechamodifica(new Date());
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sRequerimiento);
				
				_log.debug("Nuevo:" + sRequerimiento.getSolicitudRequerimientoId());
				result.put("respuesta", Constantes.TRANSACCION_OK);
				result.put("objeto", sRequerimiento);
				result.put("mensaje","Se ha extendido la publicación");

			}
		} catch (SystemException | PortalException e) {
			_log.error("Error al guardar " + e.getMessage(), e);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PortletProps.get("portal.transaccion.error"));
		}
		return result;
	}

}
