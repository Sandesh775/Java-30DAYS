public class Code02 {
    public static void main(String[] args) {
        int[]a = {1,2,4,5};
        int n = a.length+1;
        int expected_sum = (n*(n+1))/2 ;//15;
        int sum_here = 0;
        for(int i = 0; i<a.length; i++){
            sum_here = sum_here+a[i];
        }
        System.out.println("Here the missing number in an array is : "+(expected_sum-sum_here));
    }
}
