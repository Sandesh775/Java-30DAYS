public class Code02 {
    public static void main(String[] args){
        int [] arr = {1, 0, 3, 0, 5};
        int zerocount = 0;
        for(int i = 0; i< arr.length; i++){
            if( arr[i] == 0){
                zerocount++;
            }
        }
        for( int j = 1 ; j <= zerocount; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    if (i == arr.length - 1) {
                        break;
                    }
                    arr[i] = arr[i + 1];
                    arr[i + 1] = 0;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }
}

