package search;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		 
		 int[] nums = {0, 1, 4, 0, 5, 2};
		 int index=linearSearch(nums,1);
			System.out.println("found at "+index);
	}
	
	static int linearSearch(int[] nums,int num)
	{
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==num)
			{
				return i;
			}
			
		}
		
			return -1;
		
			
		
	}

	
	

}
