public class Code05 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        int count = 0;
        int totalcount = 0;
        for(int i = 0; i<arr.length; i++){
            count = 0;
            for(int j = 0; j< arr.length; j++){

                if((arr[i] == arr[j]) && i!=j){
                    count++;
                }
            }
            if(count == 0){
                totalcount++;
                System.out.println(arr[i]);
            }
            else{
                continue;
            }
        }
        System.out.println("Total number of unique elements in an array : "+totalcount);
    }
}