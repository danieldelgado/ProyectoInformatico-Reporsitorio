package com.hitss.rec.registrarAvance.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller("registrarAvanceViewController")
@RequestMapping(value = "VIEW")
public class RegistrarAvanceViewController {

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {

		return "view";

	}
	

	

}
