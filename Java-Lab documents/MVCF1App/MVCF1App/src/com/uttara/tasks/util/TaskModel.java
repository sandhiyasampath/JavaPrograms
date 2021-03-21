package com.uttara.tasks.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskModel {

	public List<TaskBean> getTasks(String catName)
	{
		List<TaskBean> beans = new ArrayList<TaskBean>();
		TaskBean beanie = null;
		
		BufferedReader br = null;
		try
		{
			String line;
			br = new BufferedReader(new FileReader(catName+".tasks"));
			while((line = br.readLine())!=null)
			{
				beanie = new TaskBean();
				String[] sa = line.split(":");
				beanie.setName(sa[0]);
				beanie.setDesc(sa[1]);
				beanie.setSdt(sa[2]);
				beanie.setPriority(Integer.parseInt(sa[3]));
				beanie.setStatus(sa[4]);
				beanie.setTags(sa[5]);
				
				beans.add(beanie);
			}
			Collections.sort(beans);
			return beans;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return null;
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
	
	public String createTask(TaskBean bean, String catName)
	{
		Logger.getInstance().log("TM->createTask()->starting...");
		/*
		 * 1) create a file named with catname
		 * 2) convert data in bean to a string line with : delimiter
		 * 3) write the line into file
		 * 4) close the file
		 * 5) return success
		 * 6) any failure, return error msg as string
		 */
		BufferedWriter bw = null;
		try
		{
			bw = new BufferedWriter(new FileWriter(catName+".tasks",true));
			String line = bean.getName()+":"+bean.getDesc()+":"+bean.getSdt()+":"+bean.getPriority()+":"+bean.getStatus()+":"+bean.getTags();
			Logger.getInstance().log("TM->createTask() line = "+line);
			bw.write(line);
			bw.newLine();
			return Constants.SUCCESS;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return "Something bad happened in writing to file "+e.getMessage();
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
	
	public boolean checkIfCategoryExists(String catName)
	{
		Logger.getInstance().log("TM->checkIfCategoryExists()->starting...");
		File f = new File(catName+".tasks");
		Logger.getInstance().log("TM->checkIfCategoryExists()->cat exists ?..."+f.exists());
		if(f.exists())
			return true;
		else
			return false;
	}
	
}
