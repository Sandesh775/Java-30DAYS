/**
 * Count frequency of each word in a sentence
 *
 * Input: "hello world hello java world"
 * Output:
 * hello -> 2
 * world -> 2
 * java -> 1
 *
 * TIME: 30 minutes
 */
import java.util.HashMap;
import java.util.Map;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String str = "hello world hello java world";
        String [] a = str.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String s : a){
            if(map.containsKey(s)){
                int count = map.get(s);
                map.put(s,count+1);
            }
            else {
                map.put(s,1);
            }
        }

        // output :
        for(Map.Entry<String, Integer>entry : map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}