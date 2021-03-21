package com.uttara.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PgmingQs {

	
	public static void printCharOccInWord(String word)
	{
		//assuming word contains only letter symbols
		int[] arr = new int[256];
		
		for(int i = 0 ; i < word.length() ; i++)
		{
			char c = word.charAt(i);
			arr[c - 'a']++;
		}
		
		for(int i = 0 ; i < arr.length ;i++)
		{
			System.out.println("num of times "+(char)(i+'a')+" = "+arr[i]);
		}
	}
	
	public static void printUniqueWordsFromFile(String path)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
		{
			BufferedReader br = null;
			String line;
			//List<String> words = new ArrayList<String>();
			Set<String> words = new TreeSet<String>();
			try
			{
				br = new BufferedReader(new FileReader(f));
				while((line = br.readLine())!=null)
				{
					String[] sa = line.split(" ");
					for(String word : sa)
					{
						words.add(word);
					}
				}
				System.out.println("all words = "+words);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(br!=null)
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			
		}
		else
			System.out.println("Pass a valid text file path, you pathless!");
		
	}
	
	
	public static void printWordsFromFile(String path)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
		{
			BufferedReader br = null;
			String line;
			List<String> words = new ArrayList<String>();
			try
			{
				br = new BufferedReader(new FileReader(f));
				while((line = br.readLine())!=null)
				{
					String[] sa = line.split(" ");
					for(String word : sa)
					{
						words.add(word);
					}
				}
				System.out.println("all words = "+words);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(br!=null)
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			
		}
		else
			System.out.println("Pass a valid text file path, you pathless!");
		
	}
	public static void printWordOccFromFile(String path)
	{
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
		{
			BufferedReader br = null;
			String line;
			//List<String> words = new ArrayList<String>();
			Map<String,Integer> words = new HashMap<String,Integer>();
			
			try
			{
				br = new BufferedReader(new FileReader(f));
				while((line = br.readLine())!=null)
				{
					String[] sa = line.split(" ");
					for(String word : sa)
					{
						//words.add(word);
						if(words.get(word)==null)
							words.put(word, 1);
						else
							words.put(word, words.get(word)+1);
					}
					
				}
				
				System.out.println("all words = "+words);
				
				WordOccValueComparator comp = new WordOccValueComparator(words);
				Map<String,Integer> sortedMap = new TreeMap<String,Integer>(comp);
				
				sortedMap.putAll(words);
				System.out.println("sortedByValuesMap = "+sortedMap);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(br!=null)
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			
		}
		else
			System.out.println("Pass a valid text file path, you pathless!");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter path of text file");
		String path = sc2.nextLine();
		
		//printWordsFromFile(path);
		//printUniqueWordsFromFile(path);
		//printWordOccFromFile(path);
		printCharOccInWord("abracadabraaabahogoooo");
		
	}

}

class WordOccValueComparator implements Comparator<String>
{
	Map<String,Integer> map = null;
	
	public WordOccValueComparator(Map<String,Integer> map) {
		this.map = map;
	}
	
	@Override
	public int compare(String o1, String o2) {
		// use string o1 and o2 as keys and pull the values
		// compare the values and return the return
		
		//return o1.length() - o2.length();
		
		int val1 = map.get(o1);
		int val2 = map.get(o2);
		
		return val1-val2;
	}
}










