public class Code05 {
    public static void main(String[] args){
        char[] arr = { 'a','b','a','c'};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count = 0;
            for( int j = 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                        count++;
                }
            }
            if( count > 0){
                System.out.println(arr[i]+" is the first repeating character in an array !");
                return;
            }
        }
    }
}