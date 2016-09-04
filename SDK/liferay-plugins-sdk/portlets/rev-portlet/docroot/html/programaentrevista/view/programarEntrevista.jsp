
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

<portlet:resourceURL var="guardarProgramacionEntrevista" id="guardarProgramacionEntrevista" />


<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>guardarProgramacionEntrevistaUrl" type="hidden" value="${guardarProgramacionEntrevista}" />

<input id="<portlet:namespace/>popupconfirmarMensage" type="hidden" value="Programación de Entrevista" />
<input id="<portlet:namespace/>popupMensaje" type="hidden" value="Registro de Programación de Entrevista" />

<input id="<portlet:namespace/>msgError" type="hidden" value="<liferay-ui:message key="general.form.error" />" />

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<fieldset>
	<legend>Programar Entevista para Postulante ${colaborador}</legend>
	<div class="container">
		<div class="contenedorAlerta"></div>
		<div class="offset1 span10">
			<form id="<portlet:namespace/>programarEntrevista"
				name="<portlet:namespace/>programarEntrevista" class="formulario">
				<input id="<portlet:namespace/>solicitudId"
					name="<portlet:namespace/>solicitudId" type="hidden"
					value="${solicitudReclutamiento.solicitudRequerimientoId}" /> <input
					id="<portlet:namespace/>userId" name="<portlet:namespace/>userId"
					type="hidden" value="${userId}" />
				<div class="row-fluid"></div>
				<div class="row-fluid">
					<div class="span12"></div>
										${ colaborador }
					<c:if test="${ !colaborador }">					
						<div class="span12">
							<div>
								<div class="span5">
									<label> Fecha evaluación Piscólogica: </label>
								</div>
								<div class="span6">
									<input id="<portlet:namespace/>fasepostulacionPicologicaId"
										name="<portlet:namespace/>fasepostulacionPicologicaId"
										type="hidden" value="${fasePsicologia.fasepostulacionId}" />
	
									<div class="input-prepend">
										<span class="add-on"><i class="icon-calendar"></i></span> <input
											class="span7" value="${fasePsicologia.strfechaFase}"
											id="<portlet:namespace/>fechaEvaluacionPsicologica"
											name="<portlet:namespace/>fechaEvaluacionPsicologica"
											type="text" placeholder="DD/MM/YYYY"
											onKeyPress="return false;" /> <input
											id="<portlet:namespace/>fechaEvaluacionPsicologicaVal"
											name="<portlet:namespace/>fechaEvaluacionPsicologicaVal"
											type="hidden" value="${fasePsicologia.strfechaFase}" />
									</div>
								</div>
							</div>
	
						</div>
						<div class="span12">
							<div>
								<div class="span5">
									<label> Fecha evaluación Técnica: </label>
								</div>
								<div class="span6">
									<input id="<portlet:namespace/>fasepostulacionTecnicaId"
										name="<portlet:namespace/>fasepostulacionTecnicaId"
										type="hidden" value="${faseTecnica.fasepostulacionId}" />
	
									<div class="input-prepend">
										<span class="add-on"><i class="icon-calendar"></i></span> <input
											class="span7" value="${faseTecnica.strfechaFase}"
											id="<portlet:namespace/>fechaEvaluacionTecnica"
											name="<portlet:namespace/>fechaEvaluacionTecnica" type="text"
											placeholder="DD/MM/YYYY" onKeyPress="return false;" /> <input
											id="<portlet:namespace/>fechaEvaluacionTecnicaVal"
											name="<portlet:namespace/>fechaEvaluacionTecnicaVal"
											type="hidden" value="${faseTecnica.strfechaFase}" />
									</div>
								</div>
							</div>
	
						</div>
					</c:if>
					
					
					
					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha Entrevista con RRHH: </label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fasepostulacionEntreCoordRRHHId"
									name="<portlet:namespace/>fasepostulacionEntreCoordRRHHId"
									type="hidden" value="${faseEntreCoordRRHH.fasepostulacionId}" />

								<div class="input-prepend">
									<span class="add-on"><i class="icon-calendar"></i></span> <input
										class="span7" value="${faseEntreCoordRRHH.strfechaFase}"
										id="<portlet:namespace/>fechaEvaluacionEntreCoordRRHH"
										name="<portlet:namespace/>fechaEvaluacionEntreCoordRRHH"
										type="text" placeholder="DD/MM/YYYY"
										onKeyPress="return false;" /> <input
										id="<portlet:namespace/>fechaEvaluacionEntreCoordRRHHVal"
										name="<portlet:namespace/>fechaEvaluacionEntreCoordRRHHVal"
										type="hidden" value="${faseEntreCoordRRHH.strfechaFase}" />
								</div>
							</div>
						</div>

					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha Entrevista con Gerente de Área: </label>
							</div>
							<div class="span6">
								<input
									id="<portlet:namespace/>fasepostulacionEntreGerenteAreaId"
									name="<portlet:namespace/>fasepostulacionEntreGerenteAreaId"
									type="hidden" value="${faseEntreGerenteArea.fasepostulacionId}" />

								<div class="input-prepend">
									<span class="add-on"><i class="icon-calendar"></i></span> <input
										class="span7" value="${faseEntreGerenteArea.strfechaFase}"
										id="<portlet:namespace/>fechaEvaluacionEntreGerenteArea"
										name="<portlet:namespace/>fechaEvaluacionEntreGerenteArea"
										type="text" placeholder="DD/MM/YYYY"
										onKeyPress="return false;" /> <input
										id="<portlet:namespace/>fechaEvaluacionEntreGerenteAreaVal"
										name="<portlet:namespace/>fechaEvaluacionEntreGerenteAreaVal"
										type="hidden" value="${faseEntreGerenteArea.strfechaFase}" />
								</div>
							</div>
						</div>

					</div>



				</div>


				<div class="row">
					<div class="offset4 span4">
						<aui:button-row>
							<button id="<portlet:namespace/>btnGuardar"
								class="btn btn-primary" type="button">
								<liferay-ui:message key="general.form.opciones.guardar" />
							</button>
							<portlet:renderURL var="listarPostulantes">
								<portlet:param name="action" value="listarPostulantes" />
								<portlet:param name="solicitudRequerimientoId" value="${solicitudReclutamiento.solicitudRequerimientoId}" />
							</portlet:renderURL>



							<input id="<portlet:namespace/>listarPostulantesUrl"
								name="<portlet:namespace/>listarPostulantesUrl" type="hidden"
								value="${listarPostulantes}" />

							<a class="btn btn-primary"
								href="${listarPostulantes}">
								Cancelar </a>
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
		inicializarFormularioProgramacionEntrevista();
	});
</script>