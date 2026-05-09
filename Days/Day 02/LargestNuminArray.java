public class LargestNuminArray {
    public static void main(String[] args){
        int[] arr = {10,2,3,45,105,50,4,2,90};
        int largest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest number in array is "+largest);
    }
}
