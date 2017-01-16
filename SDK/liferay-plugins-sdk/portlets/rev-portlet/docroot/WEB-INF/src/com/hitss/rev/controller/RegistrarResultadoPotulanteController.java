package com.hitss.rev.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.hitss.rev.bean.FasePostulacionBean;
import com.hitss.rev.bean.FasePostulacionPuestoEvaluacionBean;
import com.hitss.rev.bean.PuestoEvaluacionBean;
import com.hitss.rev.bean.SolicitudPostulacionBean;
import com.hitss.rev.service.RegistrarResultadoPostulanteService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.JsonUtil;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

@Controller("registrarResultadoPotulanteController")
@RequestMapping(value = "VIEW")
public class RegistrarResultadoPotulanteController extends RevController {

	private static Log _log = LogFactoryUtil.getLog(ActualizarSolicitudReclutamientoController.class);

	@Autowired
	private RegistrarResultadoPostulanteService registrarResultadoPostulanteService;

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.info("defaultView");
		return super.defaultViewReclutamiento(request, response, model, (RevServiceImpl) registrarResultadoPostulanteService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.info("irDefault");
		return super.irDefaultReclutamiento(request, response, model, (RevServiceImpl) registrarResultadoPostulanteService);
	}

	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("listarSolicitudesReclutamiento");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Long puestoId = ParamUtil.getLong(resourceRequest, "puestoId");
		_log.info("puestoId:" + puestoId);

		Date fechaRegistroInicio = null;
		String fechaRegistroInicioVal = ParamUtil.get(resourceRequest, "fechaRegistroInicioVal", "");
		if (Validator.isNotNull(fechaRegistroInicioVal)) {
			fechaRegistroInicio = ParamUtil.getDate(resourceRequest, "fechaRegistroInicioVal", sdf);
		}
		_log.info("fechaRegistroInicio:" + fechaRegistroInicio);

		Date fechaRegistrFin = null;
		String fechaRegistroFinVal = ParamUtil.get(resourceRequest, "fechaRegistroFinVal", "");
		if (Validator.isNotNull(fechaRegistroFinVal)) {
			fechaRegistrFin = ParamUtil.getDate(resourceRequest, "fechaRegistroFinVal", sdf);
		}
		_log.info("fechaRegistrFin:" + fechaRegistrFin);

		int responsable = ParamUtil.getInteger(resourceRequest, "responsable");
		_log.info("responsable:" + responsable);

		int tiempoContrato = ParamUtil.getInteger(resourceRequest, "tiempoContrato");
		_log.info("tiempoContrato:" + tiempoContrato);

		int filas = ParamUtil.getInteger(resourceRequest, "filas");
		_log.info("filas:" + filas);

		int pagina = ParamUtil.getInteger(resourceRequest, "pagina");
		_log.info("pagina:" + pagina);

		String orden = ParamUtil.get(resourceRequest, "orden", "");
		_log.info("orden:" + orden);

		String campoOrden = ParamUtil.get(resourceRequest, "campoOrden", "");
		_log.info("campoOrden:" + campoOrden);

		Map<String, Object> result = registrarResultadoPostulanteService.listarSolicitudesRequermientoPostulacion(puestoId, fechaRegistroInicio, fechaRegistrFin, responsable,
				tiempoContrato, filas, pagina, orden, campoOrden);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}
	}

	@RenderMapping(params = "action=irregistrarProceso")
	public String irregistrarProceso(RenderRequest resourceRequest, RenderResponse resourceResponse, Model model) {
		_log.info("irregistrarProceso");
		Long solicitudId = ParamUtil.getLong(resourceRequest, "solicitudId");
		_log.info("solicitudId:" + solicitudId);
		Long userId = ParamUtil.getLong(resourceRequest, "userId");
		_log.info("userId:" + userId);

		SolicitudPostulacionBean solicitudPostulacionBean = registrarResultadoPostulanteService.getSolicitudPostulacion(solicitudId, userId);

		model.addAttribute("solicitudPostulacionBean", solicitudPostulacionBean);
		model.addAttribute("userId", userId);
		return "procesoPostulante";
	}

	@ResourceMapping(value = "registrarProceso")
	public void registrarProceso(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();
		_log.info("registrarProceso");
		Long solicitudId = ParamUtil.getLong(resourceRequest, "solicitudId");
		_log.info("solicitudId:" + solicitudId);
		Long userId = ParamUtil.getLong(resourceRequest, "userId");
		_log.info("userId:" + userId);
		SolicitudPostulacionBean solicitudPostulacionBean = registrarResultadoPostulanteService.getSolicitudPostulacion(solicitudId, userId);

		List<PuestoEvaluacionBean> l = solicitudPostulacionBean.getListaEvaluacionesPuestoEnfoque();

		Long evaluacion = null;
		Double resutlado = null;
		FasePostulacionBean a = null;
		FasePostulacionPuestoEvaluacionBean b = null;

		List<FasePostulacionPuestoEvaluacionBean> listaFasePostulacionPuestoEvaluacionBean = new ArrayList<FasePostulacionPuestoEvaluacionBean>();

		for (PuestoEvaluacionBean puestoEvaluacionBean : l) {
			evaluacion = ParamUtil.getLong(resourceRequest, "evaluacionSelect" + puestoEvaluacionBean.getEvaluacionId() + "Id");
			_log.info("evaluacion:" + evaluacion);
			resutlado = ParamUtil.getDouble(resourceRequest, "resultado" + puestoEvaluacionBean.getEvaluacionId() + "Id");
			_log.info("resutlado:" + resutlado);
			if (evaluacion == 1) {
				
				a = solicitudPostulacionBean.getFasePostulacionEntrevistaRRHH();
				if(Validator.isNull(a)){
					a = new FasePostulacionBean();
					a.setUsuarioId(userId);
					a.setSolicitudRequerimientoId(solicitudId);
					a.setTipoFase(Constantes.PARAMETRO_FASE_ENTREV_COORDINADOR);
				}
				a.setApruebaFase(false);
				a.setAsistio(true);
				if( Validator.isNotNull(resutlado) && resutlado>=12.8 ){
					a.setApruebaFase(true);
				}
				a.setEstado(72);
				a.setFechaFase(new Date());

				solicitudPostulacionBean.setFasePostulacionEntrevistaRRHH(a);

				b = new FasePostulacionPuestoEvaluacionBean();
				b.setSolicitudFuncionId(solicitudPostulacionBean.getSolicitudId());
				b.setEvaluacionId(evaluacion);
				b.setFasePostulacionId(a.getFasepostulacionId());
				b.setResultado(resutlado);

				listaFasePostulacionPuestoEvaluacionBean.add(b);

			} else if (evaluacion == 2) {
				
				a = solicitudPostulacionBean.getFasePostulacionEntrevistaGerenteArea();
				if(Validator.isNull(a)){
					a = new FasePostulacionBean();
					a.setUsuarioId(userId);
					a.setSolicitudRequerimientoId(solicitudId);
					a.setTipoFase(Constantes.PARAMETRO_FASE_ENTREV_GERENTE_AREA);
				}
				a.setApruebaFase(false);
				a.setAsistio(true);
				if( Validator.isNotNull(resutlado) && resutlado>=12.8 ){
					a.setApruebaFase(true);
				}
				a.setEstado(72);
				a.setFechaFase(new Date());

				solicitudPostulacionBean.setFasePostulacionEntrevistaGerenteArea(a);

				b = new FasePostulacionPuestoEvaluacionBean();
				b.setSolicitudFuncionId(solicitudPostulacionBean.getSolicitudId());
				b.setEvaluacionId(evaluacion);
				b.setFasePostulacionId(a.getFasepostulacionId());
				b.setResultado(resutlado);

				listaFasePostulacionPuestoEvaluacionBean.add(b);
				
			} else if (puestoEvaluacionBean.getEvaluacionBean().getTipoEvaluacion() == 83) {

				a = solicitudPostulacionBean.getFasePostulacionPsicologico();
				if(Validator.isNull(a)){
					a = new FasePostulacionBean();
					a.setUsuarioId(userId);
					a.setSolicitudRequerimientoId(solicitudId);
					a.setTipoFase(Constantes.PARAMETRO_FASE_PSICOLOGICA);
				}
				a.setApruebaFase(false);
				a.setAsistio(true);
				if( Validator.isNotNull(resutlado) && resutlado>=12.8 ){
					a.setApruebaFase(true);
				}
				a.setEstado(72);
				a.setFechaFase(new Date());

				solicitudPostulacionBean.setFasePostulacionPsicologico(a);

				b = new FasePostulacionPuestoEvaluacionBean();
				b.setSolicitudFuncionId(solicitudPostulacionBean.getSolicitudId());
				b.setEvaluacionId(evaluacion);
				b.setFasePostulacionId(a.getFasepostulacionId());
				b.setResultado(resutlado);

				listaFasePostulacionPuestoEvaluacionBean.add(b);

			} else if (puestoEvaluacionBean.getEvaluacionBean().getTipoEvaluacion() == 84) {

				a = solicitudPostulacionBean.getFasePostulacionTecnico();
				if(Validator.isNull(a)){
					a = new FasePostulacionBean();
					a.setUsuarioId(userId);
					a.setSolicitudRequerimientoId(solicitudId);
					a.setTipoFase(Constantes.PARAMETRO_FASE_TECNICA);
				}
				a.setApruebaFase(false);
				a.setAsistio(true);
				if( Validator.isNotNull(resutlado) && resutlado>=12.8 ){
					a.setApruebaFase(true);
				}
				a.setEstado(72);
				a.setFechaFase(new Date());

				solicitudPostulacionBean.setFasePostulacionTecnico(a);

				b = new FasePostulacionPuestoEvaluacionBean();
				b.setSolicitudFuncionId(solicitudPostulacionBean.getSolicitudId());
				b.setEvaluacionId(evaluacion);
				b.setFasePostulacionId(a.getFasepostulacionId());
				b.setResultado(resutlado);

				listaFasePostulacionPuestoEvaluacionBean.add(b);

			}
			_log.info("FasepostulacionI:" + a.getFasepostulacionId());

		}
		
		solicitudPostulacionBean.setListaFasePostulacionPuestoEvaluacionBean(listaFasePostulacionPuestoEvaluacionBean);
		
		if (Validator.isNotNull(listaFasePostulacionPuestoEvaluacionBean) || !listaFasePostulacionPuestoEvaluacionBean.isEmpty()) {
			_log.info("solicitudId:" + solicitudId);
			Map<String, Object> result = registrarResultadoPostulanteService.registarAvance(solicitudPostulacionBean, userId , td.getScopeGroupId(), user);
			_log.info("result:" + result);
			try {
				JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
			} catch (IOException e) {
				_log.error("e:" + e.getLocalizedMessage(), e);
			}
		}

	}

	@RenderMapping(params = "action=irnoAsistio")
	public String irnoAsistio(RenderRequest resourceRequest, RenderResponse resourceResponse) {
		_log.info("noAsistio");
		Long solicitudId = ParamUtil.getLong(resourceRequest, "solicitudId");
		_log.info("solicitudId:" + solicitudId);
		Long userId = ParamUtil.getLong(resourceRequest, "userId");
		_log.info("userId:" + userId);

		return "noAsistio";
	}

	@ResourceMapping(value = "noAsistio")
	public void noAsistio(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("noAsistio");

	}

}
