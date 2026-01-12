public class Code06 {
    public static void main(String[] args){
        int[] arr= {23, 45, 121, 88};//{ 23, 13, 121,4, 55, 90};
        int digit;
        for(int a : arr){
            int rev = 0;
            int cp = a;
            while( a > 0){
                digit = a%10;
                rev = rev*10 + digit;
                a = a/10;
            }
            if(rev == cp){
                System.out.println("First palindrome num found : "+cp);
                break;
            }
            else{
                continue;
            }
        }
    }
}
