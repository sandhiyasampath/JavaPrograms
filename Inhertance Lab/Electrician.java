public class Electrician
{
	public void testDevice(Device d)
	{
		if(d instanceof TV)
		{
			d.doSomething();
			TV t =(TV)d;
			t.doSomething();
			t.switchChannel();
		}
	}
}
