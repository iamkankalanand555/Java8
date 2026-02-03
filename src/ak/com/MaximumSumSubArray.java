package ak.com;

public class MaximumSumSubArray {
    //MaximumSumSubArray of size k
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        System.out.println(maxSubarraySum(arr));//O(N^2)

        long maximumSubArraySumUsingKadaneAlgorithm
                = findMaximumSubArraySumUsingKadaneAlgorithm(arr);//O(N)
        System.out.println(maximumSubArraySumUsingKadaneAlgorithm);
    }
    //O(N²)
    //The time complexity of brute force approach is O(N²)
    // where N is size of the array as we have two nested loops
    // and space complexity is O(1) as we are not using any extra space.
    static int maxSubarraySum(int[] arr) {
        int result = arr[0];
        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                // Update result if currentSum is greater than result
                result = Math.max(result, currentSum);
            }
        }
        return result;
    }

    //O(N)
    //The time complexity of Kadane's approach is O(N),
    // where N = size of the array as we are using a single loop running N times.
    // Also Space Complexity is O(1) as we are not using any extra space.
    private static long findMaximumSubArraySumUsingKadaneAlgorithm(int[] arr) {
        long sum = 0;
        long maxSum = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        if(maxSum < 0) {
            maxSum = 0;
        }
        return maxSum;
    }
}
