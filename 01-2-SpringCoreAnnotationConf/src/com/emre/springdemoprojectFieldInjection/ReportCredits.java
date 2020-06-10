package com.emre.springdemoprojectFieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportCredits implements Report{

	/*  Below is a field injection.
	 *  Instead of using constructor or setter injection we can inject directly field
	 *  Here we inject Mizan object which is an interface, does not matter the variable is private or not
	 *  Spring will ask who implements this interface and behind the scene it is automatically arranged by Spring
	 */
	
	@Autowired
	private Mizan mizan;
	
	/* 
	 * a no argument constructor is added
	 */
	
	public ReportCredits() {
	}

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
