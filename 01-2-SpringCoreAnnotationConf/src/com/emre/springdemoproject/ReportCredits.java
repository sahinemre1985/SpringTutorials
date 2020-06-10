package com.emre.springdemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportCredits implements Report{

	private Mizan mizan;
	
	/*  Below is a constructor injection.
	 *  Spring will wire Mizan into the ReportCredits. 
	 *  Mizan is an interface, Therefore Spring will ask who is implementing this Mizan interface. 
	 *  In this case there is only one implementation, ReportingMizan. So there will be no problem
	 *  What is there are more than one implementation for Mizan interface?
	 *  Qualifier annotation shall be used for this case.
	 */
	 
	
	@Autowired
	public ReportCredits(Mizan mizan) {
		super();
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
