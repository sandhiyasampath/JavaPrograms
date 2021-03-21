/*Add 2 vehicle objects into a TreeSet in tester class. Run it. Do you get an exception?
Why? Make the vehicle class implement Comparable and override compareTo()
method to check engine capacity to decide which vehicle is greater/lesser.
Test this first in a tester class and see which vehicle is greater/lesser. Then add vehicle
objects to a TreeSet. Iterate over the elements and print out the vehicle names. Verify if
the sorting is happening correctly.*/
package uttara.solutions.Collection2;

import java.util.Set;
import java.util.TreeSet;

public class Question4 {


	public static void main(String[] args) {
		Set<Vehicle> s=new TreeSet<Vehicle>();
		Vehicle v=new Vehicle("BULLET",100);
		Vehicle v1=new Vehicle("BULLET",1000);
		s.add(v);
		s.add(v1);

		//System.out.println(s);//get exception because we cant compare the items that are added into it hence we have to implement comparable
		System.out.println(s);

	}

}
