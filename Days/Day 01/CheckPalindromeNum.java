import java.util.Scanner;
public class CheckPalindromeNum {
    public static  void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negative numbers can't be palindromes");
            sc.close();
            return;  // Stop the program
        }
        int digit;
        int temp = num;
        int reversed = 0;
        while (temp > 0) {
            digit = temp % 10;
            reversed = reversed * 10 + digit;// reversed * 10 helps to shifting the place value of number from ones, tens, hundred, thousand etc ...
            temp = temp / 10;
        }
        if (num == reversed) {
            System.out.println("it is palindrome number ");
        } else {
            System.out.println("it is not palindrome number ");
        }
        sc.close();
    }
}
