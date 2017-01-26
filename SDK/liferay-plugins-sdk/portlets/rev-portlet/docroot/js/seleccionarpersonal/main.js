var inputFristnamespace = null;
var formvalid = false;
var modalconfirmacion = null;

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

	var urls = {
		"listarPostulantesUrl" : listarPostulantesUrl
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
	var listafechaemitida = $("#" + inputFristnamespace + "listafechaemitida").val();
	var listafechalimite = $("#" + inputFristnamespace + "listafechalimite").val();
	var listatiempocontrato = $("#" + inputFristnamespace + "listatiempocontrato").val();
	var listacliente = $("#" + inputFristnamespace + "listacliente").val();
	var listaprioridad = $("#" + inputFristnamespace + "listaprioridad").val();
	var listaestado = $("#" + inputFristnamespace + "listaestado").val();
	var listaopciones = $("#" + inputFristnamespace + "listaopciones").val();

	var listaOpcionSeleccionarPostulacion = $("#" + inputFristnamespace + "listaOpcionSeleccionarPostulacion").val();

	$.ajax({
		type : "POST",
		url : listarSolicitudesRelutamientoUrl,
		data : $(buscarSolicitud).serialize() + "&" + inputFristnamespace + "pagina=" + pagina + "&" + inputFristnamespace + "filas=" + filas,
		success : function(data) {
			data = $.parseJSON(data);
			var html = '<table class="table table-hover table-bordered">';
			html += '<thead>';
			html += '<tr class="cabecera">';
			html += '<th>#</th>';
			html += '<th>' + listapuesto + '</th>';
			html += '<th>' + listacantidad + '</th>';
			html += '<th>' + listaareaSolicitante + '</th>';
			html += '<th>' + listaresponsableRRHH + '</th>';
			html += '<th>' + listafechaemitida + '</th>';
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
				
				html += '<tr';
				if(value.estado ==  49){
					html += ' class="success" ';					
				}
				if(value.estado ==  50){
					html += ' class="error" ';
				}
				html += '>';

				html += '<td>' + +count + '</td>';

				html += '<td>' + value.strpuesto + '</td>';
				html += '<td>' + value.cantidadRecursos + '</td>';
				html += '<td>' + value.strareaSolicitante + '</td>';
				html += '<td>' + value.strresponsableRRHH + '</td>';
				html += '<td>' + value.strfechacrea + '</td>';
				html += '<td>' + value.strfechaLimite + '</td>';
				html += '<td>' + value.strtiempoContrato + '</td>';
				html += '<td>' + value.strcliente + '</td>';
				html += '<td>' + value.strprioridad + '</td>';
				html += '<td>' + value.strestado + '</td>';
				html += '<td>';
				html += '	<div class="btn-group">';
				console.log("estado:"+value.estado);
				if ( value.estado == 51 || value.estado == 52 ) {
					html += '		<a class="btn btn-primary" href="' + urls["listarPostulantesUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionSeleccionarPostulacion + ' </a>';	
				}
				
				
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
	var postulanteUrl = $("#" + inputFristnamespace + "postulanteUrl").val();
	var detallePostulanteUrl = $("#" + inputFristnamespace + "detallePostulanteUrl").val();

	var listaRequisitos = $("#" + inputFristnamespace + "listaPostulantes");
	var html = "";
	var cercania = new Number((object['cercania']));
	cercania = cercania * 100;
	html += "<tr>" + 
	"<td>" + object['fullname'] + "</td>" + 
	"<td>" + object['fechaPostulacion'] + "</td>" + 
	"<td>" + object['disponibilidad'] + "</td>" + 
	"<td>" + object['interno'] + "</td>" + 
	"<td>" + object['fasePostulacion'] + "</td>" + 
	"<td>" + (cercania.toFixed(4)) + "%</td>" + 
	"<td>" + object['estado'] + "</td>" + 
	"<td>" + "";

	html += '	<div class="btn-group">';
	html += '		<a class="btn btn-primary" href="' + postulanteUrl + '&' + inputFristnamespace + 'solicitudId=' + object['solicitudId'] + '&' + inputFristnamespace + 'userId=' + object['userId'] + '"> Seleccionar </a>';
	html += '		<a class="btn btn-primary" href="' + detallePostulanteUrl + '&' + inputFristnamespace + 'solicitudId=' + object['solicitudId'] + '&' + inputFristnamespace + 'userId=' + object['userId'] + '"> Ver detalle </a>';
	html += '	</div>';
	
	html += "</td>"
	
	html +="</tr>";
	$(listaRequisitos).append(html);

}



function inicializarFormularioSeleccion() {
	init();
	var formseleccionarPostulante = $("#" + inputFristnamespace + "seleccionarPostulante");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
//	var seleccionarPostulanteUrl = $("#" + inputFristnamespace + "seleccionarPostulanteUrl").val();
	
//	var dataSend = $(formseleccionarPostulante).serialize();
	
	
	AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator', 'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
		init();

		if (A.one('#' + inputFristnamespace + 'modal') != null) {
			var popupconfirmartitulo = "Seleccionar Postulante";
			var popupconfirmarMensage = "Confirmar la selección del postulante";
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
//						if (formvalid) {
						seleccionarPersonal();
//						}
					}
				}
				
			}, {
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
				console.log("btgardar");
//				if (formvalid) {
					modalconfirmacion.show();
//				}
			});
		}
	});

	
	
}

function seleccionarPersonal() {
	init();
	var formseleccionarPostulante = $("#" + inputFristnamespace + "seleccionarPostulante");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var seleccionarPostulanteUrl = $("#" + inputFristnamespace + "seleccionarPostulanteUrl").val();
	var listarPostulantesUrl  = $("#" + inputFristnamespace + "listarPostulantesUrl").val();	

	var popupMensaje = $("#" + inputFristnamespace + "popupMensaje").val();
	var dataSend = $(formseleccionarPostulante).serialize();
	
	$.ajax({
	type : "POST",
	url : seleccionarPostulanteUrl,
	data : dataSend,
	success : function(data) {
		modalconfirmacion.hide();
		console.log(data);
		
		data = $.parseJSON(data);
		var objeto = data["objeto"];
		var respuesta = data["respuesta"];
		var mensaje = data["mensaje"];
		var contenedorAlerta = $(".contenedorAlerta");
		listarPostulantesUrl += "&solicitudRequerimientoId=" + objeto.solicitudId;
		console.log(popupMensaje);
		listarPostulantesUrl += "&titulo=" + encodeURI(popupMensaje);
		console.log(mensaje);
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


	