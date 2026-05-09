public class code01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,4,5,3};
        boolean isDuplicate = false;
        boolean isChecked = true;
        for( int i = 0; i< a.length; i++){
            isDuplicate = false;
            isChecked = false;
            for( int j = 0; j<a.length; j++) {
                if (a[j] == a[i] && j!=i) {
                    isDuplicate = true;
                }
                if (j < i) {
                    if (a[j] == a[i]) {
                        isChecked = true;
                    }
                }
            }
            if(isDuplicate && !isChecked){
                System.out.print(a[i]+" ");
            }
        }
    }
}
