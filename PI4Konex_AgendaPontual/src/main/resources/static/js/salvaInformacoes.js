$(document).ready(function() {
	$("#addInfor").on('click',function() {
		var id = $(this).val();
		var inforAd = $("#informaAd").val();  
				if (id > 0) {
			$.ajax({
				method: "post",
				url: '/consulta/validacao/addInfo',
				data: { "id": id, "inforAd":inforAd },
				success:function() {
					alert('Informações adiconadas!');
					/*$("#informaAd").val("");*/ //Para limpar o campo informaAd descomente essa linha.
				}	
			});
		}
	});
});