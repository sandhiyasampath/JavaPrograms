package com.uttara.tasks.util;

public class TasksUtil {

	public static boolean isValidWord(String str)
	{
		if(str==null || str.trim().equals(""))
			return false;
		else
		{
			//start with letter, no spl chars, min 3 chars, max 30 chars
			if(str.split(" ").length > 1)
				return false;
			if(str.length() < 3)
				return false;
			if(str.length() >= 30)
				return false;
			if(!Character.isLetter(str.charAt(0)))
					return false;
			for(int i = 1 ; i < str.length() ;i++)
			{
				if(!(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))))
					return false;
			}
			return true;
		}
	}
}






