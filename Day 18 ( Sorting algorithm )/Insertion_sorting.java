public class Insertion_sorting {
    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 6, 2};

        // Correct insertion sort
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];  // Element to insert
            int j = i - 1;

            // Shift elements greater than temp to the right
            while (j >= 0 && arr[j] > temp) {  // Correct condition
                arr[j + 1] = arr[j];  // Shift right
                j--;
            }

            // Insert temp at the correct position
            arr[j + 1] = temp;  // Correct assignment
        }

        System.out.println("Sorted array using insertion algorithm: ");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
    }
}