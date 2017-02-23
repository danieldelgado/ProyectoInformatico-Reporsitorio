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

<portlet:resourceURL var="listarSolicitudesReclutamiento" id="listarSolicitudesReclutamiento" />
<portlet:renderURL var="irregistrarProceso">
	<portlet:param name="action" value="irregistrarProceso" />
</portlet:renderURL>

<portlet:renderURL var="irnoAsistio">
	<portlet:param name="action" value="irnoAsistio" />
</portlet:renderURL>


<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>listarSolicitudesReclutamiento" type="hidden" value="${listarSolicitudesReclutamiento}" />
<input id="<portlet:namespace/>registrarProcesoUrl" type="hidden" value="${irregistrarProceso}" />
<input id="<portlet:namespace/>noAsistioUrl" type="hidden" value="${irnoAsistio}" />

<input id="<portlet:namespace/>pagina" type="hidden" value="1" />
<input id="<portlet:namespace/>filas" type="hidden" value="5" />

<input id="<portlet:namespace/>listapuesto" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.puesto" />" />
<input id="<portlet:namespace/>listadisponibilidad" type="hidden" value="Disponiilidad" />
<input id="<portlet:namespace/>listatipopostulante" type="hidden" value="Tipo Postulante" />
<input id="<portlet:namespace/>listapostulante" type="hidden" value="Postulante" />
<input id="<portlet:namespace/>listafasepostulante" type="hidden" value="Fase Postulante" />
<input id="<portlet:namespace/>listafechapostulacion" type="hidden" value="Fecha Postulación" />
<input id="<portlet:namespace/>listafechapsicologica" type="hidden" value="Fecha Psicológica" />
<input id="<portlet:namespace/>listafechatecnica" type="hidden" value="Fecha Técnica" />
<input id="<portlet:namespace/>listafecharrhh" type="hidden" value="Fecha RRHH" />
<input id="<portlet:namespace/>listafechagerentearea" type="hidden" value="Fecha Gerente de Área" />
<input id="<portlet:namespace/>listaopciones" type="hidden" value="<liferay-ui:message key="listasolicitudreclutamiento.lista.opciones" />" />


<input id="<portlet:namespace/>listaOpcionRegistrarProceso" type="hidden" value="Registrar Proceso" />
<input id="<portlet:namespace/>listaOpcionNoAsistio" type="hidden" value="No Asistio" />

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<input id="<portlet:namespace/>popupAprobartitulo" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.anular.titulo" />" />
<input id="<portlet:namespace/>popupRechazartitulo" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.anular.titulo" />" />
<input id="<portlet:namespace/>popupanularaMensage" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.anular.registro" />" />

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
								<label>Fecha Emisión inicio:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaRegistroInicio" name="<portlet:namespace/>fechaRegistroInicio" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaRegistroInicioVal" name="fechaRegistroInicioVal" type="hidden" />
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha Emisión fin:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaRegistroFin" name="<portlet:namespace/>fechaRegistroFin" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaRegistroFinVal" name="fechaRegistroFinVal" type="hidden" />
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
						</aui:button-row>
					</div>
				</div>
			</form>
		</div>
		<div class="row">
			<div class=" span12 ">
				<div id="<portlet:namespace/>listaSolicitudes"></div>
				<div id="<portlet:namespace/>paginacion" class="pagination offset4"></div>
			</div>
		</div>
	</div>
</fieldset>
<div class="yui3-skin-sam">
	<div id="<portlet:namespace/>modalAnular"></div>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		inicializarFormularioBusqueda();
	});
</script>
