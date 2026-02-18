import java.util.Scanner;
public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n = sc.nextInt();

        int years = n / 365;
        int remainingDays = n % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(years + " years " + months + " months " + days + " days");

        sc.close();
    }
}