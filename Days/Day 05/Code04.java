public class Code04 {
    public static void main(String[] args) {
        int[] arr = {30, 68, 90, 12, 34, 50, 12, 49};
        int largest = arr[0];
        int second = arr[1];
        for (int i = 0; i <= 1; i++) {
            if (i == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] > largest) {
                        largest = arr[i];
                    }
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == largest) {
                        continue;
                    } else {
                        if (arr[j] > second) {
                            second = arr[i];
                        }
                    }
                }
            }
        }
        System.out.println("Second highest element in an array : " + second);
    }
}