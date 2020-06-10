package com.emre.springdemoproject;

import org.springframework.stereotype.Component;

@Component
public class ReportingMizan implements Mizan {

	@Override
	public long getAssetSum() {
		return 1200014513;
	}

}
