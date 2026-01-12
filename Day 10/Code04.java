public class Code04 {
    public static void main(String[] args){
        int [] arr = { 45, 90, 909, 11, 45, 555};
        int digit;
        int digitcount = 0;
        int evencount = 0;
        for( int a : arr){
            int cp = a;
            digitcount = 0;
            evencount = 0;
            while(a > 0){
                digit = a% 10;
                if(digit%2 ==0){
                    evencount++;
                }
                digitcount++;
                a = a/10;
            }
            System.out.println(cp+" contains "+digitcount+" digits and "+evencount+" even numbers");
        }
    }
}