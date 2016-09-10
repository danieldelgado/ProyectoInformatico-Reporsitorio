
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
				html += '<tr>';

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
				if (value.estado == 51  ||  value.estado == 68  ||  value.estado ==52) {
					html += '		<a class="btn btn-primary" href="' + urls["registrarProcesoUrl"] + '&' + inputFristnamespace + 'solicitudId=' + value.solicitudId + '&' + inputFristnamespace + 'userId=' + value.userId + '">' + listaOpcionRegistrarProceso + ' </a>';
				}
				if (value.estado == 51  ||  value.estado == 68  ||  value.estado ==52) {
					html += '		<a class="btn btn-primary" href="' + urls["noAsistioUrl"] + '&' + inputFristnamespace + 'solicitudId=' + value.solicitudId + '&' + inputFristnamespace + 'userId=' + value.userId + '">' + listaOpcionNoAsistio + ' </a>';
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
