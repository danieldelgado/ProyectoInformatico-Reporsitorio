<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/portlet/login/init.jsp"%>

<%
	boolean linkedInEnabled = com.liferay.portal.util.PrefsPropsUtil.getBoolean(company.getCompanyId(), "linkedin.isenabled", false);
	boolean linkedInProfileFormPopupEnabled = com.liferay.portal.util.PrefsPropsUtil.getBoolean(company.getCompanyId(), "linkedin.isprofileformpopupenabled", true);
	boolean linkedInAutoLoginEnabled = com.liferay.portal.util.PrefsPropsUtil.getBoolean(company.getCompanyId(), "linkedin.autologinenabled", false);
	String linkedInCreateOrganizationOption = com.liferay.portal.util.PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.linkedincreateorganizationoption",
			"neverJoin");
	String apiKey = com.liferay.portal.util.PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.apikey", "");
%>

<liferay-util:buffer var="navigation">
	<liferay-ui:icon-list>

		<%
			for (String section : PropsValues.LOGIN_FORM_NAVIGATION_PRE) {
		%>

		<liferay-util:include page='<%="/html/portlet/login/navigation/" + _getSectionJsp(section) + ".jsp"%>' portletId="<%=portletDisplay.getRootPortletId()%>" />

		<%
			}

					for (String section : PropsValues.LOGIN_FORM_NAVIGATION_POST) {
		%>

		<liferay-util:include page='<%="/html/portlet/login/navigation/" + _getSectionJsp(section) + ".jsp"%>' portletId="<%=portletDisplay.getRootPortletId()%>" />

		<%
			}
		%>
		<c:if test="<%=linkedInEnabled%>">
			<li role="presentation" class="" > 
				<%@ include file="linkedinSignin.jsp"%>
			</li>
		</c:if>
	</liferay-ui:icon-list>
</liferay-util:buffer>

<%
	navigation = navigation.trim();
%>

<c:if test="<%=Validator.isNotNull(navigation)%>">
	<div class="navigation">
		<%=navigation%>
	</div>
</c:if>

<%!private String _getSectionJsp(String name) {
		return TextFormatter.format(name, TextFormatter.N);
	}%>




