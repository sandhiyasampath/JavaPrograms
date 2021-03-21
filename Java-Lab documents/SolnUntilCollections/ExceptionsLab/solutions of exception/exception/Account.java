package uttara.solutions.exception;

import java.math.BigDecimal;

public class Account {
 private BigDecimal balance;
	private String owner;
	
	public Account() {
		super();
		
	}

	public Account(BigDecimal balance, String owner) {
		super();
		int t=balance.intValue();
		if(t<0)
		{
			System.out.println("balance must be +ve");
		}
		else
		{
		this.balance = balance;
		}
		
		if(owner==null||owner.equals(""))
		{
			throw new IllegalArgumentException("Task name should not be blank or null");
		}
		if(owner.split(" ").length>1)
		{
			throw new IllegalArgumentException("multiple words are not allowed");
		}
		else
			
		{
			this.owner = owner;
		}
	}
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		int t=balance.intValue();
		if(t<0)
		{
			System.out.println("balance must be +ve");
		}
		else
		{
		this.balance = balance;
		}
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		if(owner==null||owner.equals(""))
		{
			throw new IllegalArgumentException("Task name should not be blank or null");
		}
		if(owner.split(" ").length>1)
		{
			throw new IllegalArgumentException("multiple words are not allowed");
		}
		else
			
		{
			this.owner = owner;
		}
		
	}
	
	
	public BigDecimal debit(BigDecimal amt) throws  MoneyEllaException
	{
		
		int t=amt.intValue();
		int bal=balance.intValue();
		if(t>bal)
		{
		  throw new MoneyEllaException("Why man want to go for jail???");
		}
		else
		{
			BigDecimal v= balance.subtract(amt);
			this.balance=v;
			return v;
		}
		
		
	}
	public BigDecimal credit(BigDecimal amt) throws CreditProblemException
	{
		int t=amt.intValue();
		if(t<0)
		{
		  throw new CreditProblemException("plz add atleast 1 rupee man!!!!!");
		}
		else
		{
			BigDecimal v= balance.add(amt);
			this.balance=v;
			return v;
		}
		
		
		
}
	public BigDecimal chkBalanace()
	{
		return balance;
	}
	

	

}
