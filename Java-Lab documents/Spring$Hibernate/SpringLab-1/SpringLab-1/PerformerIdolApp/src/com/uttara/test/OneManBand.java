package com.uttara.test;

import java.util.List;

public class OneManBand implements Performer {

	private List<Instrument> instruments;
	
	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		System.out.println("I am OneMandBand going to perform....");
		for(Instrument in : instruments)
			in.play();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((instruments == null) ? 0 : instruments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OneManBand other = (OneManBand) obj;
		if (instruments == null) {
			if (other.instruments != null)
				return false;
		} else if (!instruments.equals(other.instruments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OneMandBand [instruments=" + instruments + "]";
	}
	
}
