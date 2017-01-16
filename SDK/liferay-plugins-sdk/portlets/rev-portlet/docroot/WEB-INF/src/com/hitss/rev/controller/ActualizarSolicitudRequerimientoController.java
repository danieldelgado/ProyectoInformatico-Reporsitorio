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

import com.hitss.rev.service.ActualizarSolicitudRequerimientoService;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Controller("actualizarSolicitudRequerimientoController")
@RequestMapping(value = "VIEW")
public class ActualizarSolicitudRequerimientoController extends RevController {
	
	
	private static Log _log = LogFactoryUtil.getLog(ActualizarSolicitudRequerimientoController.class);

	@Autowired
	private ActualizarSolicitudRequerimientoService actualizarSolicitudRequerimientoService;

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		return super.defaultViewReclutamiento(request, response, model, (RevServiceImpl) actualizarSolicitudRequerimientoService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("irDefault");
		return super.irDefaultReclutamiento(request, response, model, (RevServiceImpl) actualizarSolicitudRequerimientoService);
	}

	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarSolicitudesReclutamiento");
		super.listarSolicitudesReclutamiento(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudRequerimientoService);
	}
	
	@ResourceMapping(value = "listarEtiquetas")
	public void listarEtiquetas(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarEtiquetas");
		super.listarEtiquetas(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudRequerimientoService);
	}
	
	@ResourceMapping(value = "listarFunciones")
	public void listarFunciones(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarFunciones");
		super.listarFunciones(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudRequerimientoService);
	}

	@ResourceMapping(value = "listarPuestosCategorias")
	public void listarPuestosCategorias(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarPuestosCategorias");
		super.listarPuestosCategorias(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudRequerimientoService);
	}

	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");		
		return super.verDetalleSolicitudReclutamiento(request, response, model, (RevServiceImpl) actualizarSolicitudRequerimientoService);
	}
	

}
