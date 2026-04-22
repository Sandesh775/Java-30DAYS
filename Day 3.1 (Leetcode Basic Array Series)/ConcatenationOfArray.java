//Given an integer array nums of length n, you want to create an array ans of length 2n
// where ans[i] == nums[i] and ans[i + n]
// == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
//
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
//Example 2:
//
//Input: nums = [1,3,2,1]
//Output: [1,3,2,1,1,3,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//        - ans = [1,3,2,1,1,3,2,1]
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 1000
//1 <= nums[i] <= 1000
//public class ConcatenationOfArray {
//    static void main() {
//        int[] nums = {1,2,1};
//        System.out.println("Input : ");
//        for(int i: nums){
//            System.out.print(i+" ");
//        }
//        System.out.println(" ");
//        int n = nums.length;
//        int[] ans = new int[2*n];
//        for(int i = 0; i< nums.length; i++){
//            ans[i] =nums[i];
//        }
//        int j = 0;
//        for(int i = n; i< ans.length; i++){
//            ans[i] =nums[j];
//            j++;
//        }
//        System.out.println("After concatenation : ");
//        for(int i: ans){
//            System.out.print(i+" ");
//        }
//    }
//}
// Alternative :
//public class ConcatenationOfArray {
//    static void main() {
//        int[] nums = {1,2,1};
//        int[] numsDuplicate = nums.clone();// made duplicate of input array ,so now we have two arrays
//        System.out.println("Input Array: ");
//        for(int i: nums){
//            System.out.print(i+" ");
//        }
//        System.out.println(" ");
//        System.out.println("Duplicate Array: ");
//        for(int i: numsDuplicate){
//            System.out.print(i+" ");
//        }
//        System.out.println(" ");
//        int n = nums.length;
//        int[] ans = new int[2*n];
//        for(int i = 0; i< nums.length; i++){
//            ans[i] = nums[i];
//        }
//        int j = 0;
//        for(int i = n; i< ans.length; i++){
//            ans[i] = numsDuplicate[j];
//            j++;
//        }
//        System.out.println("After concatenation : ");
//        for(int i: ans){
//            System.out.print(i+" ");
//        }
//    }
//}
// Optimal :
public class ConcatenationOfArray {
    static void main() {
        int[] nums = {1,3,2,1};
        System.out.println("Input Array: ");
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i< ans.length; i++){
            ans[i] = nums[i%n];// repeat around indices in nums array : 0,1,2,0,1,2...
        }
        System.out.println("After concatenation : ");
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
// Test cases done !, there may be more optimal than this you can try that !