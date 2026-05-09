// This program is the optimal method possible  to solve this question :
// Write a program to find the largest element in an array
public class Code01B {
    public static void main(String[] args) {
        int[] a = {12, 34, 1, 5, 20, 17};
        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("Largest emelent in an array : "+largest);
    }
}