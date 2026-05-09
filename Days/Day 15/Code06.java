public class Code06 {
    public static void main(String[] args){
        String [] arr = {"abc", "kite", "loop"};
        int count = 0;
        for( int i  =0; i<arr.length; i++){
            count = 0;
            String  word = arr[i];
            for( int k  = 0; k<word.length(); k++) {
                char ch = word.charAt(k);
                for (int j = k+1; j < arr[i].length(); j++) {
                    if (word.charAt(k) == word.charAt(j)) {
                        count++;
                    }
                }
            }
            if( count > 0){
                System.out.println("Word : "+arr[i] +" repetition. Stopping.");
                return;
            }
        }
    }
}