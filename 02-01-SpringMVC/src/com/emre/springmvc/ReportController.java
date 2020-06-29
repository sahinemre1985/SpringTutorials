package com.emre.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rpm")
public class ReportController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Report theReport = new Report();
		
		theModel.addAttribute("report",theReport);
		
		return "report-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("report") Report theReport) {
		
		System.out.println("theReport : " + theReport.getReportCode() + " " + theReport.getReportName());
		return "report-confirmation";
	}

}
