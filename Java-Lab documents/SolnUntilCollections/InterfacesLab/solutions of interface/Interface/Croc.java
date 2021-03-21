
public class Croc extends Animal {
	
public Croc()
{
	System.out.println("inside no  crock arg-constructor");
	
}
public Croc(String name)
{
	
	super(name);
}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
      System.out.println("im eating");
	}
	public void sleep()
	{
		System.out.println("im sleeping");
	}
	public void swim()
	{
		System.out.println("im swimming");
	}

}
