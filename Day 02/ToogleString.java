import java.util.Scanner;
public class ToogleString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word : ");
        String word = sc.nextLine();
        char [] arr = word.toCharArray();
        for(int i = 0; i<word.length();i++){
            if(Character.isLowerCase(arr[i])){
                arr[i] = Character.toUpperCase(arr[i]);
            }
            else{
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        String toggled = new String(arr);
        System.out.println("After toogle effect : "+toggled);
    }
}
