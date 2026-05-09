import java.lang.foreign.SymbolLookup;
import java.util.*;
public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Now enter numbers : ");
        for( int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of which you want to find frequency of : ");
        int num = sc.nextInt();
        int frequency = 0;
        for (int i: arr){
            if(i == num){
                frequency++;
            }
        }
        System.out.println("SO the frequency of a given number in an array is "+frequency);
    }
}