public class Code04 {
    public static void main(String[] args) {
        String s = "JaVa";
        System.out.println("String : "+s);
        System.out.println("Output : ");
        String output = "";
        for(int i = 0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                output = output+Character.toLowerCase(s.charAt(i));
            }
            else{
                output = output+Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(output);
    }
}
/*
* for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                char lowercaseChar = Character.toLowerCase(ch);
                System.out.print(lowercaseChar);
            }
            else{
                char UppercaseChar = Character.toUpperCase(ch);
                System.out.print(UppercaseChar);
            }
        }
* */