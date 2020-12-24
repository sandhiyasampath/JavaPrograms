package com.java.Testexception;

import com.java.exception.Account;

public class TestAccount {
	public static void main(String[] args) {
		try {
			Account o = new Account();
			//o.setBalance(-127);
			o.setBalance(100);
			o.setOwner("sandhiya");
			System.out.println(o);
			o.setOwner("");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
