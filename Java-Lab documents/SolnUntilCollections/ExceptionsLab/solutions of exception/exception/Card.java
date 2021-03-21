package uttara.solutions.exception;

public class Card {
 String accountnum;
 double balance;
	
	public Card(String accountnum, double balance) {
		super();
		this.accountnum = accountnum;
		this.balance = balance;
	}

	
	public double getBalance()
	{
		return balance;	
	}

}
