public class BobbleSort
{	
	public static void main(String[] args)
	{
		int[] ir = {5,2,5,3,8,45,26,48,29,56};
		bubbleSort (ir);
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
