import java.util.*;
public class Code04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();// next();
        int count = 0;
        for( int i = 0; i< word.length(); i++){
            if( word.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Number of words in entered sentence : "+(count));
    }
}