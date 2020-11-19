/* 6) Write a method to take an int number and int year as input and
return number of days in that month as int. Which control statement
will you use to effectively reduce writing more conditional code? */
public class DaysinMonth
{
	public static void main(String[] args)
	{
		numberOfDaysInGivenMonth(8,2010);
	}
	public static void numberOfDaysInGivenMonth(int number,int year)
	{
	switch(number)
	{
		  	case 1:
		  	case 3:
			case 5: 	
			case 7:
			case 8:
			case 10:
			case 12:			  	
				System.out.println("in  month "+number+" has"+" 31 days");
			break;
			case 4:	
			case 6:
			case 9:
			case 11:		
				System.out.println("in month "+number+"  has"+ " 30 days");
				break;
			case 2:
				if(year%400==0)
				{
				System.out.println("in month "+number+"  has"+" 29 days");
				}				
				else
				{
				System.out.println("in month "+number+"  has"+" 28 days");
				}
	}
		
	}
}
