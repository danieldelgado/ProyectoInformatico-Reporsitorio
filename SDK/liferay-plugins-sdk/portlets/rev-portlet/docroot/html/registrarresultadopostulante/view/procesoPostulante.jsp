
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

<portlet:resourceURL var="registrarProceso" id="registrarProceso" />


<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>registrarProcesoUrl" type="hidden" value="${registrarProceso}" />
<input id="<portlet:namespace/>popupconfirmarMensage" type="hidden" value="Registrar Resultado" />
<input id="<portlet:namespace/>popupPublicacionTitulo" type="hidden" value="Registrar Avance" />
<input id="<portlet:namespace/>popupMensaje" type="hidden" value="Registro de Registrar Resultado" />

<input id="<portlet:namespace/>msgError" type="hidden" value="<liferay-ui:message key="general.form.error" />" />

<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<fieldset>
	<legend>Registrar Resultado del postulante</legend>
	<div class="container">
		<div class="contenedorAlerta"></div>
		<div class="offset1 span10">
			<form id="<portlet:namespace/>registrarResultado" name="<portlet:namespace/>registrarResultado" class="formulario">
				<input id="<portlet:namespace/>solicitudId" name="<portlet:namespace/>solicitudId" type="hidden" value="${solicitudPostulacionBean.solicitudId}" /> <input
					id="<portlet:namespace/>userId" name="<portlet:namespace/>userId" type="hidden" value="${userId}" />
				<div class="row-fluid"></div>
				<div class="row-fluid">
					<div class="span12"></div>


					<div class="span12">
						<div>
							<div class="span5">
								<label> Puesto: </label>
							</div>
							<div class="span6">
								<label>${solicitudPostulacionBean.strpuesto}</label>
							</div>
						</div>
					</div>
					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha Actual: </label>
							</div>
							<div class="span6">
								<label>${solicitudPostulacionBean.strfechaPostulacion}</label>
							</div>
						</div>
					</div>

					<c:if test="${ solicitudPostulacionBean.fasePostulacionPsicologico != null }">
						<div class="span12">
							<div>
								<div class="span5">
									<label> Fecha evaluación Piscólogica: </label>
								</div>
								<div class="span6">
									<label>${solicitudPostulacionBean.strfechaPsicologica}</label>
								</div>
							</div>
						</div>

						<c:forEach items="${solicitudPostulacionBean.listaEvaluacionesPuestoEnfoque}" var="evaluaciones">
							<c:if test="${ evaluaciones.evaluacionBean.evaluacionId != '1' && evaluaciones.evaluacionBean.evaluacionId != '2'  }">
								<c:if test="${ evaluaciones.evaluacionBean.tipoEvaluacion == 83  }">
									<div class="span12">
										<input name="<portlet:namespace/>evaluacionSelect${evaluaciones.evaluacionBean.evaluacionId}Id" type="hidden" value="${evaluaciones.evaluacionBean.evaluacionId}" />
										<div class="span5">
											<label> ${ evaluaciones.evaluacionBean.descripcion } resultado: </label>
										</div>
										<div class="span6">										
										<select id="<portlet:namespace/>resultado${evaluaciones.evaluacionBean.evaluacionId}Id" name="<portlet:namespace/>resultado${evaluaciones.evaluacionBean.evaluacionId}Id" class="span8 valform">
											<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
											<c:set var="startIndex" scope="page" value="0"/>
											<c:set var="endIndex" scope="page" value="35"/>
	    									<c:forEach begin="${startIndex}" end="${endIndex}" step="1" var="index">
												<option value="${index}"												
											    <c:forEach items="${ solicitudPostulacionBean.listaFasePostulacionPuestoEvaluacionBean}" var="ppe">
			    									<c:if test="${ ppe.tipoEvaluacionId == evaluaciones.evaluacionBean.tipoEvaluacion  }">
				    									<c:if test="${ ppe.evaluacionId == evaluaciones.evaluacionBean.evaluacionId  }">
				    										
				    										<c:if test="${ ppe.resultado == index  }">
				    										
				    										selected="selected"
				    										
			    											</c:if>
				    									</c:if>
			    									</c:if>
		    									</c:forEach>
												>
												${index}</option>
											</c:forEach>
										</select>
										
										</div>
									</div>
								</c:if>
							</c:if>
						</c:forEach>

					</c:if>

					<c:if test="${ solicitudPostulacionBean.fasePostulacionTecnico != null }">
						<div class="span12">
							<div>
								<div class="span5">
									<label> Fecha evaluación Técnica: </label>
								</div>
								<div class="span6">
									<label>${solicitudPostulacionBean.strfechaTecnica}</label>
								</div>
							</div>

						</div>

						<c:forEach items="${solicitudPostulacionBean.listaEvaluacionesPuestoEnfoque}" var="evaluaciones">
							<c:if test="${ evaluaciones.evaluacionBean.evaluacionId != '1' && evaluaciones.evaluacionBean.evaluacionId != '2'  }">
								<c:if test="${ evaluaciones.evaluacionBean.tipoEvaluacion == 84  }">
									<div class="span12">
										<input name="<portlet:namespace/>evaluacionSelect${evaluaciones.evaluacionBean.evaluacionId}Id" type="hidden" value="${evaluaciones.evaluacionBean.evaluacionId}" />
										<div class="span5">
											<label> ${ evaluaciones.evaluacionBean.descripcion } resultado: </label>
										</div>
										<div class="span6">
											<select id="<portlet:namespace/>resultado${evaluaciones.evaluacionBean.evaluacionId}Id" name="<portlet:namespace/>resultado${evaluaciones.evaluacionBean.evaluacionId}Id" class="span8 valform">
												<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
												<c:set var="startIndex" scope="page" value="0"/>
												<c:set var="endIndex" scope="page" value="35"/>
		    									<c:forEach begin="${startIndex}" end="${endIndex}" step="1" var="index">
													<option value="${index}"
													
													 <c:forEach items="${ solicitudPostulacionBean.listaFasePostulacionPuestoEvaluacionBean}" var="ppe">
				    									<c:if test="${ ppe.tipoEvaluacionId == evaluaciones.evaluacionBean.tipoEvaluacion  }">
					    									<c:if test="${ ppe.evaluacionId == evaluaciones.evaluacionBean.evaluacionId  }">
					    										
					    										<c:if test="${ ppe.resultado == index  }">
					    										
					    										selected="selected"
					    										
				    											</c:if>
					    									</c:if>
				    									</c:if>
			    									</c:forEach>
													
													>${index}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</c:if>
							</c:if>
						</c:forEach>

					</c:if>




					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha Entrevista con RRHH: </label>
							</div>
							<div class="span6">
								<label>${solicitudPostulacionBean.strfechaRRHH}</label>
							</div>
						</div>
					</div>
					<div class="span12">
						<input name="<portlet:namespace/>evaluacionSelect1Id" type="hidden" value="1" />
						<div class="span5">
							<label> ${ evaluaciones.evaluacionBean.descripcion } resultado: </label>
						</div>
						<div class="span6">
							<select id="<portlet:namespace/>resultado1Id" name="<portlet:namespace/>resultado1Id" class="span8 valform">
								<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
								<c:set var="startIndex" scope="page" value="0"/>
								<c:set var="endIndex" scope="page" value="35"/>
  									<c:forEach begin="${startIndex}" end="${endIndex}" step="1" var="index">
									<option value="${index}"									
								 		<c:forEach items="${ solicitudPostulacionBean.listaFasePostulacionPuestoEvaluacionBean}" var="ppe">
		    									<c:if test="${ ppe.evaluacionId == 1  }">		    										
		    										<c:if test="${ ppe.resultado == index  }">		    										
		    										selected="selected"
		    										</c:if>
		    									</c:if>
    									</c:forEach>	
									>${index}</option>
								</c:forEach>
							</select>
						</div>
					</div>

					<div class="span12">
						<div>
							<div class="span5">
								<label> Fecha Entrevista con Gerente de Área: </label>
							</div>
							<div class="span6">
								<label>${solicitudPostulacionBean.strfechaGerenteArea}</label>
							</div>
						</div>
					</div>
					<div class="span12">
						<input name="<portlet:namespace/>evaluacionSelect2Id" type="hidden" value="2" />
						<div class="span5">
							<label> ${ evaluaciones.evaluacionBean.descripcion } resultado: </label>
						</div>
						<div class="span6">
							<select id="<portlet:namespace/>resultado2Id" name="<portlet:namespace/>resultado2Id" class="span8 valform">
								<option label="" value=""><liferay-ui:message key="general.form.seleccione" /></option>
								<c:set var="startIndex" scope="page" value="0"/>
								<c:set var="endIndex" scope="page" value="35"/>
  									<c:forEach begin="${startIndex}" end="${endIndex}" step="1" var="index">
									<option value="${index}"								
								 		<c:forEach items="${ solicitudPostulacionBean.listaFasePostulacionPuestoEvaluacionBean}" var="ppe">
		    									<c:if test="${ ppe.evaluacionId == 2  }">		    										
		    										<c:if test="${ ppe.resultado == index  }">		    										
		    										selected="selected"
		    										</c:if>
		    									</c:if>
    									</c:forEach>
    								>${index}</option>
								</c:forEach>
							</select>
						</div>
					</div>

				</div>
				<div class="row">
					<div class="offset4 span4">
						<aui:button-row>
							<button id="<portlet:namespace/>btnGuardar" class="btn btn-primary" type="button">
								<liferay-ui:message key="general.form.opciones.guardar" />
							</button>
							<portlet:renderURL var="listarPostulantes">
								<portlet:param name="action" value="listarPostulantes" />
								<portlet:param name="solicitudRequerimientoId" value="${solicitudReclutamiento.solicitudRequerimientoId}" />
							</portlet:renderURL>
							<input id="<portlet:namespace/>listarPostulantesUrl" name="<portlet:namespace/>listarPostulantesUrl" type="hidden" value="${listarPostulantes}" />
							<a class="btn btn-primary" href="${listarPostulantes}"> Cancelar </a>
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
		inicializarFormularioRegsitroAvancePostulante();
	});
</script>