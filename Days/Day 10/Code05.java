import java.util.*;
public class Code05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if((a > b && a < c)||(a < b && a > c)){
            System.out.println("a : "+a+" is the second largest among entered numbers !");
        }
        else if((b > a && b < c)||(b < a && b > c)){
            System.out.println("b : "+b+" is the second largest among entered numbers !");
        }
        else{
            System.out.println("c : "+c+" is the second largest among entered numbers !");
        }
    }
}
