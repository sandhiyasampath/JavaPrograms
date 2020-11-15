public class BubbleSort
{	
	public static void main(String[] args)
	{
		int[] ir = {5,4,8,9,11,56,48};
		Sort(ir);
	}
	public static int[] Sort(int[] ir)
	{
		for(int i=0; i<ir.length; i++)
		{
			for(int j=i; j<ir.length; j++)
			{
				if(ir[i]>ir[j])
				{
					int temp = ir[i];
					ir[i] = ir[j];
					ir[j] = temp;
				}
			}
		}
		return ir;
	}
}
