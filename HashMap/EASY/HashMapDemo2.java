import java.util.HashMap;
import java.util.Map;
public class HashMapDemo2 {
    static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

// 1. ADD key-value pair
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

// 2. GET value by key
        String name = map.get(2);  // Returns "Bob"
        String missing = map.get(999);  // Returns null (key doesn't exist)

        // Looping Through HashMap:
        // Method 1: Loop through keys
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Method 2: Loop through entries (BEST)
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Method 3: Loop through values only
        for (String value : map.values()) {
            System.out.println(value);
        }

// 3. CHECK if key exists
        if (map.containsKey(2)) {  // true
            System.out.println("Key 2 exists");
        }

// 4. CHECK if value exists
        if (map.containsValue("Alice")) {  // true
            System.out.println("Alice is in the map");
        }

// 5. REMOVE by key
        map.remove(3);  // Removes Charlie

// 6. SIZE
        int size = map.size();  // Returns 2

// 7. CLEAR all
        map.clear();

    }
}