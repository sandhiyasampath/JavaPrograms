/*There are vehicles. Vehicle has a name and an engine capacity [like 100bhp, 200bhp
etc => take as int]. Generate setter/getter methods and a parameterised constructor. A
vehicle is equal to another if both the name and capacity are the same. Without
overriding equals(), verify in TestVehicle->main() by creating 2 Vehicle objects with same
state whether object equality check works.
Then override equals() method in Vehicle to implement this functionality (do not use
auto generate but code the method yourself). Put SOP in equals() with something like
SOP(“Vehicle->equals()->testing…”) and concat the states of the two objects into sop. In
a tester class, create two vehicle objects, invoke equals on it and find out whether
object equality check is working correctly. Create an ArrayList object, add first vehicle
ref and check if the contains(second ref) returns true or not => it should return true as
equality check would be used to search. Verify if the SOP in equals() is being called or
not.*/

package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle("BULLET",100);
		Vehicle v1=new Vehicle("BULLET",100);
		//System.out.println("WITHOUT OVERRIDING EQUALS"+v.equals(v1));//returns false because this is our own class we need to override equals
		System.out.println("AFTER OVERRIDING EQUALS"+"..............>"+v.equals(v1));//RETURS TRUE
		List l=new ArrayList();
		l.add(v);
		l.add(v1);
		System.out.println(l.contains(v));//it will call the sop of equals

	}

}
