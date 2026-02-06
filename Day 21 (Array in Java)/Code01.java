import java.util.*;
public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array (n): ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        // Now taking input for array :
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter value for array a["+i+"] : ");
            arr[i] = sc.nextInt();
            sum = sum+arr[i];// doing sum while taking inputs
        }
        // Now printing the result :
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("The sum of elements in an array is : "+sum);
    }
}
