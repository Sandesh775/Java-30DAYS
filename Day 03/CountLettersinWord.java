import java.util.Scanner;
public class CountLettersinWord {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = sc.nextLine();
        char[] arr = word.toCharArray();
        int count = 0;
        for( char c : arr){// it is so realiable to use for each loop here becasue we only need elements to be fetched
            count++;// and at the same time we don't know where to stop (index wise )
        }
        System.out.println("Number of character in an array is "+count);
    }
}
