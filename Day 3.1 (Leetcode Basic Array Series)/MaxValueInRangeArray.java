// Given an positive integer array, and indices as range inside an Array
// now we have to find maximum value in that particular range in an array
import java.util.Arrays;

public class MaxValueInRangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 45, 60, 12, 30, 99, 89};
        System.out.println(Arrays.toString(arr));

        int start = 2;
        int end = 5;  // Fixed: end should be within array bounds (0-6)

        int maxValue = findMaxInRange(arr, start, end);

        if (maxValue != -1) {
            System.out.println("Max value in range " + start + " to " + end + " is: " + maxValue);
        } else {
            System.out.println("Invalid range!");
        }
    }

    public static int findMaxInRange(int[] arr, int start, int end) {
        // Check for null array
        if (arr == null) {
            System.out.println("Array is null!");
            return -1;
        }

        // Check for empty array
        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return -1;
        }

        // Check if start is valid (not negative, not beyond array length)
        if (start < 0 || start >= arr.length) {
            System.out.println("Invalid start index: " + start);
            return -1;
        }

        // Check if end is valid (not less than start, not beyond array length)
        if (end < start || end >= arr.length) {// start > end
            System.out.println("Invalid end index: " + end);
            return -1;
        }

        // Find maximum in range
        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}