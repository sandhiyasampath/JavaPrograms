/*4) Print 1 to 10 to the monitor using for, while, do..while*/
public class Loop
{
	public static void main(String[] args)
	{
	for(int i=1; i<=10; i++)
	{
		System.out.println(i);
	}
	int i = 1;
	while(i<=10)
	{
		System.out.println(i);
		i++;
	}
	int j=1;
	do
	{
		System.out.println(j);
		j++;
	}
	while(j<=10);
	}
}
