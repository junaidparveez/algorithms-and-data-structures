package arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = { 1, 2, 4, 5 };

		int missing = findMissingNumberUsingXOR(n, arr);

		System.out.println("Missing number is: " + missing);
	}

	// Method to find the missing number
	public static int findMissingNumber(int n, int[] arr) {
		int sum = n * (n + 1) / 2;

		for (int num : arr) {
			sum -= num;
		}

		return sum;
	}

	public static int findMissingNumberUsingXOR(int n, int[] arr) {
		int xor1 = 0;
		for (int i = 1; i <= n; i++) {
			xor1 = xor1 ^ i;
		}
		int xor2 = 0;
		for (int i = 0; i < n-1; i++) {
			xor2 = xor2 ^ arr[i];
		}

		return xor1 ^ xor2;
	}
}
