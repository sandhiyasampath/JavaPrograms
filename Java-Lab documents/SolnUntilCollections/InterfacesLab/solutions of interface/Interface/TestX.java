/*Create a class X. Create an int field a and assign 10 to it.
Create an instance initializer and put in SOP("in inst init 1 a = "+a);
and change a value to 20.
Create another instance initializer and put in SOP("in inst init 2 a = "+a);
and change a value to 30.
Create a no-arg constructor, print value of a and then assign 40 to it.
In a Tester class, in main()-> create object of X and then print obj.a
to the monitor.
Do you understand how the initialisation is happening?
Now add a static variable in X named b = 15. Create 2 static init where
you print the value of b and change them like earlier. Add printing of
X.b in Tester class and then run it. Do you understand now how the
initialisation is occuring. Create one more object of X and see if
the static initializers are getting fired.
Now create a subclass of X named Y with same class defn (copy paste)
except change the name of var to c and d and SOPs to indicate Y class.
Now in Tester class, create object of Y. Think what should be the
order of execution of init and constructors. Verify if that is correct.
Ask doubts if you have any.*/

package uttara.solutions.Interface;

public class TestX {

	public static void main(String[] args) {
		X obj= new X();
		System.out.println( obj.a);


		Y obj2= new Y();// we c the parent calss X instance block and constructor SOP first and later the Y class
		//where as static variables will create only one copy
		System.out.println(obj2.c);
	}

}
