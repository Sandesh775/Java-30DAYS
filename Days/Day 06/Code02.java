public class Code02 {
        public static void main(String[] args){
            int num = 694251;
            int count = 0;
            int digits;
            System.out.println("No of count in number 694251, how many are above or greater than 5 : ");
            while(num > 0){
                digits = num%10;
                if(digits > 5){
                    count++;
                }
                num = num/10;
            }
            System.out.println("Count : "+count);
        }
}

