import java.util.*;
public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String first = sc.next();
        System.out.println("Enter second string : ");
        String second = sc.next();
        int count1 = 0;
        int count2 = 0;
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                if(first.charAt(i) == second.charAt(i)){
                    for (int j = 1; j < first.length(); j++) {
                        if(first.charAt(i) == first.charAt(j)){
                            count1++;
                        }
                    }
                    for (int k = 1; k < first.length(); k++) {
                        if(second.charAt(i) == second.charAt(k)){
                            count2++;
                        }
                    }
                }
            }
        }
    }
}