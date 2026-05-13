public class CountSubarrayWithSumKQno8 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int k = 3;
        int subarraySum = 0;
        int count = 0;
        // forming every possible sub arrays
        for(int i = 0; i<arr.length; i++){
            for( int j = i; j<arr.length; j++){
                subarraySum = 0;
                for( int l = i; l<=j; l++){
                    subarraySum += arr[l];
                }
                if(subarraySum == k){
                    count++;
                }
            }
        }
        System.out.println("No of subarray with count : "+k+" are : "+count);
    }
}