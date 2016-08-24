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

<portlet:resourceURL var="publicarOfertaReclutamiento" id="publicarOfertaReclutamiento" />

<portlet:renderURL var="regresar">
	<portlet:param name="action" value="default" />
</portlet:renderURL>

<portlet:resourceURL var="publicarOferta" id="publicarOferta" />

<input type="hidden" value="<portlet:namespace/>" />

<input id="<portlet:namespace/>regresar" type="hidden" value="${regresar}" />
<input id="<portlet:namespace/>publicarOfertaUrl" type="hidden" value="${publicarOferta}" />

<input id="<portlet:namespace/>popupPublicacionTitulo" type="hidden" value="<liferay-ui:message key="publicar.oferta.mensaje.publicar.popup.titulo" />" />
<input id="<portlet:namespace/>popupPublicacionMensage" type="hidden" value="<liferay-ui:message key="publicar.oferta.mensaje.publicar.popup.mensaje" />" />

<input id="<portlet:namespace/>popupMensaje" type="hidden" value="<liferay-ui:message key="publicar.oferta.mensaje.publicar" />" />
<input id="<portlet:namespace/>msgError" type="hidden" value="<liferay-ui:message key="general.form.error" />" />

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<fieldset>
	<legend>Lista de Solicitudes de Reclutamiento</legend>
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
			<form id="<portlet:namespace/>publicaroferta" class="formulario">
				<input id="<portlet:namespace/>solicitudReclutamientoId" type="hidden" value="${solicitudReclutamiento.solicitudRequerimientoId}" />
				<div class="row-fluid">
					<div class="span12">
						<div>
							<div class="span5">
								<label>Puesto:</label>
							</div>
							<div class="span6">
								<label>${solicitudReclutamiento.strpuesto}</label>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha registro:</label>
							</div>
							<div class="span6">
								<label>${solicitudReclutamiento.strfechacrea}</label>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha Limite:</label>
							</div>
							<div class="span6">
								<label>${solicitudReclutamiento.strfechaLimite}</label>
							</div>
						</div>
					</div>
					<div>
						<div class="span12">
							<div class="span12">
								<label>Descripcion:</label>
							</div>
							<div class="span12">
								<liferay-ui:input-editor />
								<input name="<portlet:namespace />htmlCodeFromEditorPlacedHere" type="hidden" value="" />
							</div>
						</div>
					</div>
				</div>
				<div class="row-fluid">

					<fieldset>
						<legend>Vista previa de la publicación</legend>




					</fieldset>

				</div>
				<div class="row">
					<div class="offset5 span2">
						<aui:button-row>
							<a class="btn btn-primary" id="<portlet:namespace/>btnGuardar" href="javascript:void(0)"> <liferay-ui:message key="general.form.opciones.guardar" />
							</a>
							<a class="btn btn-primary" href="${regresar}"> <liferay-ui:message key="general.form.opciones.salir" />
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
		inicializarFormularioPublicarOferta();
		listarRequisitos('${requisitoEtiquetaBeans}');

	});

	function <portlet:namespace />initEditor() {
		return '';
	}

	function <portlet:namespace />extractCodeFromEditor() {

		console.log("1");
		console.log(window.<portlet:namespace />editor.getHTML());
		console.log("2");
		console.log($('#<portlet:namespace />htmlCodeFromEditorPlacedHere'));
		
		var html = "'" + window.<portlet:namespace />editor.getHTML() + "'"; 
		var greeting = $('#<portlet:namespace />htmlCodeFromEditorPlacedHere').val( window.<portlet:namespace />editor.getHTML() );
		console.log("3");
		console.log(greeting);
	

	}
</script>


