package com.emre.springdemoprojectLiteralValuesInjection;

public class ReportTreasury implements Report {

	private Mizan mizan;
	
	//add new private fields for report
	private String reportName;
	private String reportCode;
	private int reportVersion;
	
	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		System.out.println("i am inside a setReportName method of ReportTreasury");
		this.reportName = reportName;
	}

	public String getReportCode() {
		return reportCode;
	}

	public void setReportCode(String reportCode) {
		System.out.println("i am inside a setReportCode method of ReportTreasury");
		this.reportCode = reportCode;
	}

	public int getReportVersion() {
		return reportVersion;
	}

	public void setReportVersion(int reportVersion) {
		System.out.println("i am inside a setReportVersion method of ReportTreasury");
		this.reportVersion = reportVersion;
	}

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
