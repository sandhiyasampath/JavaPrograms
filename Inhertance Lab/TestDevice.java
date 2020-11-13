public class TestDevice
{
	public static void main(String[] args)
	{
		System.out.println("Tv object created");
		Device d1 = new TV("sony");
		d1.doSomething();

		TV t1 = (TV)d1;
		t1.switchChannel();

		System.out.println("-------------------------");
		System.out.println("Device object created");
		Device d2 = new Device();
		d2.setName("sony");
		d2.doSomething();

		System.out.println("-------------------------");
		System.out.println("TV object created");
		TV d3 = new TV();
		d3.doSomething(); 

		System.out.println("Tv object created");
		Device d = new TV();// ( 2 constructors are called)
		d.setName("sony");
		d.doSomething();
		System.out.println("-------------------------");

		System.out.println("printer object created");
		d = new Printer();// ( 2 constructors are called again - constructor chaining happens per object creation)
		d.setName("sony");
		d.doSomething();
		System.out.println("-------------------------");

		System.out.println("Microwave object created");
		d = new Microwave();
		d.doSomething();
		System.out.println("-------------------------");
	
		System.out.println("d instance of Microwave? "+ (d instanceof Microwave));
		System.out.println("d instance of Printer? "+ (d instanceof Printer));
		System.out.println("d instance of TV? "+ (d instanceof TV));
		System.out.println("d instance of Device? "+ (d instanceof Device));
		//System.out.println("d instance of String? "+ (d instanceof String));
		System.out.println("-------------------------");

		Electrician e = new Electrician();
		TV t = new TV();
		t.setName("sony");
		Printer p = new Printer();
		Microwave w = new Microwave();
		e.testDevice(t);
		e.testDevice(p);
		e.testDevice(w);
		//e.testDevice(null);//null pointer exception
		Device dd = new TV();
		dd.setName("sony");
		e.testDevice(d);		
	}
}
