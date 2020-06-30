package com.emre.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//initbinder is for preprocessing all webrequests
	//in here we use it for trim whitespaces
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm (
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {	
		
		System.out.println("last name: |"+ theCustomer.getLastName() +"| first name: |"+ theCustomer.getFirstName()+"|");
		
		if(theBindingResult.hasErrors() ) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}
	
}
