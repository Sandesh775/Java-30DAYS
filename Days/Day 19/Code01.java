public class Code01 {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int sum_at_odd_index = 0;
        for( int i  =0; i<a.length; i++){
            if(i%2 != 0){
                sum_at_odd_index += a[i];
            }
        }
        System.out.println("Here is the sum of elements at odd index in an array : "+sum_at_odd_index);
    }
}
