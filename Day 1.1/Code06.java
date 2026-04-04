//Q6.	Check if any subarray has sum = K using prefix sum
//Input: arr = {1, 4, 20, 3, 10, 5}, K = 33
//Output: true (subarray 20+3+10 = 33 from index 2 to 4)
//Input: arr = {1, 4, 20, 3, 10, 5}, K = 18
//Output: false (Hint: Use prefix sum and check if prefix[j] - prefix[i-1] == K)
public class Code06 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int k = 33;
        int [] prefix = new int[arr.length];
        int sum = 0;
        for( int i = 0; i<arr.length; i++){
            sum += arr[i];
            prefix[i] = sum;
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int subarraySum;

                if(i == 0) {
                    subarraySum = prefix[j];  // Sum from 0 to j
                } else {
                    subarraySum = prefix[j] - prefix[i-1];  // Sum from i to j
                }

                if(subarraySum == k) {
                    System.out.println("Found: subarray = "+k+" from index " + i + " to " + j);
                    return;
                }
            }
        }
            System.out.println("false (no subarray with sum " + k + ")");
    }
}