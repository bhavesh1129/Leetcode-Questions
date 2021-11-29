class Solution {
    public int minPathSum(int[][] grid) {
        int cc = 0, cr = 0, dc = grid[0].length - 1, dr = grid.length - 1;
        int[][] cache = new int[dr + 1][dc + 1];
        for (int[] e : cache) {
            Arrays.fill(e, -1);
        }
        return sol(grid, cc, cr, dc, dr, cache);
    }
    public int sol(int[][] grid, int cc, int cr, int dc, int dr, int[][] cache) {
        if(cc > dc || cr > dr){
            return Integer.MAX_VALUE;
        }
        if(cc == dc && cr == dr){
            return grid[cr][cc];
        }
        if(cache[cr][cc] != -1){
            return cache[cr][cc];
        }
        int c1 = sol(grid, cc + 1, cr, dc, dr, cache);
        int c2 = sol(grid, cc, cr + 1, dc, dr, cache);
        
        return cache[cr][cc] = Math.min(c1, c2) + grid[cr][cc];
    }
}
