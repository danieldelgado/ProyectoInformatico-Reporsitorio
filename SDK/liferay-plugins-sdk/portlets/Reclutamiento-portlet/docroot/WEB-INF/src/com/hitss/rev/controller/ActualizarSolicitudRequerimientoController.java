package com.hitss.rev.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hitss.rev.service.ActualizarSolicitudReclutamientoService;

@Controller("actualizarSolicitudRequerimientoController")
@RequestMapping(value = "VIEW")
public class ActualizarSolicitudRequerimientoController {
	
	@Autowired
	private ActualizarSolicitudReclutamientoService actualizarSolicitudReclutamientoService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {


		System.out.println(actualizarSolicitudReclutamientoService);

		return "view";

	}
	

}
