public class uniquePathGrid {
    public static int findPath(int row, int col){
        int[][] grid = new int[row][col];
        for(int left = 0; left<row; left++) grid[left][0] = 1;
        for(int right = 0; right<col; right++) grid[0][right] = 1;
        return grid[row-1][col-1];

        //incomplete
    }
}
