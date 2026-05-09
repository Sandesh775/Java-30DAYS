import java.util.Scanner;
public class CountVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        word = word.toUpperCase();
        char [] chars = word.toCharArray();
        int count = 0;
        for(int i = 0; i< word.length();i++){
            if(chars[i] == 'A'|| chars[i] == 'E'||chars[i] == 'I'|| chars[i] == 'O'|| chars[i] == 'U'){
                count++;
            }
        }
        System.out.println("Vowels number count in word is "+count);
    }
}
