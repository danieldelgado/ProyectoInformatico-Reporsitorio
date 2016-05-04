package com.hitss.rev.test.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller("test3ViewController")
@RequestMapping(value = "VIEW")
public class Test3ViewController {

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {

		

		return "view";

	}
	

	

}
