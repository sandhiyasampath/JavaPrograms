package com.uttara.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIS {

	public static void main(String[] args) {
		
		BufferedInputStream bin=null;
		BufferedOutputStream bout = null;
		try
		{
			bin = new BufferedInputStream(new FileInputStream("/Users/vikramshastry/Desktop/Batch68/msgs.txt"));
			bout = new BufferedOutputStream(new FileOutputStream("/Users/vikramshastry/Desktop/Batch68/out.txt"));
			
			int c;
			while((c=bin.read())!=-1)
			{
				bout.write(c);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(bin!=null)
				try {
					bin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(bout!=null)
				try {
					bout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
