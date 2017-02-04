
var inputFristnamespace = null;
var formvalid = true;
var modalconfirmacion = null;

var listaFuncionMap = [];
$(document).ready(function() {
	init();
});
function init() {
	inputFristnamespace = $("input[type=hidden]").first().val();
}

function inicializarFormularioBusqueda() {
	init();

	var buscarSolicitud = $("#" + inputFristnamespace + "buscarSolicitud");
	var btnBuscar = $("#" + inputFristnamespace + "btnBuscar");
	var listarSolicitudesReclutamientoUrl = $("#" + inputFristnamespace + "listarSolicitudesReclutamiento").val();
	var listaSolicitudes = $("#" + inputFristnamespace + "listaSolicitudes");
	var paginacion = $("#" + inputFristnamespace + "paginacion");
	var pagina = $("#" + inputFristnamespace + "pagina").val();
	var filas = $("#" + inputFristnamespace + "filas").val();

	var publicarOfertaUrl = $("#" + inputFristnamespace + "publicarOfertaUrl").val();
	var verDetalleSolicitudUrl = $("#" + inputFristnamespace + "verDetalleSolicitudUrl").val();
	var finalizarOfertaUrl = $("#" + inputFristnamespace + "finalizarOfertaUrl").val();

	var urls = {
			"finalizarOfertaUrl" : finalizarOfertaUrl,
			"publicarOfertaUrl" : publicarOfertaUrl,
			"verDetalleSolicitudUrl" : verDetalleSolicitudUrl
	};

	listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);

	$(btnBuscar).click(function() {
		// if(filtrafecharegistro){
		listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);
		// }
	});
	
	
	
	


	AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator', 'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
		init();
		
		if (A.one('#' + inputFristnamespace + 'fechaRegistroInicio') != null) {
			new A.DatePicker({
				trigger : '#' + inputFristnamespace + 'fechaRegistroInicio',
				mask : '%d/%m/%Y',
				popover : {
					zIndex : 1
				},
				on : {
					selectionChange : function(event) {
						// var btnBuscar = $("#" + inputFristnamespace +
						// "btnBuscar");
						var d = new Date(event.newSelection);
						var day = d.getDate();
						var monthIndex = d.getMonth();
						var year = d.getFullYear();
						var fecha = day + "/" + (monthIndex + 1) + "/" + year;
						A.one('#' + inputFristnamespace + 'fechaRegistroInicioVal').set('value', fecha);
						console.log(validarFecharSimple(inputFristnamespace + 'fechaRegistroInicioVal', inputFristnamespace + 'fechaRegistroFinVal'));
						if (validarFecharSimple(inputFristnamespace + 'fechaRegistroInicioVal', inputFristnamespace + 'fechaRegistroFinVal')) {
							var contenedorAlerta = $(".contenedorAlerta");
							$(contenedorAlerta).html("");
						} else {
							var contenedorAlerta = $(".contenedorAlerta");
							mostrarAlerta(contenedorAlerta, "Busqueda", "Fechas incorrectas", "alert-error", null);
						}
					}
				}
			});
		}
		
		if (A.one('#' + inputFristnamespace + 'fechaRegistroFin') != null) {
			new A.DatePicker({
				trigger : '#' + inputFristnamespace + 'fechaRegistroFin',
				mask : '%d/%m/%Y',
				popover : {
					zIndex : 1
				},
				on : {
					selectionChange : function(event) {
						// var btnBuscar = $("#" + inputFristnamespace +
						// "btnBuscar");
						var d = new Date(event.newSelection);
						var day = d.getDate();
						var monthIndex = d.getMonth();
						var year = d.getFullYear();
						var fecha = day + "/" + (monthIndex + 1) + "/" + year;
						A.one('#' + inputFristnamespace + 'fechaRegistroFinVal').set('value', fecha);
						console.log(validarFecharSimple(inputFristnamespace + 'fechaRegistroInicioVal', inputFristnamespace + 'fechaRegistroFinVal'));
						if (validarFecharSimple(inputFristnamespace + 'fechaRegistroInicioVal', inputFristnamespace + 'fechaRegistroFinVal')) {
							var contenedorAlerta = $(".contenedorAlerta");
							$(contenedorAlerta).html("");
						} else {
							var contenedorAlerta = $(".contenedorAlerta");
							mostrarAlerta(contenedorAlerta, "Busqueda", "Fechas incorrectas", "alert-error", null);
						}
					}
				}
			});
		}
		
		
	});
	

}

function listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesRelutamientoUrl, urls) {
	$(listaSolicitudes).html("");
	$(paginacion).html("");

	var listapuesto = $("#" + inputFristnamespace + "listapuesto").val();
	var listacantidad = $("#" + inputFristnamespace + "listacantidad").val();
	var listaareaSolicitante = $("#" + inputFristnamespace + "listaareaSolicitante").val();
	var listaresponsableRRHH = $("#" + inputFristnamespace + "listaresponsableRRHH").val();
	var listafechalimite = $("#" + inputFristnamespace + "listafechalimite").val();
	var listatiempocontrato = $("#" + inputFristnamespace + "listatiempocontrato").val();
	var listacliente = $("#" + inputFristnamespace + "listacliente").val();
	var listaprioridad = $("#" + inputFristnamespace + "listaprioridad").val();
	var listaestado = $("#" + inputFristnamespace + "listaestado").val();
	var listaopciones = $("#" + inputFristnamespace + "listaopciones").val();

	var listaOpcionPublicarOferta = $("#" + inputFristnamespace + "listaOpcionPublicarOferta").val();
	var listaOpcionVerDetalle = $("#" + inputFristnamespace + "listaOpcionVerDetalle").val();
	var listaOpcionFinalizarOferta = $("#" + inputFristnamespace + "listaOpcionFinalizarOferta").val();
		
	$.ajax({
		type : "POST",
		url : listarSolicitudesRelutamientoUrl,
		data : $(buscarSolicitud).serialize() + "&" + inputFristnamespace + "pagina=" + pagina + "&" + inputFristnamespace + "filas=" + filas,
		success : function(data) {
			data = $.parseJSON(data);
			console.log(data);
			var html = '<table class="table table-hover table-bordered">';
			html += '<thead>';
			html += '<tr class="cabecera">';
			html += '<th>#</th>';
			html += '<th>' + listapuesto + '</th>';
			html += '<th>' + listacantidad + '</th>';
			html += '<th>' + listaareaSolicitante + '</th>';
			html += '<th>' + listaresponsableRRHH + '</th>';
			html += '<th>' + listafechalimite + '</th>';
			html += '<th>' + listatiempocontrato + '</th>';
			html += '<th>' + listacliente + '</th>';
			html += '<th>' + listaprioridad + '</th>';
			html += '<th>' + listaestado + '</th>';
			html += '<th>' + listaopciones + '</th>';
			html += '</tr>';
			html += '</thead>';
			html += '<tbody>';
			var count = (filas * pagina - filas);

			$.each(data.lista, function(index, value) {
				count++;
				html += '<tr>';

				html += '<td>' + +count + '</td>';

				html += '<td>' + value.strpuesto + '</td>';
				html += '<td>' + value.cantidadRecursos + '</td>';
				html += '<td>' + value.strareaSolicitante + '</td>';
				html += '<td>' + value.strresponsableRRHH + '</td>';
				html += '<td>' + value.strfechaLimite + '</td>';
				html += '<td>' + value.strtiempoContrato + '</td>';
				html += '<td>' + value.strcliente + '</td>';
				html += '<td>' + value.strprioridad + '</td>';
				html += '<td>' + value.strestado + '</td>';
				html += '<td>';
				html += '	<div class="btn-group">';

				if (value.estado == 75) {
					html += '		<a class="btn btn-danger finalizarPublicacion" data="' + value.solicitudRequerimientoId + '" href="javascript:void();">' + listaOpcionFinalizarOferta + ' </a>';
					//html += '		<a class="btn btn-danger" href="' + urls["finalizarOfertaUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionFinalizarOferta + ' </a>';
				}

				if (value.estado == 76) {
					html += '		<a class="btn btn-primary" href="' + urls["publicarOfertaUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionPublicarOferta + ' </a>';
				}
				
				html += '		<a class="btn btn-primary" href="' + urls["verDetalleSolicitudUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionVerDetalle + ' </a>';
				
				html += '	</div>';
				html += '</td>';
				html += '</tr>';
			});
			html += '</tbody>';
			html += '</table>';
			$(listaSolicitudes).html(html);

			barraPaginacion(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesRelutamientoUrl, data, urls);
			finalizarPublicacion();
		}
	});

}

function barraPaginacion(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesRelutamientoUrl, data, urls) {
	var pagina = parseInt(data.pagina); // pagina actual
	var total = data.total;// total de paginas
	var html = '';

	if (total > 1) {
		html += '<ul>';
		html += '<li><a href="javascript:void(0);" class="prev" > << </a></li>';
		for (var i = 1; i <= total; i++) {
			html += '<li><a href="javascript:void(0);"';
			if (pagina == parseInt(i)) {
				html += ' class="active"  ';
			}
			html += '>' + i + '</a></li>';
		}

		html += '<li><a href="javascript:void(0);" class="next" > >> </a></li>';
		html += '</ul>';

		$(paginacion).html(html);
		if (pagina > 1) {
			$(".prev").click(function() {
				listaPaginada(pagina - 1, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesRelutamientoUrl, urls);
			});
		}

		if (total > pagina) {
			$(".next").click(function() {
				listaPaginada(pagina + 1, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesRelutamientoUrl, urls);
			});
		}
	}

}

function finalizarPublicacion(){
	var id = null;
	var anularSolicitudUrl = $("#" + inputFristnamespace + "finalizarOfertaUrl").val();
	var modal = null;
	
	var titulo = $("#" + inputFristnamespace + "popupFinalizarPublicacionTitulo").val();
	var mensaje = $("#" + inputFristnamespace + "popupFinalizarPublicacionMensage").val();
	
	var msgAceptar = $("#" + inputFristnamespace + "msgAceptar").val();
	var msgCancelar = $("#" + inputFristnamespace + "msgCancelar").val();
	var btnBuscar = $("#" + inputFristnamespace + "btnBuscar");

	var anularOpcions = $(".finalizarPublicacion");
	$(anularOpcions).click(function() {
		id = $(this).attr("data");
		modal.show();
	});

	AUI().use('aui-modal', function(A) {

		modal = new A.Modal({
			bodyContent : mensaje,
			centered : true,
			destroyOnHide : false,
			headerContent : "<h5>" + titulo + "</h5>",
			modal : true,
			render : '#' + inputFristnamespace + 'modal',
			resizable : false,
			visible : false,
			width : 305
		}).render();

		modal.addToolbar([{
			label : msgAceptar,
			on : {
				click : function() {
					$.ajax({
						type : "POST",
						url : anularSolicitudUrl + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + id,
						data : {},
						success : function(data) {
							modal.hide();
							data = $.parseJSON(data);
							console.log(data);
							var objeto = data["objeto"];
							console.log(objeto);
							var respuesta = data["respuesta"];
							console.log(respuesta);
							var mensaje = data["mensaje"];
							console.log(mensaje);
							var contenedorAlerta = $(".contenedorAlerta");
							console.log(objeto);
							mostrarAlerta(contenedorAlerta, titulo, mensaje, "alert-success", function() {
								$(btnBuscar).click();
							});
						}
					});
				}
			}
		} ,

		{
			label : msgCancelar,
			on : {
				click : function() {
					modal.hide();
				}
			}
		}
		
		
		]);

	});
}

function inicializarFormularioPublicarOferta(){
	init();
	
	var formPublicarOferta = $("#" + inputFristnamespace + "publicaroferta");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	
	var solicitudReclutamientoId = inputFristnamespace + "solicitudReclutamientoId";
	
	var cantidadAnnosRubro =  inputFristnamespace + "cantidadAnnosRubro";
	onlyNumber(cantidadAnnosRubro);
	
	var rangoMinimo1 =  inputFristnamespace + "rangoMinimo1";
	onlyNumber(rangoMinimo1);
	
	var rangoMaximo1 =  inputFristnamespace + "rangoMaximo1";
	onlyNumber(rangoMaximo1);
	
	var rangoMinimo2 =  inputFristnamespace + "rangoMinimo2";
	onlyNumber(rangoMinimo2);
	
	var rangoMaximo2 =  inputFristnamespace + "rangoMaximo2";
	onlyNumber(rangoMaximo2);

	var rangoMinimo =  inputFristnamespace + "rangoMinimo";
	onlyNumber(rangoMinimo);
	var rangoMaximo =  inputFristnamespace + "rangoMaximo";
	onlyNumber(rangoMaximo);
	
	var btnAgregar =  $("#" + inputFristnamespace + "btnAgregar");
	
	
	var rules = {};
	rules[cantidadAnnosRubro] = {
			required : function() {
				console.log($('#' + cantidadAnnosRubro).val());
				console.log($('#' + cantidadAnnosRubro).val() > -1);
				if (!$('#' + cantidadAnnosRubro).val() > -1) {
					console.log("pasa val");
					return true;
				} else {
					return false;
				}
			}
		};
	rules[rangoMinimo1] = {
			required : function() {
				console.log($('#' + rangoMinimo1).val());
				console.log($('#' + rangoMinimo1).val() <= 1 && $('#' + rangoMinimo1).val() >=0);
				if (!$('#' + rangoMinimo1).val() <= 1 && $('#' + rangoMinimo1).val() >=0) {
					return true;
				} else {
					return false;
				}
			}
		};
	rules[rangoMaximo1] = {
			required : function() {
				console.log($('#' + rangoMaximo1).val());
				console.log($('#' + rangoMaximo1).val() <= 1 && $('#' + rangoMaximo1).val() >=0);
				if (!$('#' + rangoMaximo1).val() <= 1 && $('#' + rangoMaximo1).val() >=0) {
					return true;
				} else {
					return false;
				}
			}
		};
	rules[rangoMinimo2] = {
			required : function() {
				console.log($('#' + rangoMinimo2).val());
				console.log($('#' + rangoMinimo2).val() <= 1 && $('#' + rangoMinimo2).val() >=0);
				if (!$('#' + rangoMinimo2).val() <= 1 && $('#' + rangoMinimo2).val() >=0) {
					return true;
				} else {
					return false;
				}
			}
		};
	rules[rangoMaximo2] = {
			required : function() {
				console.log($('#' + rangoMaximo2).val());
				console.log($('#' + rangoMaximo2).val() <= 1 && $('#' + rangoMaximo2).val() >=0);
				if (!$('#' + rangoMaximo2).val() <= 1 && $('#' + rangoMaximo2).val() >=0) {
					console.log("rangoMaximo2 return true");
					return true;
				} else {
					console.log("rangoMaximo2 return false");
					return false;
				}
			}
		};
	
	
	var messages = {};
	messages[cantidadAnnosRubro] =	{	required :  "Debe de ingresar la cantidad de años" };
	messages[rangoMinimo1] = 		{	required :  "Ingresar rango minimo de evaluación con coordinandor de RRHH" };
	messages[rangoMaximo1] = 		{	required :  "Ingresar rango maximo de evaluación con coordinandor de RRHH" };
	messages[rangoMinimo2] = 		{	required :  "Ingresar rango minimo de evaluación con Gerente de área" };
	messages[rangoMaximo2] = 		{	required :  "Ingresar rango maximo de evaluación con Gerente de área" };
	
	$(formPublicarOferta).validate({
		ignore : [],
		debug : true,
		errorElement : "div",
		errorClass : "text-error",
		rules : rules,
		messages : messages,
		submitHandler : function(form) {
			console.log(form);
			return false;
		}
	});
	
	
	$(btnGuardar).click(function() {
		var contenedorAlerta = $(".contenedorAlerta");
		console.log("listaFuncionMap:"+listaFuncionMap);
		var listasCorrectas = true;
		if( listaFuncionMap.length == 0 ){
			mostrarAlerta(contenedorAlerta, "Lista de Evaluaciones", "Ingrese al menos una evaluacion psicológica y/o técnica", "alert-error", null);
			listasCorrectas = false;
		}	
		console.log("listasCorrectas:"+listasCorrectas);
		console.log("btnGuardar");
		formvalid = false;
		$(formPublicarOferta).valid();
		if(listasCorrectas){
			formvalid = $(formPublicarOferta).valid();
			console.log(formvalid);
		}		
	});
	
	$(btnAgregar).click(function() {
		
		agregarEvaluacion();
	});
}

function agregarEvaluacion(){
	var evaluacion = $("#" + inputFristnamespace + "evaluacion").val();
	console.log("evaluacion:"+evaluacion);
	var evaluacionText = $("#" + inputFristnamespace + "evaluacion option:selected").text();
	console.log("evaluacionText:"+evaluacionText);
	var rangoMinimo = $("#" + inputFristnamespace + "rangoMinimo").val();
	var rangoMaximo = $("#" + inputFristnamespace + "rangoMaximo").val();
	addEvaluacionFila(evaluacion, evaluacionText , rangoMinimo,rangoMaximo);	
}

function addEvaluacionFila(evaluacionId , evaluacionText , rangoInferior,rangoSuperior) {
	console.log("addEvaluacionFila");
	
	if (evaluacionId != "" && (rangoInferior != "" && rangoInferior <= 1 && rangoInferior >=0) && (rangoSuperior != ""& rangoSuperior <= 1 && rangoSuperior >=0) ) {
		var b = validarExitenteEvaluacionFila(evaluacionId);
		if (b) {
			var funcionMap = {};
			funcionMap['evaluacionId'] = evaluacionId;
			funcionMap['rangoSuperior'] = rangoSuperior;
			funcionMap['rangoInferior'] = rangoInferior;
			listaFuncionMap.push(funcionMap);

			var listaFuncions = $("#" + inputFristnamespace + "listaEvaluaciones");
			console.log("listaEvaluaciones");
			console.log(listaFuncions);
			var html = "";
			html += "<tr>" + "<td>" + evaluacionText + "</td>" + "<td>" + rangoInferior + "</td>"+ "<td>" + rangoSuperior + "</td>" ;			
			
				html += "<td>" + "<a class='btn btn-primary eliminarFuncion' data='"
				+ evaluacionId + "' href='javascript:void(0);'>Eliminar</a>"
				+ "</td>";
			
			html += "</tr>";

			console.log(html);
			$(listaFuncions).append(html);
			$(".eliminarFuncion").unbind("click");
			$(".eliminarFuncion").click(function() {
				var id = $(this).attr("data");
				console.log(id);
				var tr = $(this).parent().parent();
				removerFuncionItem(id, tr);
			});
		}
	}
}
function validarExitenteEvaluacionFila(evaluacion) {
	var result = true;
	console.log("validarExitenteEvaluacionFila1:"+listaFuncionMap);
	$.each(listaFuncionMap, function(index, object) {
		if (object['evaluacionId'] == evaluacion) {
			result = false;
		}
	});
	console.log("validarExitenteEvaluacionFila2:"+listaFuncionMap);;
	return result;
}

function removerFuncionItem(id, tr) {
	console.log("removerFuncionItem1:"+listaFuncionMap);
	$.each(listaFuncionMap, function(index, object) {
		if (object['evaluacionId'] == id) {
			listaFuncionMap.splice(index, 1);
		}
	});
	console.log("removerFuncionItem2:"+listaFuncionMap);
	$(tr).remove();
}




function publicarOfertaLaboral(){

	var listasCorrectas = true;
	var contenedorAlerta = $(".contenedorAlerta");
	var formPublicarOferta = $("#" + inputFristnamespace + "publicaroferta");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var solicitudReclutamientoId = inputFristnamespace + "solicitudReclutamientoId";
	var publicarOfertaUrl = $("#" + inputFristnamespace + "publicarOfertaUrl").val();
	var listarSolicitudesUrl = $("#" + inputFristnamespace + "regresar").val();
	var cantidadAnnosRubro = $("#" + inputFristnamespace + "cantidadAnnosRubro").val();
		
	var popupMensaje = $("#" + inputFristnamespace + "popupMensaje").val();
	var msgError = $("#" + inputFristnamespace + "msgError").val();
	var editor_descripcion = window[inputFristnamespace + "extractCodeFromEditor"]("");
//	console.log(encodeURIComponent(editor_descripcion));
	
	if(editor_descripcion.length<3000){
		console.log("menos de 3000:"+editor_descripcion.length);
	}
	
	var dataSend = $(formPublicarOferta).serialize();
	dataSend=dataSend + "&editor_descripcion="+editor_descripcion;	
	dataSend=dataSend + "&"+inputFristnamespace +"cantidadAnnosRubro="+cantidadAnnosRubro;	

	if( listaFuncionMap.length == 0 ){
		mostrarAlerta(contenedorAlerta, "Evaluaciones y rangos", "Ingrese al menos una evaluación", "alert-error", null);
		listasCorrectas = false;
		modalconfirmacion.hide();
	}

	var rangoMinimo1 = $("#" + inputFristnamespace + "rangoMinimo1").val();
	var rangoMaximo1 = $("#" + inputFristnamespace + "rangoMaximo1").val();
	var rangoMinimo2 = $("#" + inputFristnamespace + "rangoMinimo2").val();
	var rangoMaximo2 = $("#" + inputFristnamespace + "rangoMaximo2").val();
	console.log(rangoMinimo1);
	console.log(rangoMaximo1);
	console.log(rangoMinimo2);
	console.log(rangoMaximo2);
	if(  !((rangoMinimo1 != "" && rangoMinimo1 <= 1 && rangoMinimo1 >=0) && 
			(rangoMaximo1 != "" && rangoMinimo1 <= 1 && rangoMaximo1 >=0) && 
			(rangoMinimo2 != "" && rangoMinimo1 <= 1 && rangoMinimo2 >=0) && 
			(rangoMaximo2 != "" && rangoMinimo1 <= 1 && rangoMaximo2 >=0))  ){
		mostrarAlerta(contenedorAlerta, "Rangos de Entrevistas", "Ingrese los valores para las entrevistas", "alert-error", null);
		listasCorrectas = false;
		modalconfirmacion.hide();
	}
	dataSend = dataSend + "&" + inputFristnamespace + "evaluacionList=" + JSON.stringify(listaFuncionMap) + "";
	
	if(listasCorrectas){
		$.ajax({
			type : "POST",
			url : publicarOfertaUrl,
			data : dataSend,
			success : function(data) {
				modalconfirmacion.hide();
				data = $.parseJSON(data);
				var objeto = data["objeto"];
				var respuesta = data["respuesta"];
				var mensaje = data["mensaje"];
				var contenedorAlerta = $(".contenedorAlerta");
				listarSolicitudesUrl += "&solicitudRequerimientoId=" + objeto.solicitudRequerimientoId;
				console.log(popupMensaje);
				listarSolicitudesUrl += "&titulo=" + encodeURI(popupMensaje);
				console.log(mensaje);
				listarSolicitudesUrl += "&mensaje=" + encodeURI(mensaje);
				if (respuesta == 1) {
					$(btnGuardar).attr("disabled", "disabled");
					mostrarAlerta(contenedorAlerta, popupMensaje, mensaje, "alert-success", function() {
						setTimeout(function() {
							window.location = listarSolicitudesUrl;
						}, 1500);
					});
				} else {
					mostrarAlerta(contenedorAlerta, msgError, mensaje, "alert-error", null);
				}
			}
		});
	}
}

function listarRequisitos(requisitoEtiquetaBeans) {
	init();

	if (requisitoEtiquetaBeans != "") {
		var lista = $.parseJSON(requisitoEtiquetaBeans);
		$.each(lista, function(index, object) {
			var exigible = false;
			if (object['exigibleText'] == undefined) {
				exigible = object['exigible'];
			} else {
				exigible = object['exigibleText'];
			}
			addRequisitoFila(object['requisito'], object['annos'], object['annosText'], exigible, object['tipoRequisito'], object['tipoRequisitoText']);
		});
	}
}

function addRequisitoFila(requisito, annos, annosText, exigile, tipoRequisito, tipoRequisitotext) {
	var exigileValue = exigile;
	if (exigile == true) {
		exigile = "Si";
	} else {
		exigile = "No";
	}

	if (requisito != "" && tipoRequisito > 0 && annos > 0) {

		var requistoMap = {};
		requistoMap['requisito'] = requisito;
		requistoMap['annos'] = annos;
		requistoMap['exigibleText'] = exigileValue;

		requistoMap['tipoRequisito'] = tipoRequisito;

		var listaRequisitos = $("#" + inputFristnamespace + "listaRequisitos");
	
		var html = "";
		html += "<tr>" + "<td>" + requisito + "</td>" + "<td>" + annosText + "</td>" + "<td>" + exigile + "</td>" + "<td>" + tipoRequisitotext + "</tr>";

		
		$(listaRequisitos).append(html);

	}
}


function listarRequisitosDetalle(requisitoEtiquetaBeans) {
	init();
	var html = "";
	if (requisitoEtiquetaBeans != "") {
		var lista = $.parseJSON(requisitoEtiquetaBeans);
				
		$.each(lista, function(index, object) {
			var exigible = false;
			if (object['exigibleText'] == undefined) {
				exigible = object['exigible'];
			} else {
				exigible = object['exigibleText'];
			}
			html += addRequisitoFilaDetalle(object['requisito'], object['annos'], object['annosText'], exigible, object['tipoRequisito'], object['tipoRequisitoText']);
		});
	}
	return html
}

function addRequisitoFilaDetalle(requisito, annos, annosText, exigile, tipoRequisito, tipoRequisitotext) {
	var exigileValue = exigile;
	if (exigile == true) {
		exigile = "Si";
	} else {
		exigile = "No";
	}

	if (requisito != "" && tipoRequisito > 0 && annos > 0) {

		var requistoMap = {};
		requistoMap['requisito'] = requisito;
		requistoMap['annos'] = annos;
		requistoMap['exigibleText'] = exigileValue;

		requistoMap['tipoRequisito'] = tipoRequisito;

		var listaRequisitos = $("#" + inputFristnamespace + "listaRequisitos");
	
		var html = "";
		html += "<tr>" + "<td>" + requisito + "</td>" + "<td>" + annosText + "</td>" + "<td>" + exigile + "</td>" + "<td>" + tipoRequisitotext + "</tr>";

		return html;

	}

	return "";
}


AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator', 'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
	init();

	if (A.one('#' + inputFristnamespace + 'modal') != null) {
		var popupconfirmartitulo = $("#" + inputFristnamespace + "popupPublicacionTitulo").val();
		var popupconfirmarMensage = $("#" + inputFristnamespace + "popupPublicacionMensage").val();
		var msgAceptar = $("#" + inputFristnamespace + "msgAceptar").val();
		var msgCancelar = $("#" + inputFristnamespace + "msgCancelar").val();

		modalconfirmacion = new A.Modal({
			bodyContent : popupconfirmarMensage,
			centered : true,
			destroyOnHide : false,
			headerContent : "<h5>" + popupconfirmartitulo + "</h5>",
			modal : true,
			render : '#' + inputFristnamespace + 'modal',
			resizable : false,
			visible : false,
			width : 305
		}).render();

		modalconfirmacion.addToolbar([ 
		                              
		{
		
			label : msgAceptar,
			on : {
				click : function() {
					if (formvalid) {
						publicarOfertaLaboral();
					}
				}
			}
		} ,
		{
			label : msgCancelar,
			on : {
				click : function() {
					modalconfirmacion.hide();
				}
			}
		}
		
		]);
	}
	if (A.one('#' + inputFristnamespace + 'btnGuardar') != null) {
		A.one('#' + inputFristnamespace + 'btnGuardar').on('click', function() {
			if (formvalid) {
				modalconfirmacion.show();
			}
		});
	}
});

function listarFuncions(funcionEtiquetaBeans) {
	console.log(funcionEtiquetaBeans);
	if (funcionEtiquetaBeans != "") {
		var lista = $.parseJSON(funcionEtiquetaBeans);
		console.log(lista);
		$.each(lista, function(index, object) {
			var exigible = false;
			if (object['exigibleText'] == undefined) {
				exigible = object['exigible'];
			} else {
				exigible = object['exigibleText'];
			}
			addFuncionFila(object['funcion'], exigible);
		});
	}
}

function addFuncionFila(funcion, exigile) {
	console.log("addFuncionFila");
	var exigileValue = exigile;
	if (exigile == true) {
		exigile = "Si";
	} else {
		exigile = "No";
	}

	if (funcion != "") {
		var b = validarExitenteFuncion(funcion);

		if (b) {

			var funcionMap = {};
			funcionMap['funcion'] = funcion;
			funcionMap['exigibleText'] = exigileValue;
			listaFuncionMap.push(funcionMap);

			var listaFuncions = $("#" + inputFristnamespace + "listaFuncions");
			console.log("listaFuncions");
			console.log(listaFuncions);
			var html = "";
			html += "<tr>" + "<td>" + funcion + "</td>" + "<td>" + exigile + "</td>" ;			
			if(false){
				html += "<td>" + "<a class='btn btn-primary eliminarFuncion' data='"
				+ funcion + "' href='javascript:void(0);'>Eliminar</a>"
				+ "</td>";
			}
			html += "</tr>";

			console.log(html);
			$(listaFuncions).append(html);
			$(".eliminarFuncion").unbind("click");
			$(".eliminarFuncion").click(function() {
				var id = $(this).attr("data");
				var tr = $(this).parent().parent();
				removerFuncionItem2(id, tr);
			});
		}
	}
}

function validarExitenteFuncion(funcion) {
	var result = true;
	$.each(listaFuncionMap, function(index, object) {
		if (object['funcion'] == funcion) {
			result = false;
		}
	});
	return result;
}

function removerFuncionItem2(id, tr) {
	$.each(listaFuncionMap, function(index, object) {
		if (object['funcion'] == id) {
			listaFuncionMap.splice(index, 1);
		}
	});
	$(tr).remove();
}






