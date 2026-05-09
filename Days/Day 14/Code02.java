import java.util.*;
public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String first = sc.next();
        System.out.println("Enter second string : ");
        String second = sc.next();
        String lowfirst = first.toLowerCase();
        String lowsecond = second.toLowerCase();
        int count = 0;
        int countletter = 0;
        if (first.length() == second.length()) {
            for( int m = 0; m < first.length(); m++){
                for( int n = 0; n< first.length(); n++){
                    if(first.charAt(m) == first.charAt(n)){
                        countletter++;
                    }
                }
            }
            countletter = countletter-first.length();
            for (int i = 0; i < first.length(); i++) {
                for (int j = 0; j < first.length(); j++) {
                    if (lowfirst.charAt(i) == lowsecond.charAt(j)) {
                        count++;
                    }
                }
            }
            if(countletter > 0 ){
                count = count - countletter;
            }
            if(count == first.length()){
                System.out.println("Entered words are anagram to each other !");
            }
            else{
                System.out.println("Entered words aren't anagram to each other ! because the frequency of letters doesn't match  ");
            }
        }
        else{
            System.out.println("Entered words aren't anagram to each other ! because length is different ");
        }
    }
}