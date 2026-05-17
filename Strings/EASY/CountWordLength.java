public class CountWordLength {
    public static void main(String[] args) {
        String s = "I love Java";
        countWordLength(s);
    }
    public static void countWordLength(String s){
        String [] words = s.split(" ");
        for(String str : words){
            System.out.println("Word : "+str+" , Length : "+str.length());
        }
    }
}