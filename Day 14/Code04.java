public class Code04 {
    public static void main(String [] args){
        int [] arr = { 5,1,2,3,2,3,4,3,4,3,6,5};
        int count =0 ;
        System.out.println("Printing each of element without repeating their duplicates element, " +
                "but only encountering last occurence of that element :");
        for( int i = 0; i<arr.length; i++){
            count = 0;
            for( int j = (i+1); j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 0){
                System.out.println("a["+i+"] = "+arr[i]);
            }
        }
    }
}
/*
* /*
* for(int i = 0; i<arr.length; i++){
            count = 0;
            for(int j = (i+1); j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(arr[i]);
            }
            else{
                continue;
            }
        }*/