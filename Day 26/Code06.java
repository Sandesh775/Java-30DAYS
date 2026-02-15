public class Code06 {
    public static void main(String[] args) {
        int[]a = {4,1,2,1,2};
        int XOR = a[0];
        for(int i = 1; i<a.length; i++){
            XOR = XOR^a[i];
        }
        System.out.println("Output :: "+XOR);
    }
}
/*
* int [] a = {4,1,2,1,2};
        int count = 0;
        for( int i = 0; i<a.length; i++){
            count = 0;
            for( int j = 0; j<a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Output : "+a[i]);
                return;
            }
        }
        * */