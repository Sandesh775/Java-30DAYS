public class Code01 {
    public static void main(String[] args) {
        int[]arr = { 10,20,30,40,50};
        int sum = 0;
        for( int i = 0; i<arr.length; i++){
            if(i % 2 == 0){
                sum = sum+arr[i];
            }
        }
        System.out.println("Here is the sum of elements at even index in an array is : "+sum);
    }
}
