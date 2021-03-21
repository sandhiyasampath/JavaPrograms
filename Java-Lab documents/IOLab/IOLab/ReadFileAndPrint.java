package com.uttara.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileAndPrint {
	
	public static void main(String[] args) {
		
		BufferedReader br = null; //ctrl+shift+o
		BufferedWriter bw = null;
		try
		{
			long t1 = System.currentTimeMillis();//time taken from epoch time Jan 1st 1970
			
			br = new BufferedReader(new FileReader("/Users/vikramshastry/Desktop/IOTestQs.txt"));
			bw = new BufferedWriter(new FileWriter("/Users/vikramshastry/Desktop/output.txt",true));
			
			//reading one line at a time
			String line;
			while((line=br.readLine())!=null)
			{
				bw.write(line);
				bw.newLine();
			}
			
			/* reading one char at a time
			int x;
			
			while((x = br.read())!=-1)
			{
				//System.out.print((char)x);
				bw.write(x);
				
			}
			*/
			//bw.flush();
			 
			 
			long t2 = System.currentTimeMillis();
			
			System.out.println("Time taken = "+(t2-t1)+" ms");
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
			if(bw!=null)
				try {
					bw.close(); //internally calls flush!!
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	/*
	public static void main(String[] args) {
		
		BufferedReader br = null; //ctrl+shift+o
		try
		{
			long t1 = System.currentTimeMillis();//time taken from epoch time Jan 1st 1970
			br = new BufferedReader(new FileReader("/Users/vikramshastry/Desktop/IOTestQs.txt"));
			int x;
			while((x = br.read())!=-1)
			{
				System.out.print((char)x);
			}
			long t2 = System.currentTimeMillis();
			
			System.out.println("Time taken = "+(t2-t1)+" ms");
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
	*/
	
/*
	public static void main(String[] args) {
	
		
		FileReader fr = null; //ctrl+shift+o
		try
		{
			long t1 = System.currentTimeMillis();//time taken from epoch time Jan 1st 1970
			fr = new FileReader("/Users/vikramshastry/Desktop/IOTestQs.txt");
			int x;
			while((x = fr.read())!=-1)
			{
				System.out.print((char)x);
			}
			long t2 = System.currentTimeMillis();//time taken from epoch time Jan 1st 1970
			System.out.println("Time taken = "+(t2-t1)+" ms");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	*/


}
