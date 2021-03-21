package uttara.solutions.exception;

public class Testfinally {
	/*public int m1()
	{
	int x = 10;
	try
	{
		String s=null;
		System.out.println(s.length()); //raises the nullpointerexception
	System.out.println("in m1() x="+x );//x=10
	return ++x;//10
	
	}
	catch(Exception e)
	{
		String s=null;
		System.out.println(s.length());
	System.out.println("in catch of m1() "+e.getMessage());
	return ++x;
	
	}
	finally
	{
		
	System.out.println("in finally() of m1() x = "+x);//x=11
	return ++x;
	}
	*/
	
	

	
	public int m1()
	{
		
	int x = 10;
	try
	{
		String s=null;
		System.out.println(s.length());
	System.out.println("in m1() x="+x );
	return ++x;
	}
	catch(Exception e)
	{
		String s=null;
		System.out.println(s.length());
	System.out.println("in catch of m1() "+e.getMessage());
	return ++x;
	}
	finally
	{
		String s=null;
		System.out.println(s.length());
	System.out.println("in finally() of m1() x = "+x);
	
	}
	}
}

