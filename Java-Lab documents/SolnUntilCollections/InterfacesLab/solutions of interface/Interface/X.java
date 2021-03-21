package uttara.solutions.Interface;

public class X {


	int a = 10; 
	
	static int b = 15; 
	
	static
	{ 
	System.out.println("in static init 1 b = "+b); 
	b = 25; 
	System.out.println("in static init 1 b = "+b); 
	} 

	{ 
	System.out.println("in inst init 1 a = "+a); 
	a = 20; 
	} 

	{ 
	System.out.println("in inst init 2 a = "+a); 
	a = 30; 
	} 

	static // does order matter for init execution? 

	{ 
	System.out.println("in static init 2 b = "+b); 
	b = 35; 
	} 
	public X() 
	{ 
	System.out.println("in constr of X a = "+a); 
	a = 40;
	}
	
	
}
