public class LongestContinousVowelStreak {
    public static void main(String[] args) {
        String str = "beaautiful";
        int result = longestVowelStreak(str.toLowerCase());
        System.out.println(result);
    }
        public static int longestVowelStreak(String s) {
            int maxStreak = 0;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                    if (count > maxStreak){
                        maxStreak = count;
                    }
                } else {
                    count = 0;
                }
            }
            return maxStreak;
    }
}