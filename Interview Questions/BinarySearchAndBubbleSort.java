public class BinarySearchAndBubbleSort
{
	public static void main(String[] args)
	{
		int[] ir = {1,3,2,1,26};
		int c = findIntInIntArray(ir,26);
		System.out.println(c);
	}
	public static int findIntInIntArray(int[] ir,int i)
	{
		ir = bubbleSort(ir);
		// ir = {1,1,2,3,26};
		int start = 0;
		int end = ir.length-1;
		int b = -1;
		while(start <= end)
		{
			int mid =  (start + end)/2;
			if(ir[mid] == i)
			{
				b = mid;
				break;
			}
			else if(ir[mid] > i)
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}	
		}
		return b;
	}
	public static int[] bubbleSort(int[] ir)
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
