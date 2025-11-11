package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionOf2SortedArrays {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6 };
	int[]union=	UnionUsingSet(nums, nums2);
		System.out.println(Arrays.toString(union));
	}

	static int[] UnionUsingSet(int[] nums, int[] nums2) {
		Set<Integer> s = new LinkedHashSet<>();

		for (int i = 0; i < nums.length; i++) {
			s.add(nums[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			s.add(nums2[i]);
		}

		int[] union = new int[s.size()];
		int index = 0;
		for (int num : s) {
			union[index++] = num;
		}

		return union;
	}
	
	static int[] UnionUsingTwoPointer(int[] nums, int[] nums2) {
	    int n1 = nums.length;
	    int n2 = nums2.length;
	    int i = 0, j = 0;

	    List<Integer> unionList = new ArrayList<>();

	    while (i < n1 && j < n2) {
	        if (nums[i] == nums2[j]) {
	            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums[i]) {
	                unionList.add(nums[i]);
	            }
	            i++;
	            j++;
	        } else if (nums[i] < nums2[j]) {
	            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums[i]) {
	                unionList.add(nums[i]);
	            }
	            i++;
	        } else {
	            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
	                unionList.add(nums2[j]);
	            }
	            j++;
	        }
	    }

	    // Add remaining elements from nums
	    while (i < n1) {
	        if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums[i]) {
	            unionList.add(nums[i]);
	        }
	        i++;
	    }

	    // Add remaining elements from nums2
	    while (j < n2) {
	        if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
	            unionList.add(nums2[j]);
	        }
	        j++;
	    }

	    // Convert to int[]
	    int[] union = new int[unionList.size()];
	    for (int k = 0; k < unionList.size(); k++) {
	        union[k] = unionList.get(k);
	    }

	    return union;
	}



}
