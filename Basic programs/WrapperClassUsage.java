/* 6) Test wrapper class usage => do you know how to convert a primitive into an object &
back?, do you know how to access constants in Wrapper classes? Test the working of
parsing & Character static methods. */

public class WrapperClassUsage
{
	public static void main(String[] args)
	{
		int x=10;
		float f = 10.4f;
		//boxing Premetive to object
		Integer iob = new Integer(x);
		Float fob = new Float(f);
		//object to premetive
		int y = iob.intValue();
		float g = fob.floatValue();
		//Auto boxing
		Integer i = 10;
		//Auto unBoxing
		int z = i ;
		System.out.println(Integer.MAX_VALUE);
		String s = "1254";
		String s2 = "12345.24f";
		int a = Integer.parseInt(s);
		float b = Float.parseFloat(s2);
		System.out.println(a);
		System.out.println(b);
		//character wrapper classes
		char c = 'a';
		boolean d = Character.isDigit(c);
		char e = Character.toUpperCase(c);
		char h = Character.toLowerCase(c);
		boolean j = Character.isLetter(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(h);
		System.out.println(j);
		
	}
}

