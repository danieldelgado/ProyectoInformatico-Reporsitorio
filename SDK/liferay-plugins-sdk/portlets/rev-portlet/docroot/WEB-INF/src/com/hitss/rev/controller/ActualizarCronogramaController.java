package com.hitss.rev.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.hitss.rev.bean.ActividadCronogramaBean;
import com.hitss.rev.bean.PrioridadGrupoUsuariosBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.ActualizarCronogramaService;
import com.hitss.rev.util.JsonUtil;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.hitss.rev.util.Util;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

@Controller("actualizarCronogramaController")
@RequestMapping(value = "VIEW")
public class ActualizarCronogramaController extends RevController {

	private static Log _log = LogFactoryUtil.getLog(ActualizarCronogramaController.class);

	@Autowired
	private ActualizarCronogramaService actualizarCronogramaService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.info("defaultView");
		return super.defaultViewEvaluacion(request, response, model, (RevServiceImpl) actualizarCronogramaService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.info("irDefault");
		return super.irDefaultEvaluacion(request, response, model, (RevServiceImpl) actualizarCronogramaService);
	}
	
	
	@ResourceMapping(value = "listarSolicitudesEvaluacion")
	public void listarSolicitudesEvaluacion(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("listarSolicitudesEvaluacion");
		super.listarSolicitudesEvaluacion(resourceRequest, resourceResponse, (RevServiceImpl) actualizarCronogramaService);
	}
	
	
	@RenderMapping(params = "action=crearCronograma")
	public String crearCronograma(RenderRequest request, RenderResponse response, Model model) {
		_log.info("crearCronograma");
		Long solicitudEvaluacionId = ParamUtil.getLong(request, "solicitudEvaluacionId");
		_log.info("solicitudEvaluacionId:"+solicitudEvaluacionId);		
		List<PrioridadGrupoUsuariosBean> listPrioridadGrupoUsuariosBeans = actualizarCronogramaService.getListaPrioridadGrupoUsuariosBySolicitud(solicitudEvaluacionId);
		model.addAttribute("listPrioridadGrupoUsuariosBeans", JsonUtil.getJsonString(listPrioridadGrupoUsuariosBeans));
		return "listaPrioridad";
	}
	
	@RenderMapping(params = "action=planificar")
	public String planificar(RenderRequest request, RenderResponse response, Model model) {
		_log.info("planificar");
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		HttpServletRequest r = PortalUtil.getHttpServletRequest(request);
		Long solicitudEvaluacionId = ParamUtil.getLong(request, "solicitudEvaluacionId");
		_log.info("solicitudEvaluacionId:"+solicitudEvaluacionId);	
		Long prioridadGrupoUsuariosId = ParamUtil.getLong(request, "prioridadGrupoUsuariosId");
		_log.info("prioridadGrupoUsuariosId:"+prioridadGrupoUsuariosId);	
		Long cronograma = ParamUtil.getLong(request, "cronograma");
		_log.info("cronograma:"+cronograma);	
		Long actividadCronogramaId = ParamUtil.getLong(request, "actividadCronogramaId");
		_log.info("actividadCronogramaId:"+actividadCronogramaId);	
		Long grupoUsuario = ParamUtil.getLong(request, "grupoUsuarioId");
		_log.info("grupoUsuario:"+grupoUsuario);	
		
		ActividadCronogramaBean actividadCronogramaBean = actualizarCronogramaService.getActividadCronograma(solicitudEvaluacionId,prioridadGrupoUsuariosId,cronograma,actividadCronogramaId,grupoUsuario);
		
		model.addAttribute("actividadCronograma", actividadCronogramaBean);
		model.addAttribute("solicitudEvaluacionId", solicitudEvaluacionId);
		model.addAttribute("prioridadGrupoUsuariosId", prioridadGrupoUsuariosId);
		model.addAttribute("cronograma", cronograma);
		model.addAttribute("actividadCronogramaId", actividadCronogramaId);
		model.addAttribute("grupoUsuario", grupoUsuario);

		List<UsuarioBean> listaGerentes = actualizarCronogramaService.getListaGerentes(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaGerentes", listaGerentes);
		List<UsuarioBean> listalideres = actualizarCronogramaService.getListaLideres(td.getCompanyId(), td.getCompanyGroupId()); 
		model.addAttribute("listalideres", listalideres);
		
		return "planificar";
	}
	
	
	@ResourceMapping(value = "guardarPlanificar")
	public void guardarPlanificar(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("guardarPlanificar");
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		Long solicitudEvaluacionId = ParamUtil.getLong(resourceRequest, "solicitudEvaluacionId");
		_log.info("solicitudEvaluacionId:"+solicitudEvaluacionId);		
		Long cronograma = ParamUtil.getLong(resourceRequest, "cronograma");
		_log.info("cronograma:"+cronograma);
		Long actividadCronogramaId = ParamUtil.getLong(resourceRequest, "actividadCronogramaId");
		_log.info("actividadCronogramaId:"+actividadCronogramaId);
		Long grupoUsuarioId = ParamUtil.getLong(resourceRequest, "grupoUsuarioId");
		_log.info("grupoUsuarioId:"+grupoUsuarioId);
		Long gerenteArea = ParamUtil.getLong(resourceRequest, "gerenteArea");
		_log.info("gerenteArea:"+gerenteArea);
		Long lider = ParamUtil.getLong(resourceRequest, "lider");
		_log.info("lider:"+lider);
		String actividad = ParamUtil.get(resourceRequest, "actividad","");
		_log.info("actividad:"+actividad);
		Date fechaInicioEvalacion = null;
		String fechaInicioEvalacionVal = ParamUtil.get(resourceRequest, "fechaInicioEvalacion", "");
		fechaInicioEvalacion = Util.getFecha(fechaInicioEvalacionVal);
		_log.info("fechaInicioEvalacion:"+fechaInicioEvalacion);
		Date fechaFinEvalacion = null;
		String fechaFinEvalacionVal = ParamUtil.get(resourceRequest, "fechaFinEvalacion", "");
		fechaFinEvalacion = Util.getFecha(fechaFinEvalacionVal);
		_log.info("fechaFinEvalacion:"+fechaFinEvalacion);
		Date fechaInicioPlanAccion = null;
		String fechaInicioPlanAccionVal = ParamUtil.get(resourceRequest, "fechaInicioPlanAccion", "");
		fechaInicioPlanAccion = Util.getFecha(fechaInicioPlanAccionVal);
		_log.info("fechaInicioPlanAccion:"+fechaInicioPlanAccion);
		Date fechaFinPlanAccion = null;
		String fechaFinPlanAccionVal = ParamUtil.get(resourceRequest, "fechaFinPlanAccion", "");
		fechaFinPlanAccion = Util.getFecha(fechaFinPlanAccionVal);
		_log.info("fechaFinPlanAccion:"+fechaFinPlanAccion);

		Long prioridadGrupoUsuariosId = ParamUtil.getLong(resourceRequest, "prioridadGrupoUsuariosId");
		_log.info("prioridadGrupoUsuariosId"+prioridadGrupoUsuariosId);
		

		Map<String, Object> result = actualizarCronogramaService.guardarPlanificar(
				solicitudEvaluacionId,
				cronograma,
				actividadCronogramaId,
				grupoUsuarioId,
				gerenteArea,
				lider,
				actividad,
				fechaInicioEvalacion,
				fechaFinEvalacion,
				fechaInicioPlanAccion,
				fechaFinPlanAccion,
				prioridadGrupoUsuariosId,
				td.getUser(),td.getScopeGroupId());
		if (Validator.isNotNull(result)) {
			_log.debug("result:" + result);
			try {
				JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
			} catch (IOException e) {
				_log.error("e:" + e.getLocalizedMessage(), e);
			}
			SessionMessages.add(resourceRequest, "success");
		} else {
			SessionErrors.add(resourceRequest, "error");
		}
	}
		
	
}
