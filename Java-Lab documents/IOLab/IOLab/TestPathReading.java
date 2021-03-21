package com.uttara.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestPathReading {

	public static void main(String[] args) {
		
		/*
		 * accept path from user as input
		 * check if path exists and is it a directory
		 * if yes, get the contents of the directory
		 * if each path is a file and check if extension contains ".txt"
		 * if yes, open the file and read the contents!
		 */
		
		if(args.length>0)
		{
			String path = args[0];
			File f = new File(path);
			if(f.exists() && f.isDirectory())
			{
				File[] fa = f.listFiles();
				for(File fi : fa)
				{
					if(fi.isFile() && fi.getName().contains(".txt"))
					{
						//fi is a File obj that points to a text file path
						BufferedReader br = null;
						try
						{
							br = new BufferedReader(new FileReader(fi));
							String line;
							System.out.println("reading contents of "+fi.getName());
							while((line=br.readLine())!=null)
							{
								System.out.println(line);
							}
							System.out.println("-------");
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
				}
			}
		}
		else
		{
			System.out.println("pls give at least one path as input");
	
		}
	}
}








