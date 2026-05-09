public class Code04 {
    public static void main(String[] args) {
        String[] arr = {"abc", "aaa", "kite", "pop"};
        System.out.println("Array : ");
        for( String s: arr){
            System.out.print(s+"  ");
        }
        int count = 0;
        System.out.println("\nSo here are those string or words Starting and Ending With Same Character : ");
        for( int i = 0; i<arr.length; i++){
            String str = arr[i];
            if(str.charAt(0) == str.charAt(str.length()-1)){
                count ++;
                System.out.print(arr[i]+"  ");
            }
        }
        System.out.println("\ncount : "+count);
    }
}