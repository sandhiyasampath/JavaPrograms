
public  abstract class Animal {
	String name;
	public Animal()
	{
		System.out.println("inside no animal arg-constructor");
	}
	public Animal(String name) {
		super();
		this.name = name;
		System.out.println("inside parameterised constructor");
	}
	public void sleep()
	{
		System.out.println("closing the eyes and sleeping");
	}
	public abstract void eat();
	

}
