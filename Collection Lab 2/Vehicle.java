

public class Vehicle implements Comparable<Vehicle> {
	String name;
	int engineCapacity;
	public Vehicle(String name, int engineCapacity) {
		super();
		this.name = name;
		this.engineCapacity = engineCapacity;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Vehicle equals method started  ");
		if(obj instanceof Vehicle) {
			Vehicle p = (Vehicle)obj;
			System.out.println("in Vehicle equals vehicle name = "+p.name);
			if(this.name.equals(p.name) && this.engineCapacity==p.engineCapacity) {
				System.out.println("Vehicle equals method ended ");
				return true;
			}
			else {
				System.out.println("Vehicle equals method ended ");
				return false;
			}
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		return (name+engineCapacity).hashCode();
	}
	@Override
	public int compareTo(Vehicle v) {
		System.out.println("Vehicle class compareTo method ended ");
		return this.name.compareTo(v.name);
	}
	@Override
	public String toString() {
		return "Vehicle : "+name+","+engineCapacity;
	}
	
}
