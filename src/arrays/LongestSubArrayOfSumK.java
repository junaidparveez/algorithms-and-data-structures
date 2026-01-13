package arrays;

public class LongestSubArrayOfSumK {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
		int k = 3;
		int longest = longestSubArrayBruteSolution(nums, k);
		System.out.println("longest " + longest);
	}

	private static int longestSubArrayBruteSolution(int[] nums, int k) {
		int n=nums.length;
		int maxlen=0;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+nums[j];
				if(sum==k)
				{
					maxlen=max(maxlen,j-i+1);
				}
			}
			
		}
		
		return maxlen;
	}
	
	static int max(int n1,int n2)
	{
		if(n1>n2)
		{
			return n1;
		}
		return n2;
	}

}
