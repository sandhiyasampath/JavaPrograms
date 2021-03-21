/*Test how to use a HashSet and TreeSet with strings*/

package uttara.solutions.Collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OtherProb1 {

	public static void main(String[] args) {
		//HashSet Usage..
		Set <String>hashSet = new HashSet<String>();   // using generics
	      hashSet.add("set1");
	      hashSet.add("set2");
	      hashSet.add("set3");
	      hashSet.add("set4");
	      System.out.println(hashSet);

	      // Tree Set....
	      TreeSet <String>treeSet = new TreeSet<String>();   // using generics
	      treeSet.add("1");
	      treeSet.add("2");
	      treeSet.add("3");
	      treeSet.add("4");
	      System.out.println(treeSet);

	}

}
