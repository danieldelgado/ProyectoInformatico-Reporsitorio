package com.hitss.rev.test.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.tagplugins.jstl.core.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

@Controller("testViewController")
@RequestMapping(value = "VIEW")
public class TestViewController {

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {

		return "view";

	}

	@ResourceMapping(value = "myInfo")
	public void getMyInformation(ResourceRequest request, ResourceResponse response) throws IOException {

		JSONObject json = JSONFactoryUtil.createJSONObject();
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			User user = themeDisplay.getUser();
			response.setCharacterEncoding("UTF-8");
			json.put("firstName", user != null ? user.getFirstName() : "");
			json.put("lastName", user != null ? user.getLastName() : "");
			response.getWriter().write(json.toString());
		} catch (Exception e) {
		}
	}

	@ResourceMapping(value = "ajaxtagstest")
	public void ajaxtagstest(ResourceRequest request, ResourceResponse response) throws IOException {

		JSONObject json = JSONFactoryUtil.createJSONObject();
		JSONObject jsonchilder = null;
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			User user = themeDisplay.getUser();
			response.setCharacterEncoding("UTF-8");
			
			HttpServletRequest req = PortalUtil.getHttpServletRequest(request);
			
			System.out.println(req.getParameterMap());
			System.out.println(request.getParameterMap());
			String query = ParamUtil.get(request, "query", "");
			System.out.println("query");
			System.out.println(query);
			List<JSONObject> listanombres = new ArrayList<JSONObject>();
			
			for (int i = 0; i < 10; i++) {
				jsonchilder = JSONFactoryUtil.createJSONObject();
				jsonchilder.put("nombre",user.getLastName()+"-"+i);
				listanombres.add(jsonchilder);
			}
			System.out.println(listanombres);
			
			json.put("results", listanombres.toString());
			
			response.getWriter().write(json.toString());
		} catch (Exception e) {
		}
	}

}
