//9) WAP to identity the GCD of 2 int numbers!

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter 1st number");
		   int x=sc.nextInt();
		   System.out.println("Enter 2nd number");
		   int y=sc.nextInt();


		   int a=(x>y)?x:y;     // using Terenary operator...
		   int b=(x<y)?x:y;     // smaller num stored in b


		  int rem=b;

		  while(a%b>0)
		  {
			  rem=a%b;
			  a=b;
	         b=rem;
		   }
		  System.out.println("gcd is "+rem);





	}

}
