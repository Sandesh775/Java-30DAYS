import java.util.*;
public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word : ");
        String word = sc.nextLine();
        System.out.println("Enter second word ");
        String word2 = sc.nextLine();
        if(word.length() == word2.length()){
            char[] ch = word.toLowerCase().toCharArray();
            char[] ch2 = word2.toLowerCase().toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch2);
            if(Arrays.equals(ch,ch2)){
                System.out.println("Words are anagram !");
            }
            else{
                System.out.println("Word are not anagram !");
            }
        }
        else{
            System.out.println("Word are not anagram !");
        }
    }
}