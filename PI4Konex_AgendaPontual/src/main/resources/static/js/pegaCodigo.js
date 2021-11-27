$(document).ready(function() {
	$("input[name=IdCons]").click(function() {
        $("#codigo").val($(this).val());
	});
});