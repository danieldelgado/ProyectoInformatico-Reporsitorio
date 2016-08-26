package com.hitss.rev.controller;

import java.io.IOException;
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

import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
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

	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");

		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			System.out.println(evaluarSolicitudRequerimientoService);
			SolicitudRequerimientoBean solicitudReclutamiento = evaluarSolicitudRequerimientoService.getSolicitudRequerimiento(solicitudRequerimientoId);
			model.addAttribute("solicitudReclutamiento", solicitudReclutamiento);
			model.addAttribute("requisitoEtiquetaBeans", JsonUtil.getJsonString(solicitudReclutamiento.getRequisitoEtiquetaBeans()));
		}

		List<PuestoBean> listaPuestoBeans = evaluarSolicitudRequerimientoService.getListaPuestos(td.getSiteGroup().getGroupId(), null);
		model.addAttribute("listaPuestoBeans", listaPuestoBeans);

		List<UsuarioBean> listaUsuarioBeans = evaluarSolicitudRequerimientoService.getListaResponsable(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaUsuarioBeans", listaUsuarioBeans);

		List<ParametroBean> listaTiempoContrato = evaluarSolicitudRequerimientoService.getTiempoContrato();
		model.addAttribute("listaTiempoContrato", listaTiempoContrato);

		List<ParametroBean> listaTipoNegocio = evaluarSolicitudRequerimientoService.getTipoNegocio();
		model.addAttribute("listaTipoNegocio", listaTipoNegocio);

		List<ParametroBean> listaClientes = evaluarSolicitudRequerimientoService.getClientes();
		model.addAttribute("listaClientes", listaClientes);

		List<ParametroBean> listaAreas = evaluarSolicitudRequerimientoService.getAreas();
		model.addAttribute("listaAreas", listaAreas);

		List<ParametroBean> listaNiveles = evaluarSolicitudRequerimientoService.getListaNiveles();
		model.addAttribute("listaNiveles", listaNiveles);

		List<ParametroBean> listaTipoRequisito = evaluarSolicitudRequerimientoService.getListaTipoRequisito();
		model.addAttribute("listaTipoRequisito", listaTipoRequisito);

		return "detalleSolicitud";
	}
	
}
 