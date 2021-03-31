package com.augustomteixeira.validacaocustumizada.validacao.validators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.augustomteixeira.validacaocustumizada.model.dto.EntretenimentoDto;
import com.augustomteixeira.validacaocustumizada.service.CampoEntretenimentoObrigatoriedadeService;
import com.augustomteixeira.validacaocustumizada.validacao.annotations.Titulo;

public class TituloValidation implements ConstraintValidator<Titulo, EntretenimentoDto> {

	@Autowired
	private CampoEntretenimentoObrigatoriedadeService campoEntretenimentoObrigatoriedadeService;

	@Override
	public boolean isValid(EntretenimentoDto entretenimentoDto, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		Map<String, Boolean> campos = campoEntretenimentoObrigatoriedadeService.campoObrigatorioPorTipoEntretenimento(
				entretenimentoDto.getTipoEntretenimento().getIdTipoEntretenimento());

		if (campos.get("título")) {
			return (entretenimentoDto.getTitulo() != null && !entretenimentoDto.getTitulo().isEmpty());
		}

		return true;
	}

}
