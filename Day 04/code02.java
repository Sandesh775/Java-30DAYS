import java.util.Scanner;
public class code02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto to nth term you want fibonacci series to be print :");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int c = 0;
        if(n >= 1){
            System.out.print(a+"\t");
        }
        if (n >= 2) {
            System.out.print(b+"\t");
        }
        while(n >= 3){
            c = a + b;
            System.out.print(c+"\t");
            a = b;
            b = c;
            n--;
        }

    }
}
