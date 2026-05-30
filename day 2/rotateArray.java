import java.util.Arrays;

public class rotateArray {
    public static void rotateMatrix(int[][] nums){
         int n =nums.length;

         //transpose
         for(int row = 0; row<n ; row++){
             for(int col =row+1; col<n ; col++){
                 nums[row][col] ^= nums[col][row];
                 nums[col][row] ^= nums[row][col];
                 nums[row][col] ^= nums[col][row];
             }
         }

        //reverse 
         for(int row = 0; row<n; row++){
             int left =0, right = n-1;
             while(left<right){
                 nums[row][left] ^= nums[row][right];
                 nums[row][right] ^= nums[row][left];
                 nums[row][left] ^= nums[row][right];
                 left++; right--;
             }
         }
        //no need to return the matrix, cuz it shares the same memory as matrix from the main function

    }
    public static void main(String[] args) {
         int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
         rotateMatrix(matrix);
         for(int[] row : matrix){
             System.out.println(Arrays.toString(row));
         }
    }
}
