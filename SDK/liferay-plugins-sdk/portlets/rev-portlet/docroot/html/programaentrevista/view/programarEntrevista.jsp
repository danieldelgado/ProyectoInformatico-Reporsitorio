
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.util.Constants"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:renderURL var="detallePostulante">
	<portlet:param name="action" value="detallePostulante" />
</portlet:renderURL>
<input id="<portlet:namespace/>detallePostulanteUrl" type="hidden" value="${detallePostulante}" />

<input type="hidden" value="<portlet:namespace/>" />





<a class="btn btn-primary" href="${detallePostulante}"> detallePostulante </a>

<script type="text/javascript">
	$(document).ready(function() {
		inicializarFormularioProgramacionEntrevista();
	});
</script>