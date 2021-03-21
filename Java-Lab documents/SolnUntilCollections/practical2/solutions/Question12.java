//12)WAP to sum the digits in an int input and return it!
package uttara.solutions.prac3;

public class Question12 {

	public static void main(String[] args) {
		System.out.println(sum_digit(1567));
	}

	public static int sum_digit(int num)
	{
		int sum=0,digit;
		while (num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
	}
}
