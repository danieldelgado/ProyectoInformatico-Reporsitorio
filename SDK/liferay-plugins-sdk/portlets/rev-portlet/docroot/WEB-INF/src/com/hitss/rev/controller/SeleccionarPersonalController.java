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

import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.SeleccionarPersonalService;
import com.hitss.rev.util.JsonUtil;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

@Controller("seleccionarPersonalController")
@RequestMapping(value = "VIEW")
public class SeleccionarPersonalController  extends RevController {

	private static Log _log = LogFactoryUtil.getLog(SeleccionarPersonalController.class);
	
	@Autowired
	private SeleccionarPersonalService seleccionarPersonalService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.info("defaultView");
		return super.defaultViewReclutamiento(request, response, model, (RevServiceImpl) seleccionarPersonalService);
	}
	
	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.info("irDefault");
		return super.irDefaultReclutamiento(request, response, model, (RevServiceImpl) seleccionarPersonalService);
	}

	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("listarSolicitudesReclutamiento");
		super.listarSolicitudesReclutamiento(resourceRequest, resourceResponse, (RevServiceImpl) seleccionarPersonalService);
	}
	
	@RenderMapping(params = "action=listarPostulantes")
	public String listarPostulantes(RenderRequest request, RenderResponse response, Model model) {
		_log.info("listarPostulantes");
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		List<UsuarioBean> listaUsuarios = seleccionarPersonalService.getListaPostulantes(td.getCompanyId(),td.getCompanyGroupId(),solicitudRequerimientoId);
		model.addAttribute("listaUsuarios",JsonUtil.getJsonString(listaUsuarios));
		
		
		return "listarPostulantes";
	}

	@RenderMapping(params = "action=irpostulante")
	public String irpostulante(RenderRequest request, RenderResponse response, Model model) {
		return "postulante";
	}
	@RenderMapping(params = "action=irdetallePostulante")
	public String irdetallePostulante(RenderRequest request, RenderResponse response, Model model) {
		return "detallePostulante";
	}
	
	
}
