package com.hitss.rev.controller;

import java.util.List;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hitss.rev.bean.ComboBean;
import com.hitss.rev.service.ActualizarCronogramaService;
import com.hitss.rev.util.RevController;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Controller("actualizarCronogramaController")
@RequestMapping(value = "VIEW")
public class ActualizarCronogramaController extends RevController {

	private static Log _log = LogFactoryUtil.getLog(ActualizarCronogramaController.class);

	@Autowired
	private ActualizarCronogramaService actualizarCronogramaService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.info("defaultView");
		
		
		List<ComboBean> lstEstados = actualizarCronogramaService.getEstados();
		model.addAttribute("lstEstados", lstEstados);
		
		return "view";
	}


}
