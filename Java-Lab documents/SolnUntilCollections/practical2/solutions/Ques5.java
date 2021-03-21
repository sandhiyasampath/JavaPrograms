//5) WAP to test whether an int is a power of 2 !

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your number");
		   int k=sc.nextInt();
		   int val=1;
		   boolean b=false;
		   while(k>val)
		   {
			   val=val*2;
			   if(val==k)
			   {
				  b=true;
				   break;
			   }

		}
		   if(b)
		   {
			   System.out.println("power of 2");
		   }
		   else
			   System.out.println("Not a power of 2");


	}

}
