/* 5) There are Dogs. Every Dog has a name and a size. Dogs can bark. If
the size of the dog is > 10, it "meows". If the size <=10, then as many
times, it "bow wow" its name to the monitor. Test Dog design. After
testing the same, make the size variable private and then add setSize()/
getSize() method. See how this impacts your tester class. What check
should you add in bark() to ensure that even if the class user has not set
size and invokes bark, he gets scolded with a message? */

public class Dog
{
	private String name;
	private int size;
	public void setName(String s)
	{
		if(s=="null" || s==null || s.length()==0)
		{
			System.out.println("Give a valid name");
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
	public void setSize(int a)
	{
		if(a<0)
		{
			System.out.println("giva a valid size");
		}
		else
		{
			size = a;
		}
	}
	public int getSize()
	{
		return size;
	}
	public void bark()
	{
		if(size>10)
		{
			for(int i=1; i<=size; i++)
			{
				System.out.println("meows " + name);
			}
		}
		if(size<=10)
		{
			for(int j=1; j<=size; j++)
			{
				System.out.println("bowww wowwww "+name);
			}
		}
	}
}
class TestDog
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
		d1.setName("ramu");
		d1.setSize(11);
		d1.bark();
		Dog d2 = new Dog();
		d2.setName("beemu");
		d2.setSize(3);
		d2.bark();
	}
}
		
		
