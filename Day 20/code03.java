import java.util.Locale;
import java.util.Scanner;
public class code03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word = in.next();
        String lowword = word.toLowerCase();
        int countvowel = 0;
        for( int i = 0; i<word.length()-1; i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countvowel++;
            }
        }
        System.out.println("Vowels : "+(countvowel)+" Consonant : "+(word.length()-countvowel));
    }
}
