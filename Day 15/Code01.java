public class Code01 {
    public static void main(String[] args){
        int []  arr = { 1,1,2,3,3,3,4,4,6,9,9,9,99,9,9,9,9,9,9};
        int count = 0;
        boolean repeated = false;
        int totalcount = 0;
        for( int i = 0; i< arr.length; i++){
            count  = 0;
            repeated = false;
            for(int j = 0; j<arr.length; j++){
                if( (arr[i] == arr[j]) && (i!=j)){
                    count++;
                    if(i < j && (arr[i] == arr[j]) ){
                        repeated = true;
                    }
                }
            }
            if( count > 0 && !repeated){
                totalcount++;
            }
        }
        System.out.println("Total repeated elements in an array : "+totalcount);
    }
}
