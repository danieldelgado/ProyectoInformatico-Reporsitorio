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

	var modificarSolicitudUrl = $("#" + inputFristnamespace + "modificarSolicitudUrl").val();
	var anularSolicitudUrl = $("#" + inputFristnamespace + "anularSolicitudUrl").val();

	var urls = {
		"modificarSolicitud" : modificarSolicitudUrl,
		"anularSolicitud" : anularSolicitudUrl
	};

	listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);

	$(btnBuscar).click(function() {
		listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);
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
				html += '		<a class="btn btn-primary" href="' + urls["modificarSolicitud"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionModificar + ' </a>';
				html += '		<a class="btn btn-primary" href="#">' + listaOpcionAnular + ' </a>';
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

function inicializarFormularioRegistro() {
	init();
	var formActualizarSolicitud = $("#" + inputFristnamespace + "actualizarSolicitud");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var inputpuesto = inputFristnamespace + "puestoId";
	var inputcantidadRecursos = inputFristnamespace + "cantidadRecursos";
	var inputareaSolicitante = inputFristnamespace + "areaSolicitante";
	var inputfechaLimiteVal = inputFristnamespace + "fechaLimiteVal";
	var inputpresupuestoMinimo = inputFristnamespace + "presupuestoMinimo";
	var inputresponsable = inputFristnamespace + "responsable";
	var inputtiempoContrato = inputFristnamespace + "tiempoContrato";
	var inputtipoNegocio = inputFristnamespace + "tipoNegocio";
	var inputcliente = inputFristnamespace + "cliente";
	var inputpresupuestoMaximo = inputFristnamespace + "presupuestoMaximo";

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
	rules[inputareaSolicitante] = {
		required : true
	};
	rules[inputfechaLimiteVal] = {
		required : true,
		rango_fecha_limite : true
	};
	rules[inputpresupuestoMinimo] = {
		required : true,
		range : [ 850, 20000 ],
		rango_no_menor : {
			input : inputpresupuestoMaximo
		}
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
	rules[inputpresupuestoMaximo] = {
		required : true,
		range : [ 850, 20000 ]
	};

	var mesajepuesto = $("#" + inputFristnamespace + "msgpuesto").val();
	var mesajecantidadrecursos = $("#" + inputFristnamespace + "msgcantidadrecursos").val();
	var mesajeareaSolicitante = $("#" + inputFristnamespace + "msgareaSolicitante").val();
	var mesajefechalimite = $("#" + inputFristnamespace + "msgfechalimite").val();
	var mesajefechalimiteFueraRango = $("#" + inputFristnamespace + "msgfechalimiteFueraRango").val();
	var mesajepresupuestominimo = $("#" + inputFristnamespace + "msgpresupuestominimo").val();
	var mesajeresponsablerrhh = $("#" + inputFristnamespace + "msgresponsablerrhh").val();
	var mesajetiempocontrato = $("#" + inputFristnamespace + "msgtiempocontrato").val();
	var mesajetiponegocio = $("#" + inputFristnamespace + "msgtiponegocio").val();
	var mesajecliente = $("#" + inputFristnamespace + "msgcliente").val();
	var mesajepresupuestomaximo = $("#" + inputFristnamespace + "msgpresupuestomaximo").val();

	var messages = {};
	messages[inputpuesto] = mesajepuesto;
	messages[inputcantidadRecursos] = mesajecantidadrecursos;
	messages[inputareaSolicitante] = mesajeareaSolicitante;
	messages[inputfechaLimiteVal] = {
		required : mesajefechalimite,
		rango_fecha_limite : mesajefechalimiteFueraRango
	};
	messages[inputpresupuestoMinimo] = mesajepresupuestominimo;
	messages[inputresponsable] = mesajeresponsablerrhh;
	messages[inputtiempoContrato] = mesajetiempocontrato;
	messages[inputtipoNegocio] = mesajetiponegocio;
	messages[inputcliente] = mesajecliente;
	messages[inputpresupuestoMaximo] = mesajepresupuestomaximo;

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

function registrarSolicitud() {
	init();
	var formActualizarSolicitud = $("#" + inputFristnamespace + "actualizarSolicitud");
	var actualizarUrl = $("#" + inputFristnamespace + "actualizarUrl").val();
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var listarSolicitudesUrl = $("#" + inputFristnamespace + "listarSolicitudesUrl").val();

	var popupMensaje = $("#" + inputFristnamespace + "popupMensaje").val();
	var msgError = $("#" + inputFristnamespace + "msgError").val();

	$.ajax({
		type : "POST",
		url : actualizarUrl,
		data : $(formActualizarSolicitud).serialize(),
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

	if (A.one('#' + inputFristnamespace + 'fechaRegistroInicio') != null) {
		new A.DatePicker({
			trigger : '#' + inputFristnamespace + 'fechaRegistroInicio',
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
					A.one('#' + inputFristnamespace + 'fechaRegistroInicioVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);
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

					var d = new Date(event.newSelection);
					var day = d.getDate();
					var monthIndex = d.getMonth();
					var year = d.getFullYear();
					A.one('#' + inputFristnamespace + 'fechaRegistroFinVal').set('value', day + "/" + (monthIndex + 1) + "/" + year);

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
