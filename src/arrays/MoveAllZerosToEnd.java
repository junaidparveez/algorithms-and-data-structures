package arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {
	
	public static void main(String[] args) {
		 
		 int[] nums = {0, 1, 4, 0, 5, 2};
			moveZeroes(nums);
			System.out.println("nums "+Arrays.toString(nums) );
	}
	
	static void moveZeroes(int[] nums)
	{
		int j=-1;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0)
			{
				j=i;
				break;
			}
			
		}
		if(j==-1)
		{
			return;
		}
			
		for(int i=j+1;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				int temp=nums[j];
			     nums[j]=nums[i];
			    nums[i]=temp;
			    j++;
			}
		}
		 
	}

	
	
	
}
