package sorting;

import java.util.Arrays;

public class Bubble {

	public static void main (String[] args)
	{
	
		int[] nums = {7, 4, 1, 5, 3};
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	 public static  int[] bubbleSort(int[] nums) {
		 
		 for(int i=nums.length-1;i>0;i--)
		 {
			 for(int j=0;j<i;j++)
			 {
				 if(nums[j]>nums[j+1])
				 {
					 int temp=nums[j];
					 nums[j]=nums[j+1];
					 nums[j+1]=temp;
				 }
			 }
		 }
		 
		return nums;

	    }
}
