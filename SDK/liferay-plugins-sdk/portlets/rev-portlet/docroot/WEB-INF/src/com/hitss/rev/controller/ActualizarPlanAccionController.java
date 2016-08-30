package com.hitss.rev.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hitss.rev.util.RevController;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


@Controller("actualizarPlanAccionController")
@RequestMapping(value = "VIEW")
public class ActualizarPlanAccionController extends RevController {

	private static Log _log = LogFactoryUtil.getLog(ActualizarPlanAccionController.class);
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.debug("defaultView");
		
		return "view";

	}
	
	
}
  