package com.meera.liferay.aui.auto.completelist;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class LiferayAUIAutoCompleteListWithAjaxAction
 */
public class LiferayAUIAutoCompleteListWithAjaxAction extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);

		System.out.println("Constants.CMD: " + cmd);
		if (cmd.equals("get_users")) {
			getUsers(resourceRequest, resourceResponse);
		}

	}

	private void getUsers(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		JSONArray usersJSONArray = JSONFactoryUtil.createJSONArray();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		String userEmail = ParamUtil.getString(resourceRequest, "userEmail");
		System.out.println("=====00000========" + userEmail);
		DynamicQuery userQuery = DynamicQueryFactoryUtil.forClass(User.class,
				PortalClassLoaderUtil.getClassLoader());
		Criterion criterion = RestrictionsFactoryUtil.like("emailAddress",
				StringPool.PERCENT + userEmail + StringPool.PERCENT);
		userQuery.add(criterion);
		JSONObject userJSON = null;
		System.out.println("=====1111========" + userQuery.toString());
		try {
			List<User> userList = UserLocalServiceUtil.dynamicQuery(userQuery);
			System.out.println("=====222========" + userList.size());
			for (User user : userList) {
				userJSON = JSONFactoryUtil.createJSONObject();
				userJSON.put("userId", user.getUserId());
				userJSON.put("email", user.getEmailAddress());
				userJSON.put("firstName", user.getFirstName());
				usersJSONArray.put(userJSON);
			}
		} catch (Exception e) {

		}
		PrintWriter out = resourceResponse.getWriter();
		out.println(usersJSONArray.toString());
	}

}
