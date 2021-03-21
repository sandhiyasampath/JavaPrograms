//6) AP to return the number of bits set to 1 in an int input !

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your number");
		   int k=sc.nextInt();
		   int count=0;
		   String m=Integer.toBinaryString(k);    // used to convert Decimal to Binary...
		   for(int i=0;i<m.length();i++)
		   {
			   char c=m.charAt(i);
			   if(c=='1')
			   {
				   count++;
			   }
		   }
		System.out.println("number of bits set to 1 in given int is "+count);
	}

}
