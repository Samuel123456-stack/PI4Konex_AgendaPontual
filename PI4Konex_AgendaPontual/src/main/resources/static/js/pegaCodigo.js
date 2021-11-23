$(document).ready(function() {
	$("input[name=IdCons]").click(function() {
		 if ($(this).is(':checked')) {
            /*$("#codigo").val($(this).val());*/
            $("#codigo").val("TEste");
        }
	});
});