package com.emre.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/esm")
public class HelloWorldController {
	
	
	//controller for show initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller for processing the form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller for reading form data and adding it to the model
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("reportName");
		
		theName = theName.toUpperCase();
		
		String result = "Greeting with : " + theName;
		
		model.addAttribute("message", result);
		
		
		return "helloworld";
	}
	
	
	//controller for reading form data using RequestParam annotation
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("reportName") String theName, 
			Model model) {
		
		
		theName = theName.toUpperCase();
		
		String result = "Greeting with : " + theName +" which is captured by RequestParam annotation";
		
		model.addAttribute("messageThree", result);
		
		
		return "helloworld";
	}
	
	
}
