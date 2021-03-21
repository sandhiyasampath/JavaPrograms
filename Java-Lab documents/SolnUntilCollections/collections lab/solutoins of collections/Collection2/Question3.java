/*Create a HashSet. Add vehicle objects to it. Create a new vehicle object with an
earlier created name and engine capacity. Try to add this to the set. Remember this
should not be allowed as it is a duplicate. If it is allowing, why so? invoke hashCode()
method on both the objects and SOP the returned values. Are they the same? Now do
you understand why set is allowing duplicates?
Override hashCode() method in Vehicle class and see if the same behaviour still persists
in the tester class. Put SOPs in equals() and hashCode() so you understand the control
flow.*/
package uttara.solutions.Collection2;

import java.util.HashSet;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {
		Set<Vehicle> s=new HashSet<Vehicle>();
		Vehicle v=new Vehicle("BULLET",100);
		Vehicle v1=new Vehicle("BULLET",100);
		s.add(v);
		s.add(v1);
		System.out.println("the contents of set"+"..........>"+s);//when we dont override hashcode it will allow duplicates because it may generate different bucket number thogh we add same vehicle contents
		System.out.println(v.hashCode());
		System.out.println(v1.hashCode());

	}

}
