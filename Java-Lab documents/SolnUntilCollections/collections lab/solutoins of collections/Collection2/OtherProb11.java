/* Take a sentence and a word as input from the user and
a) print how many occurrences you find of an input word in the sentence
b) sort the sentence i) with duplicates ii) without duplicates and print
c) sort the sentence using string length comparison
d) remove all the occurrences of the word from the sentence*/
package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class OtherProb11 {

	public static void main(String[] args) {

		List <String>li= new ArrayList<String>();
		Set<String>s=new LinkedHashSet<String>();


	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Sentence...>");
	 String sen=sc.nextLine();
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("Enter Word----->");
	 String wrd=sc1.next();

	 String[] words=sen.split(" ");
	 for(String h:words)
	 {
		 li.add(h);

	 }
	 int occ=Collections.frequency(li, wrd);
	 System.out.println(occ+" times "+wrd+" present in sentence");

	// sorting using String length comparator....


		StringLengthComp slc=new StringLengthComp();
		Collections.sort(li,slc);
		 String upSen3="";
			for(String h:li)
			{
				 upSen3= upSen3+" "+h;
			}
		System.out.println("Soreted Sentence Based on StringLength Comparator------>"+upSen3);


	 // Sorting

	 Collections.sort(li);
	 String upSen="";
		for(String h:li)
		{
			 upSen= upSen+" "+h;
		}
	 System.out.println("Sorted Sentence--> "+upSen);
	 for(String b:li)
	 {
		 s.add(b);                   // adding to Set to remove Duplicates...
	 }
	 String upSen2="";
	for(String h:s)
	{
		 upSen2= upSen2+" "+h;
	}
	 System.out.println("Sorted Sentence Without Duplicate--> "+upSen2);



	// removing  all the occurences of wrd Frm Sentence,....
	String temp="";
	for(String b:li)
	 {
		if(!b.equals(wrd))
		{
			temp=temp+" "+b;
		}

	 }

	System.out.println("After removing Occurences---> "+temp);



}

}

// String Length Comparator Class.............

class StringLengthComp implements Comparator<String>   // we have to use Comparator here....
{
	public int compare(String o1,String o2)
	{
		return o1.length()-o2.length();

	}



}
