
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

<portlet:resourceURL var="noAsistio" id="noAsistio" />

<portlet:renderURL var="regresar">
	<portlet:param name="action" value="default" />
</portlet:renderURL>


<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>noAsistioUrl" type="hidden" value="${noAsistio}" />
<input id="<portlet:namespace/>regresarUrl" type="hidden" value="${regresar}" />

<input id="<portlet:namespace/>popupconfirmarMensage" type="hidden" value="Se registro la no asistencia" />
<input id="<portlet:namespace/>popupPublicacionTitulo" type="hidden" value="No Asistencia" />
<input id="<portlet:namespace/>popupMensaje" type="hidden" value="Registro de no asistencia" />

<input id="<portlet:namespace/>msgError" type="hidden" value="<liferay-ui:message key="general.form.error" />" />

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<fieldset>
	<legend>Registrar Resultado del postulante</legend>
	<div class="container">
		<div class="contenedorAlerta"></div>
		<div class="offset1 span10">
			<form id="<portlet:namespace/>noAsistio" name="<portlet:namespace/>noAsistio" class="formulario">
				<input id="<portlet:namespace/>solicitudId" name="<portlet:namespace/>solicitudId" type="hidden" value="${solicitudPostulacionBean.solicitudId}" /> 
				<input id="<portlet:namespace/>userId" name="<portlet:namespace/>userId" type="hidden" value="${userId}" />
				<div class="row-fluid"></div>
				<div class="row-fluid">
					<div class="span12"></div>


					<div class="span12">
						<div class="span12"></div>

						<div class="span5">
							<label> Fase de Postulación: </label>
						</div>
						<div class="span6">
							<div class="input-prepend">
								<select id="<portlet:namespace/>fasePostulacion" name="<portlet:namespace/>fasePostulacion" class="span12">
									<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
									<option label="" value="78">Evaluación Piscológica</option>
									<option label="" value="79">Evaluación Técnica</option>
									<option label="" value="80">Entrevista con RRHH</option>
									<option label="" value="81">Entrevista con Gerente de Área</option>
								</select>
							</div>
						</div>
						<div class="span5">
							<label> Observación: </label>
						</div>
						<div class="span6">
							<div class="input-prepend">
								<textarea id="<portlet:namespace/>observacion" name="<portlet:namespace/>observacion" rows="" cols=""></textarea>
							</div>
						</div>

					</div>
				</div>
				<div class="row">
					<div class="offset4 span4">
						<aui:button-row>
							<button id="<portlet:namespace/>btnGuardar" class="btn btn-primary" type="button">
								<liferay-ui:message key="general.form.opciones.guardar" />
							</button>
							<portlet:renderURL var="listarPostulantes">
								<portlet:param name="action" value="listarPostulantes" />
								<portlet:param name="solicitudRequerimientoId" value="${solicitudReclutamiento.solicitudRequerimientoId}" />
							</portlet:renderURL>
							<input id="<portlet:namespace/>listarPostulantesUrl" name="<portlet:namespace/>listarPostulantesUrl" type="hidden" value="${listarPostulantes}" />
							<a class="btn btn-primary" href="${listarPostulantes}"> Cancelar </a>
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
		inicializarFormularioRegsitroNoAsistencia();
	});
</script>