import java.util.Scanner;
public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        char [] ch = word.toCharArray();
        int count = 0;
        for(int i = 0; i < word.length()-1; i++){
            if(ch[i] == ch[i+1]){
                count++;
            }
        }
        System.out.println("Count : "+count);
    }
}
