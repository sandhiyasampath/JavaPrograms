/*Code an ATM class with withdraw() that accepts a Card reference and double amount
as parameter. A Card has a account num (String) and balance (double). Implement all
input validation checks and business validation checks in ATM class. Why do you code/
create custom expections?How to?What are checked exceptions? recap…ask doubts!*/
package uttara.solutions.exception;


public class Question8
{
	public static void main(String[] args)
	{

		System.out.println("main()->starting...");
		try
		{
			ATM a = new ATM();
			Card c = new Card("LOKI",5000);

			a.withDraw(c, 6000);//if the amount what we withdraw is greater than actual balance raises custom exception
			System.out.println("after withdrawal in main() c.balance = "+c.getBalance());

		}
		catch(NotEnoughMoneyInCardException t)
		{
			System.out.println("Oops something bad happened msg = "+t.getMessage());
			t.printStackTrace();

		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}


	}

}
//Checked exceptions: are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.



