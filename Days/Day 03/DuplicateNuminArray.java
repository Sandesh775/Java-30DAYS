public class DuplicateNuminArray{
    public static void main(String[] args){
        int [] arr = {1,2,1,3,4,2,4,5,6,8,5,9,9};
        System.out.println("Duplicate elements in an array : ");
        for(int i = 0; i< arr.length ; i++){
            for(int j = i+1; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+"\t");
                }
            }
        }
    }
}