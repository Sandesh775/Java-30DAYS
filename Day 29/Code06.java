public class Code06 {
    public static void main(String[] args) {
        int[] a = {1,2,5,3,6,7};
        int[] b = {7,9,1,3};
        System.out.println("Intersection elements of two arrays : ");
        for ( int i = 0; i<a.length; i++){
            for( int j = 0; j<b.length; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}