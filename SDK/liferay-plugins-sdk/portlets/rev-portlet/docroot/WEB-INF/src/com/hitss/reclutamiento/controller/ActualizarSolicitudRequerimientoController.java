package com.hitss.reclutamiento.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller("actualizarSolicitudRequerimientoController")
@RequestMapping(value = "VIEW")
public class ActualizarSolicitudRequerimientoController {
	
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {


		return "view";

	}
	

}
