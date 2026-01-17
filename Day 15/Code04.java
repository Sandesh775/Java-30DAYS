public class Code04 {
    public  static  void main(String [] args){
        int[] arr = { 1,2,2,3,3};
        boolean isRepeat = false;
        for( int i  = 0; i < arr.length; i++){
            isRepeat = false;
            for( int j  = 0; j< i ; j++){
                if( arr[i] == arr[j]){
                    isRepeat = true;
                }
            }
            if(isRepeat){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}