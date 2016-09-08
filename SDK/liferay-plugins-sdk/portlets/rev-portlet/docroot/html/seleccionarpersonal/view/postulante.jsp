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

<portlet:resourceURL id="seleccionarPostulante" var="seleccionarPostulante" > </portlet:resourceURL>


<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>seleccionarPostulanteUrl" type="hidden" value="${seleccionarPostulante}" />

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<fieldset>
	<legend>Seleccionar al postulante</legend>
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
		<div class="offset1 span10">
			<form id="<portlet:namespace/>seleccionarPostulante" class="formulario">
				<input id="<portlet:namespace/>solicitudId" name="<portlet:namespace/>solicitudId" type="hidden" value="${solicitudId}" />
				<input id="<portlet:namespace/>userId" name="<portlet:namespace/>userId" type="hidden" value="${userId}" />
			

				<div class="row-fluid"></div>
				<div class="row">
					<div class="span12"></div>
				</div>
				<div class="row">
					<div class="offset5 span2">
						<aui:button-row>
							<a class="btn btn-primary" id="<portlet:namespace/>btnGuardar" href="javascript:void(0)"> <liferay-ui:message key="general.form.seleccionar" />
							</a>
							
							<portlet:renderURL var="listarPostulantes">
								<portlet:param name="action" value="listarPostulantes" />
								<portlet:param name="solicitudRequerimientoId" value="${solicitudId}" />
							</portlet:renderURL>
							
							<a class="btn btn-primary" href="${listarPostulantes}"> <liferay-ui:message key="general.form.opciones.salir" />
							</a>
						</aui:button-row>
					</div>
				</div>
			</form>
		</div>
	</div>
</fieldset>

<div class="yui3-skin-sam">
	<div id="<portlet:namespace/>modal"></div>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		inicializarFormularioSeleccion();
	});
</script>