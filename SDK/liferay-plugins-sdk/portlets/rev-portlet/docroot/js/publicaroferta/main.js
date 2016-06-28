
var inputFristnamespace = null;
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
				html += '		<a class="btn btn-danger" href="' + urls["finalizarOfertaUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionFinalizarOferta + ' </a>';
				html += '		<a class="btn btn-primary" href="' + urls["publicarOfertaUrl"] + '&' + inputFristnamespace + 'solicitudRequerimientoId=' + value.solicitudRequerimientoId + '">' + listaOpcionPublicarOferta + ' </a>';
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

