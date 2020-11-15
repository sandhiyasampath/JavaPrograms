public class MultiplicationTable
{
	public static void main(String[] args)
	{
		TestMultiplicationTable.TestMultiplicationTable(1,2);
	}
}
class TestMultiplicationTable
{
	public static void TestMultiplicationTable(int a,int b)
	{
		if(a>b)
		{
		for(int i=1; i<=a; i++)
		{
			
			System.out.println(b+ "*" +i +" =" +(b*i));
		}
		}
		if(b>a)
		{
		for(int i=1; i<=b; i++)
		{
			
			System.out.println(a+ "*" +i +" =" +(a*i));
		}
		}
	}
}
