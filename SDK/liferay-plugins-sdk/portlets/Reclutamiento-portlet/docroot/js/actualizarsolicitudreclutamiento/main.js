var inputFristnamespace = null;

$(document).ready(function() {
	inputFristnamespace = $("input[type=hidden]").first().val();
	console.log(inputFristnamespace);
	init();
});

function init() {

	var formActualizarSolicitud = $("#" + inputFristnamespace + "actualizarSolicitud");
	var btnGuardar = $("#" + inputFristnamespace + "btnGuardar");
	var actualizarUrl = $("#" + inputFristnamespace + "actualizarUrl").val();

	var inputpuesto = inputFristnamespace + "puesto";

	var rules = {};
	rules[ inputpuesto ] = "required";
	
	
	var messages = {};
	messages[ inputpuesto ] = "Ingresar el puesto";

	$(formActualizarSolicitud).validate({
		errorElement : "span",
		errorClass : "text-error",
		rules : rules,
		messages : messages,
		submitHandler : function(form) {
			console.log("submitHandler");
			console.log('valid form submitted');

			 $.ajax({
				type : "POST",
				url : actualizarUrl,
				data : $(formActualizarSolicitud).serialize(),
				success : function(data) {
					alert(data);
				}
			});

			return false;
		}
	});

	$(btnGuardar).click(function() {
		$(formActualizarSolicitud).valid();
	});

}
