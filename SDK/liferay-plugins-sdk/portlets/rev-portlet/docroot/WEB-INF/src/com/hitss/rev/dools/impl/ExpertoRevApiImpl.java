package com.hitss.rev.dools.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.layer.model.Evaluacion;
import com.hitss.layer.model.Experiencia;
import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.PuestoEvaluacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.model.UsuarioRequisito;
import com.hitss.layer.service.EvaluacionLocalServiceUtil;
import com.hitss.layer.service.ExperienciaLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionPuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.PuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.UsuarioRequisitoLocalServiceUtil;
import com.hitss.rev.bean.ComboBean;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.RequisitoEtiquetaBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.dools.ExpertoRevApi;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.ParametroService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.hitss.rev.util.Constantes;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

@Component("ExpertoRevApi")
public class ExpertoRevApiImpl implements ExpertoRevApi {

	@Autowired
	protected SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService;

	@Autowired
	private LiferayApiService liferayApiService;

	@Autowired
	private ParametroService parametroService;

	@Override
	public List<Usuario> analsisExperto(Long solicitudRequerimientoId, List<Postulacion> lst, List<Usuario> lstUsuariosPostulantes) {
		List<Usuario> u = new ArrayList<Usuario>();
		try {
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimientoId);
			List<PuestoEvaluacion> listaPuestoEvaluacion = PuestoEvaluacionLocalServiceUtil.findByS_ALL(solicitudRequerimientoId);
			SolicitudReclutamiento solicitudReclutamiento = null;
			com.hitss.rev.dools.impl.Postulacion pa = null;
			List<com.hitss.rev.dools.impl.Postulacion> listaPostulaciones = new ArrayList<com.hitss.rev.dools.impl.Postulacion>();
			for (Postulacion pst : lst) {
				pa = new com.hitss.rev.dools.impl.Postulacion();

				solicitudReclutamiento = new SolicitudReclutamiento();
				solicitudReclutamiento.setId(solicitudRequerimientoId);
				solicitudReclutamiento.setPuesto(getPuestoConfiguracion(sr, listaPuestoEvaluacion));
				solicitudReclutamiento.setFechaLimite((sr.getFechaLimite()));
				solicitudReclutamiento.setPresupuestoMaximo(sr.getPresupuestoMaximo());
				solicitudReclutamiento.setPresupuestoMinimo(sr.getPresupuestoMinimo());
				pa.setSolicitudReclutamiento(solicitudReclutamiento);
				pa.setUsuarioBean(getUsuario(pst.getUsuarioId(), solicitudRequerimientoId));
				listaPostulaciones.add(pa);
			}
			listaPostulaciones = DataAnalisisExperto.analisisDatos(listaPostulaciones);
			System.out.println("---------FIN--------");
			System.out.println("---------FIN--------");
			System.out.println("---------FIN--------");
			for (com.hitss.rev.dools.impl.Postulacion postulacion : listaPostulaciones) {
				System.out.println(postulacion.getUsuarioBean().getIdUsuario());
				System.out.println("getIdUsuario--" + postulacion.getUsuarioBean().getIdUsuario());
				System.out.println("DistanciaEuclidianaEntrevista--" + postulacion.getDistanciaEuclidianaEntrevista());
				System.out.println("DistanciaHammingEntrevista--" + postulacion.getDistanciaHammingEntrevista());
				System.out.println("DistanciaEuclidianaPsicologico--" + postulacion.getDistanciaEuclidianaPsicologico());
				System.out.println("DistanciaHammingPsicologico--" + postulacion.getDistanciaHammingPsicologico());
				System.out.println("DistanciaEuclidianaTecnico--" + postulacion.getDistanciaEuclidianaTecnico());
				System.out.println("DistanciaHammingTecnico--" + postulacion.getDistanciaHammingTecnico());
				System.out.println("RecomendableReqCum--" + postulacion.isRecomendableReqCum() + " al " + postulacion.getPorcentajeReqCum());
				System.out.println("RecomendableRequisitosCumplidoPorUsuario--" + postulacion.isRecomendableRequisitosCumplidoPorUsuario() + " al "
						+ postulacion.getPorcentajeRequisitosCumplidoPorUsuario());
				if (postulacion.getPorcentajeReqCertiCum() > 0) {
					System.out.println("RecomendableReqCertiCum--" + postulacion.isRecomendableReqCertiCum() + " al " + postulacion.getPorcentajeReqCertiCum());
					System.out.println("RecomendableCertificadoCumplidoPorUsuario--" + postulacion.isRecomendableCertificadoCumplidoPorUsuario() + " al "
							+ postulacion.getPorcentajeCertificadoCumplidoPorUsuario());
				}
				System.out.println("-----------------");
			}

		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
		return lstUsuariosPostulantes;
	}

	private UsuarioBean getUsuario(long usuarioId, Long solicitudRequerimientoId) throws PortalException, SystemException {
		User e = UserLocalServiceUtil.getUser(usuarioId);
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(e.getUserId());
		p.setNombre(e.getFullName());
		Boolean colaborador = (Boolean) e.getExpandoBridge().getAttribute("Colaborador");
		Float salario = (Float) e.getExpandoBridge().getAttribute("Salario");
		p.setSalario(salario.doubleValue());
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = null;
			List<Experiencia> l = ExperienciaLocalServiceUtil.getExperiencia(usuarioId);
			for (Experiencia experiencia : l) {
				experienciaBean = new ExperienciaBean(1L, experiencia.getDescripcion(), parametroService.getParametro(experiencia.getTipoNegocio()).getParametroId(),
						experiencia.getProyecto(), experiencia.getFechaInicio(), experiencia.getFechaFin());
				listaExperiencias.add(experienciaBean);
			}
			p.setListaExperiencias(listaExperiencias);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			List<UsuarioRequisito> urq = UsuarioRequisitoLocalServiceUtil.getUsuarioRequisito(usuarioId);
			RequisitoBean requisitoBean = null;
			for (UsuarioRequisito usuarioRequisito : urq) {
				if (usuarioRequisito.getTipoRequisito() == 66) {
					requisitoBean = new RequisitoBean(usuarioRequisito.getTagId(), usuarioRequisito.getTipoRequisito(), liferayApiService.getEtiqueta(usuarioRequisito.getTagId())
							.getValue(), getValueAnnos(usuarioRequisito.getAnnos()));
					listaRequisitoBean.add(requisitoBean);
				}
			}
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			List<UsuarioRequisito> urq = UsuarioRequisitoLocalServiceUtil.getUsuarioRequisito(usuarioId);
			RequisitoBean requisitoBean = null;
			for (UsuarioRequisito usuarioRequisito : urq) {
				if (usuarioRequisito.getTipoRequisito() == 67) {
					requisitoBean = new RequisitoBean(usuarioRequisito.getTagId(), usuarioRequisito.getTipoRequisito(), liferayApiService.getEtiqueta(usuarioRequisito.getTagId())
							.getValue());
					listaRequisitoBean.add(requisitoBean);
				}
			}
			p.setListaCertificados(listaRequisitoBean);
		}
		if (colaborador) {
			{
				List<EvaluacionBean> listaEvaluacion = new ArrayList<EvaluacionBean>();
				List<FasePostulacionPuestoEvaluacion> a = FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionBySolicitud(solicitudRequerimientoId);
				EvaluacionBean eb = null;
				Evaluacion e2 = null;
				for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : a) {
					if (fasePostulacionPuestoEvaluacion.getEvaluacionId() != 1 && fasePostulacionPuestoEvaluacion.getEvaluacionId() != 2) {
						e2 = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());
						if (e2.getTipoEvaluacion() == 83) {
							eb = new EvaluacionBean();
							eb.setId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
							eb.setTipoEvaluacion(e2.getTipoEvaluacion());
							eb.setPuntajeObtenido(fasePostulacionPuestoEvaluacion.getResultado());
							listaEvaluacion.add(eb);
						}

					}
				}
				p.setListaEvaluacionPiscologicas(listaEvaluacion);
			}
			{
				List<EvaluacionBean> listaEvaluacion = new ArrayList<EvaluacionBean>();
				List<FasePostulacionPuestoEvaluacion> a = FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionBySolicitud(solicitudRequerimientoId);
				EvaluacionBean eb = null;
				Evaluacion e2 = null;
				for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : a) {
					if (fasePostulacionPuestoEvaluacion.getEvaluacionId() != 1 && fasePostulacionPuestoEvaluacion.getEvaluacionId() != 2) {
						e2 = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());
						if (e2.getTipoEvaluacion() == 84) {
							eb = new EvaluacionBean();
							eb.setId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
							eb.setTipoEvaluacion(e2.getTipoEvaluacion());
							eb.setPuntajeObtenido(fasePostulacionPuestoEvaluacion.getResultado());
							listaEvaluacion.add(eb);
						}
						listaEvaluacion.add(eb);
					}
				}
				p.setListaEvaluacionTecnicas(listaEvaluacion);
			}
		}
		{
			List<EvaluacionBean> listaEntrevistas = new ArrayList<EvaluacionBean>();
			List<FasePostulacionPuestoEvaluacion> a = FasePostulacionPuestoEvaluacionLocalServiceUtil.getFasePostulacionPuestoEvaluacionBySolicitud(solicitudRequerimientoId);
			EvaluacionBean eb = null;
			Evaluacion e2 = null;
			for (FasePostulacionPuestoEvaluacion fasePostulacionPuestoEvaluacion : a) {
				if (fasePostulacionPuestoEvaluacion.getEvaluacionId() == 1 && fasePostulacionPuestoEvaluacion.getEvaluacionId() == 2) {
					e2 = EvaluacionLocalServiceUtil.getEvaluacion(fasePostulacionPuestoEvaluacion.getEvaluacionId());
					eb = new EvaluacionBean();
					eb.setId(fasePostulacionPuestoEvaluacion.getEvaluacionId());
					eb.setTipoEvaluacion(e2.getTipoEvaluacion());
					eb.setPuntajeObtenido(fasePostulacionPuestoEvaluacion.getResultado());
					listaEntrevistas.add(eb);
				}
			}
			p.setListaEvaluacionTecnicas(listaEntrevistas);
		}
		return p;
	}

	private PuestoBean getPuestoConfiguracion(SolicitudRequerimiento sr, List<PuestoEvaluacion> listaPuestoEvaluacion) throws PortalException, SystemException {
		SolicitudRequerimientoBean solicitudRequerimiento = new SolicitudRequerimientoBean();
		solicitudRequerimiento.setSolicitudRequerimientoId(sr.getSolicitudRequerimientoId());
		PuestoBean p = new PuestoBean();
		p.setId(sr.getCategoriaPuestoId());
		ComboBean v = liferayApiService.getCategoria(sr.getCategoriaPuestoId());
		p.setNombre(v.getValue());
		p.setTipoNegocioRequierido(parametroService.getParametro(sr.getTipoNegocio()).getParametroId());
		{	
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, parametroService.getParametro(sr.getTipoNegocio()).getParametroId(), sr.getCantidadAnnosRubro());
			p.setExperienciaRubro(experienciaBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			List<RequisitoEtiquetaBean> listaSolicitudRequerimientoRequisitosExitentes = solicitudRequerimientoRequisitoService
					.getListaSolicitudRequerimientoRequisitosExitentesBeans(solicitudRequerimiento);
			RequisitoBean requisitoBean = null;
			for (RequisitoEtiquetaBean requisitoEtiquetaBean : listaSolicitudRequerimientoRequisitosExitentes) {
				if (requisitoEtiquetaBean.getTipoRequisito() == 66) {
					requisitoBean = new RequisitoBean(requisitoEtiquetaBean.getTagId(), requisitoEtiquetaBean.getTipoRequisito(), requisitoEtiquetaBean.getRequisito(),
							getValueAnnos(requisitoEtiquetaBean.getAnnos()), requisitoEtiquetaBean.isExigible());
					listaRequisitoBean.add(requisitoBean);
				}
			}
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			List<RequisitoEtiquetaBean> listaSolicitudRequerimientoRequisitosExitentes = solicitudRequerimientoRequisitoService
					.getListaSolicitudRequerimientoRequisitosExitentesBeans(solicitudRequerimiento);
			RequisitoBean requisitoBean = null;
			for (RequisitoEtiquetaBean requisitoEtiquetaBean : listaSolicitudRequerimientoRequisitosExitentes) {
				if (requisitoEtiquetaBean.getTipoRequisito() == 67) {
					requisitoBean = new RequisitoBean(requisitoEtiquetaBean.getTagId(), requisitoEtiquetaBean.getTipoRequisito(), requisitoEtiquetaBean.getRequisito(),
							requisitoEtiquetaBean.isExigible());
					listaRequisitoBean.add(requisitoBean);
				}
			}
			p.setListaCertificados(listaRequisitoBean);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacion = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = null;
			Evaluacion e = null;
			for (PuestoEvaluacion puestoEvaluacion : listaPuestoEvaluacion) {
				if (puestoEvaluacion.getEvaluacionId() != 1 && puestoEvaluacion.getEvaluacionId() != 2) {
					e = EvaluacionLocalServiceUtil.getEvaluacion(puestoEvaluacion.getEvaluacionId());
					if (e.getTipoEvaluacion() == 83) {

						evaluacionPuestoBean = new EvaluacionPuestoBean(e.getEvaluacionId(), e.getTipoEvaluacion(), e.getDescripcion(), puestoEvaluacion.getRangoInferior(),
								puestoEvaluacion.getRangoSuperior());
						listaEvaluacion.add(evaluacionPuestoBean);
					}
				}
			}
			p.setListaEvaluacionPiscologicas(listaEvaluacion);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacion = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = null;
			Evaluacion e = null;
			for (PuestoEvaluacion puestoEvaluacion : listaPuestoEvaluacion) {
				if (puestoEvaluacion.getEvaluacionId() != 1 && puestoEvaluacion.getEvaluacionId() != 2) {
					e = EvaluacionLocalServiceUtil.getEvaluacion(puestoEvaluacion.getEvaluacionId());
					if (e.getTipoEvaluacion() == 84) {
						evaluacionPuestoBean = new EvaluacionPuestoBean(e.getEvaluacionId(), e.getTipoEvaluacion(), e.getDescripcion(), puestoEvaluacion.getRangoInferior(),
								puestoEvaluacion.getRangoSuperior());
						listaEvaluacion.add(evaluacionPuestoBean);
					}
				}
			}
			p.setListaEvaluacionTecnicas(listaEvaluacion);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacion = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = null;
			Evaluacion e = null;
			for (PuestoEvaluacion puestoEvaluacion : listaPuestoEvaluacion) {
				if (puestoEvaluacion.getEvaluacionId() == 1 || puestoEvaluacion.getEvaluacionId() == 2) {
					e = EvaluacionLocalServiceUtil.getEvaluacion(puestoEvaluacion.getEvaluacionId());
					evaluacionPuestoBean = new EvaluacionPuestoBean(e.getEvaluacionId(), e.getTipoEvaluacion(), e.getDescripcion(), puestoEvaluacion.getRangoInferior(),
							puestoEvaluacion.getRangoSuperior());
					listaEvaluacion.add(evaluacionPuestoBean);
				}
			}
			p.setListaEntrevista(listaEvaluacion);
		}
		return p;
	}

	// private int getTipoRequisito(){
	// List<ParametroBean> listaTiempoContrato =
	// parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_TIPO_REQUISITO);
	// for (ParametroBean parametroBean : listaTiempoContrato) {
	//
	// }
	//
	//
	// }

	private int getValueAnnos(Long annosId) {
		switch (annosId.intValue()) {
		case 96:
			return 1;
		case 97:
			return 2;
		case 98:
			return 3;
		case 99:
			return 4;
		case 100:
			return 5;
		}

		// List<ParametroBean> listaTiempoContrato =
		// parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_ANNOS);
		// for (ParametroBean parametroBean : listaTiempoContrato) {
		// if (parametroBean.getParametroId() == annosId) {
		// return Integer.parseInt(parametroBean.getValor());
		// }
		// }
		return 0;
	}

}
