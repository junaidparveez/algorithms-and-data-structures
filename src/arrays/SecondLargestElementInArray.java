package arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7, 4, 1, 5, 3};
		int largest=secondLargestElement(nums);
		System.out.println("Second Largest "+largest);
	}

	
	 public static  int secondLargestElement(int[] nums) {
		    int secondLargestElement=-1;
	        int largestElement=nums[0];
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]>largestElement)
	            {
	            	secondLargestElement=largestElement;
	                largestElement=nums[i];
	            }
	            else if(nums[i]<largestElement && nums[i]>secondLargestElement)
	            {
	            	secondLargestElement=nums[i];
	            }
	        }
	        return secondLargestElement;


	    }
}
