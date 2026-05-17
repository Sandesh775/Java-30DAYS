/**
 * Input: [1, 2, 3, 2, 4, 3, 5]
 * Output: [2, 3]
 *
 * Use HashMap to count frequencies
 * Return elements with frequency > 1
 *
 * TIME: 35 minutes
 */
import java.util.HashMap;
import java.util.Map;
public class DuplicateInArray {
    public static void main(String[] args) {
        int [] input = {1, 2, 3, 2, 4, 3, 5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : input){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        // let's print duplicates
        System.out.println("Printing duplicates element in an array : ");
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){//if(map.get(entry.getKey())>1){
                System.out.println(entry.getKey());
            }
        }
    }
}