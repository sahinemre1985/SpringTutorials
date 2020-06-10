package com.emre.springdemoprojectQualifier;

import org.springframework.stereotype.Component;

@Component
public class CreditsMizan implements Mizan {

	@Override
	public long getAssetSum() {
		return 11231413;
	}

}
