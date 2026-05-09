public class FrequencyOFeachNuminArray {
    public static void main(String[] args){
     int []arr = {1,2,5,1,9,8,10,2,5,1,4,5};
     int count;
     boolean isPrinted ;
     for(int i = 0; i < arr.length; i++){// for extracting each element one by one
         count = 1;
         for(int j = i+1; j< arr.length; j++){// for counting purpose
             if(arr[i]==arr[j]) {
                 count++;
             }
         }
         isPrinted = false;
         // Check if we already printed this element
         for(int k = 0; k < i; k++){
             if(arr[k] == arr[i]){
                 isPrinted = true;
                 break;
             }
         }
         // Print only if not printed before
         if(!isPrinted) {
             System.out.println("Element " + arr[i] + " occurs " + count + " times");
         }
     }
    }
}
