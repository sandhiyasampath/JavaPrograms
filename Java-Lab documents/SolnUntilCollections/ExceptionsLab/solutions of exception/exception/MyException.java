package uttara.solutions.exception;
//we call this class as custom checked exception class
public class MyException extends Exception {
	
	public  MyException()
	{
		
	}
	public  MyException(String msg)
	{
		super(msg); //we are passing msg to exception
	}
	

}
