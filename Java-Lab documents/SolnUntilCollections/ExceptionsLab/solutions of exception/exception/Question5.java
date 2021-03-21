/*In main(), test the throw keyword usage.*/
package uttara.solutions.exception;


public class Question5 {

	public static void main(String[] args) {
		try
		{
		System.out.println("going to use of throw");
		if(1==1)
		{
		throw new NullPointerException("null pointer throwing");
		}
		System.out.println("after using throw");//unreachable code
		}
		catch(Exception e)
		{
		System.out.println("null point");
		e.printStackTrace();
		}

		/*try
		{
		System.out.println("going to use of throw");
		if(1==1)
		throw new MyException("this is my exception");//no need of custom checked exception in this

		}
		catch(Exception e)
		{
		System.out.println("null point");
		e.printStackTrace();
		}*/

	}

}
