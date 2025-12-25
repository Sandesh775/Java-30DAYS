import java.util.Scanner;
public class CountRepeatDigitinNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int n1 = num;int n2 = num;
        int d1, d2;
        int count = 0;
        while( n1 != 0){
            count = 0;
            d1 = n1%10;
            while(n2 != 0){
                d2 = n2%10;
                if(d1 == d2){
                    count++;
                }
                n2 = n2/10;
            }
            if(count>1) {
                System.out.println("Repeated number : " +d1);
            }
            n2 = num;
            n1 = n1/10;
        }
    }
}
