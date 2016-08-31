<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>


<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:renderURL var="regresar">
	<portlet:param name="action" value="default" />
</portlet:renderURL>

<div>
	<c:forEach var="oferta" items="${listaOfertalLaboral}">

		<div>
			<fieldset>
				<legend>${oferta.titulo}</legend>
				${oferta.resumen}
				<br>
				${oferta.strFechaCreado}
				<div>
					<a href="${regresar}&articulo=${oferta.journalArticuleId}">Postular</a>
				</div>
			</fieldset>


		</div>

	</c:forEach>
</div>

