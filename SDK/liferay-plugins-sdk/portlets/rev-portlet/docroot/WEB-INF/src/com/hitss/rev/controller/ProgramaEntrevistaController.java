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
import com.hitss.rev.service.ProgramarEntrevistaService;
import com.hitss.rev.util.JsonUtil;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

@Controller("programaEntrevistaController")
@RequestMapping(value = "VIEW")
public class ProgramaEntrevistaController extends RevController {
	

	private static Log _log = LogFactoryUtil.getLog(ProgramaEntrevistaController.class);
	
	@Autowired
	private ProgramarEntrevistaService programaEntrevistaService;
	
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		return super.defaultViewReclutamiento(request, response, model, (RevServiceImpl) programaEntrevistaService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("irDefault");
		return super.irDefaultReclutamiento(request, response, model, (RevServiceImpl) programaEntrevistaService);
	}


	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarSolicitudesReclutamiento");
		super.listarSolicitudesReclutamiento(resourceRequest, resourceResponse, (RevServiceImpl) programaEntrevistaService);
	}


	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");		
		return super.verDetalleSolicitudReclutamiento(request, response, model, (RevServiceImpl) programaEntrevistaService);
	}
	
	@RenderMapping(params = "action=listarPostulantes")
	public String listarPostulantes(RenderRequest request, RenderResponse response, Model model) {		
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		List<UsuarioBean> listaUsuarios = programaEntrevistaService.getListaPostulantes(td.getCompanyId(),td.getCompanyGroupId(),solicitudRequerimientoId);
		model.addAttribute("listaUsuarios",JsonUtil.getJsonString(listaUsuarios));
	
		return "listarPostulantes";
	}
	
	@RenderMapping(params = "action=programarEntrevista")
	public String programarEntrevista(RenderRequest request, RenderResponse response, Model model) {
		return "programarEntrevista";
	}
	
	@RenderMapping(params = "action=detallePostulante")
	public String detallePostulante(RenderRequest request, RenderResponse response, Model model) {
		return "detallePostulante";
	}
	
}
