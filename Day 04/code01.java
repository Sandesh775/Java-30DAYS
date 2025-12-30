import java.util.Scanner;
public class code01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Entered number is prime !");
        } else {
            System.out.println("Entered number isn't prime !");
        }
    }
}