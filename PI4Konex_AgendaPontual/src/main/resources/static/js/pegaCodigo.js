$(document).ready(function() {
	$("input[name=IdCons]").click(function() {
        $("#CodConsul").val($(this).val());
	});
	if($("input[name=paraMed]").is(':checked') && $("input[name=paraMed]").is(':checked')){
		$("#para").val('Teste');
	}
	if ($("input[name=paraMed]").is(':checked')){
		$("#para").val('Nota para Médico');
	}
	if($("input[name=paraCli]").is(':checked')){
		$("#para").val('Nota para Clinica');
	}
});