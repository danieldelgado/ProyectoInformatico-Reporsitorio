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

<portlet:resourceURL var="guardarPlanificar" id="guardarPlanificar" />

<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>guardarPlanificarUrl" type="hidden" value="${guardarPlanificar}" />

<input id="<portlet:namespace/>popupconfirmartitulo" type="hidden" value="Planificar Actividades" />
<input id="<portlet:namespace/>popupconfirmarMensage" type="hidden" value="Confrmacion para la planificación de la evaluación y plan de acción" />
<input id="<portlet:namespace/>popupMensaje" type="hidden" value="Registro de la activadad del cronograma" />

<input id="<portlet:namespace/>msgError" type="hidden" value="<liferay-ui:message key="general.form.error" />" />

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<fieldset>
	<legend>Programar Entevista para Postulante ${colaborador}</legend>
	<div class="container">
		<div class="contenedorAlerta"></div>
		<div class="offset1 span10">
			<form id="<portlet:namespace/>planificarActividad" name="<portlet:namespace/>planificarActividad" class="formulario">
					<input id="<portlet:namespace/>solicitudEvaluacionId" name="<portlet:namespace/>solicitudEvaluacionId" type="hidden" value="${solicitudEvaluacionId}" /> 
				
					<input
					id="<portlet:namespace/>cronograma" name="<portlet:namespace/>cronograma" type="hidden" value="${cronograma}" /> 
					
					<input id="<portlet:namespace/>actividadCronogramaId"
					name="<portlet:namespace/>actividadCronogramaId" type="hidden" value="${actividadCronogramaId}" />
					
					<input id="<portlet:namespace/>grupoUsuarioId"
					name="<portlet:namespace/>grupoUsuarioId" type="hidden" value="${grupoUsuario}" />
					
					<input id="<portlet:namespace/>prioridadGrupoUsuariosId"
					name="<portlet:namespace/>prioridadGrupoUsuariosId" type="hidden" value="${prioridadGrupoUsuariosId}" />
					
					
					

				<div class="row">

					<div class="row-fluid"></div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Gerente Área: </label>
							</div>
							<div class="span6">
								<select id="<portlet:namespace/>gerenteArea" name="<portlet:namespace/>gerenteArea">
									<option label="Seleccione" value="Seleccione">Seleccione</option>
									<c:forEach items="${listaGerentes}" var="usuario">
										<option value="${usuario.userId}">${usuario.fullname}</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Líder: </label>
							</div>
							<div class="span6">
								<select id="<portlet:namespace/>lider" name="<portlet:namespace/>lider">
									<option label="Seleccione" value="Seleccione">Seleccione</option>
									<c:forEach items="${listalideres}" var="usuario">
										<option value="${usuario.userId}">${usuario.fullname}</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span12">
								<label> Actividades </label>
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Actividad: </label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>actividad" name="<portlet:namespace/>actividad"/>
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span12">
								<label>Fase de Evaluación</label>
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha de Inicio: </label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaInicioEvalacion" name="<portlet:namespace/>fechaInicioEvalacion" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaInicioEvalacionVal" name="fechaInicioEvalacionVal" type="hidden" />
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha de Fin: </label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaFinEvalacion" name="<portlet:namespace/>fechaFinEvalacion" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaFinEvalacionVal" name="fechaFinEvalacionVal" type="hidden" />
							</div>
						</div>
					</div>


					<div class="span12">
						<div>
							<div class="span12">
								<label>Fase de Plan de Acción</label>
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha de Inicio: </label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaInicioPlanAccion" name="<portlet:namespace/>fechaInicioPlanAccion" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaInicioPlanAccionVal" name="fechaInicioPlanAccionVal" type="hidden" />
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha de Fin: </label>
							</div>
							<div class="span6">
								<input id="<portlet:namespace/>fechaFinPlanAccion" name="<portlet:namespace/>fechaFinPlanAccion" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;">
								<aui:input id="fechaFinPlanAccionVal" name="fechaFinPlanAccionVal" type="hidden" />
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
		inicializarFormularioPlanificar();
	});
</script>
