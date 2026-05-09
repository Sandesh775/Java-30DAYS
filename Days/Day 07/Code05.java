import java.util.*;
public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int digit;
        while(num > 0){
            digit = num%10;
            if(digit == 5){
                System.out.println("5 had been encountered !");
                break;
            }
            System.out.println(digit);
            num = num / 10;
        }
    }
}