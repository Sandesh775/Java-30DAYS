// This program is the most manual or let's say time consuming method to solve this question :
// Write a program to find the largest element in an array
public class Code01A {
    public static void main(String[] args){
        int[] a = { 12,34,1,5,20,17};
        int temp;
        System.out.println("Before sorting an array : ");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
        for(int i = 0; i<a.length; i++){
            for( int j = (i+1); j<a.length; j++) {
                    if (a[j] < a[i]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
            }
        }
        System.out.println("\nAfter sorting an array : ");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nLargest element in an array : "+a[a.length-1]);
    }
}