package com.uttara.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReading {

	public static void main(String[] args) 
	{
		
		BufferedReader br=null;
		BufferedWriter bw =null;
		try
		{
			br = new BufferedReader(new FileReader("/Users/vikramshastry/Desktop/msgs.txt"));
			String line;
			bw= new BufferedWriter(new FileWriter("/Users/vikramshastry/Desktop/output.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}
			
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
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}









