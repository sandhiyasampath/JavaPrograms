package inheritence;

public class Tv extends Device {
	public Tv()
	{
		System.out.println("im in tv no-argument constructor");
	}
	public void dosomething()
	{
		System.out.println("watching movie"+"  "+getName());
	}
	public void switchChannel()
	{
		System.out.println("tv switchingchannel");
	}

}
