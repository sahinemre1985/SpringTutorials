package com.emre.springdemoprojectLiteralValuesInjection;

public class ReportDeposits implements Report{

	private Mizan theMizan;
	
	public ReportDeposits() {
	
	}
	
	public ReportDeposits(Mizan mizan) {
		theMizan=mizan;
	}
	
	@Override
	public String sayMyName() {
		return "I am a Deposit Report.";
	}

	@Override
	public long getAssetSum() {
		return theMizan.getAssetSum();
	}

}
