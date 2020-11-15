/*12) Create a byte variable with value 127. Add 10 to it and store in byte. Print the result. Is
the result correct? Why not?*/
public class DataOverLoading
{
	public static void main(String[] args)
	{
		byte b = 127;
		// b = b+10; crosing the limit of what bite cann hold and also byte + byte = int data incompatability
		int c = b +10;
		System.out.println(c);
		System.out.println(2 >> 1);
		System.out.println(6 >> 2);
		System.out.println(-2 >> 1);
		System.out.println(10);
		System.out.println(012);
		System.out.println(0xAB);
		System.out.println( 2 << 1);
		System.out.println(6 << 2);
		System.out.println( -2 << 1);
		int x = 10;
		System.out.println(~x);
		int a = 100;
		System.out.println(~a);
		int z = 10;
		int y = 6;
		System.out.println(z | y);
	}
}
