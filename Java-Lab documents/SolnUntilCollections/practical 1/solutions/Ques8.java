//8) Print "even" and the number or "odd" and the number between 1-100!

package uttara.solutions.prac1;

public class Ques8 {

	public static void main(String[] args) {
		System.out.println("odd and even numbers between 1 to 100");
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd "+i);
			}
			else
			{
			System.out.println("even "+i);
			}

		}
	}

}
