import  java.util.Scanner;
public class Code01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int digit;
        int sum = 0;
        int cp = num;
        while(num > 0){
            digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("Sum of all digits in number "+cp+" is :"+sum);
    }
}