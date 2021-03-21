package vahana;

public abstract class Vehicle
{
	public abstract void start();
	public abstract void drive();
	public void stop()
	{
		System.out.println("Vehicle stopping...");	
	}
}
