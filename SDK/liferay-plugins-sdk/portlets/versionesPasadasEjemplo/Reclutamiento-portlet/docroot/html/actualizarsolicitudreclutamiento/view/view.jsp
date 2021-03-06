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

<portlet:renderURL var="nuevaSolicitud">
	<portlet:param name="action" value="actualizarSolicitud" />
</portlet:renderURL>

<portlet:resourceURL var="listarSolicitudesReclutamiento" id="listarSolicitudesReclutamiento" />
<portlet:resourceURL var="anularSolicitud" id="anularSolicitud" />

<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>listarSolicitudesReclutamiento" type="hidden" value="${listarSolicitudesReclutamiento}" />
<input id="<portlet:namespace/>modificarSolicitudUrl" type="hidden" value="${nuevaSolicitud}" />
<input id="<portlet:namespace/>anularSolicitudUrl" type="hidden" value="${anularSolicitud}" />

<input id="<portlet:namespace/>pagina" type="hidden" value="1" />
<input id="<portlet:namespace/>filas" type="hidden" value="10" />

<input id="<portlet:namespace/>listapuesto" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.puesto" />" />
<input id="<portlet:namespace/>listacantidad" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.cantidad" />" />
<input id="<portlet:namespace/>listaareaSolicitante" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.areaSolicitante" />" />
<input id="<portlet:namespace/>listaresponsableRRHH" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.responsableRRHH" />" />
<input id="<portlet:namespace/>listafechalimite" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.fechalimite" />" />
<input id="<portlet:namespace/>listatiempocontrato" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.tiempocontrato" />" />
<input id="<portlet:namespace/>listacliente" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.cliente" />" />
<input id="<portlet:namespace/>listaprioridad" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.prioridad" />" />
<input id="<portlet:namespace/>listaestado" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.estado" />" />
<input id="<portlet:namespace/>listaopciones" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.opciones" />" />

<input id="<portlet:namespace/>listaOpcionModificar" type="hidden" value="<liferay-ui:message key="general.form.opciones.editar" />" />
<input id="<portlet:namespace/>listaOpcionAnular" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.opciones.anular" />" />

<fieldset>
	<legend>Lista de Solicitudes de Reclutamiento</legend>
	<div class="container">
		<c:if test="${not empty mensaje}">
			<div class="contenedorAlerta">
				<div class="alert alert-success">
					<button type="button" class="calert close" data-dismiss="alert">&times;</button>
					<h4>${titulo}</h4> ${mensaje}
				</div>
			</div>
		</c:if>
		<div class="offset1 span10">
			<form id="<portlet:namespace/>buscarSolicitud" class="formulario">
				<div class="row-fluid">
					<div class="span5">
						<div>
							<div class="span5">
								<label>Puesto:</label>
							</div>
							<div class="span6">
								<select id="<portlet:namespace/>puestoId" name="<portlet:namespace/>puestoId">
									<option label="Seleccione" value="Seleccione">Seleccione</option>
									<c:forEach items="${listaPuestoBeans}" var="puesto">
										<option value="${puesto.puestoId}">${puesto.descripcion}</option>
									</c:forEach>
								</select>
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
								<input id="<portlet:namespace/>fechaRegistroFin" name="<portlet:namespace/>fechaRegistroFin" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaRegistroFinVal" name="fechaRegistroFin" type="hidden" />
							</div>
						</div>
					</div>
					<div class="offset1 span5">
						<div>
							<div class="span5">
								<label>Responsable RRHH:</label>
							</div>
							<div class="span6">
								<select id="<portlet:namespace/>responsable" name="<portlet:namespace/>responsable">
									<option label="Seleccione" value="Seleccione">Seleccione</option>
									<c:forEach items="${listaUsuarioBeans}" var="usuario">
										<option value="${usuario.userId}">${usuario.fullname}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Tiempo de Contrato:</label>
							</div>
							<div class="span6">
								<select id="<portlet:namespace/>tiempoContrato" name="<portlet:namespace/>tiempoContrato">
									<option label="Seleccione" value="Seleccione">Seleccione</option>
									<c:forEach items="${listaTiempoContrato}" var="parametro">
										<option value="${parametro.parametroId}">${parametro.valor}</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="offset4 span5">
						<aui:button-row>
							<button id="<portlet:namespace/>btnBuscar" class="btn btn-primary" type="button">Buscar</button>
							<a class="btn btn-primary" href="${nuevaSolicitud}">Nueva Solicitud </a>
						</aui:button-row>
					</div>
				</div>
			</form>
		</div>
		<div class="row">
			<div class=" span12 ">
				<div id="<portlet:namespace/>listaSolicitudes"></div>
				<div id="<portlet:namespace/>paginacion" class="pagination offset4">
					<ul>
						<li><a href="#">Prev</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">Next</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</fieldset>

<script type="text/javascript">
	$(document).ready(function() {
		inicializarFormularioBusqueda();
	});
</script>
