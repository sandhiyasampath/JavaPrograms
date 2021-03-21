//3) WAP to test whether an int num is prime !

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your number");
		   int k=sc.nextInt();
		   boolean b=false;
		   if(k==1)
		   {
			   System.out.println("Your num is Neither Prime nor composite ");
		   }
		   for(int i=2;i<=k/2;i++)
		   {
			   if(k%i==0)
			   {
				   b=true;
				   break;
			   }
		   }
		   if(k!=1)
		   {
		   if(!b)
		   {
			   System.out.println("Your num is prime");
		   }
		   else
			   System.out.println("your num is not prime");
		   }

	}

}
