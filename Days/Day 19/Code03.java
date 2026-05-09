import java.util.*;
public class Code03 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or sentence : ");
        String word = sc.nextLine();
        String[] a = word.split(" ");
        System.out.println("Each word is reverse in individual : ");
        for( int i  =0; i<a.length; i++){
            for( int j = a[i].length()-1; j>= 0; j--){
                char c = a[i].charAt(j);
                System.out.print(c);
            }
            System.out.print("\t");
        }
    }
}
