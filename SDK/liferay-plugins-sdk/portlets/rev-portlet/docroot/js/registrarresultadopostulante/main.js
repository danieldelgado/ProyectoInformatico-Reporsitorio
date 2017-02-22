var inputFristnamespace = null;
var formvalid = true;
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

	var registrarProcesoUrl = $("#" + inputFristnamespace + "registrarProcesoUrl").val();
	var noAsistioUrl = $("#" + inputFristnamespace + "noAsistioUrl").val();

	var urls = {
		"registrarProcesoUrl" : registrarProcesoUrl,
		"noAsistioUrl" : noAsistioUrl
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
	var listadisponibilidad = $("#" + inputFristnamespace + "listadisponibilidad").val();
	var listatipopostulante = $("#" + inputFristnamespace + "listatipopostulante").val();
	var listapostulante = $("#" + inputFristnamespace + "listapostulante").val();
	var listafasepostulante = $("#" + inputFristnamespace + "listafasepostulante").val();
	var listafechapostulacion = $("#" + inputFristnamespace + "listafechapostulacion").val();
	var listafechapsicologica = $("#" + inputFristnamespace + "listafechapsicologica").val();
	var listafechatecnica = $("#" + inputFristnamespace + "listafechatecnica").val();
	var listafecharrhh = $("#" + inputFristnamespace + "listafecharrhh").val();
	var listafechagerentearea = $("#" + inputFristnamespace + "listafechagerentearea").val();
	var listaopciones = $("#" + inputFristnamespace + "listaopciones").val();

	var listaOpcionRegistrarProceso = $("#" + inputFristnamespace + "listaOpcionRegistrarProceso").val();
	var listaOpcionNoAsistio = $("#" + inputFristnamespace + "listaOpcionNoAsistio").val();

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
			html += '<th>' + listadisponibilidad + '</th>';
			html += '<th>' + listatipopostulante + '</th>';
			html += '<th>' + listapostulante + '</th>';
			html += '<th>' + listafasepostulante + '</th>';
			html += '<th>' + listafechapostulacion + '</th>';
			html += '<th>' + listafechapsicologica + '</th>';
			html += '<th>' + listafechatecnica + '</th>';
			html += '<th>' + listafecharrhh + '</th>';
			html += '<th>' + listafechagerentearea + '</th>';
			html += '<th>' + listaopciones + '</th>';
			html += '</tr>';
			html += '</thead>';
			html += '<tbody>';
			var count = (filas * pagina - filas);

			$.each(data.lista, function(index, value) {
				console.log("value");
				console.log(value);
				count++;
				html += '<tr ';

				if (!value.asistio) {
					html += ' class="warning" ';
				}
				html += ' >';

				html += '<td>' + +count + '</td>';

				html += '<td>' + value.strpuesto + '</td>';
				html += '<td>' + value.disponibilidad + '</td>';
				html += '<td>' + value.strTipoPostulante + '</td>';
				html += '<td>' + value.postulante + '</td>';
				html += '<td>' + value.strFasePostulacion + '</td>';
				html += '<td>' + value.strfechaPostulacion + '</td>';
				html += '<td>' + value.strfechaPsicologica + '</td>';
				html += '<td>' + value.strfechaTecnica + '</td>';
				html += '<td>' + value.strfechaRRHH + '</td>';
				html += '<td>' + value.strfechaGerenteArea + '</td>';
				html += '<td>';
				html += '	<div class="btn-group">';
				console.log("value.estadoSolicitud :" + value.estadoSolicitud);
				console.log("value.estado :" + value.estado);
				if (value.estadoSolicitud == 51 || value.estadoSolicitud == 52) {
					if (value.estado == 70 || value.estado == 71 || value.estado == 72 || value.estado == 73) {

						html += '		<a class="btn btn-primary" href="' + urls["registrarProcesoUrl"] + '&' + inputFristnamespace + 'solicitudId=' + value.solicitudId + '&'
								+ inputFristnamespace + 'userId=' + value.userId + '">' + listaOpcionRegistrarProceso + ' </a>';

						html += '		<a class="btn btn-primary" href="' + urls["noAsistioUrl"] + '&' + inputFristnamespace + 'solicitudId=' + value.solicitudId + '&'
								+ inputFristnamespace + 'userId=' + value.userId + '">' + listaOpcionNoAsistio + ' </a>';

					}
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

function inicializarFormularioRegsitroAvancePostulante() {
	 init() ;
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
//	onlyNumberClass("solonumeros");
	var registrarResultado = $("#" + inputFristnamespace + "registrarResultado");
	var resultado1Id = inputFristnamespace + "resultado1Id";
	var resultado2Id = inputFristnamespace + "resultado2Id";
	
	
	var solonumeroslist = $(".solonumeros");
	console.log(solonumeroslist);
	var rules = {};
	rules[resultado1Id] = {
			required : function() {
				console.log(" com:"+resultado1Id + " | val:"+$('#' + resultado1Id).val())
				if ($('#' + resultado1Id).val() >= 0 && $('#' + resultado1Id).val() <= 35 ) {
					return true;
				} else {
					return false;
				}
			}
		};

	rules[resultado2Id] = {
			required : function() {
				console.log(" com:"+resultado2Id + " | val:"+$('#' + resultado2Id).val())
				if ($('#' + resultado2Id).val() >= 0 && $('#' + resultado2Id).val() <= 35 ) {
					return true;
				} else {
					return false;
				}
			}
		};
	
	
	
	var messages = {};
	messages[resultado1Id] = "Debe ingresar la puntuacion obtenida";
	messages[resultado2Id] = "Debe ingresar la puntuacion obtenida";
	
	
	
	
	try {
		$(solonumeroslist).each(function( index ) {
			var com = $( this ).attr("id");
			rules[com] = {
					required : function() {
						console.log(" com:"+com + " | val:"+$('#' + com).val())
						if ($('#' + com).val() >= 0 && $('#' + com).val() <= 35 ) {
							return true;
						} else {
							return false;
						}
					}
				};

			messages[com] = "Debe ingresar la puntuacion obtenida";
			
		});
		
		

//		rules[resultado1Id] = {
//				required : function() {
//					console.log(" com:"+resultado1Id + " | val:"+$('#' + resultado1Id).val())
//					if ($('#' + resultado1Id).val() >= 0 && $('#' + resultado1Id).val() <= 35 ) {
//						return true;
//					} else {
//						return false;
//					}
//				}
//			};
//
//		messages[resultado1Id] = "Debe ingresar la puntuacion obtenida";
//		
//		rules[resultado2Id] = {
//				required : function() {
//					console.log(" com:"+resultado2Id + " | val:"+$('#' + resultado2Id).val())
//					if ($('#' + resultado2Id).val() >= 0 && $('#' + resultado2Id).val() <= 35 ) {
//						return true;
//					} else {
//						return false;
//					}
//				}
//			};
//
//		messages[resultado2Id] = "Debe ingresar la puntuacion obtenida";
		
	} catch (e) {
		console.log(e);
	}
	
	
	$(registrarResultado).validate({
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
	
	
	$(btnGuardar).click(function() {
		
		console.log("validate");
		formvalid = true;
		formvalid = $(registrarResultado).valid();
		if (formvalid) {
			modalconfirmacion.show();
		}
	});
}

AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator',
		'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
			init();

			if (A.one('#' + inputFristnamespace + 'modal') != null) {
				var popupconfirmartitulo = "Registra Avance";
				var popupconfirmarMensage = "Confirma resultados de postuante";
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
							if (formvalid) {
								registrarAvance();
							}
						}
					}
				}, {
					label : msgCancelar,
					on : {
						click : function() {
							modalconfirmacion.hide();
						}
					}
				} ]);
			}

//			if (A.one('#' + inputFristnamespace + 'btnGuardar') != null) {
//				A.one('#' + inputFristnamespace + 'btnGuardar').on('click', function() {
//					if (formvalid) {
//						modalconfirmacion.show();
//					}
//				});
//			}
		});

function registrarAvance() {

	var listasCorrectas = true;
	var contenedorAlerta = $(".contenedorAlerta");

	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var formRegistrarResultado = $("#" + inputFristnamespace + "registrarResultado");
	var solicitudId = $("#" + inputFristnamespace + "solicitudId");
	var userId = $("#" + inputFristnamespace + "userId");

	var registrarProcesoUrl = $("#" + inputFristnamespace + "registrarProcesoUrl").val();
	var listarPostulantesUrl = $("#" + inputFristnamespace + "listarPostulantesUrl").val();

	var popupMensaje = $("#" + inputFristnamespace + "popupMensaje").val();

	var msgError = $("#" + inputFristnamespace + "msgError").val();

	var dataSend = $(formRegistrarResultado).serialize();

	// if( !((rangoMinimo1 != "" && rangoMinimo1 <= 1 && rangoMinimo1 >=0) &&
	// (rangoMaximo1 != "" && rangoMinimo1 <= 1 && rangoMaximo1 >=0) &&
	// (rangoMinimo2 != "" && rangoMinimo1 <= 1 && rangoMinimo2 >=0) &&
	// (rangoMaximo2 != "" && rangoMinimo1 <= 1 && rangoMaximo2 >=0)) ){
	// mostrarAlerta(contenedorAlerta, "Rangos de Entrevistas", "Ingrese los
	// valores para las entrevistas", "alert-error", null);
	// listasCorrectas = false;
	// modalconfirmacion.hide();
	// }

	if (listasCorrectas) {
		$.ajax({
			type : "POST",
			url : registrarProcesoUrl,
			data : dataSend,
			success : function(data) {
				console.log(data);
				modalconfirmacion.hide();
				data = $.parseJSON(data);
				var objeto = data["objeto"];
				var respuesta = data["respuesta"];
				var mensaje = data["mensaje"];
				var contenedorAlerta = $(".contenedorAlerta");
				// listarPostulantesUrl += "&solicitudRequerimientoId=" +
				// objeto.solicitudRequerimientoId;
				console.log(popupMensaje);
				// listarPostulantesUrl += "&titulo=" + encodeURI(popupMensaje);
				console.log(mensaje);
				// listarPostulantesUrl += "&mensaje=" + encodeURI(mensaje);
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
}

function inicializarFormularioRegsitroNoAsistencia() {
	init();

	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var formnoAsistio = $("#" + inputFristnamespace + "noAsistio");

	var fasePostulacion = inputFristnamespace + "fasePostulacion";
	var observacion = inputFristnamespace + "observacion";

	limiteText2(observacion,300);
	
	var rules = {};
	rules[fasePostulacion] = {
			required : function() {
				if ($('#' + fasePostulacion+ " option:selected").val() != '-1') {
					return true;
				} else {
					return false;
				}
			}
		};
	
	rules[observacion] = {
			required : true
		};
	
	var messages = {};
	messages[fasePostulacion] = "Seleccione una fase de postulación";
	messages[observacion] = "Ingrese la observación";
	
	$(formnoAsistio).validate({
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
		console.log(btnGuardar);
		formvalid = $(formnoAsistio).valid();
//		formvalid = true;
		if (formvalid) {
			console.log("show");
			modalconfirmacion.show();
		}

	});

	AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator',
			'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
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
						label : msgAceptar,
						on : {
							click : function() {
								if (formvalid) {
									registrarNoAsistncia();
								}
							}
						}
					}, {
						label : msgCancelar,
						on : {
							click : function() {
								modalconfirmacion.hide();
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
}
// noAsistioUrl

function registrarNoAsistncia() {
	init();
	var contenedorAlerta = $(".contenedorAlerta");

	var formPublicarOferta = $("#" + inputFristnamespace + "noAsistio");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var noAsistioUrl = $("#" + inputFristnamespace + "noAsistioUrl").val();
	var regresarUrl = $("#" + inputFristnamespace + "regresarUrl").val();

	var dataSend = $(formPublicarOferta).serialize();
	console.log("dataSend:" + dataSend);

	var popupMensaje = "Extensión de Fecha Limite";
	var msgError = "Error en actualizar la extensión de fecha limite";

	$.ajax({
		type : "POST",
		url : noAsistioUrl,
		data : dataSend,
		success : function(data) {
			console.log(data);
			modalconfirmacion.hide();
			data = $.parseJSON(data);
			var objeto = data["objeto"];
			var respuesta = data["respuesta"];
			var mensaje = data["mensaje"];
			regresarUrl += "&titulo=" + encodeURI(popupMensaje);
			regresarUrl += "&mensaje=" + encodeURI(mensaje);
			if (respuesta == 1) {
				$(btnGuardar).attr("disabled", "disabled");
				mostrarAlerta(contenedorAlerta, popupMensaje, mensaje, "alert-success", function() {
					setTimeout(function() {
						window.location = regresarUrl;
					}, 1500);
				});
			} else {
				mostrarAlerta(contenedorAlerta, msgError, mensaje, "alert-error", null);
			}
		}
	});
}
