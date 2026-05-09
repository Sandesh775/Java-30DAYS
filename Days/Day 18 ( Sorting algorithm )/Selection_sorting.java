public class Selection_sorting {
    public static void main(String[] args){
        int[] a = {13,2,9,8,3,20};
        for(int i = 0; i<a.length-1;i++){
            int min = i;// let's assume the i index is the minimum one right now in every i iteration
            for(int j = i+1; j<a.length; j++){// in inner loop we go all the way to last index because the unsorted part is in right side
                if( a[j] < a[min]){// this part is crucial and confirm why the second approach is in comment below
                    min = j;  // because we are not swapping everytime time any minimum value next to current one
                }
            }
            // And here finally the minimum index being confirmed we swap values here
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("Sorted array using selection sorting : ");
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
    }
}
/* not so optimal approach or solution !!
* for(int i =0; i<a.length-1;i++){
            for(int j = i+1; j<a.length; j++){
                if(a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }*/