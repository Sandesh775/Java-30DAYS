public class Code02 {
    public static void main(String[] args){
        int [] arr = {56,7,80,12,0,4,56,89};
        for(int a : arr){
            if( a == 0){
                System.out.println("Ops 0 had been encountered !");
                break;
            }
            System.out.println(a);
        }
    }
}