/*1) Build an interface Pet
public interface Pet
{
public void play();
}
and save it in Pet.java.
Compile it. Now try to add a constructor and see if compilation succeeds. Try to add
a method with body and see if it compiles. Try to add a final method and see if it
compiles. Add a variable without a value and see if compiles.
Change to:
public interface Pet
{
int X = 10;
String NAME = “Pingu";
public void play();
}
Compile it.
Then create TestPet.java with:
...
main(..)
{
System.out.println(Pet.NAME); // with it print the name or not, check.
Pet p = new Pet(); // will this compile? check.
}
Then create Doggy.java:
public class Doggy implements Pet
{
public void barky()
{
SOP(“woof woof”);
}
}
Check without overriding any method, with the class compile. Then override the
method play() with SOP. Check if it compiles.
In main(),
Pet p = new Doggy();
what methods you can invoke using p and why? check and run.*/
package InterfaceLab;
public interface Pet
{
	int X = 20; 
	String NAME = "Pingu";
	public void play();
}
class TestPet
{
	public static void main(String[] args)
	{
		System.out.println(Pet.X);
		System.out.println(Pet.NAME);
		// Pet p = new Pet(); interface heater marked abstract defaultly by compiler so you can,t create object
		Pet p = new Doggy();
		Doggy d = (Doggy)p;
		d.barky();
		d.play();
	}
}
class Doggy implements Pet
{
	public void barky()
	{
		System.out.println(" dpggy barking wooff wooff");
	}
	public void play()
	{
		System.out.println(" dpggy playing");
	}
}
	
