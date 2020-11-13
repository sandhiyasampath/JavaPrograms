/* Question: Given an array of ints, return true if every element is a 1 or a 4.
Sample Input: 1. only14({1, 4, 1, 4}) -> true , 2. only14({1, 4, 2, 4}) -> false ,
Sample Output: 3. only14({1, 1}) -> true */
public class EveryElememtIsOneOrFour
{
	public static void main(String[] args)
	{
		only14({1,2,4,2,4})
	}
	public boolean only14(int[] nums)
	{
		boolean b = false;
		for(int i= 1; i<nums.length; i++)
		{
			if(nums[i]==1 || nums[i]==4)
			{
				b = true;
				continue;
			}
			else
			{
				b = false;
				break;
			}
		}
		return b;
	}
}

