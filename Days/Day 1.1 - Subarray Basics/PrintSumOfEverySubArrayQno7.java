/*
* 7.	Write a program to print sum of every subarray
Input: {1, 2, 3}
Output:  Subarray [1] = 1
Subarray [1,2] = 3
Subarray [1,2,3] = 6
Subarray [2] = 2
Subarray [2,3] = 5
Subarray [3] = 3
*/
public class PrintSumOfEverySubArrayQno7 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        //int [] prefixSum = new int[arr.length];
        //int sum = 0;
        int sumSubarray = 0;
//        for( int i = 0; i< arr.length; i++){
//            sum += arr[i];
//            prefixSum[i] += sum;
//        }
        // subarray
        for( int i = 0;i<arr.length; i++){
            for( int j = i; j< arr.length ; j++){
                sumSubarray = 0;
                for( int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sumSubarray += arr[k];
                }
                System.out.println(" = "+sumSubarray);
            }
        }
    }
}