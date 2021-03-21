package com.uttara.io;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		
		if(args.length>0)
		{
			System.out.println("args[0] = "+args[0]);
			File f1 = new File(args[0]);
			System.out.println("does f1 exist ? "+f1.exists());
			System.out.println("is directory ? "+f1.isDirectory());
			System.out.println("is file ? "+f1.isFile());
			System.out.println("abs path = "+f1.getAbsolutePath());
			System.out.println("size = "+ f1.length());
			System.out.println("is hidden ? "+f1.isHidden());
			System.out.println("----------------");
			if(f1.exists() && f1.isDirectory())
			{
				System.out.println("listing contents of "+f1.getName());
				File[] fa = f1.listFiles();
				for(File f : fa)
				{
					System.out.println(f.getAbsolutePath());
					
					
				}
			}
			
		}
		else
			System.out.println("pls give at least one path as input");
		

	}

}
