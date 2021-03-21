/*Create a TestCollections class with main(). Create an ArrayList object
like this:
Collection col = new ArrayList(); //import package java.util.*;
now invoke basic methods on col collection to test adding, searching,
removing, getting the size, iteration and printing the contents. First add 5-6
strings in ArrayList. Check if add is successful. Add duplicates. SOP the
collection ref. Check whether duplicates are allowed. Create a new String
object with same state as another and check if contains works on
collection. Add many duplicates and try to remove all occurrences
Change ArrayList to LinkedList and see if you get any difference in the
methods working. Then change it to HashSet and check.
Create 2 collections with strings and then invoke addAll(), retainAll() and
removeAll() and verify if you understand how the methods work.*/
package uttara.solutions.Collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {
		Collection<String> col=new ArrayList<String>();
		col.add("loki");
		col.add("arun");
		col.add("chandu");
		col.add("jamuna");
		col.add("chalapathy");
		col.add("xyz");
		col.add("arun");
		col.add("chandu");
		col.add("jamuna");
		System.out.println(col);//because we are adding to list and hence it will allow duplicates
		String s=new String("loki");
		col.add(s);
		System.out.println(col.contains(s));
		Collection<String> col1=new ArrayList<String>();
		col1.addAll(col);
		System.out.println(col1);//adding all the data from one arraylist to another
		col1.removeAll(col);
		System.out.println("removing all the occurences"+".............>"+col1);

		//methods of collections checking
		List l=new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		l.add("six");

		List l1=new ArrayList();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		l1.add("six");
		System.out.println("size of the list is"+l.size());
		l.remove("six");//removing the item six from list
		l.clear();
		System.out.println("after the clearing"+".............>"+l);
		System.out.println("checking with emptyness of the list"+"..........>"+l.isEmpty());
		System.out.println("the contents in list2"+".........>"+l1);
		System.out.println("cheking with emptyness"+".........>"+l1.isEmpty());
		List s1=new ArrayList();
		List s2=new ArrayList();
		s1.add("a");
		s1.add("b");
		s1.add("ab");
		s1.add("ac");
		s1.add("ad");
		System.out.println("list1 items are"+"...........>"+s1);
		s2.addAll(s1);
		s2.add("cd");
		s2.add("nx");
		System.out.println("list1 items are"+"...........>"+s2);
		s2.retainAll(s1);
		System.out.println("after retaining"+"............>"+s2);
		//iterating the contents
		for(String s4:col)
		{
			System.out.println(s4);
		}

		//ArrayList and LinkedList works in same manner
		Set set=new HashSet();
		set.add("allu");
		set.add("mullu");
		set.add("sullu");
		set.add("kallu");
		set.add("allu");
		System.out.println("contents of set as it is not allowing duplicates"+"............>"+set);
		Collection c=new ArrayList();
		Collection c1=new ArrayList();
		c.add("mango");
		c.add("mango");
		c.add("orenge");
		c.add("pineapple");
		c.add("apple");
		c.add("grapes");
		System.out.println("contents of list4"+"..........>"+c);
		c1.addAll(c);
		System.out.println("contents of list4"+"..........>"+c1);

		c1.retainAll(c);
		System.out.println("after retaining"+"..........>"+c1);
		c1.removeAll(c);
		System.out.println("aftter removing"+"..........>"+c1);


	}

}
