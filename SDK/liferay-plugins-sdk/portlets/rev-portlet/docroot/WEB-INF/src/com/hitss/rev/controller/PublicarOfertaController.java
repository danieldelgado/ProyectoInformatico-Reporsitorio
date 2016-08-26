package com.hitss.rev.controller;

import java.io.IOException;
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

import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.service.PublicarOfertaService;
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

@Controller("publicarOfertaController")
@RequestMapping(value = "VIEW")
public class PublicarOfertaController  extends RevController {

	private static Log _log = LogFactoryUtil.getLog(PublicarOfertaController.class);

	@Autowired
	private PublicarOfertaService publicarOfertaService;

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		return super.defaultView(request, response, model, (RevServiceImpl) publicarOfertaService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("irDefault");
		return super.irDefault(request, response, model, (RevServiceImpl) publicarOfertaService);
	}

	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarSolicitudesReclutamiento");
		super.listarSolicitudesReclutamiento(resourceRequest, resourceResponse, (RevServiceImpl) publicarOfertaService);
	}


	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");		
		return super.verDetalleSolicitud(request, response, model, (RevServiceImpl) publicarOfertaService);
	}

	@RenderMapping(params = "action=publicarOferta")
	public String publicarOferta(RenderRequest request, RenderResponse response, Model model) {
//		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			SolicitudRequerimientoBean solicitudReclutamiento = publicarOfertaService.getSolicitudRequerimiento(solicitudRequerimientoId);
			model.addAttribute("solicitudReclutamiento", solicitudReclutamiento);
			model.addAttribute("requisitoEtiquetaBeans", JsonUtil.getJsonString(solicitudReclutamiento.getRequisitoEtiquetaBeans()));
		}

		return "publicarOferta";
	}

	@ResourceMapping(value = "publicarOferta")
	public void publicarOfertaLaboral(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("publicarOfertaLaboral");
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();		
		HttpServletRequest h = PortalUtil.getHttpServletRequest(resourceRequest);
		Long solicitudRequerimientoId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		String descripcion = ParamUtil.get(resourceRequest, "editor_descripcion", "");
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			_log.info("solicitudRequerimientoId:"+solicitudRequerimientoId);
			_log.info("descripcion:"+descripcion);
			Map<String, Object> result = publicarOfertaService.publicarOfertaLaboral(solicitudRequerimientoId,td.getScopeGroupId(), descripcion, user, true, h);			
			_log.info("result:"+result);
			try {
				JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
			} catch (IOException e) {
				_log.error("e:" + e.getLocalizedMessage(), e);
			}
		}
	}

	@ResourceMapping(value = "finalizarOferta")
	public void finalizarOferta(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("finalizarOferta");
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();
		Long solicitudRequerimientoId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {

			Map<String, Object> result = publicarOfertaService.publicarOfertaLaboral(solicitudRequerimientoId,td.getScopeGroupId(), null, user, false, null);
			
			_log.info("result:"+result);
			try {
				JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
			} catch (IOException e) {
				_log.error("e:" + e.getLocalizedMessage(), e);
			}
		}
	}
	
}
