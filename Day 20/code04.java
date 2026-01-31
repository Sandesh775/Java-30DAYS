import java.util.Locale;
import java.util.Scanner;
public class code04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word3 = in.next();
        String word = word3.toLowerCase();
        char[] word2 = word.toCharArray();
        int j = 0;
        boolean ispalin = true;
        for( int i  = word.length()-1; i>= 0; i--){
            if(word2[i] != word.charAt(j)){
                ispalin = false;
                break;
            }
            j++;
        }
        if( ispalin ){
            System.out.println("Output : True");
        }
        else{
            System.out.println("Output : false");
        }
    }
}