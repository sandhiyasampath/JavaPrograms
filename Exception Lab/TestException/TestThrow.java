package com.java.Testexception;

public class TestThrow {
	public static void main(String[] args) {
		try
		{
			System.out.println("going to use throws");
			if(1==1)
				throw new MyException("null pointer MyException");
		}
		catch(Exception e) {
			System.out.println("in main()->catch() msg = "+e.getMessage());
			e.printStackTrace();
		}
	}
}
class MyException extends Exception{
	public MyException() {
		
	}
	public MyException(String s) {
		super(s);
	}
	
}
