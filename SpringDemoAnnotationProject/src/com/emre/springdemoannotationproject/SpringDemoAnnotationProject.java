package com.emre.springdemoannotationproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoAnnotationProject {

	public static void main(String[] args) {
		//Report theReport = new ReportDeposits();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Report theReport = context.getBean("myReport",Report.class);
		
		System.out.println(theReport.sayMyName());
		
		System.out.println(theReport.getAssetSum());
		
		context.close();
	}

}
