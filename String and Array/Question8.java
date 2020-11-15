/* 8) WAP in main() to test Math.sqrt(), Math.cbrt(), Math.random(),
Math.pow() usage. See TestMath.java for sample code. */

public class Question8
{
	public static void main(String[] args)
	{
	double a = Math.sqrt(4);
	double b = Math.sqrt(9);
	double c = Math.cbrt(9);
	double d = Math.cbrt(4);
	double e = Math.pow(2,3);
	double f = Math.random();
	System.out.println("sqrt of 4 "+a);
	System.out.println("sqrt of 9 "+b);
	System.out.println("cbrt of 9 "+c);
	System.out.println("cbrt of 4 "+d);
	System.out.println("pow of 2,3 "+e);
	System.out.println("random "+f);

	}
}
