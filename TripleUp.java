/* Question: Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
Sample Input: 1. tripleUp({1, 4, 5, 6, 2}) ->true 2. tripleUp({1, 2, 3}) -> true
Sample Output: 3. tripleUp({1, 2, 4}) -> false
Question Points: 10 */
public class TripleUp
{
	public static void main(String[] args)
	{
		int[] r = {10,20,30,31,32};
		tripleUp(r);
	}
	public static boolean tripleUp(int[] nums)
	{	
		boolean isTripleUp = false;
		int temp = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if((i+2)<nums.length)
			{
				temp = nums[i];
				if(nums[i+1]==temp+1 && nums[i+2]==temp+2)
				{
						isTripleUp = true;
				}
			}
		}
		System.out.println(isTripleUp);
		return isTripleUp;
	}
}
			

