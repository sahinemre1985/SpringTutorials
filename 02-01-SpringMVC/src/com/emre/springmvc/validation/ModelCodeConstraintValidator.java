package com.emre.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ModelCodeConstraintValidator 
	implements ConstraintValidator<ModelCode,String>{

	private String modelPrefix;
	
	@Override
	public void initialize(ModelCode theModelCode) {
		 modelPrefix = theModelCode.value();
	 }
	
	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result; 
		
		
		if (theCode !=null) {
			result =theCode.startsWith(modelPrefix);
		}
		else {
			result=true;
		}
		
		return result;
	}

}
