import java.util.*;
public class Code03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sen = sc.nextLine();
        String []words = sen.split(" ");
        int count = 0;// measure the length of current word
        int length = 0;// store the highest length until next one is encountered
        String largestword = "";// store the word with largest word length
        for(int i = 0; i< words.length; i++){
            count = 0;
            for( int j =0; j<words[i].length(); j++){
                count++;
            }
            if(count > length){
                length = count;
                largestword = words[i];
            }
        }
        // now printing the longest word in a sentence
        System.out.println("Word : "+largestword+"\tlength : "+length);
    }
}
