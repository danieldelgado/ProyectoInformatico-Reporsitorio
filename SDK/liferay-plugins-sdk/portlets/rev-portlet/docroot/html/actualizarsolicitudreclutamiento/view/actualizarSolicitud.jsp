
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

<portlet:resourceURL var="actualizarSolicitud" id="actualizarSolicitud" />
<portlet:resourceURL var="listarEtiquetas" id="listarEtiquetas" />
<portlet:resourceURL var="listarFunciones" id="listarFunciones" />
<portlet:renderURL var="regresar">
	<portlet:param name="action" value="default" />
</portlet:renderURL>
<input id="<portlet:namespace/>actualizarUrl" type="hidden" value="${actualizarSolicitud}" />
<input id="<portlet:namespace/>listarSolicitudesUrl" type="hidden" value="${regresar}" />
<input id="<portlet:namespace/>listarEtiquetasUrl" type="hidden" value="${listarEtiquetas}" />
<input id="<portlet:namespace/>listarFuncionesUrl" type="hidden" value="${listarFunciones}" />

<input id="<portlet:namespace/>msgpuesto" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.puesto" />" />
<input id="<portlet:namespace/>msgcantidadrecursos" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.cantidad.recursos" />" />
<input id="<portlet:namespace/>msgareaSolicitante" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.areaSolicitante" />" />
<input id="<portlet:namespace/>msgfechalimite" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.fecha.limite" />" />
<input id="<portlet:namespace/>msgfechalimiteFueraRango" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.fecha.limite.fuerarango" />" />
<input id="<portlet:namespace/>msgresponsablerrhh" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.responsablerrhh" />" />
<input id="<portlet:namespace/>msgtiempocontrato" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.tiempocontrato" />" />
<input id="<portlet:namespace/>msgtiponegocio" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.tiponegocio" />" />
<input id="<portlet:namespace/>msgcliente" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.cliente" />" />
<input id="<portlet:namespace/>msgproyecto" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.proyecto" />" />
<input id="<portlet:namespace/>msgespecialidad" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.valid.mensaje.especialidad" />" />

<input id="<portlet:namespace/>popupconfirmartitulo" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.confirmar.titulo" />" />

<c:choose>
	<c:when test="${empty solicitudReclutamiento}">
		<input id="<portlet:namespace/>popupconfirmarMensage" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.confirmar.registro" />" />
		<input id="<portlet:namespace/>popupMensaje" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.registrar" />" />
	</c:when>
	<c:when test="${not empty solicitudReclutamiento}">
		<input id="<portlet:namespace/>popupconfirmarMensage" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.confirmar.actualizar" />" />
		<input id="<portlet:namespace/>popupMensaje" type="hidden" value="<liferay-ui:message key="actualizarreclutamiento.mensaje.actualizar" />" />
	</c:when>
</c:choose>

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />
<input id="<portlet:namespace/>msgError" type="hidden" value="<liferay-ui:message key="general.form.error" />" />


<fieldset>
	<legend> ${empty solicitudReclutamiento?'Registrar':'Actualizar'} Solicitud de Reclutamiento </legend>
	<div class="container">
		<div class="contenedorAlerta"></div>
		<div class="contenedorAlerta2"></div>
		<div class="contenedorAlerta3"></div>
		<div class="offset1 span10">
			<form id="<portlet:namespace/>actualizarSolicitud" name="<portlet:namespace/>actualizarSolicitud" class="formulario">
				<input id="<portlet:namespace/>solicitudRequerimientoId" name="<portlet:namespace/>solicitudRequerimientoId" type="hidden"
					value="${solicitudReclutamiento.solicitudRequerimientoId }" />
				<div class="row-fluid">
					<div class="span5">
						<div class="control-group">
							<div class="span5">
								<label class="control-label" for="<portlet:namespace/>puesto"> <liferay-ui:message key="actualizarreclutamiento.form.puesto" />:
								</label>
							</div>
							<div class="controls span6">
								<div class="input-prepend">
									<select id="<portlet:namespace/>puestoId" name="<portlet:namespace/>puestoId">
										<option value=""><liferay-ui:message key="general.form.seleccione" /></option>
										<c:forEach items="${listaPuestoBeans}" var="puesto">
											<option <c:if test="${solicitudReclutamiento.puestoId eq puesto.puestoId}"> selected="selected" </c:if> value="${puesto.puestoId}">${puesto.descripcion}</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.cantidad" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<input class="span12" id="<portlet:namespace/>cantidadRecursos" name="<portlet:namespace/>cantidadRecursos" type="text"
										value="${solicitudReclutamiento.cantidadRecursos}" />
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.areaSolicitante" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<select id="<portlet:namespace/>areaSolicitante" name="<portlet:namespace/>areaSolicitante">
										<option value=""><liferay-ui:message key="general.form.seleccione" /></option>
										<c:forEach items="${listaAreas}" var="parametro">
											<option <c:if test="${solicitudReclutamiento.areaSolicitante eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
										</c:forEach>
									</select>

								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.fechalimite" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-calendar"></i></span> <input class="span7" value="${solicitudReclutamiento.strfechaLimite}"
										id="<portlet:namespace/>fechaLimite" name="<portlet:namespace/>fechaLimite" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;" /> <input
										id="<portlet:namespace/>fechaLimiteVal" name="<portlet:namespace/>fechaLimiteVal" type="hidden" value="${solicitudReclutamiento.strfechaLimite}" />
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.proyecto" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<input class="span12" id="<portlet:namespace/>proyecto" name="<portlet:namespace/>proyecto" type="text" value="${solicitudReclutamiento.proyecto}" />
								</div>
							</div>
						</div>
					</div>
					<div class="offset1 span5">
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.responsableRRHH" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<select id="<portlet:namespace/>responsable" name="<portlet:namespace/>responsable">
										<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
										<c:forEach items="${listaUsuarioBeans}" var="usuario">
											<option <c:if test="${solicitudReclutamiento.responsableRRHH eq usuario.userId}"> selected="selected" </c:if> value="${usuario.userId}">${usuario.fullname}</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.tiempocontrato" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<select id="<portlet:namespace/>tiempoContrato" name="<portlet:namespace/>tiempoContrato">
										<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
										<c:forEach items="${listaTiempoContrato}" var="parametro">
											<option <c:if test="${solicitudReclutamiento.tiempoContrato eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.tipoNegocio" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<select id="<portlet:namespace/>tipoNegocio" name="<portlet:namespace/>tipoNegocio">
										<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
										<c:forEach items="${listaTipoNegocio}" var="parametro">
											<option <c:if test="${solicitudReclutamiento.tipoNegocio eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.cliente" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<select id="<portlet:namespace/>cliente" name="<portlet:namespace/>cliente">
										<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
										<c:forEach items="${listaClientes}" var="parametro">
											<option <c:if test="${solicitudReclutamiento.cliente eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</div>
						<div>
							<div class="span5">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.especialidad" />:
								</label>
							</div>
							<div class="span6">
								<div class="input-prepend">
									<input class="span12" id="<portlet:namespace/>especialidad" name="<portlet:namespace/>especialidad" type="text" value="${solicitudReclutamiento.especialidad}" />
								</div>
							</div>
						</div>
					</div>

					<c:if test="${ not empty  solicitudReclutamiento.observacionBean }">
						<div class="span12 alert alert-error">
							<div class="span12">
								<label> <liferay-ui:message key="actualizarreclutamiento.form.observacion" />:
								</label>
							</div>
							<div class="span12">
								<div class="">
									<div>${solicitudReclutamiento.observacionBean.descripcion}</div>
								</div>
							</div>
						</div>
					</c:if>
				</div>
				<div class="row">
					<fieldset>
						<legend> Lista de requisitos </legend>
					</fieldset>
					<div class="container-fluid">
						<div>
							<div>
								<div class="span1">
									<label> <liferay-ui:message key="actualizarreclutamiento.form.requisito" />:
									</label>
								</div>
								<div class="span2">
									<div class="input-prepend">
										<input id="<portlet:namespace/>requisito" name="<portlet:namespace/>requisito" class="span12" type="text">
									</div>
								</div>
								<div class="span1">
									<label> <liferay-ui:message key="actualizarreclutamiento.form.anno" />:
									</label>
								</div>
								<div class="span2">
									<div class="input-prepend">

										<select id="<portlet:namespace/>annos" name="<portlet:namespace/>annos" class="span12">
											<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
											<c:forEach items="${listaAnnos}" var="parametro">
												<option value="${parametro.parametroId}">${parametro.valor}</option>
											</c:forEach>
										</select>

									</div>
								</div>
								<div class="span1">
									<label> <liferay-ui:message key="actualizarreclutamiento.form.exigile" />:
									</label>
								</div>
								<div class="span1">
									<div class="input-prepend">
										<input id="<portlet:namespace/>exigile" name="<portlet:namespace/>exigile" class="" type="checkbox">
									</div>
								</div>
								<div class="span1">
									<label> <liferay-ui:message key="actualizarreclutamiento.form.tipoRequisito" />:
									</label>
								</div>
								<div class="span2">
									<div class="input-prepend">
										<select id="<portlet:namespace/>tipoRequisito" name="<portlet:namespace/>tipoRequisito" class="span12">
											<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
											<c:forEach items="${listaTipoRequisito}" var="parametro">
												<option value="${parametro.parametroId}">${parametro.valor}</option>
											</c:forEach>
										</select>
									</div>
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
											<th><liferay-ui:message key="actualizarreclutamiento.form.requisito" /></th>
											<th><liferay-ui:message key="actualizarreclutamiento.form.anno" /></th>
											<th><liferay-ui:message key="actualizarreclutamiento.form.exigile" /></th>
											<th><liferay-ui:message key="actualizarreclutamiento.form.tipoRequisito" /></th>
											<th><liferay-ui:message key="listasolicitudreclutamiento.lista.opciones" /></th>
										</tr>
									</thead>
									<tbody id="<portlet:namespace/>listaRequisitos">

									</tbody>
								</table>
							</div>
							
						</div>
					</div>
				</div>
				
				<div class="row">
					<fieldset>
						<legend> Lista de funciones </legend>
					</fieldset>
					<div class="container-fluid">
						<div>
							<div>
								<div class="span1">
									<label> <liferay-ui:message key="actualizarreclutamiento.form.funcion" />:
									</label>
								</div>
								<div class="span2">
									<div class="input-prepend">
										<input id="<portlet:namespace/>funcion" name="<portlet:namespace/>funcion" class="span12" type="text">
									</div>
								</div>
								<div class="span1">
									<label> <liferay-ui:message key="actualizarreclutamiento.form.exigile" />:
									</label>
								</div>
								<div class="span1">
									<div class="input-prepend">
										<input id="<portlet:namespace/>exigilefuncion" name="<portlet:namespace/>exigilefuncion" class="" type="checkbox">
									</div>
								</div>
								<div class="span1">
									<div class="input-prepend">
										<button id="<portlet:namespace/>btnAgregarFuncion" class="btn btn-primary span12" type="button">
											<liferay-ui:message key="general.form.opciones.agregar" />
										</button>
									</div>
								</div>
							</div>
							<div id="">
								<table class="table table-hover table-bordered">
									<thead>
										<tr class="cabecera">
											<th><liferay-ui:message key="actualizarreclutamiento.form.funcion" /></th>
											<th><liferay-ui:message key="actualizarreclutamiento.form.exigile" /></th>
											<th><liferay-ui:message key="listasolicitudreclutamiento.lista.opciones" /></th>
										</tr>
									</thead>
									<tbody id="<portlet:namespace/>listaFuncions">

									</tbody>
								</table>
							</div>
							
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="offset5 span2">
						<aui:button-row>
							<button id="<portlet:namespace/>btnGuardar" class="btn btn-primary" type="button">
								<liferay-ui:message key="general.form.opciones.guardar" />
							</button>
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

		inicializarFormularioRegistro();
		listarRequisitos('${requisitoEtiquetaBeans}',true);
		listarFuncions('${funcionEtiquetaBeans}',true);
	});
</script>
