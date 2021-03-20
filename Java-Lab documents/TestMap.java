package com.uttara.coll;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class TestMap {

	public static void main(String[] args) {
		/*
		Map<String,String> sayings = new HashMap<String,String>();
		System.out.println("sayings = "+sayings + " size = "+sayings.size());;
		sayings.put("Sholay", "kitne aadmi they");
		sayings.put("KGF","powerful ppl come from powerful places");
		sayings.put("Kungfu Panda", "There are no accidents");
		sayings.put("DDLJ","palat");
		sayings.put("DCH", "<temp>");
		System.out.println("sayings = "+sayings + " size = "+sayings.size());;
		System.out.println("putting for DCH = "+ sayings.put("DCH", "Dil Chata Hai"));;
		
		System.out.println("value for DCH = "+sayings.get("DCH"));
		
		Map<String,List<String>> words = new TreeMap<String,List<String>>();

     	words.put("box", Arrays.asList(new String[] {"a container","wrapped","to punch"}));
     	words.put("phase", Arrays.asList(new String[] {"a current","a zone","a period","angle"}));
     	
     	sayings.remove("DDLJ");
     	sayings.remove("Godfather");
     	
		System.out.println("sayings = "+sayings + " size = "+sayings.size());;
  	
		Set<String> keys = sayings.keySet();
		System.out.println("keys = "+keys);
     	for(String x : keys)
     	{
     		if(x.contains("K"))
     			System.out.println("found with K letter = "+x);
     	}
     	
     	Collection<String> col = sayings.values();
     	for(String x : col)
     	{
     		if(x.contains("p"))
     			System.out.println("found with p letter = "+x);
     	}
     	
     	//get each entry, in each entry search if the value has p
     	
     	sayings.put("dummy", "papaiepoe");
     	
     	Set<Entry<String,String>> entries = sayings.entrySet();
     	for(Entry<String,String> e : entries)
     	{
     		String k = e.getKey();
     		String v = e.getValue();
     	
     		if(v.contains("p"))
     			System.out.println("matching key containg p letter in value = "+k);
     	}
     	*/
		
		String str = "the distance between Johnson and and and and and Johnson are not the same";
				
		String[] words = str.split(" ");
		for(String w : words)
		{
			int count = 0;
			for(String wo : words)
				if(w.equals(wo))
					count++;
			
			System.out.println(w+" occurs "+count+" num of times");
		}
		System.out.println("--------------");
		String[] ws = str.split(" ");
		List<String> lwords=Arrays.asList(ws);
		
		for(String w : words)
		{
			int count = Collections.frequency(lwords,w);
			
			System.out.println(w+" occurs "+count+" num of times");
		}
		
     	// => n squared o
		
		Map<String,Integer> wordCount = new HashMap<String,Integer>();
		for(String w : words)
		{
			Integer occ = wordCount.get(w);
			if(occ==null)
				wordCount.put(w,1);
			else
				wordCount.put(w,occ+1);
		
		}
		System.out.println(wordCount);
	}

}








