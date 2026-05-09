/*
* Question 4: Find sum of elements between given indices using prefix sum
 * Concept : RANGE SUM QUERIES
 * Input: arr = {1, 2, 3, 4, 5}
 *        queries = {{1,3}, {0,2}, {2,4}}
 *
 * Output:
 * Sum[1 to 3] = 2+3+4 = 9
 * Sum[0 to 2] = 1+2+3 = 6
 * Sum[2 to 4] = 3+4+5 = 12
 * Hint: sum(i to j) = prefix[j] - prefix[i-1] (if i>0)
 *                    = prefix[j] (if i=0)
 * Analogy :
 * 10 cm stick:
|------------------|------------------|------------------|------------------|------------------|
0                 2                  4                  6                  8                 10

Small stick = 4 cm (placed once)
[==== 4 cm ====]

After placing it once:
[==== 4 cm ====] [====== 6 cm remaining ======]
0                4                              10
* Interval	    Meaning	                            Length
* [0,4]	    Used part (includes 0 and 4)	        4 cm
* (4,10]	Remaining (excludes 4, includes 10)	    6 cm
*
 * */
public class Code04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 1;
        int j = 3;
        // {1,3} - index 1 to 3
        System.out.println("Sum between range i: "+i+" to j: "+j+" is : "+rangeSum(arr,i,j));
    }
    public static int rangeSum(int[] arr, int i, int j){
        int [] prefix_array = new int[arr.length];
        int sum = 0;
        for( int k = 0 ; k<arr.length; k++){
            sum += arr[k];
            prefix_array[k] = sum;
        }
        if(i == 0){
            return prefix_array[j];
        } //else if (i > 0) {
            return prefix_array[j]-prefix_array[i-1];
    }
}
/*
 int sum = 0;
* for( int i = 0; i<a.length; i++){
            for( int j = i; j < i+1; j++){
                sum += a[j];
            }
            System.out.print(sum +" ");
        }
* */
/*
* int sum = 0;
        for( int i = 0 ; i<arr.length; i++){
            sum = 0;
            for( int j = 0; j< i+1; j++){
                sum += arr[j];
            }
            prefix_array[i] = sum;
        }
* */
/*
* int sum = 0;
        for( int i = 0 ; i<arr.length; i++){
            for( int j = i; j< i+1; j++){
                sum += arr[j];
            }
            prefix_array[i] = sum;

* */