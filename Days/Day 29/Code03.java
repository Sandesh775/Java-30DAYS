public class Code03 {
    public static void main(String[] args) {
        int[] input = {121, 34, 44, 7};
        System.out.println("Array : ");
        for (int i : input){
            System.out.print(i+" ");
        }
        System.out.println("\nHere are some palindrome elements or number in given array : ");
        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            int cp = num;
            int rev = 0;
            int digit = 0;
            while (cp != 0) {
                digit = cp % 10;
                rev = (rev * 10 + digit);
                cp = cp / 10;
            }
            if (rev == num) {
                System.out.print(num + " ");
            }
        }
    }
}