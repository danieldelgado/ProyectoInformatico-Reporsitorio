<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />



<portlet:actionURL var="buscar" name="buscar" />




<aui:fieldset label="Programar Entrevistas">

	<aui:row>
		<aui:col span="2">
		</aui:col>
		<aui:col span="8">
			<form name="fm" method="post" action="${buscar}">
				<aui:row>
					<aui:col span="5">
						<div>
							<aui:col span="6">
								<label>Puesto:</label>
							</aui:col>
							<aui:col span="6">
								<input name="puesto" type="text">
							</aui:col>
						</div>
						<div>
							<aui:col span="6">
								<label>Fecha Inicio:</label>
							</aui:col>
							<aui:col span="6">
								<liferay-ui:input-date name="fechaEmisionInicio" dayValue="15"
									monthValue="9" yearValue="1990"></liferay-ui:input-date>
							</aui:col>
						</div>
						<div>
							<aui:col span="6">
								<label>Fecha Fin:</label>
							</aui:col>
							<aui:col span="6">
								<liferay-ui:input-date name="fechaEmisionFin" dayValue="15"
									monthValue="9" yearValue="1990"></liferay-ui:input-date>
							</aui:col>
						</div>
					</aui:col>
					<aui:col span="2">
					</aui:col>
					<aui:col span="5">


						<div>
							<aui:col span="6">
								<label>Responsable:</label>
							</aui:col>
							<aui:col span="6">
								<input name="responsable" type="text">
							</aui:col>
						</div>
						<div>
							<aui:col span="6">
								<label>Tiempo de Contrato:</label>
							</aui:col>
							<aui:col span="6">
								<select name="tiempoContrato">
									<option label="Seleccione" value="Seleccione" />
									<option label="45" value="1 mes" />
									<option label="46" value="6 meses" />
								</select>
							</aui:col>
						</div>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col span="3" cssClass="offset4">
						<aui:button-row>
							<aui:button name="buscar" type="submit" value="Buscar" />
						</aui:button-row>
					</aui:col>
				</aui:row>
			</form>
		</aui:col>
		<aui:col span="2">
		</aui:col>

	</aui:row>
	<aui:row>
		<aui:col span="12">


			<%
				PortletURL iteratorURL = renderResponse.createRenderURL();
			%>

			<liferay-ui:search-container id="listaRequerimientoSolicitud"
				curParam="listaRequerimientos" delta="10"
				iteratorURL="<%=iteratorURL%>"
				emptyResultsMessage="No hay resultados">
				<liferay-ui:search-container-results
					results="${listaSolicitudesEntrevistaBeans}"
					total="${listaSolicitudesEntrevistaBeansCount}" />
				<liferay-ui:search-container-row
					className="com.hitss.rec.programarentrevista.bean.SolicitudRequerimientoBean"
					modelVar="solreq">

					<liferay-ui:search-container-column-text property="codigo"
						name="Código" />

					<liferay-ui:search-container-column-text property="numero"
						name="Número" />

					<liferay-ui:search-container-column-text property="arearequerida"
						name="Área requerida" />

					<liferay-ui:search-container-column-text property="fechaEmitida"
						name="Fecha Emitida" />

					<liferay-ui:search-container-column-text property="tiempoContrato"
						name="Tiempo Contrato" />

					<liferay-ui:search-container-column-text
						property="countEvaluacionesAprobadas" name="Aprobarón Evauaciones" />

					<liferay-portlet:renderURL var="listaPostulantes">
						<portlet:param name="action" value="listaPostulantes" />
						<portlet:param name="requerimeintoId"
							value="${solreq.requerimeintoId}" />
					</liferay-portlet:renderURL>

					<liferay-ui:search-container-column-text href="${listaPostulantes}"
						name="Opciones" value="Listar Postulantes" />

					
				
				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>

</aui:fieldset>