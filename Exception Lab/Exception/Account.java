package com.java.exception;

public class Account {
	private double balance;
	private String owner;
	public Account(double balance, String owner) {
		if(owner.length()==0 || owner==null)
			throw new IllegalArgumentException("Please give a valild input");
		if(balance<0)
			throw new IllegalArgumentException();
		this.balance = balance;
		this.owner = owner;
	}
	public Account() {
		
	}
	public Account(String Owner,double balance) {
		if(balance<=0)
			throw new IllegalArgumentException("deposit balance should not be 0 or less than zero");
		this.balance = balance;
		if(owner.length()<10)
			throw new IllegalArgumentException("please give valid OwnerName");
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance<=0)
			throw new IllegalArgumentException("deposit balance should not be 0 or less than zero");
		this.balance = balance;
		
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		if(owner.length()<=0)
			throw new IllegalArgumentException("please give valid OwnerName");
		this.owner = owner;
	}
	public double debit(double amt) throws NotEnoughBalanceInAccountException {
		if(amt<0)
			throw new IllegalArgumentException("please withdraw valid amount");
		if(amt>getBalance())
			throw new NotEnoughBalanceInAccountException("Not enough balance in your card");
		setBalance(getBalance()-amt);
		return getBalance();
			
	}
	public double credit(double amt) {
		if(amt<0)
			throw new IllegalArgumentException("please credit valid amount");
		setBalance(getBalance()+amt);
		return getBalance();
	}
	public double checkBalance() {
		return getBalance();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account a = (Account)obj;
			if(this.owner.equals(a.owner) && this.balance==a.balance)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (owner+balance).hashCode();
	}
	@Override
	public String toString() {
		return "Account : owner = "+owner+" balance = "+balance;
	}
}
class NotEnoughBalanceInAccountException extends Exception {

	public NotEnoughBalanceInAccountException() {
		super();
	}

	public NotEnoughBalanceInAccountException(String message) {
		super(message);
	}
}