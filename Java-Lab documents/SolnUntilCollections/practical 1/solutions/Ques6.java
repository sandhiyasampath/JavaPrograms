//6) Print all even numbers from 1 to 100 to the monitor!

package uttara.solutions.prac1;

public class Ques6 {

	public static void main(String[] args) {
		System.out.println("Even numbers between 1 to 100");
		for(int i=1;i<=100;i++)
		{
			if((i&1)==0)            // you can use  (i%2==0) also here...
			{
				System.out.println(i);
			}

		}
	}
}
