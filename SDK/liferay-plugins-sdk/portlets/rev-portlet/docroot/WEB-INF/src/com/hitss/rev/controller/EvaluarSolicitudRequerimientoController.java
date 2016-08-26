package com.hitss.rev.controller;

import java.io.IOException;

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

import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.service.EvaluarSolicitudRequerimientoService;
import com.hitss.rev.service.impl.EvaluarSolicitudRequerimientoServiceImpl;
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


@Controller("evaluarSolicitudRequerimientoController")
@RequestMapping(value = "VIEW")
public class EvaluarSolicitudRequerimientoController  extends RevController {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);
	
	@Autowired
	private EvaluarSolicitudRequerimientoService evaluarSolicitudRequerimientoService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		return super.defaultView(request, response, model, (RevServiceImpl) evaluarSolicitudRequerimientoService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("irDefault");
		return super.irDefault(request, response, model, (RevServiceImpl) evaluarSolicitudRequerimientoService);
	}

	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarSolicitudesReclutamiento");
		super.listarSolicitudesReclutamiento(resourceRequest, resourceResponse, (RevServiceImpl) evaluarSolicitudRequerimientoService);
	}
	
	@ResourceMapping(value = "listarEtiquetas")
	public void listarEtiquetas(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarEtiquetas");
		super.listarEtiquetas(resourceRequest, resourceResponse, (RevServiceImpl) evaluarSolicitudRequerimientoService);
	}

	@ResourceMapping(value = "listarPuestosCategorias")
	public void listarPuestosCategorias(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarPuestosCategorias");
		super.listarPuestosCategorias(resourceRequest, resourceResponse, (RevServiceImpl) evaluarSolicitudRequerimientoService);
	}

	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");		
		return super.verDetalleSolicitud(request, response, model, (RevServiceImpl) evaluarSolicitudRequerimientoService);
	}

	@ResourceMapping(value = "aprobarSolicitud")
	public void aprobarSolicitud(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("aprobarSolicitud:");
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();
		Long solicitudRequerimientoId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		_log.info(solicitudRequerimientoId);
		Double presupuestoMinimo = ParamUtil.getDouble(resourceRequest, "presupuestoMinimo");
		Double presupuestoMaximo = ParamUtil.getDouble(resourceRequest, "presupuestoMaximo");
		_log.info("solicitudRequerimientoId:" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			SolicitudRequerimientoBean solicitudReclutamiento = 
					evaluarSolicitudRequerimientoService.evaluarSolicitudRequerimiento(Constantes.SOLICITUD_APROBADA,solicitudRequerimientoId,presupuestoMinimo,presupuestoMaximo,null,user);
			try {
				JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), solicitudReclutamiento);
			} catch (IOException e) {
				_log.error("e:" + e.getLocalizedMessage(), e);
			}
		}
		
	}

	@ResourceMapping(value = "rechazarSolicitud")
	public void rechazarSolicitud(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("rechazarSolicitud:");
		_log.info("aprobarSolicitud:");
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();

		Long solicitudRequerimientoId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		_log.info(solicitudRequerimientoId);
		String motivoRechazo = ParamUtil.get(resourceRequest, "motivo","");
		_log.info("solicitudRequerimientoId:" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			SolicitudRequerimientoBean solicitudReclutamiento = 
					evaluarSolicitudRequerimientoService.evaluarSolicitudRequerimiento(Constantes.SOLICITUD_RECHAZADA,solicitudRequerimientoId,null,null,motivoRechazo,user);
			try {
				JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), solicitudReclutamiento);
			} catch (IOException e) {
				_log.error("e:" + e.getLocalizedMessage(), e);
			}
		}
	}

	
}
 