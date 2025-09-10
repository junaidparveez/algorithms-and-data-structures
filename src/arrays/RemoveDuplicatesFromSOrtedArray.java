package arrays;

public class RemoveDuplicatesFromSOrtedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] nums = {0, 0, 3, 3, 5, 6};

	int size=removeDuplicates(nums);
	System.out.println("Size "+size);
	}
	
	  public static  int removeDuplicates(int[] nums) {
	        
		  int i=0;
		  for(int j=1;j<nums.length;j++)
		  {
			  if(nums[i]!=nums[j])
			  {
				  nums[i+1]=nums[j];
				  i++;
			  }
		  }
		  return i+1;
	    }

}
