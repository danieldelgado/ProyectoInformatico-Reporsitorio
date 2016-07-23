package com.hitss.reclutamiento.controller;

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

import com.hitss.reclutamiento.bean.ParametroBean;
import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.hitss.reclutamiento.bean.UsuarioBean;
import com.hitss.reclutamiento.service.ProgramarEntrevistaService;
import com.hitss.reclutamiento.util.JsonUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

@Controller("programaEntrevistaController")
@RequestMapping(value = "VIEW")
public class ProgramaEntrevistaController {
	

	private static Log _log = LogFactoryUtil.getLog(ProgramaEntrevistaController.class);
	
	@Autowired
	private ProgramarEntrevistaService programaEntrevistaService;
	
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		List<PuestoBean> listaPuestoBeans = programaEntrevistaService.getListaPuestos(td.getSiteGroup().getGroupId(), null);
		model.addAttribute("listaPuestoBeans", listaPuestoBeans);
		List<UsuarioBean> listaUsuarioBeans = programaEntrevistaService.getListaResponsable(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaUsuarioBeans", listaUsuarioBeans);
		List<ParametroBean> listaTiempoContrato = programaEntrevistaService.getTiempoContrato();
		model.addAttribute("listaTiempoContrato", listaTiempoContrato);

		
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId defaultView :" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			model.addAttribute("solicitudRequerimientoId", solicitudRequerimientoId);
			String mensaje = ParamUtil.get(request, "mensaje", "");
			_log.debug("mensaje defaultView :" + mensaje);
			model.addAttribute("mensaje", mensaje);
			String titulo = ParamUtil.get(request, "titulo", "");
			_log.debug("titulo:" + titulo);
			model.addAttribute("titulo", titulo);
		}


		return "view";

	}
	
	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		return defaultView(request, response, model);
	}

	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarSolicitudesRelutamiento");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Long puestoId = ParamUtil.getLong(resourceRequest, "puestoId");
		_log.debug("puestoId:" + puestoId);

		Date fechaRegistroInicio = null;
		String fechaRegistroInicioVal = ParamUtil.get(resourceRequest, "fechaRegistroInicioVal", "");
		if (Validator.isNotNull(fechaRegistroInicioVal)) {
			fechaRegistroInicio = ParamUtil.getDate(resourceRequest, "fechaRegistroInicioVal", sdf);
		}
		_log.debug("fechaRegistroInicio:" + fechaRegistroInicio);

		Date fechaRegistrFin = null;
		String fechaRegistroFinVal = ParamUtil.get(resourceRequest, "fechaRegistroFinVal", "");
		if (Validator.isNotNull(fechaRegistroFinVal)) {
			fechaRegistrFin = ParamUtil.getDate(resourceRequest, "fechaRegistroFinVal", sdf);
		}
		_log.debug("fechaRegistrFin:" + fechaRegistrFin);

		int responsable = ParamUtil.getInteger(resourceRequest, "responsable");
		_log.debug("responsable:" + responsable);

		int tiempoContrato = ParamUtil.getInteger(resourceRequest, "tiempoContrato");
		_log.debug("tiempoContrato:" + tiempoContrato);

		int filas = ParamUtil.getInteger(resourceRequest, "filas");
		_log.debug("filas:" + filas);

		int pagina = ParamUtil.getInteger(resourceRequest, "pagina");
		_log.debug("pagina:" + pagina);

		String orden = ParamUtil.get(resourceRequest, "orden", "");
		_log.debug("orden:" + orden);

		String campoOrden = ParamUtil.get(resourceRequest, "campoOrden", "");
		_log.debug("campoOrden:" + campoOrden);

		Map<String, Object> result = programaEntrevistaService.listarSolicitudesRequermiento(puestoId, fechaRegistroInicio, fechaRegistrFin, responsable, tiempoContrato, filas, pagina, orden, campoOrden);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}
	}
	
	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");

		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			SolicitudRequerimientoBean solicitudReclutamiento = programaEntrevistaService.getSolicitudRequerimiento(solicitudRequerimientoId);
			model.addAttribute("solicitudReclutamiento", solicitudReclutamiento);
			model.addAttribute("requisitoEtiquetaBeans", JsonUtil.getJsonString(solicitudReclutamiento.getRequisitoEtiquetaBeans()));
		}

		List<PuestoBean> listaPuestoBeans = programaEntrevistaService.getListaPuestos(td.getSiteGroup().getGroupId(), null);
		model.addAttribute("listaPuestoBeans", listaPuestoBeans);

		List<UsuarioBean> listaUsuarioBeans = programaEntrevistaService.getListaResponsable(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaUsuarioBeans", listaUsuarioBeans);

		List<ParametroBean> listaTiempoContrato = programaEntrevistaService.getTiempoContrato();
		model.addAttribute("listaTiempoContrato", listaTiempoContrato);

		List<ParametroBean> listaTipoNegocio = programaEntrevistaService.getTipoNegocio();
		model.addAttribute("listaTipoNegocio", listaTipoNegocio);

		List<ParametroBean> listaClientes = programaEntrevistaService.getClientes();
		model.addAttribute("listaClientes", listaClientes);

		List<ParametroBean> listaAreas = programaEntrevistaService.getAreas();
		model.addAttribute("listaAreas", listaAreas);

		List<ParametroBean> listaNiveles = programaEntrevistaService.getListaNiveles();
		model.addAttribute("listaNiveles", listaNiveles);

		List<ParametroBean> listaTipoRequisito = programaEntrevistaService.getListaTipoRequisito();
		model.addAttribute("listaTipoRequisito", listaTipoRequisito);

		return "detalleSolicitud";
	}
	
	@RenderMapping(params = "action=listarPostulantes")
	public String listarPostulantes(RenderRequest request, RenderResponse response, Model model) {		
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		List<UsuarioBean> listaUsuarios = programaEntrevistaService.getListaPostulantes(td.getCompanyId(),td.getCompanyGroupId(),solicitudRequerimientoId);
		model.addAttribute("listaUsuarios", listaUsuarios);
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
