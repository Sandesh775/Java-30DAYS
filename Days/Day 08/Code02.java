public class Code02{
    public static void main(String[] args){
        int num = 12349733;
        int digit;
        int count = 0;
        while(num > 0){
            digit = num%10;
            System.out.println(digit);
            count++;
            if(count == 3){
                System.out.println("3 digits printing done !");
                break;
            }
            num = num /10;
        }
    }
}