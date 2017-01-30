package com.hitss.rev.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
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

import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.SeleccionarPersonalService;
import com.hitss.rev.util.JsonUtil;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

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
		
		super.verDetalleSolicitudReclutamiento(request, response, model, (RevServiceImpl) seleccionarPersonalService);
		
		List<UsuarioBean> listaUsuarios = seleccionarPersonalService.getListaPostulantes(td.getCompanyId(),td.getCompanyGroupId(),solicitudRequerimientoId);
		model.addAttribute("listaUsuarios",JsonUtil.getJsonString(listaUsuarios));
		int c = 0;
		for (UsuarioBean usuarioBean : listaUsuarios) {
			if(usuarioBean.getCercania()<=0.3){
				c++;
			}
		}		
		model.addAttribute("cantidadPostulantes",c);
		
		return "listarPostulantes";
	}

	@RenderMapping(params = "action=irpostulante")
	public String irpostulante(RenderRequest request, RenderResponse response, Model model) {
		_log.info("irpostulante");
		Long solicitudId = ParamUtil.getLong(request, "solicitudId");
		Long userId = ParamUtil.getLong(request, "userId");	
		UsuarioBean usuarioPostualnte = seleccionarPersonalService.getPostulanteDetalle(solicitudId,userId);
		model.addAttribute("usuarioPostulante",usuarioPostualnte);	
		model.addAttribute("solicitudId",solicitudId);
		model.addAttribute("userId",userId);
		return "postulante";
	}
		
	@ResourceMapping(value = "seleccionarPostulante")
	public void seleccionarPostulante(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("seleccionarPostulante");
		Long solicitudId = ParamUtil.getLong(resourceRequest, "solicitudId");
		Long userId = ParamUtil.getLong(resourceRequest, "userId");
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		
		Map<String, Object> result = seleccionarPersonalService.seleccionarPostulaste(solicitudId,userId,td.getUser());
		
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
		
	@RenderMapping(params = "action=irdetallePostulante")
	public String irdetallePostulante(RenderRequest request, RenderResponse response, Model model) {
		Long solicitudId = ParamUtil.getLong(request, "solicitudId");
		Long userId = ParamUtil.getLong(request, "userId");
		_log.info("irdetallePostulante " + " |solicitudId:"+solicitudId+ " |userId:"+userId );
		UsuarioBean usuarioPostualnte = seleccionarPersonalService.getPostulanteDetalle(solicitudId,userId);
		model.addAttribute("usuarioPostulante",usuarioPostualnte);		
		return "detallePostulante";
	}
	

	@ResourceMapping(value = "extenderPublicacion")
	public void extenderPublicacionUrl(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("listarSolicitudesReclutamiento");
		Long solicitudId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		_log.info("solicitudId 		: "+solicitudId);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaLimite2Val = ParamUtil.getDate(resourceRequest, "fechaLimite2Val", sdf);
		_log.info("fechaLimite2Val 	: "+fechaLimite2Val);
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();
		Map<String, Object> result = seleccionarPersonalService.extenderFechaLimite(solicitudId, fechaLimite2Val,  user,td.getScopeGroupId());
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
