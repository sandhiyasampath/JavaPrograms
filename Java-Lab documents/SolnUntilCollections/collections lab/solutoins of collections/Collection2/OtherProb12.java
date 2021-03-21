/*Given a sentence as input, find the number of occurrences of every word in it and
print it out (using Maps).*/
package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OtherProb12 {

	public static void main(String[] args) {
		List <String>li= new ArrayList<String>();
		Map m=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Sentence...>");
		 String sen=sc.nextLine();

		 String[] words=sen.split(" ");
		 for(String h:words)
		 {
			 li.add(h);

		 }


		for(String temp:li)
		{
		 int occ=Collections.frequency(li, temp);      // showing occurence using map...
		 m.put(temp, occ);
		}
		System.out.println(m);
	}

}
