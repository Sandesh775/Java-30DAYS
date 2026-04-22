// Given a string, now print all it's substrings
public class PrintAllSubStrings {
    public static void main(String[] args) {
        String string = "abc";

        System.out.println("All substrings of \"" + string + "\":");

        for (int i = 0; i < string.length(); i++) {// start index
            for (int j = i; j < string.length(); j++) {// end index

                String sub = "";
                for (int k = i; k <= j; k++) {// pointer or index to fetch and concat string between start and end
                    sub += string.charAt(k);
                }
                System.out.println(sub);
            }
        }
    }
}