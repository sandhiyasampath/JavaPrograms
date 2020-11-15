/* 2) Test wrapper class usage => do you know how to convert a primitive into an
object & back?, do you know how to access constants in Wrapper classes? Test the
working of parsing & Character static methods. */

public class WrapperClassUssage
{
	public static void main(String[] args)
	{
		// boxing premitive to object
		Integer iob1 = new Integer(10);
		System.out.println(iob1);
		// Auto boxing premitive to object
		Integer iob2 = 20;
		System.out.println(iob2);
		// Unboxing object to premetive
		int a1 =iob1.intValue();
		System.out.println(a1);
		// Auto Unboxing object to premetive
		int a2 = iob2;
		System.out.println(a2);
		//accessing constant from wrapper class
		System.out.println(Integer.MAX_VALUE);
		// parsing method in wraper class String to premitive and back
		String s1 = "123456";
		int a3 = Integer.parseInt(s1);
		System.out.println(a3);
		String s2 = String.valueOf(a3);
		System.out.println(s2);
	}
}
		
