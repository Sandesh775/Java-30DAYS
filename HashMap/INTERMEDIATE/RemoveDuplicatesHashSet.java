/**
 * Remove duplicate characters from string (keep first occurrence, remove occurrence other than the first one )
 *
 * Input: "programming"
 * Output: "progamin"
 *
 * YOUR TASK:
 * 1. Create HashSet<Character>
 * 2. Create StringBuilder for result
 * 3. Loop through string
 * 4. If character NOT in set:
 *    - Add to set
 *    - Append to result
 * 5. Return result as string
 *
 * TIME LIMIT: 30 minutes
 */
import java.util.HashSet;
public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));  // progamin
        System.out.println(removeDuplicates("hello"));  // helo
    }

    public static String removeDuplicates(String s) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for( Character c : s.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}