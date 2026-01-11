public class Code01{
    public static void main(String[] args){
        int num = 12349733;
        int digit;
        while(num > 0){
            digit = num%10;
            if(digit % 2 == 0){
                System.out.println("Even digit encountered ! "+digit);
                break;
            }
            System.out.println(digit);
            num = num /10;
        }
    }
}