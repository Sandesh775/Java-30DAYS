public class Code01 {
    public static void main(String[] args) {
        String s = "banana";
        int[] a = new int[256];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int x = (int)ch;
            a[x]++;
        }
        for(int i = 0; i<a.length; i++){
            if(a[i] != 0){
                System.out.println("Character : "+(char)i+" occur "+a[i]+" times !");
            }
        }
    }
}