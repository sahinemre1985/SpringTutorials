package com.emre.springdemoprojectQualifier;

import org.springframework.stereotype.Component;

@Component
public class DepositsMizan implements Mizan {

	@Override
	public long getAssetSum() {
		return 30012331;
	}

}
