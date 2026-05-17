import java.util.Map;
import java.util.HashMap;
public class WordLengthDictionary {
    public static void main(String[] args) {
        String [] words = {"apple", "cat", "elephant"};

        // create HashMap
        HashMap<String,Integer> map = new HashMap<>();
        // key -> String ( words ), value -> their length

        // loop through array of Strings
        for(String s : words){
            if(!map.containsKey(s)){
                map.put(s,s.length());
            }
//            if(map.containsKey(s)){
//                continue;
//            }
//            else {
//                map.put(s,s.length());
//            }
        }

        // output
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}