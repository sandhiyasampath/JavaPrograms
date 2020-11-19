/* 0) Create a Duck. A Duck has a tailSize (int). A Duck can swim.
When you ask a Duck to swim, it says so (print to monitor). Design
and test Duck class usage as we did for Hippo. Create 2 Duck objects in
tester class (TestDuck->main()), with 2 references pointing to it (lets say
d1,d2). Set the tailSize states to 10 and 20. Invoke d1.swim() &
d2.swim(). Compile, run and test your understanding so far. Now make
d1.size = d2.size. SOP d1.size and d2.size to monitor. What has
changed and why? Now make d1.size = 30. SOP d1.size and d2.size to
monitor. What has changed and why? Now make d1=d2. SOP d1.size
and d2.size to monitor. What has changed and why? Now make
d1=d2=null. Can you access any of the 2 objects now? Now do d1= new
Duck(); How many objects are reachable? Do you understand the
answers to all the questions? If not, please ask. */

public class Duck
{
	private int tailSize;
	public void setTailSize(int size)
	{
		if(size>0)
		{
			tailSize=size;
		}
		else
		{
			System.out.println("please give a valid tailsize");
		}
	} 
	public int getTailSize()
	{
		return tailSize;
	}
	public void swim()
	{
		System.out.println("i am the duck  swiming and my tail size is "+tailSize);
	}
}
class TestDuck
{
	public static void main(String[] args)
	{
		Duck d1 = new Duck();
		d1.setTailSize(10);
		d1.swim();
		Duck d2 = new Duck();
		d2.setTailSize(20);
		d2.swim();
		d1 = d2;
		System.out.println("d1.size = "+d1.getTailSize() );
		System.out.println("d2.size = "+d2.getTailSize() );
		
	}
}
