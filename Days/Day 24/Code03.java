public class Code03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int len = a.length-1;
        boolean isPalindrome = false;
        for( int i = 0; i<(a.length)/2; i++){
            if(a[i] == a[len]){
                isPalindrome = true;
            }
            len--;
        }
        if (!isPalindrome) {
            System.out.println("Array is not palindrome !");
        } else {
            System.out.println("Array is palindrome !");
        }
    }
}
