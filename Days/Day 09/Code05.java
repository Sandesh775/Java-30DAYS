public class Code05 {
    public static void main(String[] args){
        int [] arr = { 50, 60, 47, 90, 80 , 100, 12, 30, 46};
        int count = 0;
        for(int a : arr){
            if(a > 50 ){
                count++;
            }
        }
        System.out.println("Number of elements greater than 50 in an array : "+ count);
    }
}
