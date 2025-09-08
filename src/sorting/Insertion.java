package sorting;

import java.util.Arrays;

public class Insertion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {7, 4, 1, 5, 3};
		insertionSort(nums);
		
		System.out.println(Arrays.toString(nums));
	}


	 public static int[] insertionSort(int[] nums) {

	        for(int i =0;i<nums.length;i++ )
	        {
	            int j=i;

	            while (j>0 && nums[j-1]>nums[j])
	            {
	                 int temp=nums[j];
	                 nums[j]=nums[j-1];
	                nums[j-1]=temp;
	                j--;
	                

	            }
	        }
	        return nums;



	    }
}

   
