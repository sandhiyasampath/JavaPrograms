package uttara.solutions.exception;

public class ATM
{
	
	
	public void withDraw(Card c, double amt)throws  NotEnoughMoneyInCardException
	{
		
		if(c == null)
			throw new IllegalArgumentException("Card is null, pass non null card");
		
		if(amt < 0)
			throw new IllegalArgumentException("amt to withdraw cannot be negative");
		
		if(c.balance < amt)//custom exception
			throw new NotEnoughMoneyInCardException("Your card has balance "+c.balance +" which is less than amt "+amt+" that you are trying to withdraw...");
		
		
		c.balance = c.balance - amt;
	}

	
}
//we create custom exceptions because we have custom exceptions that return custom messages, and also extracts cause and location from the stack trace.and when we want to create our own exceptions




