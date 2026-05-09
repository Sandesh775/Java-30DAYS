public class Code05 {
    public static void main(String[] args) {
        int[] arr = {1};
        int len = arr.length;
        boolean isPalin = false;
        if(arr.length <= 1) {
            System.out.println("It is palindrome !");  // Empty or single element is palindrome
            return;
        }
        for( int i = 0; i<arr.length/2; i++){
            len--;
            if(arr[i] == arr[len]){
                isPalin = true;
            }
            else{
                isPalin = false;
                break;
            }
        }
        if(isPalin){
            System.out.println("yes it is a palindrome array !");
        }
        else{
            System.out.println("No it isn't a palindrome array !");
        }
    }
}
/*
* public class Code05 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,1};
        boolean isPalindrome = true;  // Assume true until proven false

        int lastIndex = arr.length - 1;
        for(int i = 0; i < arr.length/2; i++) {
            if(arr[i] != arr[lastIndex - i]) {  // Direct comparison
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ?
            "Yes, it's a palindrome array!" :
            "No, it's not a palindrome array!");
    }
}*/