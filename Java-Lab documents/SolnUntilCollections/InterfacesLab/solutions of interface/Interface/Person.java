package uttara.solutions.Interface;

public final class Person {

	final String name;
	final int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("inside con "+name+age);
	}
	
}
