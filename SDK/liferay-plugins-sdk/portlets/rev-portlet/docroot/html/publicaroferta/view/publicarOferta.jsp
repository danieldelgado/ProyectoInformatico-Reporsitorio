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

<input type="hidden" value="<portlet:namespace/>" />

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
				<input id="<portlet:namespace/>solicitudReclutamientoId" type="hidden" value="${solicitudReclutamiento.solicitudRequerimientoId}" />
				<div class="row-fluid">
					<div class="span5">
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
					</div>
					<div class="span1"></div>
					<div class="span5">
						<div class="span3">
							<label>Descripcion:</label>
						</div>
						<div class="span9">
							<textarea id="<portlet:namespace/>descripcion" name="<portlet:namespace/>descripcion" rows="15" cols="">
								
								</textarea>
						</div>
					</div>
				</div>
				<div class="row-fluid">

					<fieldset>
						<legend>Vista previa de la publicación</legend>




					</fieldset>

				</div>
				<div class="row">
					<div class="offset5 span2">
						<aui:button-row>
							<a class="btn btn-primary" href="${regresar}"> <liferay-ui:message key="general.form.opciones.guardar" />
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