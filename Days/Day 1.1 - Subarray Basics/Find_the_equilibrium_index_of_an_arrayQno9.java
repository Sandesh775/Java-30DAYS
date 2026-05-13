public class Find_the_equilibrium_index_of_an_arrayQno9 {
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,2};
        int left_sum = 0;
        int right_sum = 0;
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for( int i = 1; i < arr.length-1 ; i++ ){
            left_sum = 0;
            right_sum = 0;
            for( int j = 0; j<i; j++){
                left_sum += arr[j];
            }
            for( int k = i+1; k< arr.length; k++){
                right_sum += arr[k];
            }
            if(left_sum == right_sum){
                System.out.println("Equilibrium index in array is : "+i+" value : "+arr[i]);
                return;
//                So even if multiple equilibrium indexes exist,
//                program prints only the FIRST one encountered.
            }
        }
    }
}