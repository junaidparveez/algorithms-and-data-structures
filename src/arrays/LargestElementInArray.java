package arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7, 4, 1, 5, 3};
		int largest=largestElement(nums);
		System.out.println("Largest "+largest);
	}
	
	
	    public static  int largestElement(int[] nums) {
	    
	        int largestElement=nums[0];
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]>largestElement)
	            {
	                largestElement=nums[i];
	            }
	        }
	        return largestElement;


	    }
	

}
