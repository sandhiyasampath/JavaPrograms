/* 9) WAP to generate 10 random strings with 6 length each with each containing random
digits. */

public class Random
{
	public static void main(String[] args)
	{
		String s = "123456789";
		char[] ir = new char[6];
		for(int j=1; j<=10; j++)
		{
			for(int i = 0; i<ir.length; i++)
			{
				int c = (int)(Math.random()*ir.length);
				char a = s.charAt(c);
				ir[i] = a;
			}
		s = new String(ir);
		System.out.println(s);
		}

	}
}
