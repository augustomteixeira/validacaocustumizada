package com.augustomteixeira.validacaocustumizada.validacao.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.augustomteixeira.validacaocustumizada.validacao.validators.TituloValidation;

@Repeatable(Titulo.List.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TituloValidation.class)
public @interface Titulo {
	
	String message() default "Informe o título";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
	@Target({ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	@interface List {
		Titulo[] value();
	}
	
}
