package com.java.exception;

public class Card {
	private String cardNumber;
	private double balance;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		if(cardNumber.length()<10)
			throw new IllegalArgumentException("Card number should be 10 digit");
		else
			this.cardNumber = cardNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance<=0)
			throw new IllegalArgumentException("deposit balance should not be 0 or less than zero");
		this.balance = balance;
	}

}
