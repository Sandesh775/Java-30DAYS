import java.util.*;
public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int cp = num;
        int strong = 0;
        while(cp != 0){
            int n = cp % 10;// Get last digit
            strong += factorial(n);
            cp = cp/10;// Remove last digit
        }
        if(num == strong){
            System.out.println("Entered number : "+num+" is Strong number !");
        }
        else{
            System.out.println("Entered number : "+num+" isn't a  Strong number !");
        }
    }
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return  n * factorial(n-1);
    }
}