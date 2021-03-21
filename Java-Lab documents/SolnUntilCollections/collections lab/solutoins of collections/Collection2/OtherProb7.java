/* Test how to sort List of strings, based on length*/

package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OtherProb7 {

	public static void main(String[] args) {
		 List <String>li= new ArrayList<String>();
	      li.add("hi");
	      li.add("hello");
	      li.add("how");
	      li.add("are");
	      li.add("you");

	      System.out.println("Before Sorting--> "+li);
	      StrngLengthComp slc=new  StrngLengthComp();   // creating Object...
	      Collections.sort(li,slc);
	      System.out.println("After Sorting--> "+li);



	}

}



class StrngLengthComp implements Comparator<String>   // we have to use Comparator here....
{
	public int compare(String o1,String o2)
	{
		return o1.length()-o2.length();

	}



}
