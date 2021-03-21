package com.uttara.test;

public class Instrumentatlist implements Performer {

	private Instrument instrument;
	private String name;
	
	
	public Instrumentatlist(String name) {
		super();
		this.name = name;
		System.out.println("in param constr of Instr. "+name);
	}

	public Instrumentatlist() {
		System.out.println("in no-arg constr of Instr.");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("in setName() "+name);
		this.name = name;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		System.out.println("in setInstrument() of Instrumentalist "+instrument);
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.println("Instrumentalist "+name+" going to play... ");
		instrument.play();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Instrumentatlist other = (Instrumentatlist) obj;
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Instrumentatlist [instrument=" + instrument + ", name=" + name
				+ "]";
	}

	

}
