/*To the person class, add a functionality called dance(). It should accept a string type as
parameter. If age of person is > 50 and the type of the dance is “salsa”, then raise a
business custom exception called DanceFailureException. When you throw
DanceFailureException, compile the class. Does it compile? Now add throws clause to the
method dance and see if it compiles. Now compile tester class and see if it compiles. Add
a specific DanceFailureException catch and print the message. Do you understand the
control flow?
*/
package uttara.solutions.exception;

public class Question7 {

	public static void main(String[] args) {
		try
		{
		Person p=new Person("bang",53);  // here I am passing age above 50
		p.dance("salsa");             // and name as salsa......
		}
		catch(DanceFailureException d)
		{
			System.out.println("inside DanceFailure Exception------>");
			d.printStackTrace();
		}

	}

}
