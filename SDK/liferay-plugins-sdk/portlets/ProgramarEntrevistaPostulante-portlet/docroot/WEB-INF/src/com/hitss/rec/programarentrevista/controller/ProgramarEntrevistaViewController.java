package com.hitss.rec.programarentrevista.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.google.gson.Gson;
import com.hitss.rec.programarentrevista.bean.SolicitudRequerimientoBean;
import com.hitss.rec.programarentrevista.bean.UsuarioEntrevistaBean;
import com.hitss.rec.programarentrevista.service.ProgramarEntrevistaService;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortalUtil;

@Controller("programarEntrevistaViewController")
@RequestMapping(value = "VIEW")
public class ProgramarEntrevistaViewController {

	private static Log log = LogFactoryUtil.getLog(ProgramarEntrevistaViewController.class);

	@Autowired
	private ProgramarEntrevistaService programarEntrevistaService;

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
		List<SolicitudRequerimientoBean> listaSolicitudesEntrevistaBeans = programarEntrevistaService.getListaSolicitudesEntrevista(puesto, fechaEmisionInicio, fechaEmisionFin,
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
		List<UsuarioEntrevistaBean> listaUsuarioEntrevistaBeans = programarEntrevistaService.getListaUusariosEntrevistas(requerimeintoId);
		System.out.println(listaUsuarioEntrevistaBeans.size());
		model.addAttribute("requerimeintoId", requerimeintoId);
		model.addAttribute("listaUsuarioEntrevistaBeans", listaUsuarioEntrevistaBeans);
		model.addAttribute("listaUsuarioEntrevistaBeansCount", listaUsuarioEntrevistaBeans.size());
		
		return "listaPostulantes";
	}

	@ResourceMapping(value = "filtrarPuesto")
	public void filtrarPuesto(ResourceRequest request, ResourceResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
		
        writer.print("");
        writer.flush();
        writer.close();
	}

	@ResourceMapping(value = "filtrarPesponsables")
	public void filtrarPesponsables(ResourceRequest request, ResourceResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
		
        writer.print("");
        writer.flush();
        writer.close();
		
	}
	
	

	@ResourceMapping(value = "programarEntrevista")
	public void programarEntrevista(ResourceRequest request, ResourceResponse response) throws IOException {

		HttpServletRequest httpServletRequest = PortalUtil.getHttpServletRequest(request);
		System.out.println(httpServletRequest.getParameterMap());
		System.out.println("asd1");
		String aspirante = ParamUtil.get(httpServletRequest, "aspirante", "");
		System.out.println(aspirante);
		String fechaEvalPsicologica = ParamUtil.get(httpServletRequest, "fechaEvalPsicologica", "");
		System.out.println(fechaEvalPsicologica);
		String fechaEvalTecnica = ParamUtil.get(httpServletRequest, "fechaEvalTecnica", "");
		System.out.println(fechaEvalTecnica);
		String fechaEvalGerenteArea = ParamUtil.get(httpServletRequest, "fechaEvalGerenteArea", "");
		System.out.println(fechaEvalGerenteArea);
		String fechaEvalRRHH = ParamUtil.get(httpServletRequest, "fechaEvalRRHH", "");
		System.out.println(fechaEvalRRHH);
		
		
		System.out.println("asd2");
		
        PrintWriter writer = response.getWriter();
		
    
        writer.print("hols");
        writer.flush();
        writer.close();
		
	}
	
	
	
}
