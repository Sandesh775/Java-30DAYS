import java.util.*;
public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int digit;
        int count = 0;
        while(num > 0){
            digit = num%10;
            double sqr = Math.pow(digit,2);
            if(sqr % 2 == 0){
                count++;
            }
            num = num / 10;
        }
        System.out.println("Here digits square number being even count : "+count);
    }
}