public class Code03 {
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,1,0};
        int smallest = arr[0];
        // before sorting
        System.out.println("Before sorting : ");
        for( int i : arr){
            System.out.print(i+"  ");
        }
        for(int i = 0; i<arr.length-1; i++){
            for( int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // after sorting
        System.out.println(" ");
        System.out.println("After sorting : ");
        for( int i : arr){
            System.out.print(i+"  ");
        }
    }
}
