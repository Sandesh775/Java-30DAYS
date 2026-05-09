import java.util.Scanner;
public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int digit;
        while(num > 0){
            digit = num%10;
            System.out.println(digit+" >> "+(digit*digit));
            num = num / 10;
        }
    }
}