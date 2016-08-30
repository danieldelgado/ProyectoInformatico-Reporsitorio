package com.hitss.rev.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hitss.rev.util.RevController;

@Controller("registrarResultadoPotulanteController")
@RequestMapping(value = "VIEW")
public class RegistrarResultadoPotulanteController extends RevController{
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {


		return "view";

	}
}
