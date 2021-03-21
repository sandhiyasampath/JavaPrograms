/*There are ducks in a pond. Ducks swim. They swim according to their sizes.
Ducks come in sizes chota, bada and biggest which are int values (5, 10, 15) and
are constants (where can you hold constants?).
Provide a constructor in Duck which takes in the int size to store the state of the
duck. When swim
is invoked, they swim fastest, slow, slowest correspondingly.
Keep a count to keep track of the number of duck objects created as well (single
copy variable incremented each time object is created?).
Write a tester class. Create 3 Duck objects with each of the mentioned sizes. Ask
them to swim. Verify if they are swimming as per the sizes. Also try to create a Duck
object by passing in a different int value, there should be an error displayed.
Use the constant name to pass the value into the constructor and not a int value
directly. Print the number of duck objects created as well*/
package uttara.solutions.Interface;

public class TestDuck {

	public static void main(String[] args) {

		Duck d1=new Duck(5);            // for chota duck...
		d1.swim();
		System.out.println(d1.count);
		Duck d2=new Duck(10);           // for bada duck...
		d2.swim();
		System.out.println(d2.count);
		Duck d3=new Duck(15);            // for biggest duck...
		d3.swim();
      System.out.println(d3.count);
      Duck d4=new Duck(60);              // gives error...
      d4.swim();
	}

}
