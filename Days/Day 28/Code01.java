import java.util.Scanner;
public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String word = sc.nextLine();
        int count_words = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == ' ') {
                count_words++;
            }
        }
        count_words++;
        System.out.println(count_words);
        String[] words = new String[count_words];
        for (int k = 0; k < words.length; k++) {
            words[k] = "";
        }
        int i = 0;
        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);
            if (ch == ' ') {
                i++;
                continue;
            }
            words[i] = words[i] + ch;
        }
        String[] words2 = new String[count_words];
        for (int k = 0; k < words2.length; k++) {
            words2[k] = "";
        }
        for (int k = 0; k < words2.length; k++) {
            for (int l = words[k].length() - 1; l >= 0; l--) {
                char ch = words[k].charAt(l);
                if (ch == ' ') {
                    k++;
                    break;
                }
                words2[k] = words2[k] + ch;
            }
        }
        for( String s : words2){
            System.out.print(s+" ");
        }
    }
}