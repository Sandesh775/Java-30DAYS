public class FindLargestNumin2Darray {
    public static void main(String[] args){
        int [][] arr = {{1,23,4},{50,6,17},{10,12,999}};
        int largest = arr[0][0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(largest < arr[i][j]){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest element in 2D array matrix : "+largest);
    }
}
