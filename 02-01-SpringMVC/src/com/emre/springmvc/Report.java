package com.emre.springmvc;

import java.util.LinkedHashMap;

public class Report {
	//text fieldleri
	private String reportCode;
	private String reportName;
	
	//dropdown list
	private String country;
	
	//for reading the contents of dropdownlist from java class
	private LinkedHashMap<String,String> countryOptions;

	
	//for radiobutton
	private String reportType;
	
	public Report() {
		
		countryOptions= new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("TR", "Turkey");
		countryOptions.put("US", "United States of America");
	}

	public String getReportCode() {
		return reportCode;
	}

	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}



}
