import java.util.Arrays;
public class ShiftNegativeNumbersLeft {
    public static void main(String[] args) {
        int []arr = {2, -3, 4, -1, 5};
        System.out.println(Arrays.toString(arr));
        for(int i = 1; i< arr.length ; i++){
            if(arr[i]<0){
                for(int j = i; j>0; j--){// for (int j = i; j > 0 && arr[j - 1] >= 0; j--){}
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            else {
                continue;
            }
        }
        System.out.println("After transformation : ");
        System.out.println(Arrays.toString(arr));
    }
}