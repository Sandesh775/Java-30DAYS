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
        // Showing two matrices
        System.out.println("A :");
        for(int i = 0; i<arr1.length; i++){
            for( int j = 0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("B :");
        for(int i = 0; i<arr2.length; i++){
            for( int j = 0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }
        //Printing the result
        System.out.println("Resultant matrix :");
        for(int i  =0; i<result.length; i++){
            for( int j = 0; j<result[i].length; j++){
                System.out.print(result[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
