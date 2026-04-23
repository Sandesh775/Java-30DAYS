//4.	Check If One String Is Substring of Another (Without contains())
//Input: "hello", "ell" → true

public class SubstringOfAnotherString {
    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "ell";

        System.out.println("Is "+input2+" is Substring of "+input1+" ?");
        for( int start = 0; start<input1.length(); start++){
            for( int end = start; end<input1.length(); end++){
                String sub = "";
                for(int k = start; k<=end; k++){
                    sub +=  input1.charAt(k);
                }
                if(sub.equals(input2)){
                    System.out.println("Output : True");
                    return;
                }
            }
        }
    }
}