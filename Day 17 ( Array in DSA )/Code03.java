public class Code03 {
    public static void main(String [] args){
        int[]a = { 2,4,1,5,3};
        int temp;
        System.out.println("Array before sorting : ");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i]+"\t");
        }
        for( int i = 0; i < a.length; i++){
            for( int j = (i+1); j < a.length; j++){
                if(a[j] > a[i]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("\nArray in an descending order : ");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i]+"\t");
        }
    }
}