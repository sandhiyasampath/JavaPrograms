package uttara.solutions.prac3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter 1st number");
		   int x=sc.nextInt();
		   System.out.println("Enter 2nd number");
		   int count=0;
		   int y=sc.nextInt();
		  String temp1=String.valueOf(x);
		  String temp2=String.valueOf(y);
		  
		 
		  int[] arr1=new int[temp1.length()];
		  int[] arr2=new int[temp2.length()];
		  
		 
		   while(x>0&&y>0)
		   {
			   
			   int dig1=x%10;
			   int dig2=y%10;
			   arr1[count]=dig1;
			   arr2[count]=dig2;
			    x=x/10;
			   y=y/10;
			   count++;
			}
		   System.out.println(count);
		  Arrays.sort(arr1);
		  Arrays.sort(arr2);
		  String h1=String.valueOf(arr1);
		  String h2=String.valueOf(arr2);
		  if(h1.equals(h2))
		  {
			  System.out.println("both numbers contains the same digits");
		  }
		  else
			  System.out.println("does not contain same digits");
		   

	}

}
