<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.util.Constants"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:resourceURL id="seleccionarPostulante" var="seleccionarPostulante">
</portlet:resourceURL>


<input type="hidden" value="<portlet:namespace/>" />
<input id="<portlet:namespace/>seleccionarPostulanteUrl" type="hidden" value="${seleccionarPostulante}" />


<input id="<portlet:namespace/>popupMensaje" type="hidden" value="<liferay-ui:message key="seleccionar.postulante.mensaje" />" />
<input id="<portlet:namespace/>msgError" type="hidden" value="<liferay-ui:message key="general.form.error" />" />


<input id="<portlet:namespace/>msgAceptar" type="hidden" value="<liferay-ui:message key="general.form.opciones.aceptar" />" />
<input id="<portlet:namespace/>msgCancelar" type="hidden" value="<liferay-ui:message key="general.form.opciones.cancelar" />" />

<fieldset>
	<legend>Seleccionar al postulante</legend>
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
			<form id="<portlet:namespace/>seleccionarPostulante" class="formulario">
				<input id="<portlet:namespace/>solicitudId" name="<portlet:namespace/>solicitudId" type="hidden" value="${solicitudId}" /> <input id="<portlet:namespace/>userId"
					name="<portlet:namespace/>userId" type="hidden" value="${userId}" />


				<div class="row-fluid"></div>
				<div class="row">
					<div class="span12"></div>
				</div>
<div class="row">

					<input id="" name="" type="hidden" value="${usuarioPostulante.solicitudId}" />


					<div class="span12">

						<fieldset>
							<legend>Acerca</legend>
							<label> Descripción del usuario : ${usuarioPostulante.acerca} </label> 
							
							<label> Fecha de Postulación : ${usuarioPostulante.fechaPostulacion} </label> <label> Disponibilidad :
								${usuarioPostulante.disponibilidad} </label> <label> Estado del Postulación : ${usuarioPostulante.estado} </label>
						</fieldset>
								<br>
					</div>
					<div class="span12">
						<fieldset>
							<legend>Experiencia</legend>
							<c:forEach items="${usuarioPostulante.listaExperienciaBean}" var="exp">
								<label> Empresa : ${exp.empresa} </label>
								<label> Rubro de Proyecto : ${exp.tipoNegocioProyecto} </label>
								<label> Fecha de Inicio : <fmt:formatDate pattern="dd-MM-yyyy" value="${exp.fechaInicio}" />
								</label>
								<label> Fecha de Fin : <fmt:formatDate pattern="dd-MM-yyyy" value="${exp.fechaFin}" />
								</label>
								<br>
							</c:forEach>
								<br>
						</fieldset>
					</div>
					<div class="span12">
						<fieldset>
							<legend>Conocimiento</legend>
							<c:forEach items="${usuarioPostulante.listaRequisitoConocimientosBean}" var="con">
								<label> Descripción : ${con.descripcion} </label>
								<label> Años de experiencia : ${con.annos} </label>
								<br>
							</c:forEach>

							<label> Porcentaje de requerimientos cumplidos : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.porcentajeReqCum*100}" />%
							</label> <label> Porcentaje del puesto cumplido para el postulante : <fmt:formatNumber pattern="0.00"
									value="${usuarioPostulante.porcentajeRequisitosCumplidoPorUsuario*100}" />%
							</label>
								<br>
						</fieldset>
					</div>
					<c:if test="${ usuarioPostulante.recomendableReqCertiCum and  usuarioPostulante.recomendableCertificadoCumplidoPorUsuario  }">
						<div class="span12">
							<fieldset>
								<legend>Certificado</legend>
								<c:forEach items="${usuarioPostulante.listaRequisitoCertificadosBean}" var="con">
									<label> Descripción : ${con.descripcion} </label>
									<label> Años de experiencia : ${con.annos} </label>
									<br>
								</c:forEach>

								<label> Porcentaje de cerfificados cumplidos : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.porcentajeReqCertiCum*100}" />%
								</label> <label> Porcentaje del puesto cumplido para el postulante : <fmt:formatNumber pattern="0.00"
										value="${usuarioPostulante.porcentajeCertificadoCumplidoPorUsuario*100}" />%
								</label>
								<br>
							</fieldset>
						</div>
					</c:if>
					<div class="span12">
						<fieldset>
							<legend>Evaluaciones Psicológicas</legend>
							<c:forEach items="${usuarioPostulante.listaEvaluacionPsicologicoBean}" var="eva">
								<label> Evaluación : ${eva.strTipoEvaluacion} </label>
								<label> Puntaje Obtenido : ${eva.puntajeObtenido} </label>
								<br>
							</c:forEach>
							<label> Distancia de Hamming Psicologico : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.distanciaHammingPsicologico*100}" />%
							</label> <label> Distancia de Euclidiana Psicologico : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.distanciaEuclidianaPsicologico*100}" />%
							</label>
								<br>
						</fieldset>
					</div>
					<div class="span12">
						<fieldset>
							<legend>Evaluaciones Técnicas</legend>
							<c:forEach items="${usuarioPostulante.listaEvaluacionTecnicoBean}" var="eva">
								<label> Evaluación : ${eva.strTipoEvaluacion} </label>
								<label> Puntaje Obtenido : ${eva.puntajeObtenido} </label>
								<br>
							</c:forEach>
							<label> Distancia de Hamming Técnico : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.distanciaHammingTecnico*100}" />%
							</label> <label> Distancia de Euclidiana Técnico : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.distanciaEuclidianaTecnico*100}" />%
							</label>
								<br>
						</fieldset>
					</div>
					<div class="span12">
						<fieldset>
							<legend>Entrevista con RRHH</legend>
							<label> Puntaje Obtenido : ${usuarioPostulante.evaluacionEntevistaPsicologicaBean.puntajeObtenido}</label>
								<br>
						</fieldset>
					</div>
					<div class="span12">
						<fieldset>
							<legend>Entrevista con Gérente de Área</legend>
							<label> Puntaje Obtenido : ${usuarioPostulante.evaluacionEntevistaGerenteAreaBean.puntajeObtenido}</label>
								<br>
						</fieldset>
					</div>

					<div class="span12">
						<fieldset>
							<legend>Resultados Finales</legend>
							<label> Distancia de Hamming de las entrevistas : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.distanciaHammingEntrevista*100}" />%
							</label> 							
							<label> Distancia de Euclidiana de las entrevistas : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.distanciaEuclidianaEntrevista*100}" />%
							</label> <label> Distancia Total : <fmt:formatNumber pattern="0.00" value="${usuarioPostulante.cercania*100}" />%
							</label>
								<br>
						</fieldset>
					</div>
				</div>
				<div class="row">
					<div class="offset4 span4">
						<aui:button-row>
							<a class="btn btn-primary" id="<portlet:namespace/>btnGuardar" href="javascript:void(0)"> <liferay-ui:message key="general.form.seleccionar" />
							</a>

							<portlet:renderURL var="listarPostulantes">
								<portlet:param name="action" value="listarPostulantes" />
								<portlet:param name="solicitudRequerimientoId" value="${solicitudId}" />
							</portlet:renderURL>

							<input id="<portlet:namespace/>listarPostulantesUrl" name="<portlet:namespace/>listarPostulantesUrl" type="hidden" value="${listarPostulantes}" />
							<a class="btn btn-primary" href="${listarPostulantes}"> <liferay-ui:message key="general.form.opciones.salir" />
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
		inicializarFormularioSeleccion();
	});
</script>