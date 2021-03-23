$(document).ready(function() {
	$('#tipoEntretenimento').select2({
		selectionTitleAttribute : false,
		allowClear : true,
		placeholder : "Selecione um entretenimento",
	});
});

$('#tipoEntretenimento').on('change', function(e) {
	let idTipoEntretenimento = $(this).val();
	$('#camposEntretenimento').load('/campos/tipo/entretenimento/' + idTipoEntretenimento);
});