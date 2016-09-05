package com.hitss.rev.controller;

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

import com.hitss.rev.service.ActualizarCronogramaService;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

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
	
	
	
}
