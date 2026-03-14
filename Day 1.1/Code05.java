/*
* 5.	Find equilibrium index where left sum equals right sum
 Input: {1, 7, 3, 6, 5, 6}
Output: 3 (because sum left of index 3 = 1+7+3 = 11, sum right of index 3 = 5+6 = 11).
* If no such index exists, return -1
*/
public class Code05 {
    public static void main(String[] args) {
        int [] a = {1, 7, 3, 6, 5, 6};
        int [] prefix_arr = new int [a.length];
        int sum = 0;
        for( int i = 0 ; i<a.length; i++){
            sum += a[i];
            prefix_arr[i] += sum;
        }

    }
}
