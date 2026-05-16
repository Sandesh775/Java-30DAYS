/**
 * Find first character that appears only once
 *
 * Input: "leetcode"
 * Output: 'l'
 *
 * Input: "loveleetcode"
 * Output: 'v'
 *
 * YOUR TASK:
 * 1. Count frequency of each character using HashMap
 * 2. Loop through string again
 * 3. Return first character with frequency == 1
 * 4. If none found, return '_'
 *
 * TIME LIMIT: 40 minutes
 */
/**
 * Find first character that appears only once
 *
 * Input: "leetcode"
 * Output: 'l'
 *
 * Input: "loveleetcode"
 * Output: 'v'
 *
 * YOUR TASK:
 * 1. Count frequency of each character using HashMap
 * 2. Loop through string again
 * 3. Return first character with frequency == 1
 * 4. If none found, return '_'
 *
 * TIME LIMIT: 40 minutes
 */
import java.util.Map;
import java.util.HashMap;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));  // l
        System.out.println(firstUniqChar("loveleetcode"));  // v
        System.out.println(firstUniqChar("aabb"));  // _
    }

    public static char firstUniqChar(String s) {
        // Step 1: Count frequencies
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first with freq == 1
        for(char c : s.toCharArray()){
            if(freq.get(c) == 1){
                return c;
            }
        }
        return '_';
    }
}
