package com.augustomteixeira.validacaocustumizada.validacao.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.augustomteixeira.validacaocustumizada.validacao.annotations.Titulo;

public class TituloValidation implements ConstraintValidator<Titulo, String>{

	@Override
	public boolean isValid(String campo, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return (campo != null && !campo.isEmpty());
	}

}
