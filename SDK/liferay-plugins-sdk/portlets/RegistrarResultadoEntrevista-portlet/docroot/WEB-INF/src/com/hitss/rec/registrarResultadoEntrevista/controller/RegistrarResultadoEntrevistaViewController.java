package com.hitss.rec.registrarResultadoEntrevista.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.rec.hitss.layer.model.Foo;
import com.rec.hitss.layer.service.FooLocalServiceUtil;

@Controller("registrarResultadoEntrevistaViewController")
@RequestMapping(value = "VIEW")
public class RegistrarResultadoEntrevistaViewController {

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {

		
	

		return "view";

	}
	

	

}
