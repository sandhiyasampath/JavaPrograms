package com.uttara.test;

public class Tabla implements Instrument {

	@Override
	public void play() {
		System.out.println("Tabla playing...DHUM DHOLAK DHUM");

	}

	@Override
	public String toString() {
		return "Tabla [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
