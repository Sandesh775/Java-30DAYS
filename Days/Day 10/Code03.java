public class Code03 {
    public static void main(String[] args){
        int [] arr = { 45, 90, 909, 11, 45, 555};
        int digit;
        for( int a : arr){
            System.out.println(a);
            while(a > 0){
                digit = a% 10;
                if(digit == 0){
                    System.out.println(a+" contains 0, Stopping..");
                    return;
                }
                a = a/10;
            }
        }
    }
}
