public class Code01 {
    public static void main(String[] args){
        int num = 1234896;
        int digits;
        System.out.println("Printing only even digits in a number 1234896 : ");
        while(num > 0){
            digits = num%10;
            if(digits % 2 == 0){
                System.out.print(digits+"\t");
            }
            num = num/10;
        }
    }
}
