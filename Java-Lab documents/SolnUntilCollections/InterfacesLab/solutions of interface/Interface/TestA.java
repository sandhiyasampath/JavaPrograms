/*Create a class A. Create a final int p variable in it. Compile it without
assigning any value. Now use a inst initalizer to assign a value and
compile. Then in a tester class, create object and try to modify obj.p
and see if you can do so. Then remove the inst init and then create
a parameterized constructor where you accept an int and assign it
to p. Now in tester class, create object by passing in an int to constr
and verify if object has the assigned int value.
Create a public static final int R = 5. See if you can print the value
directly in main(). Can you modify the value?*/
package uttara.solutions.Interface;

public class TestA {

	public static void main(String[] args) {
	//A a= new A();
	//a.p=10;// The final field A.p cannot be assigned

	A a1= new A(67);

	//a1.R=8;//we cant change the static final variable

	}

}
