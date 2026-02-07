public class Code06 {
    public static void main(String[] args) {
        int n = 9;
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Number is prime !");
        }
        else {
            System.out.println("Number isn't prime !");
        }
    }
}
