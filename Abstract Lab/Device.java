/* Create an abstract class Device. Create a Device no-arg constructor with SOP.Now in TestDevice, create main(). Try to test if you can
create an object of Device. Can you do so? Now add a static method to Device with an SOP. Now see if you can call this from TestDevice. 
Now add a doSomething() instance method which is abstract.Now create a subclass of Device called Phone. A Phone
can be used to call a given number (String). How a phone calls, we do not know. What will you mark call()as? Is it still mandatory to override doSomething() in Phone? Check. Now create a MobilePhone that IS-A Phone.How many methods you will have to override in this class
for compilation to succeed. Now create a Person with a name and use() method that accepts a Device d as paramter.The Person will make the device to doSomething when askedto use (meaning in use(Device d), invoke d.doSomething()).Test it by passing a MobilePhone object and verify which implementations are picked up. */
package Abstractlab;
public abstract class Device
{
	public Device()
	{
		System.out.println("in device class no arg contructor");
	}
	public abstract void doSomething();	
	public static void testMethod()
	{
		System.out.println("in abstract device class static method executted");
	}	
}
abstract class Phone extends Device
{
	public Phone()
	{
		System.out.println("in Phone class no arg contructor");
	}
	public abstract void call(String s);
}
class MobilePhone extends Phone
{
	public MobilePhone()
	{
		System.out.println("in MobilePhone class no arg contructor");
	}
	public void doSomething()
	{
		System.out.println("i am a MobilePhone doing something");
	}	
	public void call(String s)
	{
		System.out.println("in MobilePhone calling number "+s);
	}
}
class TestDevice
{
	public static void main(String[] args)
	{
		Device.testMethod(); 
		Person p = new Person();
		MobilePhone m = new MobilePhone();
		p.use(m);
	}
}
class Person
{
	String name;
	public void use(Device d)
	{
		d.doSomething();
	}
}
