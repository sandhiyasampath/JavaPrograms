package com.uttara.test;

public class Juggler implements Performer {
	
	private int numRings = 3;
	
	public Juggler() {
		System.out.println("in Juggler no-arg constr");
	}

	public Juggler(int numRings) {
		super();
		this.numRings = numRings;
		System.out.println("in param constr of Juggler "+numRings);
	}
	
	public int getNumRings() {
		return numRings;
	}

	public void setNumRings(int numRings) {
		this.numRings = numRings;
	}

	@Override
	public void perform() {
		System.out.println("Juggler juggling "+numRings+" juggle...juggle...");
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numRings;
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
		Juggler other = (Juggler) obj;
		if (numRings != other.numRings)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Juggler [numRings=" + numRings + "]";
	}
	
	
}
