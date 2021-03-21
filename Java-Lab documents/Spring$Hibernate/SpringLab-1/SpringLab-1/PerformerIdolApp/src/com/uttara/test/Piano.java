package com.uttara.test;

public class Piano implements Instrument {

	@Override
	public void play() {
		System.out.println("Piano playing...PING TING TING");

	}

	@Override
	public String toString() {
		return "Piano []";
	}
	
}
