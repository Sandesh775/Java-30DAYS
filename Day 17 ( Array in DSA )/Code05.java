public class Code05 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,8};
        int temp;
        //int m = (a.length/2)+1;
        int n = a.length-1;
        for(int i = 0; i< a.length/2; i++){//for(int i = 0; i< m; i++)
            temp = a[i];
            a[i] = a[n];
            a[n] = temp;
            n--;
        }
        System.out.println("Array in reverse position : ");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
    }
}