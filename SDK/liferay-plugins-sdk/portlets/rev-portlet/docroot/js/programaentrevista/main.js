
var formvalid = false;
var modalconfirmacion = null;
var inputFristnamespace = null;

var activoInternoEvals = false;
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

	var listarPostulantesUrl = $("#" + inputFristnamespace + "listarPostulantesUrl").val();
	var verDetalleSolicitudUrl = $("#" + inputFristnamespace + "verDetalleSolicitudUrl").val();

	var urls = {
		"listarPostulantesUrl" : listarPostulantesUrl,
		"verDetalleSolicitudUrl" : verDetalleSolicitudUrl
	};

	listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);

	$(btnBuscar).click(function() {
		// if(filtrafecharegistro){
		console.log("btnBuscar");
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
//	var listafechaemitida = $("#" + inputFristnamespace + "listafechaemitida").val();	
	var listafechalimite = $("#" + inputFristnamespace + "listafechalimite").val();
	var listatiempocontrato = $("#" + inputFristnamespace + "listatiempocontrato").val();
	var listacliente = $("#" + inputFristnamespace + "listacliente").val();
	var listaprioridad = $("#" + inputFristnamespace + "listaprioridad").val();
	var listaestado = $("#" + inputFristnamespace + "listaestado").val();
	var listaopciones = $("#" + inputFristnamespace + "listaopciones").val();

	var listarPostulantes = $("#" + inputFristnamespace + "listarPostulantes").val();
	var listaOpcionVerDetalle = $("#" + inputFristnamespace + "listaOpcionVerDetalle").val();

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
//			html += '<th>' + listafechaemitida + '</th>';
			html += '<th>' + listafechalimite + '</th>';
			html += '<th>' + listatiempocontrato + '</th>';
			html += '<th>' + listacliente + '</th>';
			html += '<th>' + 'Cantidad Postulantes' + '</th>';
			html += '<th>' + listaestado + '</th>';
			html += '<th>' + listaopciones + '</th>';
			html += '</tr>';
			html += '</thead>';
			html += '<tbody>';
			var count = (filas * pagina - filas);
			console.log("$(data.lista).size():" + $(data.lista).size());
			if ($(data.lista).size() == 0) {
				console.log("entraa size == 0");
				var contenedorAlerta = $(".contenedorAlerta");
				mostrarAlerta(contenedorAlerta, "Datos no encontrados", "No se encontraron datos", "alert-error", null);
			}
			$.each(data.lista, function(index, value) {
				console.log("-----------------------------------");
				count++;
				html += '<tr>';

				html += '<td>' + +count + '</td>';

				html += '<td>' + value.strpuesto + '</td>';
				html += '<td>' + value.cantidadRecursos + '</td>';
				html += '<td>' + value.strareaSolicitante + '</td>';
				html += '<td>' + value.strresponsableRRHH + '</td>';
//				html += '<td>' + value.strfechacrea + '</td>';
				html += '<td>' + value.strfechaLimite + '</td>';
				html += '<td>' + value.strtiempoContrato + '</td>';
				html += '<td>' + value.strcliente + '</td>';
				html += '<td>' + value.cantidadPostulantes + '</td>';
				html += '<td>' + value.strestado + '</td>';
				html += '<td>';
				html += '	<div class="btn-group">';
				var fechaHoy = Date.now();
				var dateParts =  value.strfechaLimite.split('/');
				console.log(value.estado);
				console.log(dateParts);
				var fechaLimite = new Date(dateParts[2], dateParts[1] - 1, dateParts[0]);
				console.log(fechaLimite);

				console.log("fechaHoy:"+fechaHoy);
				console.log("fechaLimite:"+fechaLimite);
				console.log((fechaHoy < fechaLimite));
				if (fechaHoy < fechaLimite) {	
					
					if (value.estado == 51 || value.estado == 52 || value.estado == 68 ) {
						html += '		<a class="btn btn-primary" href="' + urls["listarPostulantesUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listarPostulantes + ' </a>';
					}
				
					
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



function inicializarListaPotulantes(listaPostulantes) {
	init();
	if (listaPostulantes != "") {
		var lista = $.parseJSON(listaPostulantes);	
		$.each(lista, function(index, object) {		
			addPostulanteFila(	object );
		});		
	}	
}


function addPostulanteFila(object) {
	console.log("--------- addPostulanteFila ---------");
	var programarEntrevistaUrl = $("#" + inputFristnamespace + "programarEntrevistaUrl").val();
	var detallePostulanteUrl = $("#" + inputFristnamespace + "detallePostulanteUrl").val();

	var listaRequisitos = $("#" + inputFristnamespace + "listaPostulantes");

	console.log(object);
	console.log("asistio:"+object['asistio']);
	console.log("fasePostulacion:"+object['fasePostulacion']);
	console.log("faseInansistencia:"+object['faseInansistencia']);
	console.log("seleccionado:"+object['seleccionado']);
		
	var html = "";
	html += "<tr>" + 
	"<td>" + object['fullname'] + "</td>" + 
	"<td>" + object['fechaPostulacion'] + "</td>" + 
	"<td>" + object['disponibilidad'] + "</td>" + 
	"<td>" + object['interno'] + "</td>" + 
	"<td>" + object['fasePostulacion'] + "</td>" + 
	"<td>" + object['estado'] + "</td>" + 
	"<td>" + "";
	
	html += '	<div class="btn-group">';		
	console.log("asistio:"+object['asistio']);
//	if(!object['asistio']){

	if( object['seleccionado'] == false ){
		html += '		<a class="btn btn-primary" href="' + programarEntrevistaUrl + '&' + inputFristnamespace + 'solicitudId=' + object['solicitudId'] + '&' + inputFristnamespace + 'userId=' + object['userId'] + '">Programar Entrevista </a>';
	}
//	}
	
	html += '		<a class="btn btn-primary" href="' + detallePostulanteUrl + '&' + inputFristnamespace + 'solicitudId=' + object['solicitudId'] + '&' + inputFristnamespace + 'userId=' + object['userId'] + '"> Ver detalle </a>';
	
	html += '	</div>';
	
	html += "</td>"
	
	html +="</tr>";
	$(listaRequisitos).append(html);

}

function inicializarFormularioProgramacionEntrevista() {
	init();
	var today = new Date();
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator', 'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
		init();

		if (A.one('#' + inputFristnamespace + 'fechaEvaluacionPsicologica') != null) {
			new A.DatePicker({
				trigger : '#' + inputFristnamespace + 'fechaEvaluacionPsicologica',
				mask : '%d/%m/%Y',
				popover : {
					zIndex : 1,
		            boundingBox: '#bb',
		            contentBox: '#cb'
				},
				calendar: {
					maximumDate : new Date(today.getFullYear(),today.getMonth()+1,today.getDate()),
					minimumDate : new Date(today.getFullYear(),today.getMonth(),today.getDate())
				},
				on : {
					selectionChange : function(event) {		
						var d = new Date(event.newSelection);
						var day = d.getDate();
						var monthIndex = d.getMonth();
						var year = d.getFullYear();		
						A.one('#' + inputFristnamespace + 'fechaEvaluacionPsicologicaVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
//						var d = new Date(event.newSelection);
//						var day = d.getDate();
//						var monthIndex = d.getMonth();
//						var year = d.getFullYear();
//						A.one('#' + inputFristnamespace + 'fechaEvaluacionPsicologicaVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
//					
//						if (validarFecharSimple(inputFristnamespace + 'fechaEvaluacionPsicologicaVal', inputFristnamespace + 'fechaEvaluacionPsicologicaVal')) {
//							var contenedorAlerta = $(".contenedorAlerta");
//							$(contenedorAlerta).html("");
//						} else {
//							var contenedorAlerta = $(".contenedorAlerta");
//							mostrarAlerta(contenedorAlerta, "Busqueda", "Fechas incorrectas", "alert-error", null);
//						}
					}
				}
			});
		}

		if (A.one('#' + inputFristnamespace + 'fechaEvaluacionTecnica') != null) {
			new A.DatePicker({
				trigger : '#' + inputFristnamespace + 'fechaEvaluacionTecnica',
				mask : '%d/%m/%Y',
				popover : {
					zIndex : 1
				},
				calendar: {
					maximumDate : new Date(today.getFullYear(),today.getMonth()+1,today.getDate()),
					minimumDate : new Date(today.getFullYear(),today.getMonth(),today.getDate())
				},
				on : {
					selectionChange : function(event) {		
						var d = new Date(event.newSelection);
						var day = d.getDate();
						var monthIndex = d.getMonth();
						var year = d.getFullYear();
						A.one('#' + inputFristnamespace + 'fechaEvaluacionTecnicaVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
//						var d = new Date(event.newSelection);
//						var day = d.getDate();
//						var monthIndex = d.getMonth();
//						var year = d.getFullYear();
//						A.one('#' + inputFristnamespace + 'fechaEvaluacionPsicologicaVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
//					
//						if (validarFecharSimple(inputFristnamespace + 'fechaEvaluacionPsicologicaVal', inputFristnamespace + 'fechaEvaluacionPsicologicaVal')) {
//							var contenedorAlerta = $(".contenedorAlerta");
//							$(contenedorAlerta).html("");
//						} else {
//							var contenedorAlerta = $(".contenedorAlerta");
//							mostrarAlerta(contenedorAlerta, "Busqueda", "Fechas incorrectas", "alert-error", null);
//						}
					}
				}
			});
		}

		if (A.one('#' + inputFristnamespace + 'fechaEvaluacionEntreCoordRRHH') != null) {
			new A.DatePicker({
				trigger : '#' + inputFristnamespace + 'fechaEvaluacionEntreCoordRRHH',
				mask : '%d/%m/%Y',
				popover : {
					zIndex : 1
				},
				calendar: {
					maximumDate : new Date(today.getFullYear(),today.getMonth()+1,today.getDate()),
					minimumDate : new Date(today.getFullYear(),today.getMonth(),today.getDate()+1)
				},
				on : {
					selectionChange : function(event) {		
						var d = new Date(event.newSelection);
						var day = d.getDate();
						var monthIndex = d.getMonth();
						var year = d.getFullYear();		
						A.one('#' + inputFristnamespace + 'fechaEvaluacionEntreCoordRRHHVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
					
//						var d = new Date(event.newSelection);
//						var day = d.getDate();
//						var monthIndex = d.getMonth();
//						var year = d.getFullYear();
//						A.one('#' + inputFristnamespace + 'fechaEvaluacionPsicologicaVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
//					
//						if (validarFecharSimple(inputFristnamespace + 'fechaEvaluacionPsicologicaVal', inputFristnamespace + 'fechaEvaluacionPsicologicaVal')) {
//							var contenedorAlerta = $(".contenedorAlerta");
//							$(contenedorAlerta).html("");
//						} else {
//							var contenedorAlerta = $(".contenedorAlerta");
//							mostrarAlerta(contenedorAlerta, "Busqueda", "Fechas incorrectas", "alert-error", null);
//						}
					}
				}
			});
		}

		if (A.one('#' + inputFristnamespace + 'fechaEvaluacionEntreGerenteArea') != null) {
			new A.DatePicker({
				trigger : '#' + inputFristnamespace + 'fechaEvaluacionEntreGerenteArea',
				mask : '%d/%m/%Y',
				popover : {
					zIndex : 1
				},
				calendar: {
					maximumDate : new Date(today.getFullYear(),today.getMonth()+1,today.getDate()),
					minimumDate : new Date(today.getFullYear(),today.getMonth(),today.getDate()+1)
				},
				on : {
					selectionChange : function(event) {		
						var d = new Date(event.newSelection);
						var day = d.getDate();
						var monthIndex = d.getMonth();
						var year = d.getFullYear();		
						A.one('#' + inputFristnamespace + 'fechaEvaluacionEntreGerenteAreaVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
										
//						var d = new Date(event.newSelection);
//						var day = d.getDate();
//						var monthIndex = d.getMonth();
//						var year = d.getFullYear();
//						A.one('#' + inputFristnamespace + 'fechaEvaluacionPsicologicaVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
//					
//						if (validarFecharSimple(inputFristnamespace + 'fechaEvaluacionPsicologicaVal', inputFristnamespace + 'fechaEvaluacionPsicologicaVal')) {
//							var contenedorAlerta = $(".contenedorAlerta");
//							$(contenedorAlerta).html("");
//						} else {
//							var contenedorAlerta = $(".contenedorAlerta");
//							mostrarAlerta(contenedorAlerta, "Busqueda", "Fechas incorrectas", "alert-error", null);
//						}
					}
				}
			});
		}
		
		
		if (A.one('#' + inputFristnamespace + 'modal') != null) {
			var popupconfirmartitulo = "Confirmar Programación";
			var popupconfirmarMensage = "Confirma la programación del postulante";
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

			modalconfirmacion.addToolbar([ {				
				label : msgAceptar,
				on : {
					click : function() {
						console.log("msgAceptar");
						if (formvalid) {
							registrarProgramacion();
						}
				}
			}
			}, {
				label : msgCancelar,
				on : {
					click : function() {
						console.log("msgCancelar");
						modalconfirmacion.hide();
					}
				}
			} ]);
		}
				
	});
	


	var programarEntrevista = $("#" + inputFristnamespace + "programarEntrevista");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	
	console.log("init bcol=" + $("#bcol").val());
	
	if($("#bcol").val()=='false'){
		cargarValidacionesFormulario2();
	}else{
		cargarValidacionesFormulario();		
	}
	
	
	
	$(btnGuardar).click(function() {
		console.log(btnGuardar);
		var listasCorrectas = true;
		formvalid = true;
		console.log("bcol=" + $("#bcol").val());	
		console.log("validate");
		formvalid = $(programarEntrevista).valid();
		console.log("formvalid:"+formvalid);
		if(formvalid){
			console.log("show");
			modalconfirmacion.show();
		}
	});

	var btnIngEval = $("#" + inputFristnamespace + "btnIngEval");
	$(btnIngEval).click(function() {
		var pnlEvalPsicologicos = $("#" + inputFristnamespace + "pnlEvalPsicologicos");
		var pnlEvalTecnicas = $("#" + inputFristnamespace + "pnlEvalTecnicas");
		console.log("Activar evaluciones psicologicas y tecnicas");		
		if(!activoInternoEvals){  
//			$("#bcol").val()=='false'
			activoInternoEvals = true;
			$(pnlEvalPsicologicos).show();
			$(pnlEvalTecnicas).show();	
			$("#bcol").val(false);	
			cargarValidacionesFormulario2();			
		}else{
			activoInternoEvals = false;
			$(pnlEvalPsicologicos).hide();
			$(pnlEvalTecnicas).hide();			
			$("#bcol").val(true);	
			cargarValidacionesFormulario();		
		}	
	});
	
}

function cargarValidacionesFormulario(){
	var programarEntrevista = $("#" + inputFristnamespace + "programarEntrevista");
	$(programarEntrevista).removeData('validator');
	$(programarEntrevista).removeData('rule-required');
	console.log("cargarValidacionesFormulario");
	console.log("bcol=" + $("#bcol").val());	
	var rules = {};	
	console.log(" Cargando validacion para fechaEvaluacionEntreCoordRRHHVal y fechaEvaluacionEntreGerenteAreaVal");	
	rules[inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal"] =  {required : function() {
		var b = false;
		console.log(" comp:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").attr("id") + " | val:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val());
	    console.log(" noseLabora:"+noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val()) );
	    if($("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val() == "" || noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val())  ){
	    	$("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val("");
	    	b = true;
	    }
	    console.log(" b:  "+b );	
		return b;		
		
	}};
	rules[inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal"] =  {required : function() {
		var b = false;
		console.log(" comp:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").attr("id") + " | val:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val());
	    console.log(" noseLabora:"+noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val()) );
	    if($("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val() == "" || noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val())  ){
	    	$("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val("");
	    	b = true;
	    }
	    console.log(" b:  "+b );	
		return b;	
		
	}};
	var messages = {};	
	console.log(" Cargando mensajes para fechaEvaluacionEntreCoordRRHHVal y fechaEvaluacionEntreGerenteAreaVal");		
	messages[inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal"] = "Ingrese fecha para la evaluación con el coordinador RRHH";
	messages[inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal"] = "Ingrese fecha para la evaluación con el gerente de área";

	console.log("Configuracion terminada");
	$(programarEntrevista).validate({
		ignore : [],
		debug : true,
		rules : rules,
		messages : messages,
		errorElement : "div",
		errorClass : "text-error",
		submitHandler : function(form) {
			return false;
		}
	});	
}

function cargarValidacionesFormulario2(){
	var programarEntrevista = $("#" + inputFristnamespace + "programarEntrevista");
	$(programarEntrevista).removeData('validator');
	$(programarEntrevista).removeData('rule-required');
	console.log("cargarValidacionesFormulario2");
	console.log("bcol=" + $("#bcol").val());	
	var rules = {};
	console.log("val:"+$("#bcol").val()==false);
	console.log(" Cargando validacion para fechaEvaluacionPsicologicaVal y fechaEvaluacionTecnicaVal");	
	rules[inputFristnamespace+"fechaEvaluacionPsicologicaVal"] = {required : function() {
		    var b = false;
			console.log(" comp:"+$("#"+inputFristnamespace+"fechaEvaluacionPsicologicaVal").attr("id") + " | val:"+$("#"+inputFristnamespace+"fechaEvaluacionPsicologicaVal").val());
		    console.log(" noseLabora:"+noseLabora($("#"+inputFristnamespace+"fechaEvaluacionPsicologicaVal").val()) );
		    if($("#"+inputFristnamespace+"fechaEvaluacionPsicologicaVal").val() == "" || noseLabora($("#"+inputFristnamespace+"fechaEvaluacionPsicologicaVal").val())  ){
		    	$("#"+inputFristnamespace+"fechaEvaluacionPsicologicaVal").val("");
		    	b = true;
		    }
		    console.log(" b:  "+b );	
			return b;		
	}};
	rules[inputFristnamespace+"fechaEvaluacionTecnicaVal"] = {required : function() {
		var b = false;
		console.log(" comp:"+$("#"+inputFristnamespace+"fechaEvaluacionTecnicaVal").attr("id") + " | val:"+$("#"+inputFristnamespace+"fechaEvaluacionTecnicaVal").val());
	    console.log(" noseLabora:"+noseLabora($("#"+inputFristnamespace+"fechaEvaluacionTecnicaVal").val()) );
	    if($("#"+inputFristnamespace+"fechaEvaluacionTecnicaVal").val() == "" || noseLabora($("#"+inputFristnamespace+"fechaEvaluacionTecnicaVal").val())  ){
	    	$("#"+inputFristnamespace+"fechaEvaluacionTecnicaVal").val("");
	    	b = true;
	    }
	    console.log(" b:  "+b );	
		return b;			
	}};	
	console.log(" Cargando validacion para fechaEvaluacionEntreCoordRRHHVal y fechaEvaluacionEntreGerenteAreaVal");			
	rules[inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal"] =  {required : function() {
		var b = false;
		console.log(" comp:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").attr("id") + " | val:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val());
	    console.log(" noseLabora:"+noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val()) );
	    if($("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val() == "" || noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val())  ){
	    	$("#"+inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal").val("");
	    	b = true;
	    }
	    console.log(" b:  "+b );	
		return b;		
		
	}};
	rules[inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal"] =  {required : function() {
		var b = false;
		console.log(" comp:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").attr("id") + " | val:"+$("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val());
	    console.log(" noseLabora:"+noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val()) );
	    if($("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val() == "" || noseLabora($("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val())  ){
	    	$("#"+inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal").val("");
	    	b = true;
	    }
	    console.log(" b:  "+b );	
		return b;	
		
	}};
	
	var messages = {};
	console.log(" Cargando mensajes para fechaEvaluacionPsicologicaVal y fechaEvaluacionTecnicaVal");	
	messages[inputFristnamespace+"fechaEvaluacionPsicologicaVal"] = "Ingrese fecha para la evaluación psicológica";
	messages[inputFristnamespace+"fechaEvaluacionTecnicaVal"] = "Ingrese fecha para la evaluación técnica";		
	messages[inputFristnamespace+"fechaEvaluacionEntreCoordRRHHVal"] = "Ingrese fecha para la evaluación con el coordinador RRHH";
	messages[inputFristnamespace+"fechaEvaluacionEntreGerenteAreaVal"] = "Ingrese fecha para la evaluación con el gerente de área";

	console.log("Configuracion terminada");
	$(programarEntrevista).validate({
		ignore : [],
		debug : true,
		rules : rules,
		messages : messages,
		errorElement : "div",
		errorClass : "text-error",
		submitHandler : function(form) {
			return false;
		}
	});	
}

function getDay(dateString) {
	var parts =dateString.split('/');
	var mydate = new Date(parts[2],parts[1]-1,parts[0]); 
//	console.log(mydate.toDateString());
//	console.log(["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"][mydate.getDay()]);
//	console.log(mydate.getDay());
	return mydate.getDay();
}


function noseLabora(dateString) {
	if(getDay(dateString) == 0 || getDay(dateString) == 6){
//		console.log("no se labora");
		return true;
	}
//	console.log("si se labora");
	return false;
}

/*
if($('#' + inputFristnamespace + 'fechaEvaluacionEntreCoordRRHH').val()== ''){
	var contenedorAlerta = $(".contenedorAlerta");
	mostrarAlerta(contenedorAlerta, "Evaluación Coordinador RRHH ", "Ingrese fecha para la evaluación con el coordinador RRHH", "alert-error", null);
	listasCorrectas = false;
} else {
	$(".contenedorAlerta").empty();
}	
if($('#' + inputFristnamespace + 'fechaEvaluacionEntreGerenteArea').val()== ''){
	var contenedorAlerta2 = $(".contenedorAlerta2");
	mostrarAlerta(contenedorAlerta2, "Evaluación Gerente de area ", "Ingrese fecha para la evaluación con el gerente de area", "alert-error", null);
	listasCorrectas = false;
} else {
	$(".contenedorAlerta2").empty();
}	
	
if($("#bcol").val()=='false'){
	console.log("fechaEvaluacionPsicologicaVal "+ $('#' + inputFristnamespace + 'fechaEvaluacionPsicologicaVal').val());
	if($('#' + inputFristnamespace + 'fechaEvaluacionPsicologica').val()== ''){
		var contenedorAlerta3 = $(".contenedorAlerta3");
		mostrarAlerta(contenedorAlerta3, "Evaluación psicológica", "Ingrese fecha para la evaluación psicológica", "alert-error", null);
		listasCorrectas = false;
	} else {
		$(".contenedorAlerta3").empty();
	}
	if($('#' + inputFristnamespace + 'fechaEvaluacionTecnica').val()== ''){
		var contenedorAlerta4 = $(".contenedorAlerta4");
		mostrarAlerta(contenedorAlerta4, "Evaluación técnica ", "Ingrese fecha para la evaluación técnica", "alert-error", null);
		listasCorrectas = false;
	} else {
		$(".contenedorAlerta4").empty();
	}
}

//		formvalid = $(formActualizarSolicitud).valid();
*/


function registrarProgramacion(){
	init();
	var contenedorAlerta = $(".contenedorAlerta");
	var formprogramarEntrevista = $("#" + inputFristnamespace + "programarEntrevista");
	var guardarProgramacionEntrevistaUrl = $("#" + inputFristnamespace + "guardarProgramacionEntrevistaUrl").val();
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var listarPostulantesUrl = $("#" + inputFristnamespace + "listarPostulantesUrl").val();
	
	console.log(formprogramarEntrevista);
	
	var dataSend = $(formprogramarEntrevista).serialize();
	
	console.log(dataSend);

	var popupMensaje = $("#" + inputFristnamespace + "popupMensaje").val();
	var msgError = $("#" + inputFristnamespace + "msgError").val();
	
	if(activoInternoEvals){
		dataSend = dataSend+"&"+inputFristnamespace + "addEvaluaciones="+true;
	}
	
	$.ajax({
		type : "POST",
		url : guardarProgramacionEntrevistaUrl,
		data : dataSend,
		success : function(data) {
			console.log(data);
			modalconfirmacion.hide();
			data = $.parseJSON(data);
			var objeto = data["objeto"];
			var respuesta = data["respuesta"];
			var mensaje = data["mensaje"];
			listarPostulantesUrl += "&titulo=" + encodeURI(popupMensaje);
			listarPostulantesUrl += "&mensaje=" + encodeURI(mensaje);
			if (respuesta == 1) {
				$(btnGuardar).attr("disabled", "disabled");
				mostrarAlerta(contenedorAlerta, popupMensaje, mensaje, "alert-success", function() {
					setTimeout(function() {
						window.location = listarPostulantesUrl;
					}, 1500);
				});
			} else {
				mostrarAlerta(contenedorAlerta, msgError, mensaje, "alert-error", null);
			}
		}
	});
	
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

		if (true) {

			var funcionMap = {};
			funcionMap['funcion'] = funcion;
			funcionMap['exigibleText'] = exigileValue;
			
			var listaFuncions = $("#" + inputFristnamespace + "listaFuncions");
			
			var html = "";
			html += "<tr>" + "<td>" + funcion + "</td>" + "<td>" + exigile + "</td>" ;			
			if(false){
				html += "<td>" + "<a class='btn btn-primary eliminarFuncion' data='"
				+ funcion + "' href='javascript:void(0);'>Eliminar</a>"
				+ "</td>";
			}
			html += "</tr>";
			$(listaFuncions).append(html);
		
		}
	}
}
