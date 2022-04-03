class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int countIsland = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    countIsland += 1;
                    count(grid, i, j, row, col);
                }
            }
        }
        return countIsland;
    }
    
    public void count(char[][] grid, int i, int j, int row, int col) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        count(grid, i - 1, j, row, col);
        count(grid, i + 1, j, row, col);
        count(grid, i, j - 1, row, col);
        count(grid, i, j + 1, row, col);
    }
}