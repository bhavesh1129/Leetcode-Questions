class Solution {
int dir[][] = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int minimumEffortPath(int[][] heights) {
        int l = 0;
        int h = 1000005;
        int m = heights.length;
        int n = heights[0].length;

        while (l < h) {
            int mid = (l + h) / 2;
            boolean visited[][] = new boolean[m][n];
            visited[0][0] = true;
            if (dfs(heights, 0, 0, visited, mid)) {
                h = mid;
            } else
                l = mid + 1;
        }
        return l;
    }
    boolean dfs(int[][] heights, int i, int j, boolean visited[][], int mid) {
        if (i == heights.length - 1 && j == heights[0].length - 1)
            return true;
        for (int d[] : dir) {
            int x = i + d[0];
            int y = j + d[1];
            if (x < 0 || y < 0 || x >= heights.length || y >= heights[0].length || visited[x][y])
                continue;

            if (Math.abs(heights[x][y] - heights[i][j]) <= mid) {
                visited[x][y] = true;
                if (dfs(heights, x, y, visited, mid))
                    return true;
            }
        }
        return false;
    }
}