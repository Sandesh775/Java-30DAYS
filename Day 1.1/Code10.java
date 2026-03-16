/*
Given an array, print prefix sum and suffix sum for each index.
* Calculate prefix sum and suffix sum of an array
* Array:
         {1,7,3,6,5,6}
* Prefix Sum (sum from left up to index i):
i=0 → 1
i=1 → 1+7 = 8
i=2 → 8+3 = 11
i=3 → 11+6 = 17
i=4 → 17+5 = 22
i=5 → 22+6 = 28
* Suffix Sum (sum from right up to index i):
i=5 → 6
i=4 → 5+6 = 11
i=3 → 6+11 = 17
i=2 → 3+17 = 20
i=1 → 7+20 = 27
i=0 → 1+27 = 28
* */
public class Code10 {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int prefix_sum = 0;
        System.out.println("Prefix sum : ");
        for( int i =0; i<arr.length; i++){
            prefix_sum += arr[i];
            System.out.print(prefix_sum+" ");
        }
        System.out.println(" ");
        int suffix_sum = 0;
        System.out.println("Suffix sum : ");
        for( int i =arr.length-1; i>=0; i--){
            suffix_sum += arr[i];
            System.out.print(suffix_sum+" ");
        }
    }
}