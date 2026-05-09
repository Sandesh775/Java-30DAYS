//import java.util.Arrays;
//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println("Before reverse : ");
//        System.out.println(Arrays.toString(arr));
//        reverseArray(arr);
//        System.out.println("After reverse : ");
//        System.out.println(Arrays.toString(arr));
//        //System.out.println(arr.length/2.0);
//    }
//    public static void reverseArray(int []a){
//        int n = a.length-1;
//        for (int i = 0; i<(a.length/2.0); i++){
//            int temp = a[i];
//            a[i] = a[n];
//            a[n] = temp;
//            n--;
//        }
//    }
//}
// using two pointer
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before reverse : ");
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After reverse : ");
        System.out.println(Arrays.toString(arr));

    }
    public static void reverseArray(int []a){
        int start = 0; // first index
        int end = a.length-1; // last index
        while (start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}