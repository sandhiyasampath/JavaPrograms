public class TestDuck
{
	public static void main(String[] args)
	{
		/*
			a) create object from Duck design
			b) assign name & size values
			c) invoke sing()
			
			How to create an obj in java?
			You cannot create an obj in java?
			JVM!!!
			How to ask the JVM to create an obj?
				a) using new syntax
				b) cloning
				c) reflection
				d) deserialization
				
				new <classname>();
				new Duck();
				
				i) JVM searches for a file named Duck.class
			   ii) Opens Duck.class and scans the design for inst members
			  iii) Calculates the mem req for the object
			   iv) Allocates the mem in the heap mem area & creates the object (structure) with the instance variables!!
			   v) returns the st. mem addr of this object!!
				
		*/
	//reference

	Duck d1 = new Duck();
	
	d1.size = 100;
	d1.name = "ducko";
	
	System.out.println("d1.name = "+d1.name);
	System.out.println("d1.size = "+d1.size);
	
	d1.sing();
	d1.dance();
	
	Duck d2 = d1;
	
	d2.size = 200;
	d2.name = "bucky";
	
	System.out.println("d1.name = "+d1.name);
	System.out.println("d1.size = "+d1.size);

	System.out.println("d2.name = "+d2.name);
	System.out.println("d2.size = "+d2.size);

	}
}








