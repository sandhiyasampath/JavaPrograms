/*10) Consider an int input (for ex 100). Using << and >>, multiply/divide the number by 2, 4,*/
public class LeftAndRightShift
{
	public static void main(String[] args)
	{
		usingShift(8);
	}
	public static void usingShift(int num)
	{
		int n1=num<<1;
		int n2=num<<2;
		int n3=num>>1;
		int n4=num>>2;
		System.out.println("number multipled by 2 = "+n1+" number multipled by 4 ="+n2);
		System.out.println("number divided by 2 = "+n3+" number divided by 4 ="+n4);
	}
}
