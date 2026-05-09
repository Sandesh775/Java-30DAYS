public class Code02 {
    public static void main(String[] args) {
        int[] arr = {1, 4,9, 2,3,0,6};
        int smallest = arr[0];
        int largest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            } else if (arr[i]< smallest) {
                smallest = arr[i];
            }
        }
        // printing an array
        for( int i: arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("Maximum element: "+largest+" Minimum : "+smallest);
    }
}
