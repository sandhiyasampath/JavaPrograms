
public class Part2Question2 {
	String name;
	int engineCapacity;
	public Part2Question2(String name, int engineCapacity) {
		super();
		this.name = name;
		this.engineCapacity = engineCapacity;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Part2Question2 equals method exicuted");
		if(obj instanceof Part2Question2) {
			Part2Question2 p = (Part2Question2)obj;
			if(this.name.equals(p.name) && this.engineCapacity==p.engineCapacity)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (name+engineCapacity).hashCode();
	}
}
