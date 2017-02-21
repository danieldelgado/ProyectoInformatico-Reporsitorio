var modalAaprobar, modalRechazar, urlevaluar = null;
var inputFristnamespace = null;

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

	var aprobarSolicitudUrl = $("#" + inputFristnamespace + "aprobarSolicitudUrl").val();
	var rechazarSolicitudUrl = $("#" + inputFristnamespace + "rechazarSolicitudUrl").val();
	var verDetalleSolicitudUrl = $("#" + inputFristnamespace + "verDetalleSolicitudUrl").val();

	var urls = {
		"aprobarSolicitudUrl" : aprobarSolicitudUrl,
		"rechazarSolicitudUrl" : rechazarSolicitudUrl,
		"verDetalleSolicitudUrl" : verDetalleSolicitudUrl
	};

	listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);

	$(btnBuscar).click(function() {
		// if(filtrafecharegistro){
		listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesReclutamientoUrl, urls);
		// }
	});
	cargarModals();
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

	var listaOpcionAprobar = $("#" + inputFristnamespace + "listaOpcionAprobar").val();
	var listaOpcionRechazar = $("#" + inputFristnamespace + "listaOpcionRechazar").val();
	var listaOpcionVerDetalle = $("#" + inputFristnamespace + "listaOpcionVerDetalle").val();

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
				
				if(value.estado ==  48){
					html += '		<a class="btn btn-primary btnAprobar"  data="' + urls["aprobarSolicitudUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionAprobar + ' </a>';
				}

				if(value.estado ==  48){
					html += '		<a class="btn btn-primary btnRechazar" data="' + urls["rechazarSolicitudUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionRechazar + ' </a>';
				}	
				
				html += '		<a class="btn btn-primary" href="' + urls["verDetalleSolicitudUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionVerDetalle + ' </a>';
				
				html += '	</div>';
				html += '</td>';
				html += '</tr>';
			});
			html += '</tbody>';
			html += '</table>';
			$(listaSolicitudes).html(html);

			addEventoClick();

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

function getDialogAprobar() {
	var html = '';
	html += '<div class="row"> <from class="fromModalAprobar">';
	html += '<div class="span12">';
	html += '<div class="offset1 span10">';
	html += '</div>';
	html += '<div class="offset1 span10">';
	html += '<div class="span5"><label>Presupuesto Minimo:</label></div>';
	html += '<div class="span5">';
	html += '<input id="presupuestoMinimo" name="presupuestoMinimo" class="presupuestoMinimo" onkeyup="numericoLimitado(this);" type="text"  />';
	html += '</div>';
	html += '</div>';
	html += '<div class="offset1 span10">';
	html += '<p><label class="msgpresupuestominimo text-error" style="display: none;">Ingresar el presupuesto salario de s/ 850 a s/ 30 000 </label></p>';
	html += '</div>';
	html += '<div class="offset1 span10">';
	html += '<div class="span5"><label>Presupuesto Maximo:</label></div>';
	html += '<div class="span5">';
	html += '<input id="presupuestoMaximo" name="presupuestoMaximo" type="text" class="presupuestoMaximo"  onkeyup="numericoLimitado(this);"  />';
	html += '</div>';
	html += '</div>';
	html += '<div class="offset1 span10">';
	html += '<p><label class="msgpresupuestomaximo text-error" style="display: none;">Ingresar el presupuesto salario de s/ 850 a s/ 30 000</label></p>';
	html += '</div>';
	html += '</from></div>';
	html += '</div>';
	return html;
}
function getDialogRechazar() {
	var html = '';
	html += '<div class="row"> <from class="fromModalRechazar">';
	html += '<div class="span12">';
	html += '<div class="offset1 span10">';
	html += '</div>';
	html += '<div class="offset1 span10">';
	html += '<div class="span5"><label>Motivo:</label></div>';
	html += '<div class="span5">';
	html += '<textarea id="" name="" class="motivo" onkeyup="limitadoObservacion(this);"  > </textarea>';
	html += '</div>';
	html += '</div>';

	html += '<div class="offset1 span10">';
	html += '<p><label class="msgmotivo text-error" style="display: none;">Se debe ingresar la observación</label></p>';
	html += '</div>';
	html += '</from></div>';
	html += '</div>';
	return html;
}

function numericoLimitado(elemento){
	elemento.value = elemento.value.replace(/[^0-9]/g,'');
    var l = elemento.value.length ;
	if(l > 5){
		elemento.value = elemento.value.substring(0, 5);
	}	
}
function limitadoObservacion(elemento){
    var l = elemento.value.length ;
	if(l > 200){
		elemento.value = elemento.value.substring(0, 200);
	}	
}

function cargarModals() {

	AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator', 'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
		if (A.one('#' + inputFristnamespace + 'modalAaprobar') != null) {
			var btnBuscar = $("#" + inputFristnamespace + "btnBuscar");
			modalAaprobar = new A.Modal({
				bodyContent : getDialogAprobar(),
				centered : true,
				destroyOnHide : true,
				headerContent : "<h5>" + "Aprobar Solicitud de Reclutamiento" + "</h5>",
				modal : true,
				render : '#' + inputFristnamespace + 'modalAaprobar',
				resizable : false,
				visible : false,
				destroyOnClose : true,
				width : 450
			}).render();
			
			modalAaprobar.addToolbar([ 

			              			{
			              				label : "Confirmar",
			              				on : {
			              					click : function() {
			              						var presupuestoMinimo = $(".presupuestoMinimo")[1];
			              						
			              						var presupuestoMaximo = $(".presupuestoMaximo")[1];
			              				
			              						var msgpresupuestominimo = $(".msgpresupuestominimo");
			              						var msgpresupuestomaximo = $(".msgpresupuestomaximo");
			              						var pminval = $(presupuestoMinimo).val();
			              				
			              						var pmaxval = $(presupuestoMaximo).val();

		              							console.log("pminval:"+pminval);
		              							console.log("pmaxval:"+pmaxval);
		              							
			              						msgpresupuestominimo.hide();
			              						msgpresupuestomaximo.hide();
			              						var valido = true;
			              						try {
			              							
			              							if(!validation.isNumber(pminval)){
			              								msgpresupuestominimo.show();
			              								valido = false;			              								
			              							}
			              							
			              							pminval = parseInt(pminval);
				              						
			              							if (pminval <= 849 || pminval == "NaN") {
			              								msgpresupuestominimo.show();
			              								valido = false;
			              							}
			              							
			              						} catch (e) {
			              							console.log(e);
			              							msgpresupuestominimo.show();
			              							valido = false;
			              							console.log("false2");
			              						}
			              						try {
			              							
			              							if(!validation.isNumber(pmaxval)){
			              								msgpresupuestomaximo.show();
			              								valido = false;			              								
			              							}
			              							
			              							pmaxval = parseInt(pmaxval);
			              							
				              						
			              							if (pmaxval <= 849 || pmaxval == "NaN" ) {
			              								msgpresupuestomaximo.show();
			              								valido = false;
			              							}
			              						} catch (e) {
			              							console.log(e);
			              							msgpresupuestomaximo.show();
			              						}
			              						
			              						
			              						if (pmaxval <= pminval) {
			              							msgpresupuestomaximo.show();
			              							valido = false;
			              						}

		              							console.log("(pmaxval>30000 || pminval >=30000 ):"+(pmaxval>30000 || pminval >=30000 ));
			              						if(pmaxval>30000 || pminval >=30000 ){
		              								msgpresupuestominimo.show();
			              							msgpresupuestomaximo.show();
			              							valido = false;
			              						}

		              							console.log(valido);
			              						
			              						if (valido) {
			              							$.ajax({
			              								type : "POST",
			              								url : urlevaluar + '&' + inputFristnamespace + 'presupuestoMinimo=' + pminval + '&' + inputFristnamespace + 'presupuestoMaximo=' + pmaxval,
			              								data : {},
			              								success : function(data) {
			              									data = $.parseJSON(data);
			              									console.log(data);
			              									console.log(data.solicitudRequerimientoId);
			              									console.log(data["solicitudRequerimientoId"]);
			              									modalAaprobar.hide();
			              									var contenedorAlerta = $(".contenedorAlerta");
			              									console.log(contenedorAlerta);
			              									var defaultUrl = $("#" + inputFristnamespace + "defaultUrl").val();
			              									console.log(defaultUrl);
			              									mostrarAlerta(contenedorAlerta, "Solicitud Aprobada", "Solicitud aprobada :" + data.solicitudRequerimientoId, "alert-success", function() {
			              										console.log("mostrarAlerta");
			              										setTimeout(function() {
			              											//window.location = defaultUrl;
			              											$(btnBuscar).click();
			              										}, 1500);
			              									});
			              								}
			              							});
			              						}

			              					}
			              				}
			              			} 
			              			
			              			,
			                           
			              			{
			            				label : "Cancelar",
			            				on : {
			            					click : function() {
			            						var presupuestoMinimo = $(".presupuestoMinimo");
			            						var presupuestoMaximo = $(".presupuestoMaximo");
			            						modalAaprobar.hide();
			            						presupuestoMinimo.val("");
			            						presupuestoMaximo.val("");
			            					}
			            				}
			            			}
		
			
			
			
			]);
		}
		
				
		if (A.one('#' + inputFristnamespace + 'modalRechazar') != null) {
			var btnBuscar = $("#" + inputFristnamespace + "btnBuscar");
			modalRechazar = new A.Modal({
				bodyContent : getDialogRechazar(),
				centered : true,
				destroyOnHide : true,
				headerContent : "<h5>" + "Rechazar Solicitud de Reclutamiento" + "</h5>",
				modal : true,
				render : '#' + inputFristnamespace + 'modalRechazar',
				resizable : false,
				// render: '#' + inputFristnamespace + 'modalRechazar',
				visible : false,
				destroyOnClose : true,
				width : 450
			}).render();

			modalRechazar.addToolbar([ 
			
			{
				label : "Confirmar",
				on : {
					click : function() {
						var motivo = $(".motivo")[1];
						console.log(motivo);

						var motivotext = $(motivo).val();
						console.log("motivotext");
						console.log(motivotext);
						console.log(motivotext.length);

						var msgmotivo = $(".msgmotivo");

						var valido = true;
						try {
							console.log(motivotext);
							console.log(validation.isNotEmpty(motivotext));
							if (!validation.isNotEmpty(motivotext)) {
								msgmotivo.show();
								valido = false;
							}
							
							if(motivotext.length>2000){
								msgmotivo.show();
								valido = false;
							}
							
						} catch (e) {
							console.log(e);
							msgmotivo.show();
							valido = false;
						}
						if (valido) {
							$.ajax({
								type : "POST",
								url : urlevaluar + '&' + inputFristnamespace + 'motivo=' + motivotext,
								data : {},
								success : function(data) {
									data = $.parseJSON(data);
									console.log(data);
									modalRechazar.hide();
									var contenedorAlerta = $(".contenedorAlerta");
									var defaultUrl = $("#" + inputFristnamespace + "defaultUrl").val();
									mostrarAlerta(contenedorAlerta, "Solicitud Rechazada", "Solicitud rechazada :" + data.solicitudRequerimientoId, "alert-success", function() {
										setTimeout(function() {
											$(btnBuscar).click();
//											window.location = defaultUrl;
										}, 1500);
									});
								}
							});
						}

					}
				}
			}
			, 

			{
				label : "Cancelar",
				on : {
					click : function() {
						modalRechazar.hide();
					}
				}
			}
			
			
			
			]);
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

function addEventoClick() {
	onlyNumber2("presupuestoMinimo");
	onlyNumber2("presupuestoMaximo");
	limiteText("presupuestoMinimo",5);
	limiteText("presupuestoMaximo",5);
	$(".btnAprobar").unbind("click");
	$(".btnAprobar").click(function() {
		var url = $(this).attr("data");
		urlevaluar = url;
		cargarModals();
		modalAaprobar.show();
		onlyNumber2("presupuestoMinimo");
		onlyNumber2("presupuestoMaximo");
		limiteText("presupuestoMinimo",5);
		limiteText("presupuestoMaximo",5);
	});
	$(".btnRechazar").unbind("click");
	$(".btnRechazar").click(function() {
		var url = $(this).attr("data");
		urlevaluar = url;
		cargarModals();
		modalRechazar.show();
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