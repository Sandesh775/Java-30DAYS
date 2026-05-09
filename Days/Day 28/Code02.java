import java.util.Scanner;
public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for( int i = 2; i<n-1; i++){
            if( n%i== 0){
                isPrime = false;
                System.out.println("Entered number is not a prime !");
                break;
            }
        }
        if(isPrime){
            System.out.println("Entered number is a prime number !");
        }
    }
}