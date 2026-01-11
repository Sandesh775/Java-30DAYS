public class Code04 {
    public static void main(String [] args){
        int [] arr = {34,57,90,89,67,77};
        int len = arr.length;
        int count = 0;
        for(int i =0; i < len; i++){// even for-each loop works fine in this task
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Count even number in an array : "+count);
    }
}
