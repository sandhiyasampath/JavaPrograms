/*Create a class A with inst variable String name = "A" and an SOP in param
constructor.
Create a class B which extends A and also has String name = "B" and
an SOP in its constr.
In tester class, create object of B and verify what constructors are getting
fired. Using ref of B, point to the object and print the name value.
Also using a ref of A, point to the same object and print name value.
Add a method in A named print(){ SOP("in A "+name)};
Invoke print() using both the ref in tester class and verify what happens.
Now override the print() method in B with print(){SOP("in B "+name)};
Recompile and run the tester class. Are you understanding what is
happening? Type of ref dictates which redeclared/hidden variable is
picked. Type of object dictates which inst method body is picked.
Now make both the method and variable as static in both the classe.
Recompile and run and verify how statics work when redeclared.
Ask queries if you have any doubts.*/


public class TestA1 {

	public static void main(String[] args) {

		B1 obj2 = new B1("b1");
		System.out.println(obj2.name);
		A1 a=obj2;
		System.out.println(a.name);

		obj2.print();
		a.print();

	}

}
