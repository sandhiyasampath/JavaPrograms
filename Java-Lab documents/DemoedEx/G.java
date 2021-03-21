interface I1
{
	void m1();
}
interface I2
{
	void m1();
	void m2();
}
class W implements I1,I2
{
	public void m1()
	{
		System.out.println("in W`s m1()");	
	}
	public void m2()
	{
		System.out.println("in W`s m2()");	
	}
	
}
class V extends W implements I1,I2
{
	
}
abstract class U implements I2
{
	public void m1()
	{
		System.out.println("in U`s m1()");	
	}
}
class O extends U implements I1
{
	public void m2()
	{
		System.out.println("in O`s m2()");	
	}
}

public class G
{
	public static void main(String[] args)
	{
		
		
		
	}
	
	
}




