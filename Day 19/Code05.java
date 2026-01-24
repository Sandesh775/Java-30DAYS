public class Code05 {
    public static void main(String[] args){
        String s = "Swiss";
        char check[] = s.toLowerCase().toCharArray();
        for( int i = 0; i<check.length; i++){
            for( int j = 1; j< check.length ; j++){
                if(check[i] != check[j]){
                    System.out.println("First non repeating letter found : "+check[i]);
                    return;
                }
            }
        }
    }
}
