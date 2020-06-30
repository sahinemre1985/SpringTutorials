package com.emre.springmvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=ModelCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ModelCode {

	//define default model code
	public String value() default "MDL";
	//define default error message
	public String message() default "must start with MDL";
	//define default group
	public Class<?>[] groups() default{};
	//define default payloads
	public Class<? extends Payload>[] payload() default{};
	
}
