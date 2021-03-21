package inheritence;

public class Device {
 //private String name;//very much subclasses can access this variable by using setters and getters
   String name;
public Device(String name) {
	super();
	this.name = name;
	System.out.println("im in device parameterised constructor");
}
public Device() {
	
	System.out.println("im in device no-argument constructor");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void dosomething()
{
	System.out.println("shouting its name"+"  "+name);
}
}
