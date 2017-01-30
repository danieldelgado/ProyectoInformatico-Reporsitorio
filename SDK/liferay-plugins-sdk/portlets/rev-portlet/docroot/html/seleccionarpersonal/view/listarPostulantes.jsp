
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

<portlet:renderURL var="postulante">
	<portlet:param name="action" value="irpostulante" />
</portlet:renderURL>
<portlet:renderURL var="detallePostulanteUrl">
	<portlet:param name="action" value="irdetallePostulante" />
</portlet:renderURL>
<portlet:renderURL var="regresar">
	<portlet:param name="action" value="default" />
</portlet:renderURL>
<portlet:resourceURL var="extenderPublicacionUrl" id="extenderPublicacion" />

<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>postulanteUrl" type="hidden" value="${postulante}" />
<input id="<portlet:namespace/>detallePostulanteUrl" type="hidden" value="${detallePostulante}" />
<input id="<portlet:namespace/>regresarUrl" type="hidden" value="${regresar}" />
<input id="<portlet:namespace/>extenderPublicacionUrl" type="hidden" value="${extenderPublicacionUrl}" />

<fieldset>
	<legend>Lista de Postulantes del requerimiento</legend>
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
		<div class="contenedorAlerta2">
			<c:if test="${not empty mensaje}">
				<div class="alert alert-success">
					<button type="button" class="calert close" data-dismiss="alert">&times;</button>
					<h4>${titulo}</h4>
					${mensaje}
				</div>
			</c:if>
		</div>
		<div class="contenedorAlerta3">
			<c:if test="${not empty mensaje}">
				<div class="alert alert-success">
					<button type="button" class="calert close" data-dismiss="alert">&times;</button>
					<h4>${titulo}</h4>
					${mensaje}
				</div>
			</c:if>
		</div>
		<input id="<portlet:namespace/>solicitudId" name="<portlet:namespace/>userId" type="hidden" value="${usuarioPostulante.solicitudId}" /> 
		<input id="<portlet:namespace/>userId" name="<portlet:namespace/>userId" type="hidden" value="${usuarioPostulante.userId}" />

		<div class="row">
			<div class="span12">
				<div class="span12"></div>
				<div class="offset1 span5">
					<label class="control-label" for="<portlet:namespace/>puesto"> <liferay-ui:message key="actualizarreclutamiento.form.puesto" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<select id="<portlet:namespace/>puestoId" name="<portlet:namespace/>puestoId" disabled="disabled">
							<option value=""><liferay-ui:message key="general.form.seleccione" /></option>
							<c:forEach items="${listaPuestoBeans}" var="puesto">
								<option <c:if test="${solicitudReclutamiento.puestoId eq puesto.puestoId}"> selected="selected" </c:if> value="${puesto.puestoId}">${puesto.descripcion}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="offset1 span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.cantidad" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<input class="span12" id="<portlet:namespace/>cantidadRecursos" name="<portlet:namespace/>cantidadRecursos" type="text"
							value="${solicitudReclutamiento.cantidadRecursos}" disabled="disabled" />
					</div>
				</div>
				<div class="offset1 span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.areaSolicitante" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<select id="<portlet:namespace/>areaSolicitante" name="<portlet:namespace/>areaSolicitante" disabled="disabled">
							<option value=""><liferay-ui:message key="general.form.seleccione" /></option>
							<c:forEach items="${listaAreas}" var="parametro">
								<option <c:if test="${solicitudReclutamiento.areaSolicitante eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="offset1 span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.fechalimite" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<span class="add-on"><i class="icon-calendar"></i></span> <input class="span7" value="${solicitudReclutamiento.strfechaLimite}" id="<portlet:namespace/>fechaLimite"
							name="<portlet:namespace/>fechaLimite" type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;" disabled="disabled" /> <input
							id="<portlet:namespace/>fechaLimiteVal" name="<portlet:namespace/>fechaLimiteVal" type="hidden" value="${solicitudReclutamiento.strfechaLimite}" />
					</div>
				</div>
				<div class="offset1 span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.proyecto" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<input class="span12" id="<portlet:namespace/>proyecto" name="<portlet:namespace/>proyecto" type="text" value="${solicitudReclutamiento.proyecto}" disabled="disabled" />
					</div>
				</div>

				<div class="offset1  span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.responsableRRHH" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<select id="<portlet:namespace/>responsable" name="<portlet:namespace/>responsable" disabled="disabled">
							<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
							<c:forEach items="${listaUsuarioBeans}" var="usuario">
								<option <c:if test="${solicitudReclutamiento.responsableRRHH eq usuario.userId}"> selected="selected" </c:if> value="${usuario.userId}">${usuario.fullname}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="offset1  span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.tiempocontrato" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<select id="<portlet:namespace/>tiempoContrato" name="<portlet:namespace/>tiempoContrato" disabled="disabled">
							<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
							<c:forEach items="${listaTiempoContrato}" var="parametro">
								<option <c:if test="${solicitudReclutamiento.tiempoContrato eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="offset1  span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.tipoNegocio" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<select id="<portlet:namespace/>tipoNegocio" name="<portlet:namespace/>tipoNegocio" disabled="disabled">
							<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
							<c:forEach items="${listaTipoNegocio}" var="parametro">
								<option <c:if test="${solicitudReclutamiento.tipoNegocio eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="offset1  span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.cliente" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<select id="<portlet:namespace/>cliente" name="<portlet:namespace/>cliente" disabled="disabled">
							<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
							<c:forEach items="${listaClientes}" var="parametro">
								<option <c:if test="${solicitudReclutamiento.cliente eq parametro.parametroId}"> selected="selected" </c:if> value="${parametro.parametroId}">${parametro.valor}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="offset1  span5">
					<label> <liferay-ui:message key="actualizarreclutamiento.form.especialidad" />:
					</label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<input class="span12" id="<portlet:namespace/>especialidad" name="<portlet:namespace/>especialidad" type="text" value="${solicitudReclutamiento.especialidad}"
							disabled="disabled" />
					</div>
				</div>

			</div>
		</div>

		<div class="row-fluid">
			<div class="span12">


				<table class="table table-hover table-bordered">
					<thead>
						<tr class="cabecera">
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.nombre" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.fechapostulacion" /></th>
							<th><liferay-ui:message key="programar.entevistas.lista.postulante.disponibilidad" /></th>
							<th>Interno</th>
							<th>Distancia</th>
							<th><liferay-ui:message key="listasolicitudreclutamiento.lista.opciones" /></th>
						</tr>
					</thead>
					<tbody id="<portlet:namespace/>listaPostulantes">

					</tbody>
				</table>

			</div>
		</div>
		<div id="<portlet:namespace/>pnlFechaLimite" class="row-fluid">
			<div class="span12">
				<div class="span12"></div>
				<div class="offset1 span5">
					<label class="control-label"> Extender Fecha Limite: </label>
				</div>
				<div class="controls span5">
					<div class="input-prepend">
						<span class="add-on"><i class="icon-calendar"></i></span> 
							<input id="<portlet:namespace/>fechaLimite2"     name="<portlet:namespace/>fechaLimite2"    type="text" placeholder="DD/MM/YYYY" onKeyPress="return false;"  class="span7" value="${solicitudReclutamiento.strfechaLimite}"  /> 
							<input id="<portlet:namespace/>fechaLimite2Val"	name="<portlet:namespace/>fechaLimite2Val" type="hidden" value="${solicitudReclutamiento.strfechaLimite}" />
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
	</div>
</fieldset>

<div class="yui3-skin-sam">
	<div id="<portlet:namespace/>modal"></div>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		validarCantidadPostuantes();
		validarFechaLimite();		
		inicializarListaPotulantes('${listaUsuarios}' ,  ${solicitudReclutamiento.cantidadRecursos} );
	});
	function validarCantidadPostuantes() {
		var contenedorAlerta = $(".contenedorAlerta2");
		var cantidadPostulantes = ${cantidadPostulantes};
		var cantidadRequerida = ${solicitudReclutamiento.cantidadRecursos};
		//console.log("cantidadRequerida:" + cantidadRequerida + "  | cantidadPostulantes:" + cantidadPostulantes);
		if (cantidadRequerida > cantidadPostulantes) {
			mostrarAlerta(contenedorAlerta, "Cantidad Recursos", "Se realizo en análisis, pero la cantidad de postulantes aptos no supera la necesaria (solo se cuenta con "
					+ cantidadPostulantes + " de " + cantidadRequerida + ") ", "alert-error", function() {

			});
		} else {
			mostrarAlerta(contenedorAlerta, "Cantidad Recursos", "Se realizo en análisis, se cuenta con la cantidad necesaria.", "alert-success", function() {

			});
		}
	}
	function validarFechaLimite() {
		
		var contenedorAlerta = $(".contenedorAlerta3");
		var fechaHoy = Date.now();
		console.log(fechaHoy);
		console.log('${solicitudReclutamiento.strfechaLimite}');
		var dateParts = '${solicitudReclutamiento.strfechaLimite}'.split('/');
		console.log(dateParts);
		var fechaLimite = new Date(dateParts[2], dateParts[1] - 1, dateParts[0]);
		console.log(fechaLimite);

		if (fechaHoy >= fechaLimite) {			
			mostrarAlerta(contenedorAlerta, "Fecha Limite", "Se a superado la fecha limite ", "alert-error", function() {
				var inputFristnamespace = $("input[type=hidden]").first().val();
				var contenedorAlerta = $("#"+ inputFristnamespace + "pnlFechaLimite");
				var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
				$(contenedorAlerta).show();
				$(btnGuardar).show();
			});
		}
	}
</script>