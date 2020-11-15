/* 7) There are Accounts. Every Account has a number (string), owner
(string) and balance (double). You can withdraw(double amt),
debit(doubt amt) and checkBalance(). When you withdraw, the balance
should reduce accordingly. When you debit, the balance will increase
accordingly. Code an Account class and test it by creating 2 account
objects? How do you stop over withdrawal? */

public class Account
{
	private String acNumber;
	private String ownerName;
	private double balance;
	public void setAcNumber(String s)
	{
		if(s.length()==12)
		{
			acNumber = s;
		}
		else
		{
			System.out.println("please give a valid account number");
		}
	}
	public String getAcNumber()
	{
		return acNumber;
	}
	public void setOwnerName(String s)
	{
		if(s==null || s=="null" || s.length()==0)
		{
			System.out.println("Please give a valid name");
		}
		else
		{
			ownerName = s;
		}
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setBalance(double d)
	{
		if(d>0)
		{
			balance = d;
		}
		else
		{
			System.out.println("balance should be ore than zero");
		}
	}
	public double getBalance()
	{
		System.out.println("current account balance "+balance);
		return balance;
	}
	public void withdraw(double amt)
	{
		if(amt<=0)
		{
			System.out.println("please enter valid amount");
		}
		else if(amt>0 && amt<=balance)
		{
			System.out.println("i am the owner "+ownerName+ " withdrawed amd = "+amt);
			balance = balance - amt;
		}
	}
	public void debit(double amt)
	{
		if(amt<=0)
		{
			System.out.println("please enter valid amount");
		}
		else if(amt>0 && amt<=balance)
		{
			System.out.println("your account depitted with ammount = "+amt);
			balance = balance - amt;
		}
	}
	public void checkBalance()
	{
		getBalance();
	}
}
class TestAccount
{
	public static void main(String[] args)
	{
		Account a = new Account();
		a.setOwnerName("sandhiya");
		a.setBalance(1000);
		a.withdraw(500);
		a.debit(100);
		a.checkBalance();
		Account a1 = new Account();
		a1.setOwnerName("sandhiya");
		a1.setBalance(100);
		a1.withdraw(200);
		a1.debit(100);
		a1.checkBalance();
	}
}
	
