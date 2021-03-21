/*Accept 2 ints, print the multiplication tables of the smaller number till the second
number times (if 5,2 and given, print 2X1 till 2X5)!*/
package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques1 {
	public static void mult(int x,int y)
	   {
		for(int z=1;z<=y;z++)
		{
		System.out.println(x+"*"+z+"= "+(x*z));
		}

	   }

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter smaller number");
	   int x=sc.nextInt();
	   System.out.println("Enter 2nd number");
	   int y=sc.nextInt();
	   mult(x,y);
	  }

}
