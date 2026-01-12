import java.util.*;
public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string or word : ");
        String word = sc.next();
        String upperword = word.toUpperCase();
        int count = 0;
        for( int i = 0; i < word.length(); i++){
            char c = upperword.charAt(i);// charAt(index) is a method of String class so it works
            if( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count++;
            }
        }
        System.out.println("Numbers of vowel letter in entered word or string : "+count);
    }
}
