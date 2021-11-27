$(document).ready(function() {
	$("input[name=paraQuem]").click(function() {
	if($("#paraQuem1").is(':checked')){
		/*$("#saida").val('Para médico');*/
	}
	if($("#paraQuem2").is(':checked')){
		$("#saida").val('Para Clínica');
	}
	if($("#paraQuem1").is(':checked') && $("#paraQuem2").is(':checked')){
		$("#saida").val('Para Ambos');
	}
	});
});