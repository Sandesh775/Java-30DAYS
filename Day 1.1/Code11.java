/*
* Find the index where the array can be split into two subarrays with equal sum.
* or Find split point where sum of left part (including current index) equals sum of right part.
* Input:  {1, 2, 3, 4, 5, 5}
    Output: 3
    Explanation:
- Left (0 to 3): 1+2+3+4 = 10
- Right (4 to 5): 5+5 = 10 ✅ Equal!
*Equal Sum Split	"Split array into two equal sum subarrays" (i included in left)
* If i is counted in left → Equal Sum Split.
* */
public class Code11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int sum1 = 0, sum2 = 0;
        for( int i = 0; i< arr.length-1; i++){
            //Divide into 2 Equal Sum Subarrays	j <= i (include i)
            for( int j = 0; j<= i; j++){
                sum1 += arr[j];
            }
            for( int j = i+1; j<= arr.length; j++){
                sum1 += arr[j];
            }
            if(sum1 == sum2){
                System.out.println("Index : "+i);
                return;
            }
        }
        System.out.println("Such point or index doesn't exist !");
    }
}