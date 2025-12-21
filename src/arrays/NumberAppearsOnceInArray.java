package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearsOnceInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 8, 8 };

		int result = findSingleNumberUsingXOR(arr);
		System.out.println("Number appearing once: " + result);
	}

	// Method to find the number that appears only once
	static int findSingleNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count == 1) {
				return arr[i];
			}
		}
		return -1; // if no single element exists
	}

	static int findSingleNumberUsingHashing(int[] arr) {
		int maxi = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		int[] hash = new int[maxi + 1];
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]]++;

		}
		for (int i = 0; i < hash.length; i++) {
			if (hash[i] == 1) {
				return i;
			}
		}
		return -1; // if no single element exists
	}

	static int findSingleNumberUsingMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet())

		{
			if (entry.getValue() == 1) {
				return entry.getKey();
			}

		}

		return -1; // if no single element exists
	}

	static int findSingleNumberUsingXOR(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}

		return xor; 
	}
}
