
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

<portlet:renderURL var="postulante">
	<portlet:param name="action" value="irpostulante" />
</portlet:renderURL>
<portlet:renderURL var="detallePostulante">
	<portlet:param name="action" value="irdetallePostulante" />
</portlet:renderURL>
<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>postulanteUrl" type="hidden" value="${postulante}" />
<input id="<portlet:namespace/>detallePostulanteUrl" type="hidden" value="${detallePostulante}" />



<fieldset>
	<legend>Lista de Postulantes del requerimiento</legend>
	<div class="container">
		<div class="contenedorAlerta">
			<c:if test="${not empty mensaje}">
				<div class="alert alert-success">
					<button type="button" class="calert close" data-dismiss="alert">&times;</button>
					<h4>${titulo}</h4>
					${mensaje}
				</div>
			</c:if>
		</div>

		<div class="row-fluid">
			<div class="span12">


				<table  class="table table-hover table-bordered">
					<thead>
						<tr class="cabecera">
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.nombre" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.fechapostulacion" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.disponibilidad" /></th>
							<th>Interno</th>
							<th>Fase de Postulación</th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.estado" /></th>
							<th><liferay-ui:message key="listasolicitudreclutamiento.lista.opciones" /></th>
						</tr>
					</thead>
					<tbody id="<portlet:namespace/>listaPostulantes">
						
					</tbody>
				</table>

			</div>
		</div>
	</div>
</fieldset>

<script type="text/javascript">
	$(document).ready(function() {
		inicializarListaPotulantes('${listaUsuarios}');
	});
</script>