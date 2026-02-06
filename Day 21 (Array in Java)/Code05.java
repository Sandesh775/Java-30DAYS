public class Code05 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5},{10}};
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
