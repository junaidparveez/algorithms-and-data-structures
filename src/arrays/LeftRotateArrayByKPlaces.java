package arrays;

import java.util.Arrays;

public class LeftRotateArrayByKPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] nums= {1, 2, 3, 4, 5};
		  rotateArrayByKPlace(nums,1);
			System.out.println(Arrays.toString(nums));
	}

	static void rotateArrayByKPlace(int [] nums,int k)
	{
		int n=nums.length;
		int d=k%n;
		
	
			int[] temp=new int[d];
			for(int i=0;i<d;i++)
			{
				temp[i]=nums[i];
			}
			for(int i=d;i<n;i++)
			{
				nums[i-d]=nums[i];
			}
			for(int i=n-d;i<n;i++)
			{
				nums[i]=temp[i-(n-d)];
			}
			
			
			
		}
		
	
}
