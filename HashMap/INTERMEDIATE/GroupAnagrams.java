/**
 * Group strings that are anagrams of each other
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 *
 * YOUR TASK:
 * 1. Create HashMap<String, List<String>>
 *    - Key: sorted version of word (e.g., "eat" -> "aet")
 *    - Value: list of original words
 * 2. For each word:
 *    - Sort its characters
 *    - Use sorted version as key
 *    - Add original word to list
 * 3. Return all values (groups)
 *
 * TIME LIMIT: 60 minutes
 */
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        // key - Sorted string, value - List<String> of unsorted strings

        for(String s : strs){
            String sorted = sortString(s);

            // If key not present, create a new list for it
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // Add the original word to the list for that key
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    // Helper: sort characters in a string
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}