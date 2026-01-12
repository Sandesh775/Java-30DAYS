public class Code05 {
    public static void main(String[] args){
        int [] arr = { 23, 1, 445, 505, 5555, 2};
        int sum = 0;
        int digit;
        for( int a : arr){
            sum = 0;
            int cp = a;
            while(a > 0){
                digit = a % 10;
                sum += digit;
                a = a/10;
            }
            System.out.println(cp +" >>> "+sum);
        }
    }
}
