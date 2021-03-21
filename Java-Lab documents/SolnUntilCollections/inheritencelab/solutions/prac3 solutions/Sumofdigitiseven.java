/*8)WAP to add the sum of the digits of a given int input and then test
whether it is even.*/
public class Sumofdigitiseven {
	public static void isEven(int n)
	{int sum=0;
	int r;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(sum%2==0)
		{
			System.out.println("it is even number");
		}
		else
			System.out.println("it is  not an even number");
			
	}

	public static void main(String[] args) {
		Sumofdigitiseven.isEven(2987);

	}

}
