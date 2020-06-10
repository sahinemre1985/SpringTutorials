package com.emre.springdemoprojectFieldInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Configuring Spring container is possible in three ways
 * 1- XML configuration file
 * 2- Java annotations
 * 3- Java Source Code
 * 
 * */

/*
 * 
 *     AnnotationConfigApplicationContext
 *      
 */


public class SpringDemoApplication {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextFieldInjection.xml");
		
		//get he bean from container
		Report theReport = context.getBean("reportCredits",Report.class);
		
		//call a method on the bean
		System.out.println(theReport.sayMyName());
		
		System.out.println(theReport.getAssetSum() );
		
		//close the context
		context.close();
		

		
	}

}
