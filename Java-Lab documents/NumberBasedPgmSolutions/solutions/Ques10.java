//10)WAP to identity the LCM of 2 int numbers!

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter 1st number");
		   int x=sc.nextInt();
		   System.out.println("Enter 2nd number");
		   int y=sc.nextInt();


		   int a=x>y?x:y;     // using Terenary operator...   here larger value is stored in a;
		   while(true)
		   {
			   if(a%x==0 && a%y==0)
			   {
				   break;
			   }
			   a++;
		   }
		   System.out.println("Lcm of given two numbers is = "+a);




	}

}
