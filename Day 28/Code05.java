public class Code05 {
    public static void main(String[] args) {
        int[] a = {3,1,4,2,3,1,2,3};
        boolean isUnique = true;
        for( int i = 0; i<a.length; i++){
            isUnique = true;
            for( int j = 0; j<i; j++){
                if(a[i] == a[j]){
                    isUnique = false;
                }
            }
            if(isUnique){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println(" ");
        int count = 0;
        for( int i = 0; i<a.length; i++){
            isUnique = true;
            for( int j = 0; j<i; j++){
                if(a[i] == a[j]){
                    isUnique = false;
                }
            }
            count = 1;
            for( int j = i+1; j<a.length; j++){
                if(isUnique && a[i] == a[j]){
                    count++;
                }
            }
            if(isUnique){
                System.out.println("Number : "+a[i]+" Occurence : "+count);
            }
        }
    }
}