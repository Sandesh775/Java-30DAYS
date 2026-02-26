public class Code02 {
    public static void main(String[] args) {
        String input = "HelloH";

        // Edge case: null or empty
        if(input == null || input.isEmpty()) {
            System.out.println("Result: true (empty/null has all unique characters)");
            return;  // Exit program
        }

        // Create boolean array of size 256 (for ASCII)
        boolean[] charSeen = new boolean[256];
        boolean isUnique = true;  // Assume true until proven false

        // Loop through each character
        for(int i = 0; i < input.length(); i++) {
            // Get ASCII value of current character
            int asciiValue = input.charAt(i);

            // Check if this character was seen before
            if(charSeen[asciiValue] == true) {
                isUnique = false;
                System.out.println(" Duplicate found: '" + input.charAt(i) +
                        "' at position " + i);
                break;  // No need to check further
            }

            // Mark this character as seen
            charSeen[asciiValue] = true;
            System.out.println("  Character '" + input.charAt(i) +
                    "' (ASCII: " + asciiValue + ") - first time");
        }

        // Print final result
        if(isUnique) {
            System.out.println(" Result: true - All characters are unique!");
        } else {
            System.out.println(" Result: false - Duplicate characters found!");
        }
    }
}