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
import com.hitss.reclutamiento.service.ActualizarSolicitudReclutamientoService;
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
import com.rec.hitss.layer.util.JsonUtil;

@Controller("actualizarSolicitudReclutamientoController")
@RequestMapping(value = "VIEW")
public class ActualizarSolicitudReclutamientoController {

	private static Log _log = LogFactoryUtil.getLog(ActualizarSolicitudReclutamientoController.class);

	@Autowired
	private ActualizarSolicitudReclutamientoService actualizarSolicitudReclutamientoService;

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		List<PuestoBean> listaPuestoBeans = actualizarSolicitudReclutamientoService.getListaPuestos();
		model.addAttribute("listaPuestoBeans", listaPuestoBeans);
		List<UsuarioBean> listaUsuarioBeans = actualizarSolicitudReclutamientoService.getListaResponsable(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaUsuarioBeans", listaUsuarioBeans);
		List<ParametroBean> listaTiempoContrato = actualizarSolicitudReclutamientoService.getTiempoContrato();
		model.addAttribute("listaTiempoContrato", listaTiempoContrato);

		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId defaultView :" + solicitudRequerimientoId);
		if(Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId >0 ){
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
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		String mensaje = ParamUtil.get(request, "mensaje", "");
		_log.debug("mensaje:" + mensaje);
		String titulo = ParamUtil.get(request, "titulo", "");
		_log.debug("titulo:" + titulo);
		response.addProperty("solicitudRequerimientoId", String.valueOf(solicitudRequerimientoId));
		response.addProperty("titulo", titulo);
		response.addProperty("mensaje", mensaje);

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

		Map<String, Object> result = actualizarSolicitudReclutamientoService.listarSolicitudesRequermiento(puestoId, fechaRegistroInicio, fechaRegistrFin, responsable, tiempoContrato, filas, pagina, orden, campoOrden);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}
	}

	@RenderMapping(params = "action=actualizarSolicitud")
	public String iractualizarSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");

		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			SolicitudRequerimientoBean solicitudReclutamiento = actualizarSolicitudReclutamientoService.getSolicitudRequerimiento(solicitudRequerimientoId);
			model.addAttribute("solicitudReclutamiento", solicitudReclutamiento);
		}

		List<PuestoBean> listaPuestoBeans = actualizarSolicitudReclutamientoService.getListaPuestos();
		model.addAttribute("listaPuestoBeans", listaPuestoBeans);

		List<UsuarioBean> listaUsuarioBeans = actualizarSolicitudReclutamientoService.getListaResponsable(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaUsuarioBeans", listaUsuarioBeans);

		List<ParametroBean> listaTiempoContrato = actualizarSolicitudReclutamientoService.getTiempoContrato();
		model.addAttribute("listaTiempoContrato", listaTiempoContrato);

		List<ParametroBean> listaTipoNegocio = actualizarSolicitudReclutamientoService.getTipoNegocio();
		model.addAttribute("listaTipoNegocio", listaTipoNegocio);

		List<ParametroBean> listaClientes = actualizarSolicitudReclutamientoService.getClientes();
		model.addAttribute("listaClientes", listaClientes);

		List<ParametroBean> listaAreas = actualizarSolicitudReclutamientoService.getAreas();
		model.addAttribute("listaAreas", listaAreas);

		return "actualizarSolicitud";
	}

	@ResourceMapping(value = "actualizarSolicitud")
	public void actualizarSolicitud(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("actualizarSolicitud");

		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

		User user = td.getUser();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Long solicitudRequerimientoId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);

		Long puestoId = ParamUtil.getLong(resourceRequest, "puestoId");
		_log.debug("puestoId:" + puestoId);

		int cantidadRecursos = ParamUtil.getInteger(resourceRequest, "cantidadRecursos");
		_log.debug("cantidadRecursos:" + cantidadRecursos);

		Long areaSolicitante = ParamUtil.getLong(resourceRequest, "areaSolicitante");
		_log.debug("areaSolicitante:" + areaSolicitante);

		Date fechaLimiteVal = ParamUtil.getDate(resourceRequest, "fechaLimiteVal", sdf);
		_log.debug("fechaLimiteVal:" + fechaLimiteVal);

		long presupuestoMinimo = ParamUtil.getLong(resourceRequest, "presupuestoMinimo");
		_log.debug("presupuestoMinimo:" + presupuestoMinimo);

		int responsable = ParamUtil.getInteger(resourceRequest, "responsable");
		_log.debug("responsable:" + responsable);

		int tiempoContrato = ParamUtil.getInteger(resourceRequest, "tiempoContrato");
		_log.debug("tiempoContrato:" + tiempoContrato);

		int tipoNegocio = ParamUtil.getInteger(resourceRequest, "tipoNegocio");
		_log.debug("tipoNegocio:" + tipoNegocio);

		int cliente = ParamUtil.getInteger(resourceRequest, "cliente");
		_log.debug("cliente:" + cliente);

		long presupuestoMaximo = ParamUtil.getLong(resourceRequest, "presupuestoMaximo");
		_log.debug("presupuestoMaximo:" + presupuestoMaximo);

		SolicitudRequerimientoBean solicitudRequerimiento = new SolicitudRequerimientoBean();
		solicitudRequerimiento.setSolicitudRequerimientoId(solicitudRequerimientoId);
		solicitudRequerimiento.setPuestoId(puestoId);
		solicitudRequerimiento.setCantidadRecursos(cantidadRecursos);
		solicitudRequerimiento.setTipoNegocio(tipoNegocio);
		solicitudRequerimiento.setAreaSolicitante(areaSolicitante);
		solicitudRequerimiento.setFechaLimite(fechaLimiteVal);
		solicitudRequerimiento.setPresupuestoMinimo(presupuestoMinimo);
		solicitudRequerimiento.setPresupuestoMaximo(presupuestoMaximo);
		solicitudRequerimiento.setResponsableRRHH(responsable);
		solicitudRequerimiento.setTiempoContrato(tiempoContrato);
		solicitudRequerimiento.setCliente(cliente);

		Map<String, Object> result = actualizarSolicitudReclutamientoService.guardarSolicitudReclutamiento(solicitudRequerimiento, user);
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

	@ResourceMapping(value = "anularSolicitud")
	public void anularSolicitud(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {

	}

}
