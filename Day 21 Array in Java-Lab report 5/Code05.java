public class Code05 {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[]{1, 2, 3};
        a[1] = new int[]{4, 5};
        a[2] = new int[]{10};
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum = 0;
            System.out.println("Row : "+(i+1));
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
                sum+=a[i][j];
            }
            System.out.println(" ");
            System.out.println("Sum : "+sum);
        }
    }
}
