public class Code05 {
    public static  void main(String[] args){
        int fact = 1;
        for(int i = 1; i <= 5; i++){
            fact = 1;
            int digit = i;
            while( digit > 0){
                fact = fact * digit;
                digit--;
            }
            System.out.println(i+"! : "+fact);
        }
    }
}