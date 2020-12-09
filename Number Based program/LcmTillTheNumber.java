//first find the LCM of first two number,nest to find lcm for first num to use lcm of that two num and third num
public class LcmTillTheNumber
{
	public static void main(String[] args)
	{
		System.out.println(lcm(10));
	}
	public static int gcd(int num1,int num2)
	{
		if(num1%num2 !=0)
		return gcd(num2,num1%num2);
		else
		return num2;
	}
	public static int lcm(int num)
	{
		int ans = 1;
		for(int i = 1; i<=num; i++)
		ans = (ans * i)/(gcd(ans,i));
		return ans;
	}
}
	
