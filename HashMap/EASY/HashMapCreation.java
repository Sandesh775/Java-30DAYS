import java.util.HashMap;
public class HashMapCreation {
    public static void main(String[] args) {
        // Create a HashMap storing : Students -> Marks
        HashMap<String , Integer> studentLog = new HashMap<>();

        // inserting data into log / hashmap !
        studentLog.put("Ram",85);
        studentLog.put("Sita",90);
        studentLog.put("Hari",79);

        //print marks of "Sita"
        System.out.println("Marks of Sita : "+studentLog.get("Sita"));

        //print entire map
        // using keySet()
        for(String key : studentLog.keySet()){
            System.out.println(key+" -> "+studentLog.get(key));
        }
    }
}