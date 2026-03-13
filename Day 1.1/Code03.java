/*
*  * Question 3: Given an array, calculate prefix sum array
* Concept : Prefix Sum
 * Input:  {1, 2, 3, 4, 5}
 * Output: {1, 3, 6, 10, 15}
 * prefix[i] = sum of arr[0] to arr[i]
 * */
public class Code03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];   // incremental accumulation
            System.out.print(sum + " ");
        }
    }
}
/*
public class Code03 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int sum = 0;
        for( int i = 0; i<a.length; i++){
            for( int j = i; j < i+1; j++){
                sum += a[j];
            }
            System.out.print(sum +" ");
        }
    }
}
 */