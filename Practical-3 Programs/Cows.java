/* 1) There are Cows. A Cow has a name and can moo. When you ask a
Cow to moo, it shouts out its name. Design a class for Cow and the
tester code. After testing if cows work correctly, create 2 references and
then point to same object. Verify what happens if you change the state
of the object using one ref when you invoke behaviour using the second.Cow
String name;
public void moo()
{
SOP("I am cow and I am moo mooing..."+name);
}
(See example code Cow.java and TestCow.java. Code on your own after
understanding the same). */

public class Cows
{
	private String name;
	public void setName(String n1)
	{
		if(n1==null || n1.length()==0 || n1=="null")
		{
			System.out.println(" please give a valid name");
		}
		else
		{
			name=n1;
		}
	}
	public String getName()
	{
		return name;
	}
	public void moo()
	{
		System.out.println(" i am the cow "+name+" moo moo moo");
	}
}
class TestCow
{
	public static void main(String[] args)
	{
		Cows c1 = new Cows();
		c1.setName("ramu");
		c1.moo();
		Cows c2 = c1;
		c2.setName ("beemu");
		c1.moo();
		c2.moo();
	}
}
