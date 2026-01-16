public class Code02 {
    public static void main(String[] args){
        int [] arr = { 1,2,2,3,3,3,4,4,9,10,10};
        boolean isFirst = false;
        System.out.println("First occurrence of each unique element:");
        for(int i =0; i<arr.length; i++){
            // Check if this element appears before current position
            isFirst = true;
            for(int j =0; j<i; j++){
                    if(arr[i] == arr[j]){
                        isFirst = false;
                        break;
                    }
            }
            // If it's the first occurrence, print it
            if(isFirst){
                System.out.println("arr["+i+"] : "+arr[i]);
            }
        }
    }
}