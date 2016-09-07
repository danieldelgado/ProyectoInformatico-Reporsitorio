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
<portlet:renderURL var="crearCronograma">
	<portlet:param name="action" value="crearCronograma" />
</portlet:renderURL>
<portlet:resourceURL var="listarSolicitudesEvaluacion" id="listarSolicitudesEvaluacion" />

<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>listarSolicitudesEvaluacionUrl" type="hidden" value="${listarSolicitudesEvaluacion}" />
<input id="<portlet:namespace/>crearCronogramaUrl" type="hidden" value="${crearCronograma}" />


<input id="<portlet:namespace/>pagina" type="hidden" value="1" />
<input id="<portlet:namespace/>filas" type="hidden" value="10" />



<input id="<portlet:namespace/>listadescripcion" type="hidden" value="Descripción" />
<input id="<portlet:namespace/>listafechaEvaluacion" type="hidden" value="Fecha Evaluación" />
<input id="<portlet:namespace/>listafechaEstimadaFinaliacion" type="hidden" value="Fecha Estimada de Finalización" />
<input id="<portlet:namespace/>listaestado" type="hidden" value="Estado" />
<input id="<portlet:namespace/>listaopciones" type="hidden" value="Opciones" />

<input id="<portlet:namespace/>listaOpcionCrearCronograma" type="hidden" value="Cronograma" />
<input id="<portlet:namespace/>listaOpcionVerDetalle" type="hidden" value="VerDetalle" />


<fieldset>
	<legend>Lista de Solicitudes de Evaluación</legend>
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
								<label>Descripción:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>descripcion" name="<portlet:namespace/>descripcion" type="text" >
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha Evaluación Inicio:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaRegistroInicio" name="<portlet:namespace/>fechaRegistroInicio" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaRegistroInicioVal" name="fechaRegistroInicio" type="hidden" />
							</div>
						</div>
					</div>
					<div class="offset1 span5">
						<div>
							<div class="span5">
								<label>Estado:</label>
							</div>
							<div class="span6">
								<select id="<portlet:namespace/>estado" name="<portlet:namespace/>estado">
									<option label="Seleccione" value="Seleccione">Seleccione</option>
									<c:forEach items="${lstEstados}" var="estado">
										<option value="${estado.id}">${estado.value}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div>
							<div class="span5">
								<label>Fecha Evaluación fin:</label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaRegistroFin" name="<portlet:namespace/>fechaRegistroFin" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaRegistroFinVal" name="fechaRegistroFin" type="hidden" />
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
