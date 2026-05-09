public class Code05 {
    public static void main(String[] args){
        int[] arr = {90, 45, 100, 45, 68, 12, 1};
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest number in an array : "+largest);
    }
}
