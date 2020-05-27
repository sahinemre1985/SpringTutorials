package com.emre.springdemoproject;

public class ReportCredits implements Report{

	//define private field for the dependency
	//in here we do inject "Mizan" interface or class into our Report class 
	private Mizan theMizan;
	
	
	//no-args constructor
	public ReportCredits() {
	}
	
	//in here we  define a constructor for dependency injection
	public ReportCredits(Mizan mizan) {
		theMizan=mizan;
	}
	
	@Override
	public String sayMyName() {
		return "I am a Credit Report.";
	}
	
	//use dependent class's method, a mizan method
	@Override
	public long getAssetSum() {
		return theMizan.getAssetSum();
	}

}
