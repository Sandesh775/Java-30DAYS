public class Code03 {
    public static void main(String[] args){
        int[] a = {2,12,34,5,6,7};
        boolean isAscending = false;
        boolean isDescending = false;
        for(int i  = 0; i< a.length-1; i++){
            isAscending = true;
            isDescending = true;
            for( int j = 1; j < a.length; j++){
                if(a[i] < a[j]){
                    isAscending = false;
                    System.out.println("Array is not sorted !");
                    return;
                }
                else{
                    isDescending = false;
                    System.out.println("Array is not sorted !");
                    return;
                }
            }
        }
        if(!isAscending){
            System.out.println("Array is sorted in ascending order !");
        } else if (!isDescending) {
            System.out.println("Array is sorted in descending order !");
        }
    }
}
