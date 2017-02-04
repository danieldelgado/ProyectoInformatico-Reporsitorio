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
	<legend>Publicar Oferta Laboral</legend>
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
			<form id="<portlet:namespace/>publicaroferta" name="<portlet:namespace/>publicaroferta" class="formulario">
				<input id="<portlet:namespace/>solicitudReclutamientoId" name="<portlet:namespace/>solicitudReclutamientoId" type="hidden" value="${solicitudReclutamiento.solicitudRequerimientoId}" />
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
						<div>
							<div class="span5">
								<label>Cantidad de Años en (${solicitudReclutamiento.strtipoNegocio}):</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<input id="<portlet:namespace/>cantidadAnnosRubro" name="<portlet:namespace/>rangoMinimo1" class="span8" type="text">
								</div>
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
								<textarea name="<portlet:namespace />descripcion" rows="" cols="" style="display: none;" disabled="disabled"></textarea>
							</div>
						</div>
					</div>
					<div class="row"></div>

					<div class="row">
						<fieldset>
							<legend> Lista de Evaluaciones </legend>
						</fieldset>
						<div class="container-fluid">
							<div>
								<div class="span12">
									<input id="<portlet:namespace/>evaluacionEntrevista1Id" name="<portlet:namespace/>evaluacionEntrevista1Id"  type="hidden" value="1" />
									<div class="span2">
										<label> Entrevista con Coordinador de RRHH :</label>
									</div>
									<div class="span2">
										<label> Rango Mínimo: </label>
									</div>
									<div class="span2">
										<input id="<portlet:namespace/>rangoMinimo1" name="<portlet:namespace/>rangoMinimo1" class="span8" type="text">
									</div>
									<div class="span2">
										<label> Rango Máximo: </label>
									</div>
									<div class="span2">
										<input id="<portlet:namespace/>rangoMaximo1" name="<portlet:namespace/>rangoMaximo1" class="span8" type="text">
									</div>
								</div>
							</div>
							<div>
								<div class="span12">
									<input id="<portlet:namespace/>evaluacionEntrevista2Id"  name="<portlet:namespace/>evaluacionEntrevista2Id"   type="hidden" value="2" />
									<div class="span2">
										<label> Entrevista Gérente Área :</label>
									</div>
									<div class="span2">
										<label> Rango Mínimo: </label>
									</div>
									<div class="span2">
										<input id="<portlet:namespace/>rangoMinimo2" name="<portlet:namespace/>rangoMinimo2" class="span8" type="text">
									</div>
									<div class="span2">
										<label> Rango Máximo: </label>
									</div>
									<div class="span2">
										<input id="<portlet:namespace/>rangoMaximo2" name="<portlet:namespace/>rangoMaximo2" class="span8" type="text">
									</div>

								</div>
							</div>
							<div>
								<div class="span12">
									<div class="span1">
										<label> Evaluación: </label>
									</div>
									<div class="span2">
										<div class="input-prepend">
											<select id="<portlet:namespace/>evaluacion" name="<portlet:namespace/>evaluacion" class="span12">
												<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
												<c:forEach items="${evaluaciones}" var="parametro">
													<option value="${parametro.evaluacionId}">${parametro.descripcion}</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="span1">
										<label> Rango Mínimo: </label>
									</div>
									<div class="span2">
										<input id="<portlet:namespace/>rangoMinimo" name="<portlet:namespace/>rangoMinimo" class="span8" type="text">
									</div>
									<div class="span1">
										<label> Rango Máximo: </label>
									</div>
									<div class="span2">
										<input id="<portlet:namespace/>rangoMaximo" name="<portlet:namespace/>rangoMaximo" class="span8" type="text">
									</div>
									<div class="span1">
										<div class="input-prepend">
											<button id="<portlet:namespace/>btnAgregar" class="btn btn-primary span12" type="button">
												<liferay-ui:message key="general.form.opciones.agregar" />
											</button>
										</div>
									</div>
								</div>
								<div id="">
									<table class="table table-hover table-bordered">
										<thead>
											<tr class="cabecera">
												<th>Evaluación</th>
												<th>Rango Mínimo</th>
												<th>Rango Máximo</th>
												<th>Opción</th>
											</tr>
										</thead>
										<tbody id="<portlet:namespace/>listaEvaluaciones">

										</tbody>
									</table>
								</div>

							</div>
						</div>
					</div>





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
	});

	function <portlet:namespace />initEditor() {
		return '<div class="container"><div class="offset1 span10"><div class="row-fluid" id=""><div class="" id=""><div class="span12" id=""><label for="" class="control-label" id=""> Puesto: </label></div><div class="controls span12"><div class="input-prepend"><label for="" class="control-label" id=""> ${solicitudReclutamiento.strpuesto}</label></div></div><div class="span12"><label> Tiempo Contrato: </label></div><div class="span12"><div class="input-prepend"><label for="" class="control-label" id=""> ${solicitudReclutamiento.strtiempoContrato}</label></div></div><div class="span12"><label> Tipo de Negocio: </label></div><div class="span12"><div class="input-prepend"><label for="" class="control-label" id=""> ${solicitudReclutamiento.strtipoNegocio}</label></div></div><div class="span12"><label> Especialidad: </label></div><div class="span12"><div class="input-prepend"><label for="" class="control-label" id=""> ${solicitudReclutamiento.especialidad} </label></div></div></div></div><div class="row"><fieldset><legend> Lista de requisitos </legend></fieldset><div class="container-fluid"><div><div id=""><table class="table table-hover table-bordered"><thead><tr class="cabecera"><th>Requisito</th><th>Años</th><th>Exigile</th><th>Tipo Requisito</th></tr></thead><tbody id="<portlet:namespace/>listaRequisitos">'
				+ listarRequisitosDetalle('${requisitoEtiquetaBeans}') + '</tbody></table></div></div></div></div></div></div>';
	}

	function <portlet:namespace />extractCodeFromEditor(htmlcontent) {
		htmlcontent = window.<portlet:namespace />editor.getHTML();
		return htmlcontent;
	}
</script>


