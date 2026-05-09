import java.util.Scanner;
public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            count = 0;
            for( int j = 0; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if(count == 1 ){
                System.out.println("First non repeating character : "+word.charAt(i));
                return;
            }
        }
    }
}
