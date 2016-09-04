package com.hitss.rev.controller;

import java.util.List;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hitss.rev.bean.OfertalLaboral;
import com.hitss.rev.service.PostularOfertaLaboralService;
import com.hitss.rev.util.RevController;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;



@Controller("postularOfertaLaboralController")
@RequestMapping(value = "VIEW")
public class PostularOfertaLaboralController extends RevController{


	private static Log _log = LogFactoryUtil.getLog(PostularOfertaLaboralController.class);

	@Autowired
	private PostularOfertaLaboralService postularOfertaLaboralService;
	
	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {
		_log.info("defaultView");
//		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
//		User user = td.getUser();
		List<OfertalLaboral> lista = postularOfertaLaboralService.getListaOfertaLaboral(0, 0, 0);
		model.addAttribute("listaOfertalLaboral", lista);
		return "view";
	}

	@RenderMapping(params = "action=default")
	public String irDefault(RenderRequest request, RenderResponse response, Model model) {
		_log.info("irDefault");		
		Long articulo = ParamUtil.getLong(request, "articulo");
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();
		
		postularOfertaLaboralService.postularOferta(articulo,user);
		
		_log.info("articulo:"+articulo);	
		return defaultView(request, response, model);
	}
	

}
