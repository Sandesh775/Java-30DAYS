public class Code01 {
    public static void main(String[] args) {
        String duplicate = "helhlo";
        String check = duplicate.toLowerCase();
        System.out.println("Original word : "+duplicate);
        char [] arr = check.toCharArray();
        for (int i = 0; i<arr.length; i++){
            for( int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = ' ';
                }
            }
        }
        String final2 = "";
        for( int j = 0; j<arr.length; j++){
            if(arr[j] != ' '){
                final2 += arr[j];
            }
        }
        System.out.println("After effect : "+final2);
    }
}
