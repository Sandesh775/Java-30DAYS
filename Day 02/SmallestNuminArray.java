public class SmallestNuminArray {
        public static void main(String[] args){
            int[] arr = {10,2,3,45,105,50,4,1,90};
            int smallest = arr[0];
            for(int i = 1; i<arr.length; i++){
                if(arr[i]<smallest){
                    smallest = arr[i];
                }
            }
            System.out.println("Largest number in array is "+smallest);
        }
    }