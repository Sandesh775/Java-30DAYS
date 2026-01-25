public class Code06 {
    public static void main(String[] args){
        int[] a = {0, 1, 0, 3, 12};

        int lastNonZeroIndex = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                // Swap current element with element at lastNonZeroIndex
                int temp = a[i];
                a[i] = a[lastNonZeroIndex];
                a[lastNonZeroIndex] = temp;
                lastNonZeroIndex++;
            }
        }

        System.out.println("Output: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
