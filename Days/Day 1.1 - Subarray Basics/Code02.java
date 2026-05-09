/*
* 2.	Find Maximum Sum Subarray (Brute Version)
Input: {−2,1,−3,4,−1,2,1,−5,4}
Output: 6 (because subarray {4,−1,2,1})
*/
/*
public class Code02 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maximumSum = findMaxSubarray(arr);
        System.out.println("Maximum Sum Subarray is " + maximumSum);
    }

    public static int findMaxSubarray(int[] array) {
        int max_sum = Integer.MIN_VALUE;  // Start with smallest

        for(int i = 0; i < array.length; i++) {
            int curr_sum = 0;
            for(int j = i; j < array.length; j++) {
                curr_sum += array[j];  // Add current element

                if(curr_sum > max_sum) {
                    max_sum = curr_sum;  // Update if bigger
                }
            }
        }
        return max_sum;
    }
}
*/
// Here is optimal brute-force solution :
//public class Code02 {
//    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int maximumSum = findMaxSubarray(arr);
//        System.out.println("Maximum Sum Subarray is "+maximumSum);
//    }
//    public static int findMaxSubarray(int [] array){
//        int max_sum = Integer.MIN_VALUE;  // Start with smallest possible
//        for( int i = 0; i<array.length; i++){
//            int curr_sum = 0;
//            for( int j = i; j< array.length; j++){
//                curr_sum += array[j];
//                if(curr_sum > max_sum){
//                    max_sum = curr_sum;
//                }
//            }
//        }
//        return max_sum;
//    }
//}
// Optimal solution to the Maximum subarray problem (Kadane's Algorithm)
//public class Code02{
//    public static void main(String[] args) {
//        int []arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int maxSum = arr[0];
//        int current_sum = arr[0];
//        for(int i = 1; i< arr.length; i++){
//            if( arr[i] > current_sum+arr[i]){
//                current_sum = arr[i];// either start from new position arr[i]
//            }
//            else {
//                current_sum = current_sum + arr[i];  // or Extend
//            }
//            if(current_sum > maxSum){
//                maxSum = current_sum;
//            }
//        }
//        System.out.println("Output : "+maxSum);
//    }
//}
// Kadane's Algorithm optimal solution i was comfortable with !
public class Code02{
    public static void main(String[] args) {
        int []arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Sum of maximum subarray is "+findMaxSubArray(arr));
    }
    public static int findMaxSubArray(int[] arr){
        int maxSum = arr[0];
        int current_sum = arr[0];
        for(int i = 1; i< arr.length; i++){
            current_sum += arr[i];
            if( current_sum > maxSum){
                maxSum = current_sum;
            }
            if(current_sum < 0){
                current_sum = 0;
            }
        }
        return maxSum;
    }
}
//if (maxEndingHere + arr[i] > arr[i]) {
//maxEndingHere = maxEndingHere + arr[i];  // Extend
//        } else {
//maxEndingHere = arr[i];                  // Start new
//        }
//
//        if (maxEndingHere > maxSoFar) {
//maxSoFar = maxEndingHere;                 // Update global max
//}