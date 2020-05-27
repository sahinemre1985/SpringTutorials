package com.emre.springdemoprojectLiteralValuesInjection;

public class ReportTreasury implements Report {

	private Mizan mizan;
	
	//no-arg constructor
	public ReportTreasury() {
		System.out.println("i am inside a no-arg constructor of ReportTreasury");
	}

	//create a setter method for injection
	public void setMizan(Mizan theMizan) {
		System.out.println("i am inside a setter method for ReportTreasury.setMizan");
		this.mizan = theMizan;
	}

	@Override
	public String sayMyName() {
		// TODO Auto-generated method stub
		return "I am a Treasury Report";
	}

	@Override
	public long getAssetSum() {
		return mizan.getAssetSum();
	}

}
