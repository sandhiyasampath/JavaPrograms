
//14) WAP to generate the factorial of a number!

package uttara.solutions.prac3;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer to calculate it's factorial");
	      Scanner in = new Scanner(System.in);

	      int n = in.nextInt();
	      factorial(n);
	}

	public static void factorial(int n)
	{
		int  c, fact = 1;

	      if ( n < 0 )
	         System.out.println("Number should be non-negative.");
	      else
	      {
	         for ( c = 1 ; c <= n ; c++ )
	            fact = fact*c;

	         System.out.println("Factorial of "+n+" is = "+fact);
	      }
	}
}
