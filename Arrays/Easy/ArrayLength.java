//Counting elements in a given array without using .length property.
import java.util.Arrays;
public class ArrayLength {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Given Array : "+Arrays.toString(arr));
        int count = lengthOfArray(arr);
        System.out.println("Length of an given array is : "+count);
    }
    public static int lengthOfArray(int[] a){
        int count = 0;
        for(int i : a){
            count++;
        }
        return count;
    }
}