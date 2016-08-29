AUI().ready('liferay-sign-in-modal', function(A) {
	var Lang = A.Lang;

	var BODY = A.getBody();

	var WIN = A.getWin();

	var navigation = A.one('#navigation');

	if (navigation) {
		navigation.plug(Liferay.NavigationInteraction);
	}

	var signIn = A.one('.sign-in');

	if (signIn && signIn.getData('redirect') !== 'true') {
		signIn.plug(Liferay.SignInModal);
	}

	A.one('.navigation-menu').on('click', function() {
		BODY.toggleClass('opened');
	});

	A.one('.back-nav').on('click', function() {
		BODY.toggleClass('opened');
	});
});

$(document).ready(function() {

	$.validator.addMethod("rango_no_menor", function(value, element, params) {
		try {
			value = parseInt(value);
			var inputvalorMayor = $("#" + params.input).val();
			inputvalorMayor = parseInt(inputvalorMayor);
			if (inputvalorMayor > 0 || inputvalorMayor == "NaN") {
				return (value <= inputvalorMayor);
			} else {
				return true;
			}
		} catch (e) {
			console.error("catch");
			console.error(e);
			return false;
		}
		return false;
	}, "* Enddate should be greater than Startdate");
	
	$.validator.addMethod("rango_no_menor_date", function(value, element, params) {
		try {
			var fechaIncial = stringToDate(value,"dd/MM/yyyy","/");	
			var fechaFin = stringToDate($("#" + params.input).val());
			
			if(fechaIncial != "" && fechaFin != ""){
				if( (fechaIncial < fechaFin) ){
					return true;
				} else {
					return false;
				}
			}
			
		
		} catch (e) {
			console.error("catch");
			console.error(e);
			return false;
		}
		return false;
	}, "* Enddate should be greater than Startdate");

	
	$.validator.addMethod("rango_fecha_limite", function(value, element) {
		try {

			var hoydate = new Date();
			var limitedate = new Date();	
			limitedate = limitedate.setDate(limitedate.getDate() + 30);
			value = stringToDate(value,"dd/MM/yyyy","/");			
			if( (hoydate < value) && (value < limitedate) ){
				return true;
			}			
		} catch (e) {
			console.error("catch");
			console.error(e);
			return false;
		}
		return false;
	}, "* Enddate should be greater than Startdate");


}); 

function validarFecharSimple(element, elementComparate){
	try {		
		var fechaIncial = stringToDate($("#" + element).val(),"dd/MM/yyyy","/");			
		var fechaFin = stringToDate($("#" + elementComparate).val(),"dd/MM/yyyy","/");		
		if((fechaIncial != "" && fechaFin != "") || (fechaIncial != "NaN" && fechaFin != "NaN")|| (fechaIncial != "Invalid Date" && fechaFin != "Invalid Date") ){
			if( (fechaIncial < fechaFin) ){
				return true;
			} else {
				return false;
			}
		}
	} catch (e) {
		return false;
	}
	return false;
}

function mostrarAlerta(contenedor, titulo, mensaje, tipoclase, callbackFunction) {//alert-block -  alert-success - alert-error - alert-info
	if(contenedor!=null){
		var html = '<div class="alert '+tipoclase+'">';
		html+='<button type="button" class="calert close" data-dismiss="alert">&times;</button>';
		html+='<h4>'+titulo+'</h4>';
		html+=mensaje;
		html+='</div>';	
		
		$(contenedor).html(html);
		
		$(".calert").click( function(){			
			$(contenedor).html("");
		} );
		
		if(callbackFunction!=null){
			callbackFunction();
		}
	}	
}

var validation = {
	    isEmailAddress:function(str) {
	        var pattern =/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	        return pattern.test(str);  // returns a boolean
	    },
	    isNotEmpty:function (str) {
	        var pattern =/\S+/;
	        return pattern.test(str);  // returns a boolean
	    },
	    isNumber:function(str) {
	        var pattern = /^\d+$/;
	        return pattern.test(str);  // returns a boolean
	    },
	    isSame:function(str1,str2){
	        return str1 === str2;
	    }
	};   

function stringToDate(_date, _format, _delimiter) {
	var formatLowerCase = _format.toLowerCase();
	var formatItems = formatLowerCase.split(_delimiter);
	var dateItems = _date.split(_delimiter);
	var monthIndex = formatItems.indexOf("mm");
	var dayIndex = formatItems.indexOf("dd");
	var yearIndex = formatItems.indexOf("yyyy");
	var month = parseInt(dateItems[monthIndex]);
	month -= 1;
	var formatedDate = new Date(dateItems[yearIndex], month, dateItems[dayIndex]);
	return formatedDate;
}
