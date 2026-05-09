public class Code05 {
    public static void main(String[] args){
        int num = 153;
        int digit;
        System.out.println("Printing num from right to left on new line 153 :");
        while(num >0){
            digit = num%10;
            System.out.println(digit);
            num = num/10;
        }
    }
}
