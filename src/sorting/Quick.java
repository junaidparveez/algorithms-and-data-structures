package sorting;

import java.util.Arrays;

public class Quick {

	public static void main(String[] args) {
		int[] nums = {7, 4, 1, 5, 3};
		quickSort(nums,0,nums.length-1);
		
		System.out.println(Arrays.toString(nums));
	}
	
	 public static  void quickSort(int[] nums,int low,int high) {
		 
		if(low<high)
		{
			
			int partitionIndex=placePivot(nums,low,high);
			quickSort(nums,low,partitionIndex-1);
			quickSort(nums,partitionIndex+1,high);
			
			
		}
		 
		
		
	    }

	private static int placePivot(int[] nums, int low, int high) {
	
		int pivot=nums[low];
		
		int i=low;
		int j=high;
		
		while(i<j)
		{
			while(nums[i]<=pivot&&i<=high-1)
			{
				i++;
			}
			while(nums[j]>pivot&& j>=low+1)
			{
				j--;
			}
			if(i<j)
			{
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
		int temp=nums[low];
		nums[low]=nums[j];
		nums[j]=temp;
		
		
		return j;
	}
}
