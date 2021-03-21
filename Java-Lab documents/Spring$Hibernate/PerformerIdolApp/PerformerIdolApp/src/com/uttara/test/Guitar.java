package com.uttara.test;

public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Guitar playing STRUM STRUM STRUM...");

	}

	@Override
	public String toString() {
		return "Guitar []";
	}
	
}
