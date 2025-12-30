import java.util.Scanner;
public class code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int count = 0;
        int digit, sum = 0;
        while(n > 0){
            digit = n%10;
            sum = sum + digit;
            n = n/10;
            count++;
        }
        System.out.println("Digits count in number : "+count);
        System.out.println("Sum of digits : "+sum);
    }
}