import java.util.Scanner;
public class InputValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        String S;
        do {
            System.out.print("Enter any number 0-10 : ");
            N = sc.nextInt();

        }while(N<0 || N>10);
        sc.nextLine();
        do {
            System.out.print("Enter any word length 1-15 : ");
            S = sc.nextLine();
        }while( S.length()<1 || S.length()>15);
        // output format
        System.out.println(N*2);
        System.out.println(S);

    }
}