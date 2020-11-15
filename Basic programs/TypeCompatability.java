public class TypeCompatability
{
	public static void main(String[] args)
	{
		int a = 63;
		char d = (char)a;
		System.out.println(d);
		char c = 'X';
		int e = 63;
		char f = (char)e;
		System.out.println(f);
		double aa = 10/0.0; // you will have to comment this after testing
		double dd = 10.0/0.0;
		float ff = 10.0f/0.0f;
		double ddd = 10.0/0;
		double aaa = 10/0.0;

		System.out.println(aa);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(ddd);
		System.out.println(aaa);
		byte b1=100+100;
		//System.out.println(b1); TypeCompatability.java:23: error: incompatible types: possible lossy conversion from int to byte
		byte b1=(byte)100+100;

	}
}
