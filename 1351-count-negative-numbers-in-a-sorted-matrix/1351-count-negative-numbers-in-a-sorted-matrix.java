class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid[0].length, count = 0;
        int row = grid.length - 1, col = 0;
        
        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                row--;
                count += n - col;
            }else {
                col++;
            }
        }
        return count;
    }
}