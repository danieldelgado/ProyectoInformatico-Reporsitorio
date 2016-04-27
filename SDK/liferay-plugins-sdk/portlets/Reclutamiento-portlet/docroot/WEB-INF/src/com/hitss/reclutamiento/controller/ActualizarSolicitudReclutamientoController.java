package com.hitss.reclutamiento.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.hitss.reclutamiento.service.ActualizarSolicitudReclutamientoService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
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
		return "view";

	}

	@ResourceMapping(value = "listarPuestos")
	public void listarPuesto(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
		_log.debug("listarPuesto");
		String puesto = ParamUtil.getString(resourceRequest, "puesto");
		_log.debug("puesto:" + puesto);
		PuestoBean pst = new PuestoBean();
		pst.setDescripcion(puesto);
		List<PuestoBean> puestoBeans = actualizarSolicitudReclutamientoService.getListaPuestos(pst);
		JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), puestoBeans);
	}

	@RenderMapping(params = "action=actualizarSolicitud")
	public String actualizarSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");

		return "actualizarSolicitud";
	}

	@ResourceMapping(value = "actualizarSolicitud")
	public void actualizarSolicitud(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
		System.out.println(resourceRequest.getParameterMap());
		_log.debug("listarPuesto");
		
		ThemeDisplay td  =(ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		
		Long solicitudRequerimientoId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		Long puestoId = ParamUtil.getLong(resourceRequest, "puestoId");
		_log.debug("puestoId:" + puestoId);
		int cantidadRecursos = ParamUtil.getInteger(resourceRequest, "cantidadRecursos");
		_log.debug("cantidadRecursos:" + cantidadRecursos);
		Long areaSolicitanteId = ParamUtil.getLong(resourceRequest, "areaSolicitanteId");
		_log.debug("areaSolicitanteId:" + areaSolicitanteId);
		Date fechaLimiteVal = ParamUtil.getDate(resourceRequest, "fechaLimiteVal",sdf);
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
		solicitudRequerimiento.setAreaSolicitante(areaSolicitanteId);
		solicitudRequerimiento.setFechaLimite(fechaLimiteVal);
		solicitudRequerimiento.setPresupuestoMinimo(presupuestoMinimo);
		solicitudRequerimiento.setPresupuestoMaximo(presupuestoMaximo);
		solicitudRequerimiento.setResponsableRRHH(responsable);
		solicitudRequerimiento.setTiempoContrato(tiempoContrato);
		solicitudRequerimiento.setCliente(cliente);
		
		int result = actualizarSolicitudReclutamientoService.guardarSolicitudReclutamiento(solicitudRequerimiento ,  user);
		
		
		
		
		
		
		

	}

}
