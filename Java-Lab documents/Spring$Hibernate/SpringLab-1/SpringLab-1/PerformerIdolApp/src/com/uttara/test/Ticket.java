package com.uttara.test;

public class Ticket {

	private int num;

	public Ticket() {
		num = (int)(Math.random()*100000);
		System.out.println("in no-arg constr of Ticket");
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
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
		Ticket other = (Ticket) obj;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [num=" + num + "]";
	}
	
	
}
