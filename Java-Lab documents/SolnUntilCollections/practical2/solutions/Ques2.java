//WAP to test whether an int number is even!

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your number");
		   int k=sc.nextInt();
		   if(k%2==0)
		   {
			   System.out.println("Your number is EVEN");
		   }
		   else
			   System.out.println("your number is ODD");

	}

}
