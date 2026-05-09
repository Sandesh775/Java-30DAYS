public class Code01 {
    public static void main(String[] args) {
        int[] a = {0, 4, 5, 3, 1, 20, 10, 2, 12};
        int[] temp = a.clone(); // Work on a copy

        System.out.println("Elements in descending order:");
        for (int i = 0; i < a.length; i++) {
            // Find the largest remaining element
            int maxIndex = 0;
            for (int j = 1; j < temp.length; j++) {
                if (temp[j] > temp[maxIndex]) {
                    maxIndex = j;
                }
            }
            System.out.print(temp[maxIndex] + " ");
            temp[maxIndex] = Integer.MIN_VALUE; // Mark as used
        }
    }
}