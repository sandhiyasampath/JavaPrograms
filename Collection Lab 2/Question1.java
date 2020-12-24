import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question1 {
	public static void main(String[] args) {
		Vehicle p1 = new Vehicle("royal",3100);
		Vehicle p2 = new Vehicle("r15",1500);
		Vehicle p3 = new Vehicle("honda",2000);
		Vehicle p4 = new Vehicle("royal",3100);
		List<Vehicle> v = new ArrayList<Vehicle>();
		System.out.println(v.add(p1));
		System.out.println(v.add(p2));
		System.out.println(v.add(p3));
		System.out.println(v.add(p4));
		
	/*	System.out.println("--------------------------");
		Set<Vehicle> v1 = new HashSet<Vehicle>();
		System.out.println(v1.add(p1));
		System.out.println(v1.add(p2));
		System.out.println(v1.add(p3));
		System.out.println(v1.add(p4)); */
		
		System.out.println("--------------------------");
		Set<Vehicle> v2 = new TreeSet<Vehicle>();
		System.out.println(v2.add(p1));
		System.out.println(v2.add(p2));
		System.out.println(v2.add(p3));
		System.out.println(v2.add(p4));
		for(Vehicle vel:v2) {
			System.out.println(vel);
		}

	}
}
