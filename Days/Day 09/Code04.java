import java.util.*;
public class Code04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        System.out.println("Entered word : "+word);
        System.out.println("Word in reverse : ");
        for(int i = word.length()-1; i >= 0; i --){
            char c = word.charAt(i);
            System.out.print(c);
        }
    }
}
