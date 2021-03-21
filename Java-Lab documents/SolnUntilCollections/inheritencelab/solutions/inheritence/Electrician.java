package inheritence;

public class Electrician {
	public void test(Device d)
	{
		d.dosomething();
		if(d instanceof Tv)//checking whether d is instance of tv
		{
			Tv t=(Tv)d;//downcasting
			t.switchChannel();
		}
	}

}
