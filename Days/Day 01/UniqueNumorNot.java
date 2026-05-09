import java.util.Scanner;
public class UniqueNumorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : " );
        int n = sc.nextInt();
        int num = n;
        int temp = n;
        int d1, d2;
        int nod = 0;
        int count = 0;
        while(num != 0){
            d1 = num %10;
            nod++;
            while(temp != 0){
                d2 = temp % 10;
                if(d1 == d2){
                    count++;
                }
                temp = temp/10;
            }
            temp = n;
            num = num/10;
        }
        if(nod == count){
            System.out.println("Number is unique ");
        }
        else{
            System.out.println("Number is not unique ");
        }
    }
}
