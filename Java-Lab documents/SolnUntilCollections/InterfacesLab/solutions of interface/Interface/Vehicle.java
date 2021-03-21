package uttara.solutions.Interface;

public class Vehicle implements Thing {
	String name;

	public Vehicle(String name) {
		super();                     // constructer.....
		this.name = name;
	}

	@Override
	public void doSomething() {
		System.out.println("vehicle "+name+ " is being driven");
		
	}

}
