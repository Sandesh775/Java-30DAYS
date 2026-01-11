public class Code03 {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 21;
        arr[3] = 22;
        arr[4] = 43;// size = 5, but last index / max index will always be size-1
        // printing all elements using for each loop
        for(int a : arr){
            System.out.print(a+"\t");
        }

    }
}