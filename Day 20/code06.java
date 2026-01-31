import java.util.Scanner;
public class code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        int count = 0;
        int maxcount = 0;
        int maxindex = 0;
        boolean isChecked = false;
        for( int i = 0; i<word.length(); i++){
            count = 0;
            for( int j = 0; j <word.length(); j++){
                if( word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                maxindex = i;
            }
        }
        System.out.println("Here is a letter with highest occurence in string : "+word.charAt(maxindex)+" occurs "+maxcount+" times");
    }
}