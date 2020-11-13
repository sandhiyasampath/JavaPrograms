/* Question: Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
Sample Input: 1. haveThree({3, 1, 3, 1, 3}) -> true 2. haveThree({3, 1, 3, 3}) -> false
Sample Output: 3. haveThree({3, 4, 3, 3, 4})-> false */
public class ThreeAppearsThreeTimes
{
	public static void main(String[] args)
	{
		int[] ir = {3, 1, 3, 1, 3};
		haveThree(ir);
	}
	public static boolean haveThree(int[] nums)
	{
		boolean hasThree = false;
		int count = 0;
		for(int i = 0; i<nums.length; i++)
		{
			if((i+1)<nums.length && nums[i]==3 && nums[i+1]!=3)
			{
				count++;
			}
		}
		if(nums[nums.length-1]==3)
		{
			count ++;
		}
		if(count==3)
		{
			hasThree = true;
		}
		return hasThree;
	}
}


