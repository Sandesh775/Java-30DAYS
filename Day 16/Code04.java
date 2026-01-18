import java.util.*;
public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sen = sc.nextLine();
        String[] words = sen.toLowerCase().split(" ");
        int vowel = 0;
        int consonant = 0;
        for( int i = 0; i < words.length; i++){
            for( int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(ch  == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowles = "+vowel+" Consonant = "+consonant);
    }
}