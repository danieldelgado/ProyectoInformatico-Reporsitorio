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
<portlet:renderURL var="planificar">
	<portlet:param name="action" value="planificar" />
</portlet:renderURL>
<portlet:renderURL var="regresar">
	<portlet:param name="action" value="default" />
</portlet:renderURL>

<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>planificarUrl" type="hidden" value="${planificar}" />



<fieldset>
	<legend>Cronograma de solciitud de evaluación</legend>
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
							<th>Equipo</th>
							<th>Fecha evaluación inicio</th>
							<th>Fecha evaluación fin</th>
							<th>Fecha Inicio Plan de acción</th>
							<th>Fecha Fin Plan de acción</th>
							<th>Gerente Área</th>
							<th>Lider</th>
							<th>Opciones</th>
						</tr>
					</thead>
					<tbody id="<portlet:namespace/>listaGrupos">
						
					</tbody>
				</table>

			</div>
		</div>
		<div class="row">
					<div class="offset5 span2">
						<aui:button-row>
							<a class="btn btn-primary" href="${regresar}"> <liferay-ui:message key="general.form.opciones.salir" />
							</a>
						</aui:button-row>
					</div>
				</div>
	</div>
</fieldset>

<script type="text/javascript">
	$(document).ready(function() {
		inicializarListaGrupo('${listPrioridadGrupoUsuariosBeans}');
	});
</script>
