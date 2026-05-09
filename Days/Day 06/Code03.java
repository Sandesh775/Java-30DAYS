public class Code03 {
        public static void main(String[] args){
            int digit = 5;
            int fact = 1;
            System.out.println("Factorial of a single digit which is 5 here : ");
            while(digit>0){
                fact = fact * digit;
                digit--;
            }
            System.out.println("Factorial : "+fact);
        }
}
