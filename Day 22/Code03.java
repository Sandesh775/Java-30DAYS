public class Code03 {
    public static void main(String[] args) {
        String word = "HeLLoWorLD";
        String op = word.toLowerCase();
        int count_lower = 0;
        for(int i = 0; i<op.length(); i++){
            char ch = word.charAt(i);
            if(ch>='a'&& ch<='z'){
                count_lower++;
            }
        }
        System.out.println("Upper: "+(word.length()-count_lower)+" Lower: "+count_lower);
    }
}
