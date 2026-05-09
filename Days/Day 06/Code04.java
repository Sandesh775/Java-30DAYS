import java.util.*;
public class Code04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int digit ;
        int fact = 1;
        while(num > 0){
            digit = num % 10;
            int cp = digit;
            while( digit > 0){
                fact = fact * digit;
                digit--;
            }
            System.out.println(cp+"! : "+fact);
            num = num / 10;
            fact = 1;
        }
    }
}
