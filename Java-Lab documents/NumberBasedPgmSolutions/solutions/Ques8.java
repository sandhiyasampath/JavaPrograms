//8) WAP to generate n number of fibonacci sequence, given n!

package uttara.solutions.prac3;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your number");
		   int k=sc.nextInt();
		   int[] arr=new int[k];
		   arr[0]=0;
		   arr[1]=1;
		   for(int i=2;i<arr.length;i++)
		   {
			   arr[i]=arr[i-1]+arr[i-2];
		   }

		   System.out.println("Fibonacci series for given num is");
		   for(int m:arr)
		   {
			   System.out.print(m+" ");
		   }
	}

}
