/*
* 2.	Find Maximum Sum Subarray (Brute Version)
Input: {−2,1,−3,4,−1,2,1,−5,4}
Output: 6 (because subarray {4,−1,2,1})
*/
public class Code02 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maximumSum = findMaxSubarray(arr);
        System.out.println("Maximum Sum Subarray is "+maximumSum);
    }
    public static int findMaxSubarray(int [] array){
        int max_sum = Integer.MIN_VALUE;  // Start with smallest possible
        for( int i = 0; i<array.length; i++){
            int curr_sum = 0;
            for( int j = i; j< array.length; j++){
                curr_sum += array[j];
                if(curr_sum > max_sum){
                    max_sum = curr_sum;
                }
            }
        }
        return max_sum;
    }
}