class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        if (grid[0][0] == 1 || grid[rows - 1][cols - 1] == 1) {
            return 0;
        }

        int[][] paths = new int[rows][cols];
        
        paths[0][0] = 1;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                
                if (grid[i][j] == 1) {
                    continue;
                }
                
                int numPaths = 0;
                
                if (i > 0 && grid[i-1][j] != 1) {
                    numPaths += paths[i-1][j];
                }
                
                if (j > 0 && grid[i][j-1] != 1) {
                    numPaths += paths[i][j-1];
                }
                
                paths[i][j] += numPaths;
            }
        }
        
        return paths[rows - 1][cols - 1];
    }
}