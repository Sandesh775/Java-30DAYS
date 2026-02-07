public class Code04 {
    public static void main(String[] args) {
        String word = "I love Java";
        String result = "";
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) != ' '){
                result = result+word.charAt(i);
            }
        }
        System.out.println("Word : "+word);
        System.out.println("Spaces removed : "+result);
    }
}
