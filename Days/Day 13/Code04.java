public class Code04 {
    public static void main(String[] args){
        String[] arr = {"hello","JAVA","world"};
        String check = "java";
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            String lower = arr[i].toLowerCase();// or even we can use ignore case function because it is about word
            count = 0;
            for(int j = 0; j < lower.length(); j++){
                char ch = lower.charAt(j);
                for(int k = 0; k < check.length(); k++){
                    char ch2 = check.charAt(k);
                    if(ch == ch2){
                        count++;
                       break;
                    }
                }
            }
            //System.out.println(count);
            if(count == 4 ){
                System.out.println("JAVA found. Stopping.");
                return;
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}
