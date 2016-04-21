<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.liferay.portal.util.PortalUtil"%>


<portlet:defineObjects />
<liferay-theme:defineObjects/>

<liferay-ui:ratings className="${journalArticleclassName}"
    classPK="${resourcePrimKey}" type="stars" />

<br>
<br>

<liferay-ui:journal-article showTitle="false" articleId="${articleId}" groupId="${groupId}"  />


<br>
<br>

<liferay-ui:panel-container extended="<%=false%>"
    id="insultCommentsPanelContainer" persistState="<%=true%>">

    <liferay-ui:panel collapsible="<%=true%>" extended="<%=true%>"
        id="insultCommentsPanel" persistState="<%=true%>"
        title='comments'>

        <portlet:actionURL name="invokeTaglibDiscussion" var="discussionURL" />

        <%
        String currentUrl = PortalUtil.getCurrentURL(request);
        %>

        <liferay-ui:discussion className="${journalArticleclassName}"
            classPK="${resourcePrimKey}"
            formAction="<%=discussionURL%>" formName="fm2"
            ratingsEnabled="<%=true%>" redirect="<%=currentUrl%>"
            subject="Subjenteeeee"
            userId="${userId}" />

    </liferay-ui:panel>
</liferay-ui:panel-container>


