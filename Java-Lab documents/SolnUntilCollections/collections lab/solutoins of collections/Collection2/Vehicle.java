package uttara.solutions.Collection2;

public class Vehicle implements Comparable{
	private String name;
	private int capacity;
	public Vehicle()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Vehicle(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	public boolean equals(Object o)
	{ System.out.println("Vehicle->equals()->testing…");
	
      if(o instanceof Vehicle)
      {
    	  Vehicle v=(Vehicle)o;
    	  System.out.println("contents of vehicle1"+"..........>"+v.getName()+"    "+v.getCapacity()+"      "+"contents of vehicle2 are"+"     "+v.getName()+"........>"+"    "+v.getCapacity());
    	  if(this.name.equals(v.name)&&(this.capacity==v.capacity))
    	  {
    		  return true;
    	  }
    	  else
    		  return false;
      }
      else
    	  throw new IllegalArgumentException("plz pass only vehicle object to compare");
    }
	
	public String toString() {
		return "Vehicle [name=" + name + ", capacity=" + capacity + "]";
	}
	public int hashCode()
	{
		System.out.println("inside of hashcode");
		return (name+capacity).hashCode();
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Vehicle)
		{
			Vehicle v=(Vehicle)o;
			//return this.name.compareTo(v.name);
			return this.capacity-v.capacity;
		}
		else
			throw new IllegalArgumentException("plz pass only vehicle object to comapare");
	}
}
