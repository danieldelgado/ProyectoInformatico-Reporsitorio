//$(function() {
//	init();
//});
//
//function init() {
//	var linkajax = $("#linkajax").val();
//	var ajaxtagstest = $("#ajaxtagstest").val();
//	var namespacetest = $("#namespacetest").val();
//
//	$.ajax({
//		url : linkajax,
//		type : 'GET',
//		datatype : 'json',
//		success : function(data) {
//			var obj = $.parseJSON(data);
//			console.log(obj);
//		}
//	});
//
//	var movies = new Bloodhound({
//		datumTokenizer : function(datum) {
//			return Bloodhound.tokenizers.whitespace(datum.value);
//		},
//		queryTokenizer : Bloodhound.tokenizers.whitespace,
//		remote : {
//			url : ajaxtagstest + '&query=%QUERY',
//			filter : function(movies) {
//				
//				movies = $.parseJSON(movies.results);
//				
////				$(".tt-input").val("");
//				
//				return $.map(movies, function(movie) {					
//					return {
//						value : movie.nombre
//					};
//				});
//			},
//			wildcard : "%QUERY"
//		}
//	});
//	
//	movies.initialize();
//	
//	console.log($('#'+namespacetest+'tagtest'));
//	
//	$('#'+namespacetest+'tagtest').tagsinput({
//		typeaheadjs : {
//			displayKey : 'value',
//			source : movies.ttAdapter()
//		},
//		  freeInput: true,
//		  tagClass: 'big'
//	});
//
//}
