$(document).ready(function() {
	$('#tipoEntretenimento').select2({
		selectionTitleAttribute : false,
		allowClear : true,
		placeholder : "Selecione um entretenimento",
	});
});

$('#tipoEntretenimento').on('change', function(e) {
	$('#camposEntretenimento').load('/campos/tipo/entretenimento/');
});