class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            if (color[i] == 0 && !helper(graph, i, -1, color)) return false;
        }
        return true;
    }

    boolean helper(int[][] graph, int curr, int c, int[] color) {
        if (color[curr] == c) {
            return true;
        }
        color[curr] = c;
        for (int x : graph[curr]) {
            if (color[x] == c || helper(graph, x, c * -1, color) == false) return false;
        }
        return true;
    }
}