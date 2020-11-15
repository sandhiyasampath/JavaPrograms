/* Question: Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
Sample Input: 1. modThree({2, 1, 3, 5}) -> true , 2. modThree({2, 1, 2, 5}) -> false ,
Sample Output: 3. modThree({2, 4, 2, 5} )-> true */
public class ThreeContinuousNumEvenOROdd
{
	public static void main(String[] args)
	{
		int[] ir ={2,1,3,5};
		boolean b = modThree(ir);
	}
	public static boolean modThree(int[] nums)
	{
		boolean b = false;
		for(int i = 0; i<nums.length; i++)
		{
			if(i+2<nums.length && nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0)
			{
				b =true;
			}
			if(i+2<nums.length && nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1)
			{
				b =true;
			}
		}
		return b;
		
	}
}


