package com.hitss.rev.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.ui.Model;

import com.hitss.rev.bean.ComboBean;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

public abstract class RevController {

	private static Log _log = LogFactoryUtil.getLog(RevController.class);
	
	public String defaultViewReclutamiento(RenderRequest request, RenderResponse response, Model model, RevServiceImpl service) {
		_log.debug("defaultView");
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		List<PuestoBean> listaPuestoBeans = service.getListaPuestos(td.getSiteGroup().getGroupId(), null);
		model.addAttribute("listaPuestoBeans", listaPuestoBeans);
		List<UsuarioBean> listaUsuarioBeans = service.getListaResponsable(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaUsuarioBeans", listaUsuarioBeans);
		List<ParametroBean> listaTiempoContrato = service.getTiempoContrato();
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
	
	public String defaultViewEvaluacion(RenderRequest request, RenderResponse response, Model model, RevServiceImpl service) {
		_log.debug("defaultView");
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		List<ComboBean> lstEstados = service.getEstados();
		model.addAttribute("lstEstados", lstEstados);
		
		Long solicitudEvaluacionId = ParamUtil.getLong(request, "solicitudEvaluacionId");
		_log.debug("solicitudEvaluacionId defaultView :" + solicitudEvaluacionId);
		if (Validator.isNotNull(solicitudEvaluacionId) || solicitudEvaluacionId > 0) {
			model.addAttribute("solicitudEvaluacionId", solicitudEvaluacionId);
			String mensaje = ParamUtil.get(request, "mensaje", "");
			_log.debug("mensaje defaultView :" + mensaje);
			model.addAttribute("mensaje", mensaje);
			String titulo = ParamUtil.get(request, "titulo", "");
			_log.debug("titulo:" + titulo);
			model.addAttribute("titulo", titulo);
		}
		return "view";
	}
	
	public String irDefaultReclutamiento(RenderRequest request, RenderResponse response, Model model, RevServiceImpl service) {
		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		String mensaje = ParamUtil.get(request, "mensaje", "");
		_log.debug("mensaje:" + mensaje);
		String titulo = ParamUtil.get(request, "titulo", "");
		_log.debug("titulo:" + titulo);
		response.addProperty("solicitudRequerimientoId", String.valueOf(solicitudRequerimientoId));
		response.addProperty("titulo", titulo);
		response.addProperty("mensaje", mensaje);
		return defaultViewReclutamiento(request, response, model,service);
	}
	
	public String irDefaultEvaluacion(RenderRequest request, RenderResponse response, Model model, RevServiceImpl service) {
		Long solicitudEvaluacionId = ParamUtil.getLong(request, "solicitudEvaluacionId");
		_log.debug("solicitudEvaluacionId:" + solicitudEvaluacionId);
		String mensaje = ParamUtil.get(request, "mensaje", "");
		_log.debug("mensaje:" + mensaje);
		String titulo = ParamUtil.get(request, "titulo", "");
		_log.debug("titulo:" + titulo);
		response.addProperty("solicitudEvaluacionId", String.valueOf(solicitudEvaluacionId));
		response.addProperty("titulo", titulo);
		response.addProperty("mensaje", mensaje);
		return defaultViewReclutamiento(request, response, model,service);
	}
	
	public void listarSolicitudesReclutamiento(ResourceRequest resourceRequest, ResourceResponse resourceResponse, RevServiceImpl service) {
		_log.debug("listarSolicitudesRelutamiento");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		_log.debug("getParameterMap:" + resourceRequest.getParameterMap());
		Long puestoId = ParamUtil.getLong(resourceRequest, "puestoId");
		_log.debug("puestoId:" + puestoId);

		Date fechaRegistroInicio = null;
		String fechaRegistroInicioVal = ParamUtil.get(resourceRequest, "fechaRegistroInicio", "");
		fechaRegistroInicio = Util.getFecha(fechaRegistroInicioVal);
		_log.debug("fechaRegistroInicio:" + fechaRegistroInicio);

		Date fechaRegistrFin = null;
		String fechaRegistroFinVal = ParamUtil.get(resourceRequest, "fechaRegistroFin", "");	
		fechaRegistrFin = Util.getFecha(fechaRegistroFinVal);		
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

		Map<String, Object> result = service.listarSolicitudesRequermiento(puestoId, fechaRegistroInicio, fechaRegistrFin, responsable, tiempoContrato, filas, pagina, orden, campoOrden);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}
	}
	
	public void listarSolicitudesEvaluacion(ResourceRequest resourceRequest, ResourceResponse resourceResponse, RevServiceImpl service) {
		_log.info("listarSolicitudesEvaluacion");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String descripcion = ParamUtil.get(resourceRequest, "descripcion","");
		_log.info("descripcion:" + descripcion);

		Date fechaEvaluacionInicio = null;
		String fechaEvaluacionInicioVal = ParamUtil.get(resourceRequest, "fechaRegistroInicioVal", "");
		if (Validator.isNotNull(fechaEvaluacionInicioVal)) {
			fechaEvaluacionInicio = ParamUtil.getDate(resourceRequest, "fechaRegistroInicioVal", sdf);
		}
		_log.info("fechaEvaluacionInicio:" + fechaEvaluacionInicio);

		Date fechaEvaluacionFin = null;
		String fechaEvaluacionFinVal = ParamUtil.get(resourceRequest, "fechaRegistroFinVal", "");
		if (Validator.isNotNull(fechaEvaluacionFinVal)) {
			fechaEvaluacionFin = ParamUtil.getDate(resourceRequest, "fechaRegistroFinVal", sdf);
		}
		_log.info("fechaEvaluacionFin:" + fechaEvaluacionFin);

		long estado = ParamUtil.getInteger(resourceRequest, "estado");
		_log.debug("estado:" + estado);

		int filas = ParamUtil.getInteger(resourceRequest, "filas");
		_log.debug("filas:" + filas);

		int pagina = ParamUtil.getInteger(resourceRequest, "pagina");
		_log.debug("pagina:" + pagina);

		String orden = ParamUtil.get(resourceRequest, "orden", "");
		_log.debug("orden:" + orden);

		String campoOrden = ParamUtil.get(resourceRequest, "campoOrden", "");
		_log.debug("campoOrden:" + campoOrden);

		Map<String, Object> result = service.listarSolicitudesEvaluacion(descripcion, fechaEvaluacionInicio, fechaEvaluacionFin, estado, filas, pagina, orden, campoOrden);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), result);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}
	}
	
	public void listarPuestosCategorias(ResourceRequest resourceRequest, ResourceResponse resourceResponse, RevServiceImpl service) {
		String filtro = ParamUtil.get(resourceRequest, "filtro", "");
		ThemeDisplay td = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		_log.debug("filtro:" + filtro);
		List<ComboBean> listaRequisitos = service.getListarPuestosCategorias(td.getSiteGroup().getGroupId(), filtro);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), listaRequisitos);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}
	}
	
	public String verDetalleSolicitudReclutamiento(RenderRequest request, RenderResponse response, Model model, RevServiceImpl service) {
		_log.debug("actualizarSolicitud");

		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		Long solicitudRequerimientoId = ParamUtil.getLong(request, "solicitudRequerimientoId");
		_log.debug("solicitudRequerimientoId:" + solicitudRequerimientoId);
		if (Validator.isNotNull(solicitudRequerimientoId) || solicitudRequerimientoId > 0) {
			SolicitudRequerimientoBean solicitudReclutamiento = service.getSolicitudRequerimiento(solicitudRequerimientoId);
			model.addAttribute("solicitudReclutamiento", solicitudReclutamiento);
			model.addAttribute("requisitoEtiquetaBeans", JsonUtil.getJsonString(solicitudReclutamiento.getRequisitoEtiquetaBeans()));
			model.addAttribute("funcionEtiquetaBeans", JsonUtil.getJsonString(solicitudReclutamiento.getFuncionEtiquetaBeans()));
		}

		List<PuestoBean> listaPuestoBeans = service.getListaPuestos(td.getSiteGroup().getGroupId(), null);
		model.addAttribute("listaPuestoBeans", listaPuestoBeans);

		List<UsuarioBean> listaUsuarioBeans = service.getListaResponsable(td.getCompanyId(), td.getCompanyGroupId());
		model.addAttribute("listaUsuarioBeans", listaUsuarioBeans);

		List<ParametroBean> listaTiempoContrato = service.getTiempoContrato();
		model.addAttribute("listaTiempoContrato", listaTiempoContrato);

		List<ParametroBean> listaTipoNegocio = service.getTipoNegocio();
		model.addAttribute("listaTipoNegocio", listaTipoNegocio);

		List<ParametroBean> listaClientes = service.getClientes();
		model.addAttribute("listaClientes", listaClientes);

		List<ParametroBean> listaAreas = service.getAreas();
		model.addAttribute("listaAreas", listaAreas);

		List<ParametroBean> listaNiveles = service.getListaNiveles();
		model.addAttribute("listaNiveles", listaNiveles);

		List<ParametroBean> listaTipoRequisito = service.getListaTipoRequisito();
		model.addAttribute("listaTipoRequisito", listaTipoRequisito);

		return "detalleSolicitud";
	}

	public void listarEtiquetas(ResourceRequest resourceRequest, ResourceResponse resourceResponse, RevServiceImpl service) {
		String requisito = ParamUtil.get(resourceRequest, "requisito", "");
		_log.debug("requisito:" + requisito);
		List<ComboBean> listaRequisitos = service.getListarEtiquetas(requisito);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), listaRequisitos);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}
	}
	public void listarFunciones(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse,
			RevServiceImpl service) {
		
		String funcion = ParamUtil.get(resourceRequest, "funcion", "");
		_log.debug("funcion:" + funcion);
		List<ComboBean> listaFunciones = service.getFuncionsByDescripcion(funcion);
		try {
			JsonUtil.sendJsonReturn(PortalUtil.getHttpServletResponse(resourceResponse), listaFunciones);
		} catch (IOException e) {
			_log.error("e:" + e.getLocalizedMessage(), e);
		}		
	}
	

}
