public class Code01 {
    public static void main(String[] args){
        int [] arr = { 23, 1,40, 90, 24, 100};
        int largest = arr[0];
        int smallest = arr[1];
        int diff ;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if( arr[i] < smallest){
                smallest = arr[i];
            }
        }
        diff = (largest-smallest);
        System.out.println("Difference between max and min element in an array : "+largest+" and "+smallest+" : "+diff);
    }
}
