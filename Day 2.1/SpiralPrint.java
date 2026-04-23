//5.	Spiral Print 2D Matrix (Intro Level), assume given array is square matrix
//Input:
//        1 2 3
//        4 5 6
//        7 8 9
//Output: 1 2 3 6 9 8 7 4 5
public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int row = arr.length;
        int col = arr[0].length;

        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        System.out.println("Spiral Order:");

        // Print all elements in spiral order
        while (left <= right && top <= bottom) {

            // 1. Print top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;  // Move top boundary down

            // 2. Print right column (top to bottom)
            for (int j = top; j <= bottom; j++) {
                System.out.print(arr[j][right] + " ");
            }
            right--;  // Move right boundary left

            // 3. Print bottom row (right to left) - only if top <= bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;  // Move bottom boundary up
            }

            // 4. Print left column (bottom to top) - only if left <= right
            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    System.out.print(arr[j][left] + " ");
                }
                left++;  // Move left boundary right
            }
        }
    }
}