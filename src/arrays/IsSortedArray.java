package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IsSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		boolean res=isSorted(list);
		System.out.println(res);
	}
	
	 public static  boolean isSorted(ArrayList<Integer> nums) {
	     
	     for(int i=1;i<nums.size();i++)
	     {
	        if(nums.get(i)<nums.get(i-1))
	        {
	            return false;
	        }
	     }
	     return true;
	    }

}
