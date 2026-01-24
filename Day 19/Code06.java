public class Code06 {
    public static void main(String[] args){
        int []a = {0, 1, 0, 3, 12};
        for( int i = 0; i< a.length; i++){
            for( int j = 1; j< a.length; j++){
                if( a[j-1] == 0){
                    int temp = a[j];
                    a[j] = a[i-1];
                    a[i-1] = temp;
                }
            }
        }
        System.out.println("Output : ");
        for( int num: a){
            System.out.print(a+" ");
        }
    }
}
