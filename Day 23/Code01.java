public class Code01 {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        for(int i =(a.length-k);i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        for(int i = 0; i<(a.length-k); i++){
            System.out.print(a[i]+" ");
        }
    }
}