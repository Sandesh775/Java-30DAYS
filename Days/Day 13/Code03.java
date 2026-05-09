
public class Code03 {
    public static void main(String[] args){
        int[] arr = {23,47,18};
        int primecount = 0;
        int digit;
        for(int a : arr){
            while( a > 0){
                digit = a % 10 ;
                for( int i = 2; i < digit; i++){
                    if(a % i == 0){
                        primecount++;
                    }
                }
                a = a/10;
            }
        }
        System.out.println("Total prime digits : "+primecount);
    }
}
