public class Code03 {
    public static void main(String[] args) {
        int n = 4;
        for( int i = 0; i<n; i++){
            for( int k = n-i-1; k > 0; k--){
                System.out.print(" ");
            }
            for( int j = 0; j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}