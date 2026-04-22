// Q : Given an array find the maximum integer value of an array
import java.util.Arrays;
public class MaximumValueOfArray {
    public static void main(String[] args) {
        int[] arr = {5,2,3,9,0,1};
        int max = 0;
//        if(arr.length == 0){
//            return;
//        }
        for (int i = 1; i< arr.length; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        System.out.println("Input Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum value in an array : "+arr[max]);
    }
}