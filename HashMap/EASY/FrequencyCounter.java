import java.util.Map;
import java.util.HashMap;
public class FrequencyCounter {
    public static void main(String[] args) {
        String s = "banana";

        // creating hashMap
        HashMap<Character,Integer> counter = new HashMap<>();
        //  key-> each character of String, value -> counting of corresponding key which is character

        // traversing over String ,also counting and maintaining each increment
        for(char c : s.toCharArray()){// store + update frequency dynamically
            if(counter.containsKey(c)){
                int count = counter.get(c);
                counter.put(c,++count);// already exist appear more than once so increment and update count
            }
            else {
                counter.put(c,1);// set to count 1 for first encountered character
            }
            // if-else can be one liner : counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        // Output:
        for (Map.Entry<Character,Integer> entry : counter.entrySet()){
            System.out.println(entry.getKey()+"  ->  "+entry.getValue());
        }
    }
}