/**
 * Input: "abcabcbb"
 * Output: 3 (substring "abc")
 *
 * Use HashSet to track current window
 * Sliding window technique
 *
 * TIME: 60 minutes (HARD)
 */

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        // creating HashSet
        HashSet<Character> set = new HashSet<>();

        StringBuilder result = new StringBuilder();
        // loop through String
        for(char c : s.toCharArray()){
            if(!set.contains(c)){// got unique characters collected !, or can say already got our possible longest
                set.add(c);      //  substring in a string !!!
                result.append(c);
            }
        }
        StringBuilder substring = new StringBuilder();

        String max_string = "";
        // But still need to track over String for actual longest substring exist !
        for( int i =0 ; i<(s.length()/result.length()); i++){

        }
    }
}