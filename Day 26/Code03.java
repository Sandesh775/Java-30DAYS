import java.util.Scanner;
public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word = sc.next();
        char maxch = ' ';
        int largestrepeat = 0;
        int count = 0;
        for( int i = 0; i<word.length(); i++){
            count = 0;
            for( int j = i; j<word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if(count > largestrepeat){
                largestrepeat = count;
                maxch = word.charAt(i);
            }
        }
        System.out.println("Output : "+largestrepeat+" Character : "+maxch);
    }
}