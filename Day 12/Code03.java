import java.util.*;
public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String word = sc.nextLine();
        int count = 0;
        for( int i = 0; i< word.length(); i++){
            if( word.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("Number of words in entered sentence :"+(count+1));
    }
}
