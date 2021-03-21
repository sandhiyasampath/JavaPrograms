package com.uttara.iolab;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestIOFunc {

	public static void replaceOccInFile(String path,String fromStr,String toStr)
	{
		if(path==null || path.equals(""))
			throw new IllegalArgumentException("path cannot be null");
		
		File f = new File(path);
		
		if(f.exists() && f.isFile() && f.getName().contains(".txt"))
		{
			BufferedReader br = null;
			BufferedWriter bw = null;
			try
			{
				br = new BufferedReader(new FileReader(f));
				String line;
				//read line from file, replace occ of fromStr with toStr 
				//and add line to list
				//loop over list, overwrite the contents of the file
				List<String> content = new ArrayList<String>();
				while((line=br.readLine())!=null)
				{
					String newLine = line.replace(fromStr, toStr);
					content.add(newLine);
				}
				//all lines have been read and all occ have been replaced
				//content is in list
				bw = new BufferedWriter(new FileWriter(f)); //open file in overwrite mode!
				
				for(String str : content)
				{
					bw.write(str);
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
		else
			throw new IllegalArgumentException("path improper...cannot read");

	}
	
	public static void printNonDupliInFile(String path)
	{
		if(path==null || path.equals(""))
			throw new IllegalArgumentException("path cannot be null");
		
		File f = new File(path);
		
		if(f.exists() && f.isFile() && f.getName().contains(".txt"))
		{
			//read 1 line at a time, split it into words
			//add each word into a Set
			//print set
		
			BufferedReader br = null;
			try
			{
				Set<String> content = new HashSet<String>();
				
				br = new BufferedReader(new FileReader(f));
				String line;
				while((line=br.readLine())!=null)
				{
					String[] words = line.split(" ");
					for(String w: words)
						content.add(w);
				}
				System.out.println(content);
				System.out.println("size = "+content.size());
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
			throw new IllegalArgumentException("path improper...cannot read");
	}
	
	public static void byteFileCopyWithAppend(String path1, String path2) throws IOException
	{
		//invalid case checks
		//perform validations
		//apply business logic
		
		if(path1==null || path1.equals(""))
			throw new IllegalArgumentException("path cannot be null");
		if(path2==null || path2.equals(""))
			throw new IllegalArgumentException("path cannot be null");
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		if(f1.exists() && f1.isFile() )
		{
			//read from f1 file and append to f2 file
			BufferedInputStream br = null;
			BufferedOutputStream bw = null;
			try
			{
				br = new BufferedInputStream(new FileInputStream(f1));
				bw = new BufferedOutputStream(new FileOutputStream(f2,true));
				
				int c;
				while((c = br.read())!=-1)
				{
					bw.write(c);
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
				throw e;
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
		else
			throw new IllegalArgumentException("path1 is improper...cannot copy...");
	}
	
	public static void fileCopyWithAppend(String path1, String path2) throws IOException
	{
		//invalid case checks
		//perform validations
		//apply business logic
		
		if(path1==null || path1.equals(""))
			throw new IllegalArgumentException("path cannot be null");
		if(path2==null || path2.equals(""))
			throw new IllegalArgumentException("path cannot be null");
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		if(f1.exists() && f1.isFile() && f1.getName().contains(".txt"))
		{
			//read from f1 file and append to f2 file
			BufferedReader br = null;
			BufferedWriter bw = null;
			try
			{
				br = new BufferedReader(new FileReader(f1));
				bw = new BufferedWriter(new FileWriter(f2,true));
				
				String line;
				while((line = br.readLine())!=null)
				{
					bw.write(line);
					bw.newLine();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
				throw e;
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
		else
			throw new IllegalArgumentException("path1 is improper...cannot copy...");
	}
	
	public static void main(String[] args) {
		
		try
		{
			if(args.length>=3)
			{
				//byteFileCopyWithAppend(args[0],args[1]);
				//printNonDupliInFile(args[0]);
				replaceOccInFile(args[0],args[1],args[2]);
				System.out.println("done!");
			}
			else
				System.out.println("Give 2 paths as inputs");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
