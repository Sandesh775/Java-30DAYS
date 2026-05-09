public class Code04 {
    public static void main(String[] args){
        int [] arr = {1, 5, 3};//{1, 3, 5, 7};//{ 1,2,3,4,5,6,7,8};
        int count = 0;
        for(int i = 0; i< arr.length-1; i++){
            if( arr[i+1]> arr[i] ){
                count++;
            }
        }
        if(count == arr.length-1){
            System.out.println("Array is Sorted in ascending order !");
        }
        else{
            System.out.println("Array is not sorted in ascending order !");
        }
    }
}
