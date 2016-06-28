var inputFristnamespace = null;
var formvalid = false;
var modalconfirmacion = null;
var filtrafecharegistro = true;

var listarequisitosMap = [];

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

	var modificarSolicitudUrl = $("#" + inputFristnamespace + "modificarSolicitudUrl").val();
	var anularSolicitudUrl = $("#" + inputFristnamespace + "anularSolicitudUrl").val();

	var urls = {
		"modificarSolicitud" : modificarSolicitudUrl,
		"anularSolicitud" : anularSolicitudUrl
	};

	listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);

	$(btnBuscar).click(function() {
		// if(filtrafecharegistro){
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

	var listaOpcionModificar = $("#" + inputFristnamespace + "listaOpcionModificar").val();
	var listaOpcionAnular = $("#" + inputFristnamespace + "listaOpcionAnular").val();

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
				html += '<td>' + value.strfechaLimite + '</td>';
				html += '<td>' + value.strtiempoContrato + '</td>';
				html += '<td>' + value.strcliente + '</td>';
				html += '<td>' + value.strprioridad + '</td>';
				html += '<td>' + value.strestado + '</td>';
				html += '<td>';
				html += '	<div class="btn-group">';

				if (value.estado == 48||value.estado == 50) {
					html += '		<a class="btn btn-primary" href="' + urls["modificarSolicitud"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionModificar + ' </a>';
				}
				if (value.estado == 48) {
					html += '		<a class="btn btn-primary anular" data="' + value.solicitudRequerimientoId + '" href="javacript:void();">' + listaOpcionAnular + ' </a>';
				}
				html += '	</div>';
				html += '</td>';
				html += '</tr>';
			});
			html += '</tbody>';
			html += '</table>';
			$(listaSolicitudes).html(html);

			barraPaginacion(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesRelutamientoUrl, data, urls);

			anularSolicitud();

		}
	});

}

function anularSolicitud() {
	var id = null;
	var anularSolicitudUrl = $("#" + inputFristnamespace + "anularSolicitudUrl").val();
	var modalAnular = null;
	var titulo = $("#" + inputFristnamespace + "popupanularatitulo").val();
	var mensaje = $("#" + inputFristnamespace + "popupanularaMensage").val();
	var msgAceptar = $("#" + inputFristnamespace + "msgAceptar").val();
	var msgCancelar = $("#" + inputFristnamespace + "msgCancelar").val();
	var btnBuscar = $("#" + inputFristnamespace + "btnBuscar");

	var anularOpcions = $(".anular");
	$(anularOpcions).click(function() {
		id = $(this).attr("data");
		modalAnular.show();
	});

	AUI().use('aui-modal', function(A) {

		modalAnular = new A.Modal({
			bodyContent : mensaje,
			centered : true,
			destroyOnHide : false,
			headerContent : "<h5>" + titulo + "</h5>",
			modal : true,
			render : '#' + inputFristnamespace + 'modalAnular',
			resizable : false,
			visible : false,
			width : 305
		}).render();

		modalAnular.addToolbar([ {
			label : msgCancelar,
			on : {
				click : function() {
					modalAnular.hide();
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
							modalAnular.hide();
							data = $.parseJSON(data);
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

function inicializarFormularioRegistro() {
	init();

	var formActualizarSolicitud = $("#" + inputFristnamespace + "actualizarSolicitud");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var inputpuesto = inputFristnamespace + "puestoId";
	var inputcantidadRecursos = inputFristnamespace + "cantidadRecursos";
	// var inputareaSolicitante = inputFristnamespace + "areaSolicitante";
	var inputfechaLimiteVal = inputFristnamespace + "fechaLimiteVal";
	var inputresponsable = inputFristnamespace + "responsable";
	var inputtiempoContrato = inputFristnamespace + "tiempoContrato";
	var inputtipoNegocio = inputFristnamespace + "tipoNegocio";
	var inputcliente = inputFristnamespace + "cliente";
	var inputproyecto = inputFristnamespace + "proyecto";
	// var inputespecialidad = inputFristnamespace + "especialidad";

	var btnAgregar = $("#" + inputFristnamespace + "btnAgregar");

	$(btnAgregar).click(function() {
		agregarRequisitos();
	});

	var rules = {};
	rules[inputpuesto] = {
		required : function() {
			if ($('#' + inputpuesto).val() != '-1') {
				return true;
			} else {
				return false;
			}
		}
	};
	rules[inputcantidadRecursos] = {
		required : true
	};
	// rules[inputareaSolicitante] = {
	// required : true
	// };
	rules[inputfechaLimiteVal] = {
		required : true,
		rango_fecha_limite : true
	};
	rules[inputresponsable] = {
		required : function() {
			if ($('#' + inputresponsable).val() != '-1') {
				return true;
			} else {
				return false;
			}
		}
	};
	rules[inputtiempoContrato] = {
		required : function() {
			if ($('#' + inputtiempoContrato).val() != '-1') {
				return true;
			} else {
				return false;
			}
		}
	};
	rules[inputtipoNegocio] = {
		required : function() {
			if ($('#' + inputtipoNegocio).val() != '-1') {
				return true;
			} else {
				return false;
			}
		}
	};
	rules[inputcliente] = {
		required : function() {
			if ($('#' + inputcliente).val() != '-1') {
				return true;
			} else {
				return false;
			}
		}
	};
	rules[inputproyecto] = {
		required : true
	};
	// rules[inputespecialidad] = {
	// required : true
	// };

	var mesajepuesto = $("#" + inputFristnamespace + "msgpuesto").val();
	var mesajecantidadrecursos = $("#" + inputFristnamespace + "msgcantidadrecursos").val();
	// var mesajeareaSolicitante = $("#" + inputFristnamespace +
	// "msgareaSolicitante").val();
	var mesajefechalimite = $("#" + inputFristnamespace + "msgfechalimite").val();
	var mesajefechalimiteFueraRango = $("#" + inputFristnamespace + "msgfechalimiteFueraRango").val();
	var mesajeresponsablerrhh = $("#" + inputFristnamespace + "msgresponsablerrhh").val();
	var mesajetiempocontrato = $("#" + inputFristnamespace + "msgtiempocontrato").val();
	var mesajetiponegocio = $("#" + inputFristnamespace + "msgtiponegocio").val();
	var mesajecliente = $("#" + inputFristnamespace + "msgcliente").val();
	var mesajeproyecto = $("#" + inputFristnamespace + "msgproyecto").val();
	// var mesajeespecialidad = $("#" + inputFristnamespace +
	// "msgespecialidad").val();

	var messages = {};
	messages[inputpuesto] = mesajepuesto;
	messages[inputcantidadRecursos] = mesajecantidadrecursos;
	// messages[inputareaSolicitante] = mesajeareaSolicitante;
	messages[inputfechaLimiteVal] = {
		required : mesajefechalimite,
		rango_fecha_limite : mesajefechalimiteFueraRango
	};
	messages[inputresponsable] = mesajeresponsablerrhh;
	messages[inputtiempoContrato] = mesajetiempocontrato;
	messages[inputtipoNegocio] = mesajetiponegocio;
	messages[inputcliente] = mesajecliente;
	messages[inputproyecto] = mesajeproyecto;
	// messages[inputespecialidad] = mesajeespecialidad;

	$(formActualizarSolicitud).validate({
		ignore : [],
		debug : true,
		errorElement : "div",
		errorClass : "text-error",
		rules : rules,
		messages : messages,
		submitHandler : function(form) {
			return false;
		}
	});

	$(btnGuardar).click(function() {
		formvalid = $(formActualizarSolicitud).valid();
	});

}

function agregarRequisitos() {
	var requisito = $("#" + inputFristnamespace + "requisito").val();
	var nivel = $("#" + inputFristnamespace + "nivel option:selected").val();
	var nivelText = $("#" + inputFristnamespace + "nivel option:selected").text();
	var exigile = $("#" + inputFristnamespace + "exigile").prop("checked");
	var tipoRequisito = $("#" + inputFristnamespace + "tipoRequisito option:selected").val();
	var tipoRequisitotext = $("#" + inputFristnamespace + "tipoRequisito option:selected").text();
	addRequisitoFila(requisito, nivel, nivelText, exigile, tipoRequisito, tipoRequisitotext);
}

function listarRequisitos(requisitoEtiquetaBeans) {
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
		var b = validarExitenteRequisito(requisito);

		if (b) {

			var requistoMap = {};
			requistoMap['requisito'] = requisito;
			requistoMap['nivel'] = nivel;
			requistoMap['exigibleText'] = exigileValue;

			requistoMap['tipoRequisito'] = tipoRequisito;
			listarequisitosMap.push(requistoMap);

			var listaRequisitos = $("#" + inputFristnamespace + "listaRequisitos");
			var html = "";
			html += "<tr>" + "<td>" + requisito + "</td>" + "<td>" + nivelText + "</td>" + "<td>" + exigile + "</td>" + "<td>" + tipoRequisitotext + "</td>" + "<td>" + "<a class='btn btn-primary eliminar' data='" + requisito + "' href='javascript:void(0);'>Eliminar</a>"
					+ "</td>" + "</tr>";

			$(listaRequisitos).append(html);
			$(".eliminar").unbind("click");
			$(".eliminar").click(function() {
				var id = $(this).attr("data");
				var tr = $(this).parent().parent();
				removerItem(id, tr);
			});
		}
	}
}

function removerItem(id, tr) {
	$.each(listarequisitosMap, function(index, object) {
		if (object['requisito'] == id) {
			listarequisitosMap.splice(index, 1);
		}
	});
	$(tr).remove();
}

function validarExitenteRequisito(requisito) {
	var result = true;
	$.each(listarequisitosMap, function(index, object) {
		if (object['requisito'] == requisito) {
			result = false;
		}
	});
	return result;
}

function registrarSolicitud() {
	init();
	var formActualizarSolicitud = $("#" + inputFristnamespace + "actualizarSolicitud");
	var actualizarUrl = $("#" + inputFristnamespace + "actualizarUrl").val();
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var listarSolicitudesUrl = $("#" + inputFristnamespace + "listarSolicitudesUrl").val();

	var popupMensaje = $("#" + inputFristnamespace + "popupMensaje").val();
	var msgError = $("#" + inputFristnamespace + "msgError").val();

	var dataSend = $(formActualizarSolicitud).serialize();
	dataSend = dataSend + "&" + inputFristnamespace + "requisitosList=" + JSON.stringify(listarequisitosMap) + "";

	$.ajax({
		type : "POST",
		url : actualizarUrl,
		data : dataSend,
		success : function(data) {
			modalconfirmacion.hide();
			data = $.parseJSON(data);
			var objeto = data["objeto"];
			var respuesta = data["respuesta"];
			var mensaje = data["mensaje"];
			var contenedorAlerta = $(".contenedorAlerta");
			listarSolicitudesUrl += "&solicitudRequerimientoId=" + objeto.solicitudRequerimientoId;
			listarSolicitudesUrl += "&titulo=" + encodeURI(popupMensaje);
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

AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator', 'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
	init();

	if (A.one('#' + inputFristnamespace + 'requisito') != null) {
		var testData;
		var inputrequisito = inputFristnamespace + 'requisito';
		var autocompleteRequisitoUrl = A.one('#' + inputFristnamespace + 'listarEtiquetasUrl').get('value');

		new A.AutoCompleteList({
			allowBrowserAutocomplete : 'true',
			activateFirstItem : 'true',
			inputNode : '#' + inputrequisito,
			resultTextLocator : 'value',
			render : 'true',
			resultHighlighter : 'phraseMatch',
			resultFilters : [ 'phraseMatch' ],
			source : function() {
				var inputValue = A.one('#' + inputFristnamespace + 'requisito').get('value');
				var datasend = {};
				datasend[inputFristnamespace + 'requisito'] = inputValue;
				var myAjaxRequest = A.io.request(autocompleteRequisitoUrl, {
					dataType : 'json',
					method : 'POST',
					data : datasend,
					autoLoad : false,
					sync : false,
					on : {
						success : function() {
							var data = this.get('responseData');
							testData = data;
						}
					}
				});
				myAjaxRequest.start();
				return testData;
			},
		});

	}
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
					A.one('#' + inputFristnamespace + 'fechaRegistroInicioVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
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
					A.one('#' + inputFristnamespace + 'fechaRegistroFinVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
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

	if (A.one('#' + inputFristnamespace + 'fechaLimite') != null) {
		new A.DatePicker({
			trigger : '#' + inputFristnamespace + 'fechaLimite',
			mask : '%d/%m/%Y',
			popover : {
				zIndex : 1
			},
			on : {
				selectionChange : function(event) {
					var d = new Date(event.newSelection);
					var day = d.getDate();
					var monthIndex = d.getMonth();
					var year = d.getFullYear();
					A.one('#' + inputFristnamespace + 'fechaLimiteVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
				}
			}
		});
	}

	if (A.one('#' + inputFristnamespace + 'modal') != null) {
		var popupconfirmartitulo = $("#" + inputFristnamespace + "popupconfirmartitulo").val();
		var popupconfirmarMensage = $("#" + inputFristnamespace + "popupconfirmarMensage").val();
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
						registrarSolicitud();
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
