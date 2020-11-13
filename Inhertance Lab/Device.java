/*a) A device has a name and can do something. TV, Printer and Mi- crowave are devices. Using TV, you can watch movie; using Printer, you can print; using Microwave, you can cook (all these are doSome- thing() implementations - so override them in the respective classes).When a device is made to dosomething, it shouts out its name as well. An Electrician is one who can test any device. When he is asked to test a device, he will make it do something and test it. A TV can switchChannel as well (delta functionality). So if a tv is given to be
tested to an electrician, he will make the tv dosomething and switch channel as well. Write a tester class to test how devices, electricians work.If Device has a private String name, do Printer, TV, etc subclasses have a name? If yes, how to access it in overridden doSomething()
method? Try it out. */
public class Device
{
	private String name;
	public Device()
	{
		System.out.println("in Device no argument constructor executted");
	}
	public Device(String deviceName)
	{
		name = deviceName;
		System.out.println("in Device parameterised constructor executted");
	}
	public void setName(String s)
	{
		if(s==null || s=="null" || s.length()==0)
		{
			System.out.println("Please give a valid name");
		}
		else
		{
			name = s;
		}
	}
	public String getName()
	{
		return name;
	}
	public void doSomething()
	{
		System.out.println(name+" doing something ");
	}
}
class TV extends Device
{
	public TV()
	{
		System.out.println("in TV no argument constructor executted");
	}
	public TV(String TVName)
	{
		super(TVName);
		System.out.println("in TV parameterised constructor executted");
	}
	public void doSomething()
	{
		System.out.println("Watching movie in a "+getName()+" TV");
	}
	public void switchChannel()
	{
		System.out.println("switching channel in a "+getName()+" TV");
	}
}
class Printer extends Device
{
	public Printer()
	{
		System.out.println("in Printer no argument constructor executted");
	}
	public Printer(String PrinterName)
	{
		super(PrinterName);
		System.out.println("in Printer parameterised constructor executted");
	}
	public void doSomething()
	{
		System.out.println("Printing text in a "+getName()+" primter");
	}
}
class Microwave extends Device
{
	public Microwave()
	{
		System.out.println("in Microwave no argument constructor executted");
	}
	public Microwave(String MicrowaveName)
	{
		super(MicrowaveName);
		System.out.println("in Microwave parameterised constructor executted");
	}
	public void doSomething()
	{
		System.out.println("Cooking pasta in "+getName()+" microwave");
	}
}

