<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>

<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ page import="javax.portlet.ActionRequest"%>
<%@ page import="java.net.URLDecoder"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
	String search = (String) request.getAttribute("requerimeintoId");
	if (search == null) {
		search = "";
	}
	PortletURL urlPaginator = renderResponse.createRenderURL();
	urlPaginator.setParameter(ActionRequest.RENDER_PHASE, "listaPostulantes");
	urlPaginator.setParameter("requerimeintoId", search);
%>

<aui:fieldset label="Lista de Postulantes">

	<aui:row>
		<aui:col span="12">




			<liferay-ui:search-container id="listaPostulantes" delta="12"
				deltaConfigurable="true" curParam="listaPostulantes"
				iteratorURL="<%=urlPaginator %>"
				emptyResultsMessage="No hay resultados">
				<liferay-ui:search-container-results
					results="${listaUsuarioEntrevistaBeans}"
					total="${listaUsuarioEntrevistaBeansCount}" />
				<liferay-ui:search-container-row
					className="com.hitss.rec.registrarResultadoEntrevista.bean.UsuarioEntrevistaBean"
					modelVar="usuarioPostulante">

					<liferay-ui:search-container-column-text property="fullname"
						name="Postulante" />
					<liferay-ui:search-container-column-text
						property="fechaPostulancion" name="Fecha Postulaci�n" />
					<liferay-ui:search-container-column-text property="disponibilidad"
						name="Disponibilidad" />
					<liferay-ui:search-container-column-text property="interno"
						name="Interno" />
					<liferay-ui:search-container-column-text property="fase"
						name="Fase del reclutamiento" />
					<liferay-ui:search-container-column-text property="dni" name="DNI" />


					<liferay-ui:search-container-column-text name="Opciones">
						<div>
							<input type="hidden" value="${usuarioPostulante.userId}" />
							<aui:button value="Programar Evaluacio�n/Entrevista"
								cssClass="buttonDialog"></aui:button>

						</div>
					</liferay-ui:search-container-column-text>


				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>


</aui:fieldset>


<portlet:resourceURL var="programarEntrevista" id="programarEntrevista" />


<div id="modal">

<div id="programarEntrevista" style="display: none;">

	<aui:row>



		<form name="fmEntrevista" method="post" >
			<input type="hidden" name="aspirante" class="postulante" value="" />
			<aui:col span="12">

				<div>
					<aui:col span="5">
						<label>Observaciones:</label>
					</aui:col>
					<aui:col span="5">
						<input id="observaciones" name="observaciones"
							class="form-control" type="text" />
					</aui:col>
				</div>

				<div>
					<aui:col span="5">
						<label>Asistio:</label>
					</aui:col>
					<aui:col span="6">
						<input id="asistio" name="asistio"
							class="form-control" type="checkbox"/>
					</aui:col>
				</div>

			

			</aui:col>
			
		</form>
	</aui:row>

</div>

</div>



<aui:script use="node">
	AUI().use(
			'aui-base',
			function(A) {
				
				var buttonDialogProgramarEvaEntre = A.all('.buttonDialog');
				var valuePostulanteId = null;

				buttonDialogProgramarEvaEntre.each(function() {
					this.on('click', function(event) {
						valuePostulanteId = this.get('parentNode').one(
								"input[type=hidden]").get("value");
						console.log(valuePostulanteId);
						abrirDialogProgramarEntrevista(valuePostulanteId);
					});

				});
				
				

			});

	function abrirDialogProgramarEntrevista(valuePostulanteId) {
		AUI().use('aui-modal', function(Y) {			
			var postulante = Y.one("#programarEntrevista").one("input[type=hidden]");
			postulante.setAttribute('value', valuePostulanteId);		
			var modal = new Y.Modal({
				bodyContent : Y.one("#programarEntrevista").html(),
				centered : true,
				destroyOnHide : true,
				headerContent : '<h3>Registrar resultados</h3>',
				modal : true,
				stack : true,
				render : '#modal',
				visible : true,
				width : 550
			}).render();
			modal.show();		
			modal.addToolbar([
							{
								label : 'Cancelar',
								on : {
									click : function() {
										modal.hide();
									}
								}
							},
							{
								label : 'Programar',
								on : {
									click : function() {

										console.log("1this");
										console.log(modal);
										var postulantee = Y.one("#programarEntrevista").one("input[type=hidden]");
										console.log("2this");
										console.log(postulantee.getAttribute('value'));
										
										console.log(modal.get("form"));
										
										AUI().use('aui-io-request', function(A) {
											A.io.request('<%=programarEntrevista.toString()%>', {
										               method: 'post',
										               data: {
										                   id: 'fmEntrevista'
										               },
										               sync:false,
													   on: {
										 				 success:function(){
										 					var data=this.get('responseData');
										 					console.log(data);
										 					
										 				}}
										            });
										    });
										
									}
								}
							} ]);
				});				
			
	}

</aui:script>
	















