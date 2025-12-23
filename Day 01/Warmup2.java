import java.util.Scanner;
public class Warmup2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String s = sc.nextLine();
        int n;
        do {
            System.out.print("Enter how many time you want the copies of entered word to be print: ");
            n = sc.nextInt();
        }while(n <= 0);
        String getWord = stringTimes(s, n);
        System.out.println("Ouput :"+getWord);
    }
    public static String stringTimes(String word, int num){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < num ){
            sb.append(word);
            i++;
        }
        return sb.toString();
    }
}
