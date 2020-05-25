package com.emre.springdemoannotationproject;

import org.springframework.stereotype.Component;

@Component("myReport")
public class ReportCredits implements Report{

	
	@Override
	public String sayMyName() {
		return "I am a Credit Report.";
	}

	@Override
	public long getAssetSum() {
		return 12000000;
	}

}
