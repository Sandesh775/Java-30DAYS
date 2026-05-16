/**
 * Count frequency of each character in a string
 *
 * Input: "hello"
 * Output:
 * h -> 1
 * e -> 1
 * l -> 2
 * o -> 1
 *
 * YOUR TASK:
 * 1. Create HashMap<Character, Integer>
 * 2. Loop through string
 * 3. For each character:
 *    - If exists in map, increment count
 *    - If not exists, add with count 1
 * 4. Print all entries
 *
 * TIME LIMIT: 30 minutes
 */
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String input = "hello";
        countFrequency(input);
    }

    public static void countFrequency(String s) {
        // create HashMap
        HashMap<Character,Integer> counter = new HashMap<>();
        // Character is Key and Integer as value but here used as counter for corresponding key !

        // loop through String
        for(char ch : s.toCharArray()){
            if(counter.containsKey(ch)){
                // first get current counter value from map
                int count = counter.get(ch);
                // then update with increment value
                count++;
                counter.put(ch,count);
            }
            else {
                counter.put(ch,1);// not exist, so it's first encounter set count 1 !
            }
        }
        // print all entries
        System.out.println("All entries : ");
        for(Map.Entry<Character,Integer> entry : counter.entrySet()){
            System.out.println("Character : "+entry.getKey()+" , Frequency : "+entry.getValue());
        }
    }
}