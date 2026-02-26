public class Code01 {
    public static void main(String[] args) {
        String str = "aaabbc";
        int count = 1;
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            // If next character is same as current, increment count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
            else {
                // Append character and count
                output = output + str.charAt(i);
                output = output + count;
                count = 1;  // Reset count for next character
            }
        }
        System.out.println(output);
    }
}