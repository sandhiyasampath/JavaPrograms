package com.uttara.test;

public class Dancer implements Performer {

	private String danceType;
	
	public Dancer(String type) {
		danceType = type;
		System.out.println("in Dancer param constr "+type);
	}
	
	public String getDanceType() {
		return danceType;
	}

	public void setDanceType(String danceType) {
		this.danceType = danceType;
	}

	@Override
	public String toString() {
		return "Dancer [danceType=" + danceType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((danceType == null) ? 0 : danceType.hashCode());
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
		Dancer other = (Dancer) obj;
		if (danceType == null) {
			if (other.danceType != null)
				return false;
		} else if (!danceType.equals(other.danceType))
			return false;
		return true;
	}

	@Override
	public void perform() {
		System.out.println("I am dancer dancing "+danceType);

	}

}
