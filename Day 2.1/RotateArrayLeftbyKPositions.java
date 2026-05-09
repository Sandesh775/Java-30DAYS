/*
* Rotate Array Left by K Positions
Input: {1,2,3,4,5}, K = 2
Output: {3,4,5,1,2}
Use extra array OR in-place logic.
*/
public class RotateArrayLeftbyKPositions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int K = 2;
        int n = arr.length;
        System.out.println("Before rotation : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int result[] = new int[arr.length];
        // shift elements from K to n of arr by 2 position
        for(int i = K ; i < n; i++){
            result[i-K] = arr[i];
        }
        // shift beginning elements to right n-K positions right
        for( int i = 0; i<K; i++){
            result[i+(n-K)] = arr[i];
        }
        System.out.println(" ");
        System.out.println("After rotation by K = "+K+" position left : ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
//public class RotateArrayLeftbyKPositions {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int K = 2;
//        System.out.println("Before rotation : ");
//        for( int i: arr){
//            System.out.print(i+" ");
//        }
//        System.out.println(" ");
//        for( int i = 0; i<K; i++){
//            rotateOne(arr,K);
//        }
//        System.out.println("After rotation by K = "+K+" : ");
//        for( int i: arr){
//            System.out.print(i+" ");
//        }
////        int k = K;
////        System.out.println("Before rotation : ");
////        for( int l : arr){
////            System.out.print(l+" ");
////        }
////        System.out.println(" ");
////        int[] extra = new int[arr.length];
////        for( int i = 0; i< arr.length; i++){
////            if(k < arr.length){
////                extra[i] = arr[k++];
////            }
////        }
////
////        for(int i = 0; i < arr.length - K; i++){
////            extra[i] = arr[k++];
////        }
////
////        for(int i = 0; i < K; i++) {
////            extra[arr.length - K + i] = arr[i];  // arr.length-K+i gives: 3,4
////        }
////
////        for( int m: extra){
////            System.out.print(m+" ");
////        }
//    }
//    public static void rotateOne(int[] arr, int k){
//        k = k % arr.length;
////        if(k == 0 || k == arr.length){
////            return arr;
////        }
//        if(k > 0){
//            int temp = arr[0];
//            for( int  i = 0; i<arr.length-1; i++){
//                arr[i] = arr[i+1];
//            }
//            arr[arr.length-1] = temp;
//        }
////        return rotateOne(arr,k--);
//    }
//}