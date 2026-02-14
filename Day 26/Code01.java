import java.util.*;
public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for( int i = 0; i<a.length; i++){
            System.out.println("Enter value for a["+(i)+"] :");
            a[i] = sc.nextInt();
        }
        System.out.println("Now enter target number to form from this array :");
        int target = sc.nextInt();
        for(int i = 0; i<a.length; i++){
            for( int j = i+1; j<a.length; j++){
                if((a[i]+a[j] == target)){
                    System.out.println("Output : "+a[i]+" + "+a[j]);
                    return;
                }
            }
        }
    }
}
