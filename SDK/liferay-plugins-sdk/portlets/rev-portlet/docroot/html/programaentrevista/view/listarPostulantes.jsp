
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

<portlet:renderURL var="programarEntrevista">
	<portlet:param name="action" value="programarEntrevista" />
</portlet:renderURL>
<input id="<portlet:namespace/>programarEntrevistaUrl" type="hidden" value="${programarEntrevista}" />

<input type="hidden" value="<portlet:namespace/>" />





<fieldset>
	<legend>Lista de Postulantes al requerimiento</legend>
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


				<table class="table table-hover table-bordered">
					<thead>
						<tr class="cabecera">
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.nombre" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.fechapostulacion" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.disponibilidad" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.fase" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.estado" /></th>
							<th><liferay-ui:message key="listasolicitudreclutamiento.lista.opciones" /></th>
						</tr>
					</thead>
					<tbody id="<portlet:namespace/>listaRequisitos">
						<tr>
							<td>Programador Java Junior</td>
							<td>5</td>
							<td>Claro Ecuador</td>
							<td>IVAN Usuario01 QUIROZ</td>
							<td>27/04/2016</td>
							<td>1 mes</td>
							<td><a class="btn btn-primary" href="${programarEntrevista}"> programarEntrevista </a></td>
						</tr>
						<tr>
							<td>Programador Java Junior</td>
							<td>5</td>
							<td>Claro Ecuador</td>
							<td>IVAN Usuario01 QUIROZ</td>
							<td>27/04/2016</td>
							<td>1 mes</td>
							<td><a class="btn btn-primary" href="${programarEntrevista}"> programarEntrevista </a></td>
						</tr>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</fieldset>

<script type="text/javascript">
	$(document).ready(function() {
		inicializarListaPotulantes();
	});
</script>