public class Code03 {
    public static void main(String[] args){
        String str = "Java is fun";
        String str1 = "";
        System.out.println("Original string : "+str);
        String [] array = str.split(" ");
        for (int i = array.length-1; i >= 0; i--) {
            str1 = str1 + array[i] + " ";
        }
        System.out.println(str1);
    }
}
