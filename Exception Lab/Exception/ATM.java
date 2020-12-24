package com.java.exception;

public class ATM {
	public double withdraw(Card c,double amt) throws NotEnoughBalanceException{
		if(c==null)
			throw new IllegalArgumentException("Please insert a card");
		if(amt<0)
			throw new IllegalArgumentException("please withdraw valid amount");
		if(amt>c.getBalance())
			throw new NotEnoughBalanceException("Not enough balance in your card");
		c.setBalance(c.getBalance()-amt);
		return c.getBalance();
			
	}
}
class NotEnoughBalanceException extends Exception {

	public NotEnoughBalanceException() {
		super();
	}

	public NotEnoughBalanceException(String message) {
		super(message);
	}
	
}
