import java.util.*;
public class Code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        char [] ch = word.toCharArray();
        //char [] ch2 = new char[word.length()];
        int count = 0;
        int j = 0;
        for(int i = word.length()-1; i >= 0; i--){
            char ch3 = word.charAt(i);
            if(ch3 == ch[j]){
                count++;
            }
            j++;
        }
        if(count == word.length()){
            System.out.println("Word is palindrome !");
        }
        else{
            System.out.println("Word is not palindrome !");
        }
    }
}
