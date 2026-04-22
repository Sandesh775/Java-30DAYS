// Q : Given an integer , and provided two indices
// now we have to perform swapping operation , interexchange of their positioning values
// and return array after swap.., assume that entered indices are valid
import java.util.Arrays;
public class SwappingValuesInArray {
    public static void main(String[] args) {
        int [] array = {1,36,5,80,95,14,69};
        System.out.println("Input array : ");
        System.out.println(Arrays.toString(array));
        System.out.println("Index1 : "+1+" Index2 : "+6);
        swap(array,1,6);
        System.out.println("After swapping : ");
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}