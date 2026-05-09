import java.util.Scanner;
public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 words of 4 letters ! :");
        String word1 = sc.next();
        String word2 = sc.next();
        String rotate = "";
        for(int i = word1.length()/2; i<word1.length(); i++){
            rotate += word1.charAt(i);
        }
        for(int i = 0; i<word1.length()/2 ; i++){
            rotate += word1.charAt(i);
        }
        if(word2.equals(rotate)){
            System.out.println(word2 +" is rotation of "+word1+" result : true !");
        }
        else {
            System.out.println(word2 +" is not a rotation of "+word1+" result : true !");
        }
    }
}
