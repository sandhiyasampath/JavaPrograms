package com.uttara.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO {

	public static void main(String[] args) {
		
		//initialize 3rd party res to def value
		//BufferedReader br = null; 
		FileReader fr = null; 
		//BufferedWriter bw = null; 
		FileWriter fw = null;
		long t1 = System.currentTimeMillis();
		try
		{
			//initialize the BO
			fr = new FileReader("/Users/vikramshastry/Desktop/msgs.txt");
			fw = new FileWriter("/Users/vikramshastry/Desktop/output.txt",true);
			
		//	br = new BufferedReader(new FileReader("/Users/vikramshastry/Desktop/msgs.txt"));
		//	bw = new BufferedWriter(new FileWriter("/Users/vikramshastry/Desktop/output.txt",true));
			
			//apply busi.logic
			int c;
			
			while((c=fr.read())!=-1)
			{
			//	System.out.print((char)c);
				fw.write(c);
			}
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
			
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		long t2 = System.currentTimeMillis();
		
		System.out.println("time taken = "+(t2-t1)/1000.0);

	}

}







