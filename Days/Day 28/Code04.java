public class Code04 {
    public static void main(String[] args) {
        int[] a = {3,1,4,2,3,5};
        for( int i = 0; i<a.length; i++){
            for( int j = i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println("This array contains duplicates !");
                    return;
                }
            }
        }
            System.out.println("Array don't contains any duplicate elements !");
    }
}