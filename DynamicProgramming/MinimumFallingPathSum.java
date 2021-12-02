class Solution {
    int ans;
    public int minFallingPathSum(int[][] matrix) {
        ans = Integer.MAX_VALUE;
        int[][] cache = new int[matrix.length + 1][matrix.length + 1];
        for (int[] i : cache) {
            Arrays.fill(i, -1);
        }
        for(int col = 0; col < matrix.length; col++){
            ans = Math.min(ans, minFallingPathSum(matrix, 0, col, matrix.length - 1, matrix.length - 1, cache));
        }
        return ans;
    }
    public int minFallingPathSum(int[][] matrix, int currRow, int currCol, int endRow, int endCol, int[][] cache) {
        if(currRow > endRow || currCol > endCol || currCol < 0){
            return Integer.MAX_VALUE;
        }
        if(currRow == endRow){
            return matrix[currRow][currCol];
        }
        if(cache[currRow][currCol] != -1){
            return cache[currRow][currCol];
        }
        int c1 = minFallingPathSum(matrix, currRow + 1, currCol - 1, endRow, endCol, cache);
        int c2 = minFallingPathSum(matrix, currRow + 1, currCol, endRow, endCol, cache);
        int c3 = minFallingPathSum(matrix, currRow + 1, currCol + 1, endRow, endCol, cache);
        
        return cache[currRow][currCol] = (Math.min(c1, Math.min(c2, c3)) + matrix[currRow][currCol]);
    }
}
