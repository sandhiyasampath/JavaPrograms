public class Pattern
{
	public static void main(String[] args)
	{
		int n=4;
		int temp=7;
		int space = 3;
		for(int i=0; i<n; i++)
		{
			for(int k=space; k<3; k++)
			{
				System.out.print(" ");
			}
			space = space-1;
			for(int j=0; j<temp; j++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
			temp=temp-2;



		}


	}
}
