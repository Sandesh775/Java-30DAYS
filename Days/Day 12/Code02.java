import java.util.Scanner;
public class Code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word = sc.next();
        System.out.println("Enter a number as to define prefix part for that word : ");
        int n = sc.nextInt();
        char[] rev = new char[n];
        char [] ch = new char[word.length()-n];
        int j = n;
        int k = 0;
        System.out.println(ch.length);
        System.out.println(word.length()-n);
        for( int i = 0; i< ch.length; i++){
            if(j < word.length()){
                ch[i] = word.charAt(j);
                break;
            }
            j++;
        }
        String concat = new String(ch);
        for(int i = n-1; i >= 0; i--){
            rev[k] = word.charAt(i);
            k++;
        }
        String concat2 = new String(rev);
        System.out.println("Entered word / string : "+word);
        System.out.println(concat2+concat);
    }
}
