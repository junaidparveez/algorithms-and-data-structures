package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {

	public static void main(String[] args) {
		
		int[] nums = {7, 4, 1, 5, 3};
		mergeSort(nums,0,nums.length-1);
		
		System.out.println(Arrays.toString(nums));
		
	}
	
	 public static  void mergeSort(int[] nums,int left,int right) {
		 
		 int mid=(left+right)/2;
		 if(left>=right)
		 {
			 return;
		 }
		 
		mergeSort(nums,left,mid);
		mergeSort(nums,mid+1,right);
		merge(nums,mid,left,right);
	    }

	private static void merge(int[] nums, int mid, int low, int high) {
		int left=low;
		int right =mid+1;
		List<Integer> arr=new ArrayList<Integer>();
		while(left<=mid&& right<=high)
		{
			if(nums[left]>nums[right])
			{
				arr.add(nums[right]);
				right++;
			}
			else
			{
				arr.add(nums[left]);
				left++;
			}
		}
		while(left<=mid)
		{
			arr.add(nums[left]);
			left++;
		}
		while(right<=high)
		{
			arr.add(nums[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++)
		{
			
			nums[i]=arr.get(i-low);
		}
		
		
	}
	
}
