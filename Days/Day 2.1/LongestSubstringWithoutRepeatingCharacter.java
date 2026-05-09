// 3.	Longest Substring Without Repeating Characters (Basic Version)
//Input: "abcabcbb"
//Output: 3 ("abc")
public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longestSubString = "";

        // i = start index
        for (int i = 0; i < input.length(); i++) {
            // j = end index
            for (int j = i + 1; j <= input.length(); j++) {

                // Build substring manually (no substring method)
                String sub = "";
                for (int k = i; k < j; k++) {
                    sub += input.charAt(k);
                }

                boolean isUnique = isUnique(sub);
//                boolean isUnique = true;
//                for (int a = 0; a < sub.length(); a++) {
//                    for (int b = a + 1; b < sub.length(); b++) {
//                        if (sub.charAt(a) == sub.charAt(b)) {
//                            isUnique = false;
//                            break;
//                        }
//                    }
//                    if (!isUnique) break;
//                }

                // If unique and longer than current longest, update
                if (isUnique && sub.length() > longestSubString.length()) {
                    longestSubString = sub;
                }
            }
        }

        System.out.println("Longest Substring Without Repeating Characters in \"" + input + "\" is: " + longestSubString);
        System.out.println("Length: " + longestSubString.length());
    }
    public static boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
        return true;
    }
}