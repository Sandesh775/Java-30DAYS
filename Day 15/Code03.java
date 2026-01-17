public class Code03 {
    public static void main(String[] args){
        int[] arr = { 1,2,2,3,44,4,4,5,5,5,5};
        int count  = 0;
        boolean checked = false;
        for( int i = 0; i<arr.length; i++){
            checked = false;
            for (int k = 0; k< i; k++){
                if( arr[i] == arr[k]){
                    checked = true;
                }
            }
            if(checked){
                continue;
            }
            count = 0;
            for(int j = 0; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if( count == 1 ){
                System.out.println(arr[i]);
            }
        }
    }
}
