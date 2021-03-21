/*WAP to accept 1 int number and another a digit (given also as an int). Return how
manes time the second parameter occurs in the first number. Ex: 2224, 2 -> 2 occurs 3
times*/
package uttara.solutions.prac3;

public class Question18 {

	public static void main(String[] args) {

		int num=12234526;
		int dig=2;
		System.out.println("The number "+dig+" occurs "+count_num(num, dig)+" in "+num);
	}

	public static int count_num(int num,int dig)
	{
	    int count = 0;


	    while (num > 0)
	    {
	        if (num%10 == dig)
	        {
	        	count++;
	        }
	        num=num/10;
	    }

	    return count;
	}
}
