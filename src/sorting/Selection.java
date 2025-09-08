package sorting;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {7, 4, 1, 5, 3};
		selectionSort(nums);
		
		System.out.println(Arrays.toString(nums));
	}

    public static  int[] selectionSort(int[] nums) {

        for (int i=0;i<nums.length;i++)
        {
            int min=i;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[min]>nums[j])
                {
                    min=j;
                }
            }

            int temp=nums[i];
             nums[i]=nums[min];
             nums[min]=temp;

        }
		return nums;


    }
    
    public static  int[] selectionSortMasood(int[] nums) {

        for (int i=0;i<nums.length;i++)
        {
            int min=i;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[min]>nums[j])
                {
                    min=j;
                }
            }

            int temp=nums[i];
             nums[i]=nums[min];
             nums[min]=temp;

        }
		return nums;






    }
}
