
/**
 * Input: "listen", "silent"
 * Output: true
 *
 * Input: "hello", "world"
 * Output: false
 *
 * Use HashMap to count character frequencies
 * Compare both HashMaps
 *
 * TIME: 40 minutes
 */
import java.util.HashMap;
public class TwoStringsAnagrams {
    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silent";

        System.out.println("Are strings : "+input1+", and "+input2+" anagrams ? : "+checkStrings(input1,input2));
    }
    public static boolean checkStrings(String str1,String str2){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        // count frequencies
        countFrequencies(map1,str1);
        countFrequencies(map2,str2);

        // compare both HashMaps ?
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
    // helper method to count and store key dynamically !
    public static void countFrequencies(HashMap<Character,Integer> m, String str){
        for(char c : str.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
    }
}