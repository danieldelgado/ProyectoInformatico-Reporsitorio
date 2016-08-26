<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>


<portlet:defineObjects />
<liferay-theme:defineObjects />

<liferay-ui:ratings className="${journalArticleclassName}" classPK="${resourcePrimKey}" type="stars" />

<br>
<br>

<liferay-ui:journal-article showTitle="false" articleId="${articleId}" groupId="${groupId}" />


<br>
<br>

<liferay-ui:panel-container extended="<%=false%>" id="insultCommentsPanelContainer" persistState="<%=true%>">

	<liferay-ui:panel collapsible="<%=true%>" extended="<%=true%>" id="insultCommentsPanel" persistState="<%=true%>" title='comments'>

		<portlet:actionURL name="invokeTaglibDiscussion" var="discussionURL" />

		<%
			String currentUrl = PortalUtil.getCurrentURL(request);
		%>

		<liferay-ui:discussion className="${journalArticleclassName}" classPK="${resourcePrimKey}" formAction="<%=discussionURL%>" formName="fm2" ratingsEnabled="<%=true%>"
			redirect="<%=currentUrl%>" subject="Subjenteeeee" userId="${userId}" />

	</liferay-ui:panel>
</liferay-ui:panel-container>

<div class="container">
	<div class="offset1 span10">
		<div class="row-fluid" id="">
			<div class="" id="">
				<div class="span12" id="">
					<label for="" class="control-label" id=""> Puesto: </label>
				</div>
				<div class="controls span12">
					<div class="input-prepend">
						<label for="" class="control-label" id=""> ${solicitudReclutamiento.strpuesto}</label>
					</div>
				</div>
				<div class="span12">
					<label> Tiempo Contrato: </label>
				</div>
				<div class="span12">
					<div class="input-prepend">
						<label for="" class="control-label" id=""> ${solicitudReclutamiento.strtiempoContrato}</label>
					</div>
				</div>
				<div class="span12">
					<label> Tipo de Negocio: </label>
				</div>
				<div class="span12">
					<div class="input-prepend">
						<label for="" class="control-label" id=""> ${solicitudReclutamiento.strtipoNegocio}</label>
					</div>
				</div>
				<div class="span12">
					<label> Especialidad: </label>
				</div>
				<div class="span12">
					<div class="input-prepend">
						<label for="" class="control-label" id=""> ${solicitudReclutamiento.especialidad} </label>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<fieldset>
				<legend> Lista de requisitos </legend>
			</fieldset>
			<div class="container-fluid">
				<div>
					<div id="">
						<table class="table table-hover table-bordered">
							<thead>
								<tr class="cabecera">
									<th>Requisito</th>
									<th>Nivel</th>
									<th>Exigile</th>
									<th>Tipo Requisito</th>
								</tr>
							</thead>
							<tbody id="<portlet:namespace/>listaRequisitos">'+listarRequisitosDetalle('${requisitoEtiquetaBeans}')+'
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
