package uttara.solutions.exception;

public class Question2_StackOverFlow {

	public static void main(String[] args) {
/*-------------------Out of stack memory Error----------------------------------------*/
		
		try {
			main(null);   // calling main recursively..
		} 
		
		catch (StackOverflowError so) {
			System.out.println("out of stack memory Error-------->");
			so.printStackTrace();
			
		}
	}

}
