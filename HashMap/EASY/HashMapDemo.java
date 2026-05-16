import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
   public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();// created hashmap
       // Key - Roll no, Value - Name
       // put() method to insert key-value pair
       map.put(1,"Ram");
       map.put(2,"Sandesh");
       map.put(3,"John");
       map.put(null,"Doe");
       // display map
       System.out.println(map);
       // get value using key !
       System.out.println(map.get(3));
       // check if contains key
       System.out.println(map.containsKey(1));
       // check if contains value
       System.out.println(map.containsValue("Doe"));
       // check if hashmap is empty
       System.out.println(map.isEmpty());
       // remove key "John" from map
       map.remove(3);
       System.out.println(map);
       // get only keys from hashmap
       System.out.println(map.keySet());
       // retrieve only values from hashmap
       System.out.println(map.values());

       // Different ways to iterate over HashMap
       // Loop through entries
       for(Map.Entry<Integer,String> entry : map.entrySet()){
           System.out.println("Key -> "+entry.getKey()+" Value -> "+entry.getValue());
       }
       // using for-each loop, Loop through keys
       for (Integer key : map.keySet()) {
           System.out.println("Key -> " + key + " Value -> " + map.get(key));
       }
    }
}