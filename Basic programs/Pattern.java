/*10) Print this pattern to monitor in main()!
    *
   * *
  * * *
 * * * *
* * * * * */
public class Pattern
{
	int n=4;
	public static void main(String[] args)
	{
	for(int i=0; i<=5; i++)
	{
		for(int k=0; k<=4-i; k++)
		{
			System.out.print(" ");	
		}
		
		for(int j=0; j<i+1; j++)
		{
			System.out.print("* ");
		}
			System.out.println(" ");
			
	}
	}
}
