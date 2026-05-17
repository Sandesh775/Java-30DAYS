import java.util.Arrays;
public class FirstIncreasingAdjacentPair {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 9, 2, 6};//{9, 4, 2, 5, 7};
        int[] result = findFirstIncreasingAdjacentPair(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Output : ");
        System.out.println(Arrays.toString(result));
    }
    public static int[] findFirstIncreasingAdjacentPair(int[] a){
        for( int i = 0; i<a.length-1; i++){
            if(a[i+1]>a[i]){
                return new int[]{a[i],a[i+1]};
            }
        }
        return new int[]{-1,-1};
    }
}