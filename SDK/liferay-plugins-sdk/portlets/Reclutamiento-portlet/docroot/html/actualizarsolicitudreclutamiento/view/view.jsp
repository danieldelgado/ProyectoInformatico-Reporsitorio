<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.util.Constants"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:resourceURL var="listarPuestos" id="listarPuestos" />

<portlet:renderURL var="nunevaSolicitud">
	<portlet:param name="action" value="actualizarSolicitud" />
</portlet:renderURL>


<fieldset>
	<legend>Lista de Solicitudes de Reclutamiento</legend>

	<div class="container">

		<div class="offset1 span10">

			<aui:form id="<portlet:namespace/>buscarSolicitud" cssClass="formulario">

				<div class="row-fluid">
					<div class="span5">
						<div>
							<div class="span5">
								<label>Puesto:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>puesto" name="<portlet:namespace/>puesto" type="text">
								<aui:input id="puestoId" name="puestoId" type="hidden" />
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha registro inicio:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaRegistroInicio" name="<portlet:namespace/>fechaRegistroInicio" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaRegistroInicioVal" name="fechaRegistroInicio" type="hidden" />
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha registro fin:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaRegistrFin" name="<portlet:namespace/>fechaRegistrFin" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaRegistrFinVal" name="fechaRegistrFin" type="hidden" />
							</div>
						</div>
					</div>
					<div class="offset1 span5">


						<div>
							<div class="span5">
								<label>Responsable RRHH:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>responsable" name="<portlet:namespace/>responsable" type="text">
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Tiempo de Contrato:</label>
							</div>
							<div class="span6">
								<select id="<portlet:namespace/>tiempoContrato" name="<portlet:namespace/>tiempoContrato">
									<option label="Seleccione" value="Seleccione" />
									<option label="45" value="1 mes" />
									<option label="46" value="6 meses" />
								</select>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="offset4 span5">
						<aui:button-row>
							<button id="<portlet:namespace/>btnBuscar" class="btn btn-primary">Buscar</button>
							<a class="btn btn-primary" href="${nunevaSolicitud}">Nueva Solicitud </a>
						</aui:button-row>
					</div>
				</div>


			</aui:form>

		</div>


		<div>

			<table class="table table-hover table-bordered">
				<thead>
					<tr class="cabecera">
						<th>#</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Username</th>
						<th>Opciones</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Mark</td>
						<td>Otto</td>
						<td>@mdo</td>
						<td><div class="btn-group">
								<button class="btn">Modificar</button>
								<button class="btn">Anular</button>
							</div></td>
					</tr>
					<tr>
						<td>2</td>
						<td>Jacob</td>
						<td>Thornton</td>
						<td>@fat</td>
						<td><div class="btn-group">
								<button class="btn">Modificar</button>
								<button class="btn">Anular</button>
							</div></td>
					</tr>
					<tr>
						<td>3</td>
						<td>Larry the Bird</td>
						<td>Thornton</td>
						<td>@twitter</td>
						<td><div class="btn-group">
								<button class="btn">Modificar</button>
								<button class="btn">Anular</button>
							</div></td>
					</tr>
				</tbody>
			</table>

		</div>



	</div>



</fieldset>



<aui:script>
	AUI()
			.use(
					'autocomplete-list',
					'aui-base',
					'node',
					'aui-datepicker',
					'aui-io-request',
					'autocomplete-filters',
					'autocomplete-highlighters',
					function(A) {

						var testPuesto;
						new A.AutoCompleteList(
								{
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
										var inputValue = A.one(
												"#<portlet:namespace />puesto")
												.get('value');
										var myAjaxRequest = A.io
												.request(
														'${listarPuestos}',
														{
															dataType : 'json',
															method : 'POST',
															data : {
																<portlet:namespace />puesto : inputValue,
															},
															autoLoad : false,
															sync : false,
															on : {
																success : function() {
																	var data = this
																			.get('responseData');
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
											A
													.one(
															"#<portlet:namespace />puestoId")
													.set(
															'value',
															itemNode.result.raw.puestoId);
										}
									}
								});

						new A.DatePicker(
								{
									trigger : '#<portlet:namespace />fechaRegistroInicio',
									mask : '%d/%m/%Y',
									popover : {
										zIndex : 1
									},
									on : {
										selectionChange : function(event) {
											A
													.one(
															"#<portlet:namespace />fechaRegistroInicioVal")
													.set('value',
															event.newSelection);
										}
									}
								});

						new A.DatePicker(
								{
									trigger : '#<portlet:namespace />fechaRegistrFin',
									mask : '%d/%m/%Y',
									popover : {
										zIndex : 1
									},
									on : {
										selectionChange : function(event) {
											A
													.one(
															"#<portlet:namespace />fechaRegistrFinVal")
													.set('value',
															event.newSelection);
										}
									}
								});

					});
</aui:script>
	

































