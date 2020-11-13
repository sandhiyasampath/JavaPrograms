/* f) An Account has a balance (double) and can be used to checkBalance (return the balance), deposit (add to the balance by taking in adouble), withdraw (reduces the balance). BankAccount is an account.A BankAccount will have a maxBalance (balance should not go higher
than this) and minBalance (balance should not go lower than this).CreditCardAccount is an Account as well. In CCA, there is a minBal-
ance that can be negative. A Person has a Account (only 1), a nameand can be asked to buy item (given a string name and double
amount). When asked to buy an item, the person will first check thebalance in the account, then withdraw as much is required to buy the
item and SOPs it. A Person can be asked to debit money as well bypassing a double amount which he will deposit into the account he is
linked with. Which type of an Account should a Person be linked with?Should we hardcode? How to create the Person class in such a way
that a Person object can be linked to either of the accounts. Create 2 Person objects with different accounts and see how they behave. This
is an important problem. */
public class Account
{
	private double balance;
	public void checkBalance()
	{
	}
	public void withdraw()
	{
	}
	public void deposit()
	{
	}
}
class BankAccount extends Account
{
	public static final MAX_BALANCE;
}
	
