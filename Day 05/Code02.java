import java.util.Scanner;
public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String input = sc.nextLine();
        int len = input.length();
        char[] ch = input.toCharArray();
        int wordcount = 0;
        for (int i = 0; i < len; i++) {
            if (ch[i] == ' ') {
                wordcount++;
            }
        }
        System.out.println("No of words in sentence : " + (wordcount + 1));
    }
}
