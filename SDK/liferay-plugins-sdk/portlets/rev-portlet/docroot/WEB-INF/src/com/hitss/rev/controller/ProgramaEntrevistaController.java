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

import com.hitss.rev.bean.FasePostulacionBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.ProgramarEntrevistaService;
import com.hitss.rev.util.JsonUtil;
import com.hitss.rev.util.RevController;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

@Controller("programaEntrevistaController")
@RequestMapping(value = "VIEW")
public class ProgramaEntrevistaController extends RevController {
	

	private static Log _log = LogFactoryUtil.getLog(ProgramaEntrevistaController.class);
	
	@Autowired
	private ProgramarEntrevistaService programaEntrevistaService;
	
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.info("defaultView");
		return super.defaultViewReclutamiento(request, response, model, (RevServiceImpl) programaEntrevistaService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.info("irDefault");
		return super.irDefaultReclutamiento(request, response, model, (RevServiceImpl) programaEntrevistaService);
	}


	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.info("listarSolicitudesReclutamiento");
		super.listarSolicitudesReclutamiento(resourceRequest, resourceResponse, (RevServiceImpl) programaEntrevistaService);
	}


	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.info("actualizarSolicitud");		
		return super.verDetalleSolicitudReclutamiento(request, response, model, (RevServiceImpl) programaEntrevistaService);
	}
	
	@RenderMapping(params = "action=listarPostulantes")
	public String listarPostulantes(RenderRequest request, RenderResponse response, Model model) {	
		_log.info("listarPostulantes");		
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		List<UsuarioBean> listaUsuarios = programaEntrevistaService.getListaPostulantes(td.getCompanyId(),td.getCompanyGroupId(),solicitudRequerimientoId);
		model.addAttribute("listaUsuarios",JsonUtil.getJsonString(listaUsuarios));
		return "listarPostulantes";
	}
	
	@RenderMapping(params = "action=irprogramarEntrevista")
	public String irprogramarEntrevista(RenderRequest request, RenderResponse response, Model model) {
//		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
//		User user = td.getUser();
		Long solicitudId = ParamUtil.getLong(request, "solicitudId");
		_log.info("solicitudId:" + solicitudId);
		Long userId = ParamUtil.getLong(request, "userId");
		_log.info("userId:" + userId);
		try {
			SolicitudRequerimientoBean s = programaEntrevistaService.getSolicitudRequerimiento(solicitudId);
			FasePostulacionBean fasePsicologia = programaEntrevistaService.getFasePsicologia(solicitudId,userId);
			FasePostulacionBean faseTecnica = programaEntrevistaService.getFaseTecnica(solicitudId,userId);
			FasePostulacionBean faseEntreCoordRRHH = programaEntrevistaService.getFaseEntreCoodRRHH(solicitudId,userId);
			FasePostulacionBean faseEntreGerenteArea = programaEntrevistaService.getFaseEntreGerenteArea(solicitudId,userId);	
			model.addAttribute("solicitudReclutamiento", s);
			model.addAttribute("fasePsicologia", fasePsicologia);
			_log.info("fasePsicologia:" + fasePsicologia);
			model.addAttribute("faseTecnica", faseTecnica);
			_log.info("faseTecnica:" + faseTecnica);
			model.addAttribute("faseEntreCoordRRHH", faseEntreCoordRRHH);
			_log.info("faseEntreCoordRRHH:" + faseEntreCoordRRHH);
			model.addAttribute("faseEntreGerenteArea", faseEntreGerenteArea);
			_log.info("faseEntreGerenteArea:" + faseEntreGerenteArea);
			
			User u = UserLocalServiceUtil.getUser(userId);
			Boolean colaborador = (Boolean) u.getExpandoBridge().getAttribute("Colaborador");	
			model.addAttribute("userId", userId);
			model.addAttribute("bcol", colaborador);
			model.addAttribute("colaborador", colaborador?"Interno":"Externo");
			
		} catch (PortalException | SystemException e) {
			_log.error("Error irprogramarEntrevista",e);
		}
		return "programarEntrevista";
	}
	
	@ResourceMapping(value = "guardarProgramacionEntrevista")
	public void guardarProgramacionEntrevista(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();
		_log.info("guardarProgramacionEntrevista");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Long solicitudId = ParamUtil.getLong(resourceRequest, "solicitudId");
		_log.info("solicitudId:" + solicitudId);
		Long userId = ParamUtil.getLong(resourceRequest, "userId");
		_log.info("userId:" + userId);
		
		Long fasepostulacionPicologicaId = ParamUtil.getLong(resourceRequest, "fasepostulacionPicologicaId");
		_log.info("userId:" + fasepostulacionPicologicaId);
		Date fechaEvaluacionPsicologicaVal = ParamUtil.getDate(resourceRequest, "fechaEvaluacionPsicologicaVal",sdf);
		_log.info("fechaEvaluacionPsicologicaVal:" + fechaEvaluacionPsicologicaVal);
		FasePostulacionBean fasePsicologia = new FasePostulacionBean();
		fasePsicologia.setFasepostulacionId(fasepostulacionPicologicaId);
		fasePsicologia.setFechaFase(fechaEvaluacionPsicologicaVal);

		Long fasepostulacionTecnicaId = ParamUtil.getLong(resourceRequest, "fasepostulacionTecnicaId");
		_log.info("fasepostulacionTecnicaId:" + fasepostulacionTecnicaId);
		Date fechaEvaluacionTecnicaVal = ParamUtil.getDate(resourceRequest, "fechaEvaluacionTecnicaVal",sdf);
		_log.info("fechaEvaluacionTecnicaVal:" + fechaEvaluacionTecnicaVal);
		FasePostulacionBean faseTecnica = new FasePostulacionBean();
		faseTecnica.setFasepostulacionId(fasepostulacionTecnicaId);
		faseTecnica.setFechaFase(fechaEvaluacionTecnicaVal);
		


		Long fasepostulacionEntreCoordRRHHId = ParamUtil.getLong(resourceRequest, "fasepostulacionEntreCoordRRHHId");
		_log.info("fasepostulacionEntreCoordRRHHId:" + fasepostulacionEntreCoordRRHHId);
		Date fechaEvaluacionEntreCoordRRHHVal = ParamUtil.getDate(resourceRequest, "fechaEvaluacionEntreCoordRRHHVal",sdf);
		_log.info("fechaEvaluacionEntreCoordRRHHVal:" + fechaEvaluacionEntreCoordRRHHVal);
		FasePostulacionBean faseEntreCoordRRHH = new FasePostulacionBean();
		faseEntreCoordRRHH.setFasepostulacionId(fasepostulacionEntreCoordRRHHId);
		faseEntreCoordRRHH.setFechaFase(fechaEvaluacionEntreCoordRRHHVal);

		
		
		Long fasepostulacionEntreGerenteAreaId = ParamUtil.getLong(resourceRequest, "fasepostulacionEntreGerenteAreaId");
		_log.info("fasepostulacionEntreGerenteAreaId:" + fasepostulacionEntreGerenteAreaId);
		Date fechaEvaluacionEntreGerenteAreaVal = ParamUtil.getDate(resourceRequest, "fechaEvaluacionEntreGerenteAreaVal",sdf);
		_log.info("fechaEvaluacionEntreGerenteAreaVal:" + fechaEvaluacionEntreGerenteAreaVal);
		FasePostulacionBean faseEntreGerenteArea = new FasePostulacionBean();
		faseEntreGerenteArea.setFasepostulacionId(fasepostulacionEntreGerenteAreaId);
		faseEntreGerenteArea.setFechaFase(fechaEvaluacionEntreGerenteAreaVal);
		
		Map<String, Object> result = programaEntrevistaService.guardarProgramacionEntevista(solicitudId,userId,user,fasePsicologia,faseTecnica,faseEntreCoordRRHH,faseEntreGerenteArea);
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
		return "detallePostulante";
	}
	
}
