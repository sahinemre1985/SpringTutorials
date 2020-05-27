package com.emre.springdemoprojectLiteralValuesInjection;

public class ReportCredits implements Report{

	private Mizan theMizan;
	
	public ReportCredits() {
		
	}
	public ReportCredits(Mizan mizan) {
		theMizan=mizan;
	}
	
	@Override
	public String sayMyName() {
		return "I am a Credit Report.";
	}

	@Override
	public long getAssetSum() {
		return theMizan.getAssetSum();
	}

}
