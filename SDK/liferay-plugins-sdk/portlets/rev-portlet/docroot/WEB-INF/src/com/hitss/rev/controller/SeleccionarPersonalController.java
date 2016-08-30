package com.hitss.rev.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hitss.rev.service.SeleccionarPersonalService;

@Controller("seleccionarPersonalController")
@RequestMapping(value = "VIEW")
public class SeleccionarPersonalController {
	
	@Autowired
	private SeleccionarPersonalService seleccionarPersonalService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		
		seleccionarPersonalService.selectPersonal();

		return "view";

	}
}
