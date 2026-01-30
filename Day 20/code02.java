import java.util.Arrays;

public class code02 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int k = a.length-1;
        for( int i =0; i<a.length/2; i++){
            int j = k;
            if( j > 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            k--;
        }
        System.out.println(Arrays.toString(a));
    }
}
