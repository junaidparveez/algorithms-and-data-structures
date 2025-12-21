package arrays;

public class MaximumConsecutiveOrder {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};

        int result = maxConsecutiveOnes(arr);
        System.out.println("Maximum consecutive 1s: " + result);
    }

    // Method to find maximum consecutive 1s
    static int maxConsecutiveOnes(int[] arr) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = maximum(count, max);
            } else {
                count = 0;
            }
        }
        return max;
    }

   
    static int maximum(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}
