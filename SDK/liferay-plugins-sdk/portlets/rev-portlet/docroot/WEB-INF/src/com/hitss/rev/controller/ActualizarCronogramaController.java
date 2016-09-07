package com.hitss.rev.controller;

import java.util.List;

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

import com.hitss.rev.bean.ActividadCronogramaBean;
import com.hitss.rev.bean.PrioridadGrupoUsuariosBean;
import com.hitss.rev.service.ActualizarCronogramaService;
import com.hitss.rev.util.JsonUtil;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

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
		System.out.println(request.getParameterMap());
		Long solicitudEvaluacionId = ParamUtil.getLong(request, "solicitudEvaluacionId");
		_log.info("solicitudEvaluacionId:"+solicitudEvaluacionId);	
		Long prioridadGrupoUsuariosId = ParamUtil.getLong(request, "prioridadGrupoUsuariosId");
		_log.info("prioridadGrupoUsuariosId:"+prioridadGrupoUsuariosId);	
		Long cronograma = ParamUtil.getLong(request, "cronograma");
		_log.info("cronograma:"+cronograma);	
		Long actividadCronogramaId = ParamUtil.getLong(request, "actividadCronogramaId");
		_log.info("actividadCronogramaId:"+actividadCronogramaId);	
		Long grupoUsuario = ParamUtil.getLong(request, "grupoUsuario");
		_log.info("grupoUsuario:"+grupoUsuario);	
		
		ActividadCronogramaBean actividadCronogramaBean = actualizarCronogramaService.getActividadCronograma(solicitudEvaluacionId,prioridadGrupoUsuariosId,cronograma,actividadCronogramaId,grupoUsuario);
		model.addAttribute("actividadCronograma", actividadCronogramaBean);
		model.addAttribute("solicitudEvaluacionId", solicitudEvaluacionId);
		model.addAttribute("prioridadGrupoUsuariosId", prioridadGrupoUsuariosId);
		model.addAttribute("cronograma", cronograma);
		model.addAttribute("actividadCronogramaId", actividadCronogramaId);
		model.addAttribute("grupoUsuario", grupoUsuario);
		
		
		
		return "planificar";
	}
	
	
	@ResourceMapping(value = "guardarPlanificar")
	public void guardarPlanificar(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("guardarPlanificar");
		
		
		
		
		
	}
		
	
}
