import java.util.Scanner;
public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word : ");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word.length());
        for (int i = word.length()-1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        String reversed = sb.toString();
        if (word.equals(reversed)) {
            System.out.println("word is palindrome !");
        } else {
            System.out.println("word isn't palindrome !");
        }
    }
}
