import java.util.Scanner;
public class CountUniqueNums {
    public static void main(String[] args){
        int [] arr = {2, 4, 5,6, 2,2, 4, 5,4,4,4,6, 7};
        int count;
        int num;
        for(int i = 0; i< arr.length; i++){
            count = 0;
            num = arr[i];
            for(int j = 1; j <arr.length; j++){
                if(num == arr[i]){
                   count++;
                }
            }
        }
    }
}
