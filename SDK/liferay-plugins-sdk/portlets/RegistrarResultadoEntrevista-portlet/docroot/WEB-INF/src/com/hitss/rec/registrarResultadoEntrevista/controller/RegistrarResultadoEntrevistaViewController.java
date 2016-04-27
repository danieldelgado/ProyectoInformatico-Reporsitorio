package com.hitss.rec.registrarResultadoEntrevista.controller;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hitss.rec.registrarResultadoEntrevista.bean.SolicitudRequerimientoBean;
import com.hitss.rec.registrarResultadoEntrevista.bean.UsuarioEntrevistaBean;
import com.hitss.rec.registrarResultadoEntrevista.service.RegistrarResultadoEntrevistaService;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

@Controller("registrarResultadoEntrevistaViewController")
@RequestMapping(value = "VIEW")
public class RegistrarResultadoEntrevistaViewController {

	@Autowired
	private RegistrarResultadoEntrevistaService registrarResultadoEntrevistaService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {

		
		String puesto = ParamUtil.get(request, "puesto", "");
		String fechaEmisionInicio = ParamUtil.get(request, "fechaEmisionInicio", "");
		String fechaEmisionFin = ParamUtil.get(request, "fechaEmisionFin", "");
		String responsable = ParamUtil.get(request, "responsable", "");
		String tiempoContrato = ParamUtil.get(request, "tiempoContrato", "");
		if (tiempoContrato.equals("Seleccione") || tiempoContrato.equals(StringPool.BLANK)) {
			tiempoContrato = null;
		}
		List<SolicitudRequerimientoBean> listaSolicitudesEntrevistaBeans = registrarResultadoEntrevistaService.getListaSolicitudesEntrevista(puesto, fechaEmisionInicio, fechaEmisionFin,
				responsable, tiempoContrato);
		model.addAttribute("listaSolicitudesEntrevistaBeans", listaSolicitudesEntrevistaBeans);
		model.addAttribute("listaSolicitudesEntrevistaBeansCount", listaSolicitudesEntrevistaBeans.size());

		return "view";

	}
	

	

	@ActionMapping(value = "buscar")
	public void buscar(ActionRequest actionRequest, ActionResponse actionResponse, Model model) {
		String puesto = ParamUtil.get(actionRequest, "puesto", "");
		actionResponse.setRenderParameter("puesto", puesto);
		String fechaEmisionInicio = ParamUtil.get(actionRequest, "fechaEmisionInicio", "");
		actionResponse.setRenderParameter("fechaEmisionInicio", fechaEmisionInicio);
		String fechaEmisionFin = ParamUtil.get(actionRequest, "fechaEmisionFin", "");
		actionResponse.setRenderParameter("fechaEmisionFin", fechaEmisionFin);
		String responsable = ParamUtil.get(actionRequest, "responsable", "");
		actionResponse.setRenderParameter("responsable", responsable);
		String tiempoContrato = ParamUtil.get(actionRequest, "tiempoContrato", "");
		actionResponse.setRenderParameter("tiempoContrato", tiempoContrato);
	}
	
	@RenderMapping(params = "action=listaPostulantes")
	public String listaPostulantes(RenderRequest request, RenderResponse response, Model model) {
		
		PortletURL portletURL = response.createRenderURL();
//		SearchContainer searchContainer = new SearchContainer(request,
//				null, null, SearchContainer.DEFAULT_CUR_PARAM, 20, portletURL, null, null);
		
		String requerimeintoId = ParamUtil.get(request, "requerimeintoId", "");
		List<UsuarioEntrevistaBean> listaUsuarioEntrevistaBeans = registrarResultadoEntrevistaService.getListaUusariosEntrevistas(requerimeintoId);
		System.out.println(listaUsuarioEntrevistaBeans.size());
		model.addAttribute("requerimeintoId", requerimeintoId);
		model.addAttribute("listaUsuarioEntrevistaBeans", listaUsuarioEntrevistaBeans);
		model.addAttribute("listaUsuarioEntrevistaBeansCount", listaUsuarioEntrevistaBeans.size());
		
		return "listarEntrevistados";
	}
	
	
	

}
