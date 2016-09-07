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
	var listarSolicitudesEvaluacionUrl = $("#" + inputFristnamespace + "listarSolicitudesEvaluacionUrl").val();
	var listaSolicitudes = $("#" + inputFristnamespace + "listaSolicitudes");
	var paginacion = $("#" + inputFristnamespace + "paginacion");
	var pagina = $("#" + inputFristnamespace + "pagina").val();
	var filas = $("#" + inputFristnamespace + "filas").val();

	var crearCronogramaUrl = $("#" + inputFristnamespace + "crearCronogramaUrl").val();

	var urls = {
		"crearCronogramaUrl" : crearCronogramaUrl
	};

	listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesEvaluacionUrl, urls);

	$(btnBuscar).click(function() {
		// if(filtrafecharegistro){
		listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesEvaluacionUrl, urls);
		// }
	});
	
	AUI().use('autocomplete-list', 'aui-base', 'node', 'aui-datepicker', 'aui-io-request', 'autocomplete-filters', 'autocomplete-highlighters', 'aui-form-validator', 'aui-overlay-context-panel', 'aui-modal', 'aui-alert', function(A) {
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
	});
	
	
	
}

function listaPaginada(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesEvaluacionUrl, urls) {
	$(listaSolicitudes).html("");
	$(paginacion).html("");

	var descripcion = "Descripción";
	var fechaRegistroInicio = "Fecha Evaluación";
	var fechaRegistroInicio = "Fecha Estimada de Finalización";
	var estado = "Estado";
	var listaopciones = "Estado";


	$.ajax({
		type : "POST",
		url : listarSolicitudesEvaluacionUrl,
		data : $(buscarSolicitud).serialize() + "&" + inputFristnamespace + "pagina=" + pagina + "&" + inputFristnamespace + "filas=" + filas,
		success : function(data) {
			data = $.parseJSON(data);
			var html = '<table class="table table-hover table-bordered">';
			html += '<thead>';
			html += '<tr class="cabecera">';
			html += '<th>#</th>';
			html += '<th>' + descripcion + '</th>';
			html += '<th>' + fechaRegistroInicio + '</th>';
			html += '<th>' + fechaRegistroInicio + '</th>';
			html += '<th>' + estado + '</th>';
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

				html += '<td>' + value.descripcion + '</td>';
				html += '<td>' + value.strfechaInicioEvaluacion + '</td>';
				html += '<td>' + value.strfechaFinalizacionEvaluacion + '</td>';
				html += '<td>' + value.strestado + '</td>';
				html += '<td>';
				html += '	<div class="btn-group">';

				html += '		<a class="btn btn-primary" href="' + urls["crearCronogramaUrl"] + '&' + inputFristnamespace + 'solicitudEvaluacionId=' + value.solicitudEvaluacionId + '"> Crear Cronograma </a>';
				
				
				html += '	</div>';
				html += '</td>';
				html += '</tr>';
			});
			html += '</tbody>';
			html += '</table>';
			$(listaSolicitudes).html(html);

			barraPaginacion(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesEvaluacionUrl, data, urls);

		}
	});

}

function barraPaginacion(pagina, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesEvaluacionUrl, data, urls) {
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
				listaPaginada(pagina - 1, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesEvaluacionUrl, urls);
			});
		}

		if (total > pagina) {
			$(".next").click(function() {
				listaPaginada(pagina + 1, filas, buscarSolicitud, listaSolicitudes, paginacion, listarSolicitudesEvaluacionUrl, urls);
			});
		}
	}

}



function inicializarListaGrupo(listaGrupos) {
	init();
	if (listaGrupos != "") {
		var lista = $.parseJSON(listaGrupos);	
		$.each(lista, function(index, object) {		
			addGrupoFila(object );
		});		
	}	
}


function addGrupoFila(object) {
	var planificarUrl = $("#" + inputFristnamespace + "planificarUrl").val();

	var listaGrupos = $("#" + inputFristnamespace + "listaGrupos");
	var html = "";
	html += "<tr>" + 
	"<td>" + object.strgrupoUsuario + "</td>" + 
	"<td>" + "" + "</td>" + 
	"<td>" + "" + "</td>" + 
	"<td>" + "" + "</td>" + 
	"<td>" + "" + "</td>" + 
	"<td>" + "" + "</td>" + 
	"<td>" + "" + "</td>" + 
	"<td>" + "";
	
	html += '	<div class="btn-group">';
	html += '		<a class="btn btn-primary" href="' + planificarUrl 
	+ '&' + inputFristnamespace + 'solicitudEvaluacionId=' +object.solicitudEvaluacionId 
	+ '&' + inputFristnamespace + 'prioridadGrupoUsuariosId=' + object.prioridadGrupoUsuariosId + 
	+ '&' + inputFristnamespace + 'cronogramaId=' + object.actividadCronogramaBean.cronogramaId+
	+ '&' + inputFristnamespace + 'actividadCronogramaId=' + object.actividadCronogramaBean.actividadCronogramaId +
	+ '&' + inputFristnamespace + 'grupoUsuario=' +  object.grupoUsuario  +
	'"> Planificar </a>';
	html += '	</div>';
	
	html += "</td>"
	
	html +="</tr>";
	$(listaGrupos).append(html);

}
