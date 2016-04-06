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

<%@ include file="/html/portlet/portal_settings/init.jsp" %>

<liferay-ui:error-marker key="errorSection" value="authentication" />

<h3><liferay-ui:message key="authentication" /></h3>
<%  
String tabsatutenticaciones = StringUtil.merge(PropsValues.COMPANY_SETTINGS_FORM_AUTHENTICATION);
tabsatutenticaciones = tabsatutenticaciones.concat(", Linkedin");

String linkedInEnabled = PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.isenabled", "true");
String  linkedInAppKey= PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.apikey", "");
String linkedInAppSecretKey = PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.secretkey", "");
String linkedInProfileFormPopupEnabled = PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.isprofileformpopupenabled", "true");
String linkedInAutoLoginEnabled = PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.autologinenabled", "false");
//radio button fields: neverJoin, createAndJoin, joinExisting
String linkedInCreateOrganizationOption = PrefsPropsUtil.getString(company.getCompanyId(), "linkedin.linkedincreateorganizationoption", "neverJoin");

%> 
<liferay-ui:tabs
	names="<%= tabsatutenticaciones %>"
	refresh="<%= false %>"
>

	<%
	for (String section : PropsValues.COMPANY_SETTINGS_FORM_AUTHENTICATION) {
	%>

		<liferay-ui:section>
			<liferay-util:include page='<%= "/html/portlet/portal_settings/authentication/" + _getSectionJsp(section) + ".jsp" %>' portletId="<%= portletDisplay.getRootPortletId() %>" />
		</liferay-ui:section>

	<%
	}
	%>
	
	<liferay-ui:section>
		<aui:fieldset>
			<aui:input label="enabled" name='<%= "settings--linkedin.isenabled--" %>' type="checkbox" value="<%=linkedInEnabled%>" />

			<aui:input cssClass="lfr-input-text-container" label="api-key" name='<%= "settings--linkedin.apikey--" %>' type="text" value="<%=linkedInAppKey%>" />

			<aui:input cssClass="lfr-input-text-container" label="application-secret" name='<%= "settings--linkedin.secretkey--" %>' type="text" value="<%=linkedInAppSecretKey%>" />
			
			<aui:input label="enabled-profile-form-popup" name='<%= "settings--linkedin.isprofileformpopupenabled--" %>' type="checkbox" value="<%=linkedInProfileFormPopupEnabled%>" />
			
			<aui:input label="enabled-linkedin-autologin" name='<%= "settings--linkedin.autologinenabled--" %>' type="checkbox" value="<%=linkedInAutoLoginEnabled%>" helpMessage="enabled-linkedin-autologin-help"/>

			<aui:field-wrapper >
				<aui:input checked='<%= linkedInCreateOrganizationOption.equals("neverJoin") %>' inlineLabel="right" name="settings--linkedin.linkedincreateorganizationoption--" type="radio" value="neverJoin" label="never-join-organization" helpMessage="never-join-organization-help"/>
				<aui:input checked='<%= linkedInCreateOrganizationOption.equals("createAndJoin") %>' inlineLabel="right" name="settings--linkedin.linkedincreateorganizationoption--" type="radio" value="createAndJoin" label="create-and-join-organization"  helpMessage="create-and-join-organization-help"/>
				<aui:input checked='<%= linkedInCreateOrganizationOption.equals("joinExisting") %>' inlineLabel="right" name="settings--linkedin.linkedincreateorganizationoption--" type="radio" value="joinExisting" label="join-existing-organization"  helpMessage="join-existing-organization-help"/>
			</aui:field-wrapper>
			
		</aui:fieldset>
	</liferay-ui:section>
	
</liferay-ui:tabs>

<%!
private String _getSectionJsp(String name) {
	return TextFormatter.format(name, TextFormatter.N);
}
%>