public class Code05 {
    public static void main(String[] args){
        int[] arr = {121, 343, 567};
        int totalrepeat = 0;
        int digit1, digit2;
        for( int i  = 0; i<arr.length; i++){
            int n  = arr[i];
            while( n > 0){
                digit1 = n%10;
                while( n > 0){
                    digit2 = n%10;
                    if(digit1 == digit2){
                        totalrepeat++;
                        n = n/10;
                    }
                }
                n = n/10;
            }
        }
        System.out.println("Total repeating digits : "+ totalrepeat);
    }
}
