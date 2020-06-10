package com.emre.springdemoprojectSetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportCredits implements Report{

	private Mizan mizan;
	
	/* 
	 * a no argument constructor is added
	 */
	
	public ReportCredits() {
	}
	
	/*  Below is a setter injection.
	 *  Spring will wire Mizan into the ReportCredits. 
	 *  Mizan is an interface, Therefore Spring will ask who is implementing this Mizan interface. 
	 *  In this case there is only one implementation, ReportingMizan. So there will be no problem
	 *  What is there are more than one implementation for Mizan interface?
	 *  Qualifier annotation shall be used for this case.
	 */
	 
	@Autowired
	public void setMizan(Mizan mizan) {
		System.out.println("I am in a setter method of ReportCredits.setMizan");
		this.mizan = mizan;
	}

	@Override
	public String sayMyName() {
		return "I am a Credit Report. I might be KR202.";
	}


	@Override
	public long getAssetSum() {
		return mizan.getAssetSum();
	}

}
