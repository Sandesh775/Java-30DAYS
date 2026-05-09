public class Code03 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int sum = 0;
        int count = 0;
        System.out.println("Array :");
        for( int i: a){
            System.out.print(i+" ");
            sum += i;
        }
        int average = sum/(a.length);
        for(int i: a){
            if(i > average){
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("Numbers greater than average : "+count);
    }
}
