import java.util.Scanner;
public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        int count = 0;
        for(int i =0; i<word.length(); i++){
            for( int j = 0; j<word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count-word.length());
    }
}