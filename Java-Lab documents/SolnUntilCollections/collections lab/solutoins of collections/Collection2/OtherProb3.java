/* Test how to sort Strings based on length*/

package uttara.solutions.Collection2;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class OtherProb3 {

	public static void main(String[] args) {
	   Set <String>s=new TreeSet<String>();
	      s.add("hi");
	      s.add("hello");
	      s.add("how");
	      s.add("areeeeee");
	      s.add("youu");

	      System.out.println("Before Sorting--> "+s);
	      StrngLengthComp slc=new  StrngLengthComp();   // creating Object...   Check in OtherProb7 .java class..
	      Set <String>s1=new TreeSet<String>(slc);
	      s1.add("hi");
	      s1.add("hello");
	      s1.add("how");
	      s1.add("areeeeee");
	      s1.add("youu");

	      System.out.println("After Sorting--> "+s1);

	}

}
