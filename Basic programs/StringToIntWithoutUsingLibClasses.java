/* 4) *Challenge problem* Build a method to accept a string and parse it to an int
without using library parse functions! */
public class StringToIntWithoutUsingLibClasses
{
	public static void main(String[] args)
	{
		convertingStringToInt("741");
	}
	public static void convertingStringToInt(String s)
	{
		char[] cr = s.toCharArray();
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = cr.length-1; i>=0; i--)
		{
			int d = 0;
			for(int j=48; j<=cr[i]; j++)
			{
				if(j==i)
				{
					break;+
				}
				d++;
			}
			System.out.println(d);
			d = d-1;
			a = d*b;
			c = c+a;
			b = b*10;
		}
		System.out.println(c);
	}
}
