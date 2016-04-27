
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


<input type="hidden" value="<portlet:namespace/>" />

<portlet:resourceURL var="listarPuestos" id="listarPuestos" />
<portlet:resourceURL var="actualizarSolicitud" id="actualizarSolicitud" />
<input id="<portlet:namespace/>actualizarUrl" type="hidden" value="${actualizarSolicitud}" />

<fieldset>
	<legend> ${empty solicitudReclutamiento?'Registrar':'Actuaizar'} Solicitud de Reclutamiento </legend>

	<div class="container">

		<div class="offset1 span10">

			<form id="<portlet:namespace/>actualizarSolicitud" name="<portlet:namespace/>actualizarSolicitud" cssClass="formulario">
				<aui:input id="solicitudRequerimientoId" name="solicitudRequerimientoId" type="hidden" value="${solicitudReclutamiento.solicitudRequerimientoId }" />

				<div class="row-fluid">
					<div class="span5">
						<div class="form-group">
							<div class="span5">
								<label class="control-label" for="<portlet:namespace/>puesto">Puesto:</label>
							</div>
							<div class="span6">
								<div class="controls">
									<input class="span12 form-control" id="<portlet:namespace/>puesto" name="<portlet:namespace/>puesto" type="text" value="DBA" />
									<aui:input id="puestoId" name="puestoId" type="hidden" value="2" />
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Cantidad de recursos:</label>
							</div>
							<div class="span6">
								<input class="span12" id="<portlet:namespace/>cantidadRecursos" name="<portlet:namespace/>cantidadRecursos" type="text" value="5" />
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Area Solicitante:</label>
							</div>
							<div class="span6">
								<input class="span12" id="<portlet:namespace/>areaSolicitante" name="<portlet:namespace/>areaSolicitante" type="text" value="Informatica" />
								<aui:input id="areaSolicitanteId" name="areaSolicitanteId" type="hidden" value="5" />
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha limite:</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-calendar"></i></span> <input class="span7" value="19/04/2016" id="<portlet:namespace/>fechaLimite"
										name="<portlet:namespace/>fechaLimite" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;" />
									<aui:input id="fechaLimiteVal" name="fechaLimiteVal" type="hidden" value="Tue Apr 19 2016 12:00:00 GMT-0500 (PET)" />
								</div>
							</div>
						</div>

						<div>
							<div class="span5">
								<label>Presupuesto Mínimo:</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<span class="add-on">S/.</span> <input class="span12" id="<portlet:namespace/>presupuestoMinimo" name="<portlet:namespace/>presupuestoMinimo" type="text"
										value="1,000.00">
								</div>
							</div>


						</div>

					</div>
					<div class="offset1 span5">


						<div>
							<div class="span5">
								<label>Responsable RRHH:</label>
							</div>
							<div class="span6">
								<input class="span12" id="<portlet:namespace/>responsable" name="<portlet:namespace/>responsable" type="text" value="5" />
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Tiempo de Contrato:</label>
							</div>
							<div class="span6">
								<select class="span12" id="<portlet:namespace/>tiempoContrato" name="<portlet:namespace/>tiempoContrato">
									<option label="Seleccione" value="Seleccione" />
									<option label="45" value="1 mes" selected="selected" />
									<option label="46" value="6 meses" />
								</select>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Tipo de negocio:</label>
							</div>
							<div class="span6">
								<select class="span12" id="<portlet:namespace/>tipoNegocio" name="<portlet:namespace/>tiempoContrato">
									<option label="Seleccione" value="Seleccione" />
									<option label="45" value="1 mes" selected="selected" />
									<option label="46" value="6 meses" />
								</select>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Cliente:</label>
							</div>
							<div class="span6">
								<select class="span12" id="<portlet:namespace/>cliente" name="<portlet:namespace/>tiempoContrato">
									<option label="Seleccione" value="Seleccione" />
									<option label="45" value="1 mes" selected="selected" />
									<option label="46" value="6 meses" />
								</select>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Presupuesto Máximo:</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<span class="add-on">S/.</span> <input class="span12" id="<portlet:namespace/>presupuestoMaximo" name="<portlet:namespace/>presupuestoMaximo" type="text"
										value="2,000.00">
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="offset5 span2">
						<aui:button-row>
							<button id="<portlet:namespace/>btnGuardar" class="btn btn-primary">Guardar</button>
						</aui:button-row>
					</div>
				</div>


			</form>

		</div>


	</div>
</fieldset>



<aui:script>
	AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator',
			'aui-overlay-context-panel', function(A) {

				var testPuesto;
				new A.AutoCompleteList({
					allowBrowserAutocomplete : 'true',
					activateFirstItem : 'true',
					inputNode : '#<portlet:namespace />puesto',
					render : 'true',
					minQueryLength : '1',
					typeAhead : true,
					resultTextLocator : 'descripcion',
					resultHighlighter : 'phraseMatch',
					resultFilters : [ 'phraseMatch' ],
					source : function() {
						var inputValue = A.one("#<portlet:namespace />puesto").get('value');
						var myAjaxRequest = A.io.request('${listarPuestos}', {
							dataType : 'json',
							method : 'POST',
							data : {
								<portlet:namespace />puesto : inputValue,
							},
							autoLoad : false,
							sync : false,
							on : {
								success : function() {
									var data = this.get('responseData');
									testPuesto = data;
								}
							}
						});
						myAjaxRequest.start();
						return testPuesto;
					},
					on : {
						select : function(itemNode) {
							// 					       <portlet:namespace />puestoId.value = itemNode.result.raw.puestoId;
							A.one("#<portlet:namespace />puestoId").set('value', itemNode.result.raw.puestoId);
						}
					}
				});

				new A.DatePicker({
					trigger : '#<portlet:namespace />fechaLimite',
					mask : '%d/%m/%Y',
					popover : {
						zIndex : 1
					},
					on : {
						selectionChange : function(event) {
							var d = new Date(event.newSelection);
							var day = d.getDate();
							var monthIndex = d.getMonth();
							var year = d.getFullYear();
							A.one("#<portlet:namespace />fechaLimiteVal").set('value', day+"/"+(monthIndex+1)+"/"+year);
						}
					}
				});

			});
</aui:script>
	
















