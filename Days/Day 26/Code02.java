import java.util.*;
public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter value for a[" + (i) + "] :");
            a[i] = sc.nextInt();
        }
        System.out.println("Now enter the element you want to remove from an array :");
        int remove = sc.nextInt();
        for( int i = 0; i<a.length; i++){
            if(a[i] == remove){
                a[i] = 0;
            }
        }
        System.out.println("After removing : ");
        for( int i : a){
            System.out.print(i+" ");
        }
    }
}