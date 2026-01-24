public class Code02 {
    public static void main(String[] args){
        int[] arr = {2, 5, 6, 9, 12};
        int evencount = 0, oddcount = 0;
        for( int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even : "+evencount+" Odd : "+oddcount);
    }
}
