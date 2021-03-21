/*Code a Person class. Create 2 instance variables, one String name and
one int height. Create a parameterized constructor. Create a tester class,
create 2 person objects and compare the two using object identity check
and object equality checks
Check what is printed and why? Now in Person class, override equals() as
discussed. Check the test class execution and observe the output.
Now in main(), print the reference of p1 and see what is shown to the
monitor as output. Then override toString() in Person. Re-execute the
main() and see if the printing of reference has changed.
How to override equals()?*/

package uttara.solutions.Collection1;

public class Question2 {

	public static void main(String[] args) {
		Person p1=new Person("loki",10);
		Person p2=new Person("loki",10);

		/*System.out.println(p1==p2);
		System.out.println(p1.equals(p2))*/;//this is our own class hence we should override equals


		System.out.println(p1.equals(p2));//returns true because overriding equals method
		//System.out.println(p1);//it will not print the states of person to do that need to override tostring method
		System.out.println(p1);
	}

}
