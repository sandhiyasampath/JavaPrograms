package com.uttara.tasks.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	
	public void log(final String data)
	{
			new Thread(new Runnable()
			{
				@Override
					public void run() {
					
						BufferedWriter bw = null;
						try
						{
							bw = new BufferedWriter(new FileWriter(Constants.LOGPATH,true));
							Date dt = new Date();
							bw.write(dt.toString()+":"+data);
							bw.newLine();
							if(Constants.LOGGER_MODE)
								System.out.println(data);
						}
						catch(IOException e)
						{
							e.printStackTrace();
						}
						finally
						{
							if(bw!=null)
								try {
									bw.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

						}
					}

			}).start();
	}
	private Logger()
	{
		//System.out.println("in Logger() no-arg constr");
	}
	private static Logger obj = null;
	
	public static Logger getInstance()
	{
		//System.out.println("in Logger getInstance(), obj = "+obj);
		if(obj == null)
			obj = new Logger();
		
		return obj;
	}
	
}
