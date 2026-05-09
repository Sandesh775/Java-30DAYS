public class Code03 {
    public static void main(String[] args){
        int[] arr= {2,4,2,5,2};
        int x = 2;// let's have a look at fixed number in array, which is 2 here
        int count = 0;
        for(int a : arr){
            if( a == x){
                count++;
            }
        }
        System.out.println("Count of appreance of x = 2 in an array is : "+count);
    }
}
