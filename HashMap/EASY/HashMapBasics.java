import java.util.Map;
import java.util.HashMap;
public class HashMapBasics {
   public static void main(String[] args) {
        // Create HashMap
       HashMap<String,Integer> ages = new HashMap<>();
       // where Key is type - String and Value is type - Integer

       // Add data
       ages.put("Alice",25);
       ages.put("Bob",30);
       ages.put("Charlie",35);

       // get data
       System.out.println("Alice's age : "+ages.get("Alice"));

       // check if exists
       if(ages.containsKey("Bob")){
           System.out.println("Bob exists, age : "+ages.get("Bob"));
       }

       // loop method 1 : KeySet()
       System.out.println("\nUsing KeySet() : ");
       for(String name : ages.keySet()){// Key type : String
           System.out.println(name+" is "+ages.get(name)+" years old");
       }

       // Loop method 2: entrySet() - BEST
       System.out.println("\nUsing entrySet() : ");
       for(Map.Entry<String,Integer> entry : ages.entrySet()){
           System.out.println(entry.getKey()+" is "+entry.getValue()+" years old");
       }

       // Update value
       ages.put("Alice",26);// update existing key pair value

       // Remove
       ages.remove("Charlie");

       // Size
       System.out.println("\nTotal people: "+ages.size());

       // Get with default
       int age = ages.getOrDefault("Unknown",0);// Returns 0 if key doesn't exist
       System.out.println("\nUnknown's age : "+age);
    }
}