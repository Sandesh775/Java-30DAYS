public class Code02 {
    public static void main(String[] args) {
        int [] a = {1, 5, 7, -1, 5};
        int target = 6;
        for( int i = 0; i<a.length; i++){
            for( int j = i ; j<a.length ; j++){
                if( a[i] + a[j] == target){
                    System.out.println("Pair : "+a[i]+" , "+a[j]);
                }
            }
        }
    }
}