package com.emre.springdemoprojectSetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Configuring Spring container is possible in three ways
 * 1- XML configuration file
 * 2- Java annotations
 * 3- Java Source Code
 * 
 * */

/*
 * Step 1. Configuring Spring Beans
 * Step 2. Create Spring Container(ApplicationContext)
 *   Specialized implementations are;
 *     ClassPathXmlApplicationContext
 *     AnnotationConfigApplicationContext
 *     GenericWebApplicationContext
 * Step 3. Retrieve Beans from Container 
 */

/*Add applicationContext.xml file to the project
 * add a bean acc to following format
 *  <bean 	id="" class=""></bean>
 */


public class SpringDemoApplication {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetterInjection.xml");
		
		//retrieve bean from container
		  // context'in arka planda yaptığı işlem=
		  // id="myReportTreasury" class="ReportTreasury" ==> Report theReport = new ReportTreasury();
		Report theReport = context.getBean("myReportTreasury",ReportTreasury.class);
		
		
		
		System.out.println(theReport.sayMyName());
		
		System.out.println(theReport.getAssetSum());
		
		
		//close the context
		context.close();
		

		
	}

}
