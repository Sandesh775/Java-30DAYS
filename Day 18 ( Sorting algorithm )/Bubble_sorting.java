public class Bubble_sorting {
    public static void main(String[] args){
        int[] a = {2,10,1,14,3,15};
        for(int i = 0; i<a.length-1; i++){
            boolean Swap = false;
            for(int j = 0; j< a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    Swap = true;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if(Swap){
                break;
            }
        }
        System.out.println("Sorted an array using bubble sort : ");
        for( int i = 0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
    }
}
/*
* for(int i = a.length-1 ; i>= 1; i--){
            for(int j = 0; j< i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }*/