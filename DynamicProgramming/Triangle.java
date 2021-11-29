class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] cache = new int[triangle.size()][triangle.size()];
        for (int[] e : cache) {
            Arrays.fill(e, -1);
        }
        return minTotal(triangle, 0, 0, cache);
    }
    public int minTotal(List<List<Integer>> triangle, int cr, int cc, int[][] cache) {
        if(cr == triangle.size()){
            return 0;
        }
        if(cache[cr][cc] != -1){
            return cache[cr][cc];
        }
        int c1 = minTotal(triangle, cr + 1, cc + 1, cache);
        int c2 = minTotal(triangle, cr + 1, cc, cache);
        
        return cache[cr][cc] = Math.min(c1, c2) + triangle.get(cr).get(cc);
    }
}
