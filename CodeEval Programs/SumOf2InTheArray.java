/* Question: Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
Sample Input: 1. sum28({2, 3, 2, 2, 4, 2}) -> true 2. sum28({2, 3, 2, 2, 4, 2, 2}) -> false
Sample Output: 3. sum28({1, 2, 3, 4}) -> false */
public class SumOf2InTheArray
{
	public static void main(String[] args)
	{
		int[] ir = {1,2,3,4,5,2,5,2,52,6};
	}
	public static boolean sum2Is8(int[] nums)
	{
		boolean isSumOf28 = false;
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i]==2)
			{
				sum = sum + nums[i];
				if(sum==8)
				{
					isSumOf28 = true;
					break;
				}
			}
		}
		return isSumOf28;
	}
}


