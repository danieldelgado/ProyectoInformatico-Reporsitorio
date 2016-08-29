
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
		console.log("btnBuscar");
		listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);
		// }
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
					html += '		<a class="btn btn-primary finalizarPublicacion" data="' + value.solicitudRequerimientoId + '" href="javascript:void();">' + listaOpcionFinalizarOferta + ' </a>';
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

		modal.addToolbar([ {
			label : msgCancelar,
			on : {
				click : function() {
					modal.hide();
				}
			}
		}, {
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
		} ]);

	});
}

function inicializarFormularioPublicarOferta(){
	init();
	
	var formPublicarOferta = $("#" + inputFristnamespace + "publicaroferta");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var solicitudReclutamientoId = inputFristnamespace + "solicitudReclutamientoId";

}

function publicarOfertaLaboral(){
	
	var formPublicarOferta = $("#" + inputFristnamespace + "publicaroferta");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var solicitudReclutamientoId = inputFristnamespace + "solicitudReclutamientoId";
	var publicarOfertaUrl = $("#" + inputFristnamespace + "publicarOfertaUrl").val();
	var listarSolicitudesUrl = $("#" + inputFristnamespace + "regresar").val();
		
	var popupMensaje = $("#" + inputFristnamespace + "popupMensaje").val();
	var msgError = $("#" + inputFristnamespace + "msgError").val();
	var editor_descripcion = window[inputFristnamespace + "extractCodeFromEditor"]("");
//	console.log(encodeURIComponent(editor_descripcion));
	var dataSend = $(formPublicarOferta).serialize();
	dataSend=dataSend + "&editor_descripcion="+editor_descripcion;	
	
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
			addRequisitoFila(object['requisito'], object['nivel'], object['nivelText'], exigible, object['tipoRequisito'], object['tipoRequisitoText']);
		});
	}
}

function addRequisitoFila(requisito, nivel, nivelText, exigile, tipoRequisito, tipoRequisitotext) {
	var exigileValue = exigile;
	if (exigile == true) {
		exigile = "Si";
	} else {
		exigile = "No";
	}

	if (requisito != "" && tipoRequisito > 0 && nivel > 0) {

		var requistoMap = {};
		requistoMap['requisito'] = requisito;
		requistoMap['nivel'] = nivel;
		requistoMap['exigibleText'] = exigileValue;

		requistoMap['tipoRequisito'] = tipoRequisito;

		var listaRequisitos = $("#" + inputFristnamespace + "listaRequisitos");
	
		var html = "";
		html += "<tr>" + "<td>" + requisito + "</td>" + "<td>" + nivelText + "</td>" + "<td>" + exigile + "</td>" + "<td>" + tipoRequisitotext + "</tr>";

		
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
			html += addRequisitoFilaDetalle(object['requisito'], object['nivel'], object['nivelText'], exigible, object['tipoRequisito'], object['tipoRequisitoText']);
		});
	}
	return html
}

function addRequisitoFilaDetalle(requisito, nivel, nivelText, exigile, tipoRequisito, tipoRequisitotext) {
	var exigileValue = exigile;
	if (exigile == true) {
		exigile = "Si";
	} else {
		exigile = "No";
	}

	if (requisito != "" && tipoRequisito > 0 && nivel > 0) {

		var requistoMap = {};
		requistoMap['requisito'] = requisito;
		requistoMap['nivel'] = nivel;
		requistoMap['exigibleText'] = exigileValue;

		requistoMap['tipoRequisito'] = tipoRequisito;

		var listaRequisitos = $("#" + inputFristnamespace + "listaRequisitos");
	
		var html = "";
		html += "<tr>" + "<td>" + requisito + "</td>" + "<td>" + nivelText + "</td>" + "<td>" + exigile + "</td>" + "<td>" + tipoRequisitotext + "</tr>";

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

		modalconfirmacion.addToolbar([ {
			label : msgCancelar,
			on : {
				click : function() {
					modalconfirmacion.hide();
				}
			}
		}, {
			label : msgAceptar,
			on : {
				click : function() {
					if (formvalid) {
						publicarOfertaLaboral();
					}
				}
			}
		} ]);
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
				removerFuncionItem(id, tr);
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

function removerFuncionItem(id, tr) {
	$.each(listaFuncionMap, function(index, object) {
		if (object['funcion'] == id) {
			listaFuncionMap.splice(index, 1);
		}
	});
	$(tr).remove();
}