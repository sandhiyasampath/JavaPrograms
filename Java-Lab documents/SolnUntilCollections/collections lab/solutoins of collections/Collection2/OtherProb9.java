/* Test how to shuffle a List, how to check frequency
of a repeating element*/
package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class OtherProb9 {

	public static void main(String[] args) {
		List <String>li= new ArrayList<String>();
		Set <String>g=new LinkedHashSet<String>();
	      li.add("hi");
	      li.add("hello");
	      li.add("how");
	      li.add("are");
	      li.add("you");
	      li.add("hello");
	      li.add("how");

	      System.out.println("Before Shuffling --------->"+li);
	      Collections.shuffle(li);
	      System.out.println("After Shuffling --------->"+li);


	      for(String c:li)
	      {
	    	  int y=Collections.frequency(li, c);
	    	String temp=c+" "+y;
	    	 g.add(temp);

	      }
System.out.println(g);
	}

}
