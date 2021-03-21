/*Design a Student class. A student has a name, id and age. Create the
student class with overridden equals(), hashCode() and toString() and implement natural
ordering by implementing Comparable.
In tester class, create 5 student objects with different state and one more with same
state as the first object. Add the 5 to an ArrayList, HashSet, LinkedHashSet, TreeSet (one
at a time) and then iterate over the collection and print the results. Are you now able to
understand how the collection implementations work differently even though same
methods are exposed?*/
package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question5 {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		Set<Student> l1=new HashSet<Student>();
		Set<Student> l2=new TreeSet<Student>();
		Set<Student> l3=new LinkedHashSet<Student>();
		Student s1 = new Student("loki", 1, 22);

		Student s2 = new Student("arun", 1, 22);

		Student s3 = new Student("suma", 1, 22);

		Student s4 = new Student("chandu", 1, 22);

		Student s5 = new Student("soni", 1, 22);

		Student s6 = new Student("loki", 1, 22);




		/*...............Elements of arraylist..............*/
//displayed how we inserted
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		Iterator i1=l.iterator();
		while(i1.hasNext())
		{
			System.out.println("elements of arraylist are"+".........>"+i1.next());
		}
		/*......................Elements of Hashset.....................*/

	//elements are displayed randomly
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		for (Student student : l1) {
			System.out.println("elements of hashset"+"..........>"+student);

		}
/*......................Elements of Treeset.....................*/

		//elements will be displayed sortingly
		l2.add(s1);
		l2.add(s2);
		l2.add(s3);
		l2.add(s4);
		l2.add(s5);
		for (Student student : l2) {
			System.out.println("elements of hashset"+"..........>"+student);
		}
/*......................Elements of Linkedhashset.....................*/
		//elements will be displayed as how we are inserted

		l3.add(s1);
		l3.add(s2);
		l3.add(s3);
		l3.add(s4);
		l3.add(s5);
		for (Student student : l2) {
			System.out.println("elements of hashset"+"..........>"+student);




	}

}
}
