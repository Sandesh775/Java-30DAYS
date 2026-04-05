/*Given an array of positive integers, now we have to check if the number  of
pairs of integer whose sum equals to a given number k or target, and accordingly print message
And we have to perform this using HashMap
* */
import java.util.HashMap;
public class TwoSumProblem {
    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        int target = 14;
        //      key ,  value
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        // putting array index and it's value as key-value pair in HashMap
        for( int i = 0; i<arr.length; i++){
            //          index as key, index value as value
            hashmap.put(i,arr[i]);
        }
        //System.out.println(hashmap);
        for( int i = 0; i<arr.length; i++){
            int a = arr[i];
            int more = target-a;
            if(hashmap.containsValue(more)){
                System.out.println("Two sum combination of target exist in array !");
                return;
            }
        }
        System.out.println("Two sum combination of target not found in array !");
    }
}