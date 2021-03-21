//4) WAP to test whether an int is a perfect square !

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your number");
		   int k=sc.nextInt();
		   double d=Math.sqrt(k);

		   if(d==(int)d)
		   {
		   System.out.println("perfect square");
		   }
		   else
			   System.out.println("Not perfect Square");
	}

}
