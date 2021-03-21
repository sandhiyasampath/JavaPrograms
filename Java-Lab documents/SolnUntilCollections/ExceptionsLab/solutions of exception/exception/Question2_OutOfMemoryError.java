package uttara.solutions.exception;

public class Question2_OutOfMemoryError {
	

	public static void main(String[] args) {
		try
		{
		
			for(int y=0;y<Integer.MAX_VALUE;y++)
			{
				int[] arr=new int[Integer.MAX_VALUE];
			}
				
		}
		catch(OutOfMemoryError om)
		{
			System.out.println("Out Of Memory Error----------------->");
		}

	}

}
