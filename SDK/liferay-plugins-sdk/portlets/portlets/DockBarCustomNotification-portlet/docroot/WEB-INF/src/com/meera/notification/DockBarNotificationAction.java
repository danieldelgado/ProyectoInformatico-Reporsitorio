package com.meera.notification;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserNotificationEventLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DockBarNotificationAction
 */
public class DockBarNotificationAction extends MVCPortlet {
	public void sendUserNotification(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {

			List<User> users = UserLocalServiceUtil.getUsers(0,
					UserLocalServiceUtil.getUsersCount());
			ServiceContext serviceContext = ServiceContextFactory
					.getInstance(actionRequest);
			String notificationText = ParamUtil.getString(actionRequest,
					"notifciationText");
			for (User user : users) {
				JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
				payloadJSON.put("userId", user.getUserId());
				// payloadJSON.put("customEntityId",user.getUserId());
				payloadJSON.put("notificationText", notificationText);
				UserNotificationEventLocalServiceUtil.addUserNotificationEvent(
						user.getUserId(),
						DockBarUserNotificationHandler.PORTLET_ID,
						(new Date()).getTime(), user.getUserId(),
						payloadJSON.toString(), false, serviceContext);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
