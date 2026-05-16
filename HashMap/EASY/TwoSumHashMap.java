/**
 * Find indices of two numbers that add up to target
 *
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 *
 * YOUR TASK:
 * 1. Create HashMap<Integer, Integer>
 *    - Key: number value
 *    - Value: index
 * 2. Loop through array
 * 3. For each number:
 *    - Calculate complement = target - current number
 *    - Check if complement exists in map
 *    - If yes, return [map.get(complement), current index]
 *    - If no, add current number to map
 *
 * TIME COMPLEXITY: O(n) - One pass!
 *
 * TIME LIMIT: 50 minutes
 */
import java.util.HashMap;
import java.util.Map;
public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        // create hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        //     key - number value , value - index
        // loop through array
        for( int i = 0; i< nums.length ; i++){
            int remaining = target - nums[i];

            // check if as key ; remaining lies on HashMap // Check if complement exists
            if(map.containsKey(remaining)){
                // if yes then congratulation we got another index
                return new int[]{i, map.get(remaining)};
            }
            // else Add current number to map
            map.put(nums[i],i);
        }

        return new int[]{-1, -1};  // No solution
    }
}