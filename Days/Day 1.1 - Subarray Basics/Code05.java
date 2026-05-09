/*
* 5.Find equilibrium index where left sum equals right sum
 Input: {1, 7, 3, 6, 5, 6}
Output: 3 (because sum left of index 3 = 1+7+3 = 11, sum right of index 3 = 5+6 = 11).
* If no such index exists, return -1
* Equilibrium index = where left sum=right sum
Compare : prefix[i−1]==suffix[i+1]
left sum = prefix[i-1]
Right sum = suffix[i+1]
* If i is not counted → Equilibrium Index.
*/
public class Code05 {
    public static void main(String[] args) {
        int [] a = {1, 7, 3, 6, 5, 6};
        int index = findEquilibriumindex(a);
        if(index == -1){
            System.out.println("Equilibrium index doesn't exist !");
        }
        else {
            System.out.println("Equilibrium index is : "+index);
        }
    }
    public static int findEquilibriumindex(int[] a){
        int sum1 = 0, sum2 = 0;
        for( int i = 0; i<a.length; i++){
            sum1 = 0;
            sum2 = 0;
            // Left sum (j < i) (indices BEFORE i)
            // Equilibrium Index	j < i (exclude i)
            for( int j = 0; j<i; j++){// from 0 to i for first prefix(sub-array first part)
                sum1 += a[j];
            }
            // Right sum (j > i) (indices AFTER i)
            for( int j = i+1; j<a.length; j++){// from i+1 to remaining part of array second prefix(sub-array second or remaining part)
                sum2 += a[j];
            }
            if(sum1 == sum2){
                return i;
            }
        }
        return -1;
    }
}