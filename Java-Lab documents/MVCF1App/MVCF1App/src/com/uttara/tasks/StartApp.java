package com.uttara.tasks;

import java.util.List;
import java.util.Scanner;

import com.uttara.tasks.util.Constants;
import com.uttara.tasks.util.Logger;
import com.uttara.tasks.util.TaskBean;
import com.uttara.tasks.util.TaskModel;
import com.uttara.tasks.util.TasksUtil;

public class StartApp {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			
			int ch1=0,ch2=0;
			String catName,taskName,desc,tags,sdt;
			int prio;
			boolean result;
			TaskModel model = new TaskModel();
			
			while(ch1!=3)
			{
				System.out.println("Press 1 to Create Category");
				System.out.println("Press 2 to Load Category");
				System.out.println("Press 3 to Exit");
				System.out.println("Enter choice");
				
				while(!sc1.hasNextInt())
				{
					System.out.println("Enter integer input only boss!!!");
					sc1.next();
				}
				ch1 = sc1.nextInt();
				
				Logger.getInstance().log("choice entered = "+ch1);
				
				switch(ch1)
				{
					case 1:
							System.out.println("creating...");
							
							System.out.println("Enter category name");
							catName = sc2.nextLine();
							Logger.getInstance().log("category name given = "+catName);
							//input validate
							
							result = TasksUtil.isValidWord(catName);
							while(!result)
							{
								System.out.println("Enter a valid category name - start with letter, min 3 chars, max 30 chars, no spl chars, only one word");
								catName = sc2.nextLine();
								result = TasksUtil.isValidWord(catName);
							}
							//perform business validation 
							//check if the category already exists!!
							
							result = model.checkIfCategoryExists(catName);
							while(result)
							{
								System.out.println("Category name already exists...you duplicate!! Enter a new one...");
								catName = sc2.nextLine();
								result = model.checkIfCategoryExists(catName);
							}
							Logger.getInstance().log("category does not exist...");
							ch2 = 0;
							while(ch2!=5)
							{
								System.out.println("Press 1 to add task");
								System.out.println("Press 2 to delete tasks");
								System.out.println("Press 3 to update tasks");
								System.out.println("Press 4 to list tasks");
								System.out.println("Press 5 to go back");
								
								ch2 = sc1.nextInt();
								Logger.getInstance().log("second choice entered = "+ch2);
								switch(ch2)
								{
								case 4:
										List<TaskBean> beans = model.getTasks(catName);
										for(TaskBean b : beans)
										{
											System.out.println("Name : "+b.getName()+" Desc : "+b.getDesc()+" End Dt : "+b.getSdt()+" Priority : "+b.getPriority()+" Status : "+b.getStatus()+" Tags : "+b.getTags() );
										}
										break;
								case 1:
										System.out.println("Enter task name");
										taskName = sc2.nextLine();
										result = TasksUtil.isValidWord(taskName);
										while(!result)
										{
											System.out.println("Enter a valid word for task name...");
											taskName = sc2.nextLine();
											result = TasksUtil.isValidWord(taskName);
										}
										
										System.out.println("Enter task description");
										desc = sc2.nextLine();
										
										System.out.println("Enter tags");
										tags = sc2.nextLine();
										
										System.out.println("Enter end dt");
										sdt = sc2.nextLine();
										
										System.out.println("Enter priority (1->High,2->Med,3->Low)");
										prio = sc1.nextInt();
										Logger.getInstance().log("data obtained from user "+taskName+" "+desc+ " "+sdt+" "+tags+" "+prio);
										
										TaskBean bean = new TaskBean(taskName,desc,tags,sdt,prio,Constants.STATUS_PENDING);
										
										String msg = model.createTask(bean, catName);
										if(msg.equals(Constants.SUCCESS))
										{
											System.out.println("Task "+taskName+" created successfully in category "+catName+"!");
										}
										else
										{
											System.out.println("Oops theres been a problem! Msg is "+msg);
										}
										break;
								default:		
										System.out.println("not supported yet...");
										break;
								}
								
							}
							
							break;
					case 2:	
							System.out.println("loading...");
							break;
					case 3:
							System.out.println("tata bye bye...miss you...");
							break;
					default:
							System.out.println("enter only 1-3, varna darna...");
							break;
				}
				
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			System.out.println("Oops something bad happened "+e.getMessage());
		}
	
	}

}
