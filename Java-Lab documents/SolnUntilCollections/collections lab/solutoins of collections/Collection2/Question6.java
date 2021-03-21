/*There are Songs. Every Song has a name, length, singer. Create Song class with all
best practices. Implement natural ordering to compare songs by length. Test by adding
Song object references into TreeSet and then in a List with duplicates and sort them
using Collections.sort(li). Go through TestSongSorting.java for this.*/
package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question6 {

	public static void main(String[] args) {
		Set<Songs> s=new TreeSet<Songs>();
		List<Songs> e=new ArrayList<Songs>();
		Singer s1=new Singer();
		Songs s4=new Songs("kuch kuch",100,s1);
		Songs s3=new Songs("kuch kuch",100,s1);
		Songs s5=new Songs("jaldi jarko",30,s1);
		s.add(s5);
		s.add(s4);
		s.add(s3);

		System.out.println("contents of set"+".........>"+s);
		e.add(s5);
		e.add(s4);
		e.add(s3);
		Collections.sort(e);
		System.out.println("contents of list"+"...........>"+e);
	}

}
