public class Code02 {
    public static void main(String[] args){
        int [] arr = {12, 345, 68};//{ 23, 445, 89, 9000, 1,55};
        int evencount = 0;
        int digit;
        for(int a : arr){
            while( a > 0){
                digit = a%10;
                if( digit % 2 == 0){
                    evencount++;
                }
                a = a/10;
            }
        }
        System.out.println("Total even digits : "+ evencount);
    }
}
