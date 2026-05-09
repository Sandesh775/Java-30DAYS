import java.util.*;
public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int digit;
        int fact = 1;
        System.out.println("Printing the factorial of only even digits in a number "+num);
        while(num > 0){
            digit = num%10;
            int cp = digit;
            if(digit % 2 == 0){
                while(digit > 0){
                    fact = fact * digit;
                    digit--;
                }
                System.out.println(cp+"! = "+fact);
            }
            fact = 1;
            num = num / 10;
        }
    }
}
