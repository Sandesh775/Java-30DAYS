public class Code02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println("Before : ");
        for(int i : a){
            System.out.print(i+" ");
        }
        for( int i = 1; i<a.length; i++){
                a[i] = a[i]+a[i-1];
        }
        System.out.println(" ");
        System.out.println("After : ");
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}