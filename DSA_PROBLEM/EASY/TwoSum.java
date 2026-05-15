/*
* /**
 * Given: int[] nums, int target
 * Return: int[] with indices of two numbers that sum to target
 *
 * Example 1:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: nums[0] + nums[1] = 2 + 7 = 9
 *
 * Example 2:
 * Input: nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 *
 * Constraints:
 * - Only one valid answer exists
 * - Can't use same element twice
 *
 * YOUR TASKS:
 * 1. Solve with nested loops first (brute force)
 * 2. Then solve with HashMap (optimal)
 * 3. Compare time complexity
 *
 * TIME LIMIT: 60 minutes

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Your code here
    }
}

 */
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums,target);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        // key - index 0-4
        hashMap.put(0,2);
        hashMap.put(1,7);
        hashMap.put(2,11);
        hashMap.put(3,15);


    }
    public static void twoSum(int[] arr, int target){
        for(int i = 0; i< arr.length-1; i++){
            for( int j = i+1; j< arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Output : ["+i+" , "+j+"]");
                    return;
                }
            }
        }
    }
    public static void twoSumWithHashMap(){

    }
}