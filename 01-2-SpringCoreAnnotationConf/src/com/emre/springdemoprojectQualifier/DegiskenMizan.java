package com.emre.springdemoprojectQualifier;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DegiskenMizan implements Mizan {

	private Random myRandom = new Random();
	
	private long[] data = {
		500,
		600,
		700
	};
	
	@Override
	public long getAssetSum() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
