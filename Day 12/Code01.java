import java.util.Scanner;
public class Code01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int rem ;
        int count = 0;
        while( num > 0){
            rem = num % 10;
            count++;
            num = num /10;
        }
        //System.out.println(count);
        if(count == 1){
            System.out.println("Entered number position value is ones!");
        }
        else if(count == 2){
            System.out.println("Entered number position value is tens!");
        }
        else if(count == 3){
            System.out.println("Entered number position value is hundred!");
        }
        else if(count == 4){
            System.out.println("Entered number position value is thousand!");
        }
        else if(count == 5){
            System.out.println("Entered number position value is ten thousand!");
        }
    }
}
