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

import com.hitss.rev.bean.FuncionEtiquetaBean;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.RequisitoEtiquetaBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.ActualizarSolicitudReclutamientoService;
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

@Controller("actualizarSolicitudReclutamientoController")
@RequestMapping(value = "VIEW")
public class ActualizarSolicitudReclutamientoController extends RevController {

	private static Log _log = LogFactoryUtil.getLog(ActualizarSolicitudReclutamientoController.class);

	@Autowired
	private ActualizarSolicitudReclutamientoService actualizarSolicitudReclutamientoService;

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		return super.defaultView(request, response, model, (RevServiceImpl) actualizarSolicitudReclutamientoService);
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("irDefault");
		return super.irDefault(request, response, model, (RevServiceImpl) actualizarSolicitudReclutamientoService);
	}

	@ResourceMapping(value = "listarSolicitudesReclutamiento")
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarSolicitudesReclutamiento");
		super.listarSolicitudesReclutamiento(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudReclutamientoService);
	}
	
	@ResourceMapping(value = "listarEtiquetas")
	public void listarEtiquetas(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarEtiquetas");
		super.listarEtiquetas(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudReclutamientoService);
	}
	
	@ResourceMapping(value = "listarFunciones")
	public void listarFunciones(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarFunciones");
		super.listarFunciones(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudReclutamientoService);
	}

	@ResourceMapping(value = "listarPuestosCategorias")
	public void listarPuestosCategorias(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		_log.debug("listarPuestosCategorias");
		super.listarPuestosCategorias(resourceRequest, resourceResponse, (RevServiceImpl) actualizarSolicitudReclutamientoService);
	}

	@RenderMapping(params = "action=verDetalleSolicitud")
	public String verDetalleSolicitud(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("actualizarSolicitud");		
		return super.verDetalleSolicitud(request, response, model, (RevServiceImpl) actualizarSolicitudReclutamientoService);
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
			model.addAttribute("requisitoEtiquetaBeans", JsonUtil.getJsonString(solicitudReclutamiento.getRequisitoEtiquetaBeans()));
			model.addAttribute("funcionEtiquetaBeans", JsonUtil.getJsonString(solicitudReclutamiento.getFuncionEtiquetaBeans()));
			}

		List<PuestoBean> listaPuestoBeans = actualizarSolicitudReclutamientoService.getListaPuestos(td.getSiteGroup().getGroupId(), null);
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

		List<ParametroBean> listaNiveles = actualizarSolicitudReclutamientoService.getListaNiveles();
		model.addAttribute("listaNiveles", listaNiveles);

		List<ParametroBean> listaTipoRequisito = actualizarSolicitudReclutamientoService.getListaTipoRequisito();
		model.addAttribute("listaTipoRequisito", listaTipoRequisito);

		return "actualizarSolicitud";
	}

	@SuppressWarnings("unchecked")
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

		String proyecto = ParamUtil.get(resourceRequest, "proyecto","");
		_log.debug("proyecto:" + proyecto);

		int responsable = ParamUtil.getInteger(resourceRequest, "responsable");
		_log.debug("responsable:" + responsable);

		int tiempoContrato = ParamUtil.getInteger(resourceRequest, "tiempoContrato");
		_log.debug("tiempoContrato:" + tiempoContrato);

		int tipoNegocio = ParamUtil.getInteger(resourceRequest, "tipoNegocio");
		_log.debug("tipoNegocio:" + tipoNegocio);

		int cliente = ParamUtil.getInteger(resourceRequest, "cliente");
		_log.debug("cliente:" + cliente);

		String especialidad = ParamUtil.get(resourceRequest, "especialidad","");
		_log.debug("especialidad:" + especialidad);

		String requisitosLista = ParamUtil.get(resourceRequest, "requisitosList", "");
		String funcionList = ParamUtil.get(resourceRequest, "funcionList", "");
		
		SolicitudRequerimientoBean solicitudRequerimiento = new SolicitudRequerimientoBean();
		solicitudRequerimiento.setSolicitudRequerimientoId(solicitudRequerimientoId);
		solicitudRequerimiento.setPuestoId(puestoId);
		solicitudRequerimiento.setCantidadRecursos(cantidadRecursos);
		solicitudRequerimiento.setTipoNegocio(tipoNegocio);
		solicitudRequerimiento.setAreaSolicitante(areaSolicitante);
		solicitudRequerimiento.setFechaLimite(fechaLimiteVal);
		solicitudRequerimiento.setResponsableRRHH(responsable);
		solicitudRequerimiento.setTiempoContrato(tiempoContrato);
		solicitudRequerimiento.setCliente(cliente);
		solicitudRequerimiento.setEspecialidad(especialidad);
		solicitudRequerimiento.setProyecto(proyecto);

		List<RequisitoEtiquetaBean> lista = (List<RequisitoEtiquetaBean>) JsonUtil.getJsonObject(requisitosLista, new com.google.gson.reflect.TypeToken<List<RequisitoEtiquetaBean>>() {
		});
		solicitudRequerimiento.setRequisitoEtiquetaBeans(lista);
		List<FuncionEtiquetaBean> listafuncion = (List<FuncionEtiquetaBean>) JsonUtil.getJsonObject(funcionList, new com.google.gson.reflect.TypeToken<List<FuncionEtiquetaBean>>() {
		});
		solicitudRequerimiento.setFuncionEtiquetaBeans(listafuncion);

		Map<String, Object> result = actualizarSolicitudReclutamientoService.guardarSolicitudReclutamiento(solicitudRequerimiento, user,td.getScopeGroupId());
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
		_log.debug("actualizarSolicitud");

		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

		User user = td.getUser();

		Long solicitudRequerimientoId = ParamUtil.getLong(resourceRequest, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		SolicitudRequerimientoBean solicitudRequerimiento = new SolicitudRequerimientoBean();
		solicitudRequerimiento.setSolicitudRequerimientoId(solicitudRequerimientoId);

		Map<String, Object> result = actualizarSolicitudReclutamientoService.anularSolicitudReclutamiento(solicitudRequerimiento, user);
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
