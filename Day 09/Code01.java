public class Code01 {
    public static void main(String[] args){
        int [] arr = {56,7,80,12,34,56,89};
        int sum = 0;
        for(int a : arr){
            sum = sum + a;
        }
        System.out.println("Sum of all elements in an array is : "+sum);
    }
}