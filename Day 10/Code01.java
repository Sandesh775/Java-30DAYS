public class Code01 {
    public static void main(String [] args){
        int [] arr = { 14, 50, 15,13,60, 99, 36, 78};
        int smallest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if( arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Samallest element in an array is : "+smallest);
    }
}
