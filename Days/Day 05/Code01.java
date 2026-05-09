import java.util.Scanner;
public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int digit;
        int oddcount = 0, evencount = 0;
        while( n > 0){
                digit = n % 10 ;
                if(digit % 2 == 0){
                    evencount++;
                }
                else{
                    oddcount++;
                }
                n = n / 10;
        }
        System.out.print("Even digits : "+evencount+"\tOdd digits : "+oddcount);
    }
}
