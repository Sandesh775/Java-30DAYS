import java.util.Map;
import java.util.HashMap;
public class CheckDuplicateUsingHashMap {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        // Key - array value, Value - value's frequency !

        // loop through array
        for(int ar : a){
            if(map.containsKey(ar)){
                int frequency = map.get(ar);
                map.put(ar,frequency+1);
            }
            else {
                map.put(ar,1);
            }
        }

        // loop through entries
        System.out.println("Duplicate found: ");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                //System.out.println(entry.getKey()+" -> "+ entry.getValue());
                System.out.println(entry.getKey());
            }
        }
    }
}