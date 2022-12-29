// Find Largest sum contiguous Subarray / Kadane's Algorithm
// Link - https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

public class practice {
   
    public static void maxSubarraySum(int[] array) {
        int size = array.length;
        int max_so_far = Integer.MIN_VALUE; // -2147483648
        int max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + array[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(max_so_far);
        }

    public static void main(String[] args) {
        int []array = {-1 ,-2 ,-3, -4};
        maxSubarraySum(array);
    }
}

