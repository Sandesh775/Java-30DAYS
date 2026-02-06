public class Code04 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] result = new int[3][3];// matrix to store the result of multiplication
        // Multiplying 3*3 array
        for(int i = 0; i<arr1.length; i++){
            for(int j =0; j<arr2[i].length; j++){
                for(int k = j ; k<arr2.length; k++){
                    result[i][j] += arr1[i][k]*arr2[j][k];
                }
            }
        }
        //Printing the result
        for(int i  =0; i<result.length; i++){
            for( int j = 0; j<result[i].length; j++){
                System.out.print(result[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
