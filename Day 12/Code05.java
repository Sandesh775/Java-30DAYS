import java.util.*;
public class Code05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        int count = 0;
        boolean isNum = false;
        for( int i = 0; i< word.length(); i++){
            isNum = Character.isDigit(word.charAt(i));
            if(isNum){
                    continue;
            }
            System.out.print(word.charAt(i));
        }
    }
}