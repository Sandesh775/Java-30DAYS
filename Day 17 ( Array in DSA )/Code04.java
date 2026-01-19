public class Code04 {
    public static void main(String[] args){
        int[] a = { 1,25,4,6,7,9,10};
        int max1 = -1;
        int max2 = -2;
        for( int i = 0; i< a.length; i++){
            if( a[i] > max1 ){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.println("Second highest or largest element in an array : "+max2);
    }
}
