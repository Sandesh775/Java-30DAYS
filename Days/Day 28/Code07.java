//public class Code07 {
//    public static void main(String[] args) {
//        int[] a = { 1, 3, 5, 3, 7 };
//        int target = 2; // difference = 2
//        for( int i = 0; i<a.length; i++){
//            for( int j = 0; j<a.length; j++){
//                if( a[i]-a[j]==target && i!=j){
//                    System.out.println("Pairs of difference 2 : ("+a[i]+" ,"+a[j]+")");
//                }
//            }
//        }
//    }
//}
public class Code07 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 3, 7};
        int target = 2;

        System.out.println("Pairs with difference " + target + ":");
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {  // j starts from i+1
                if(Math.abs(a[i] - a[j]) == target) {  // Check absolute difference
                    System.out.println("(" + a[i] + ", " + a[j] + ")");
                }
            }
        }
    }
}