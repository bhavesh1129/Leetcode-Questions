class Solution {
    Set<Integer> vis;
    PriorityQueue<Pair<int[], Integer>> pq;
    public void getDistances(int[][] points, int index) {
        for (int i = 0; i < points.length; i++) {
            if (i != index && (vis.contains(i) == false)) {
                int[] s = new int[] {index, i};
                int dist = Math.abs(points[i][0] - points[index][0])
                    + Math.abs(points[i][1] - points[index][1]);
                Pair<int[], Integer> p = new Pair<>(s, dist);
                pq.add(p);
            }
        }
    }
    public int minCostConnectPoints(int[][] points) {
        vis = new HashSet<>();
        pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        vis.add(0);
        getDistances(points, 0);
        int count = 0;
        int cost = 0;

        while (count != points.length - 1) {
            Pair<int[], Integer> p = pq.poll();
            int[] s = p.getKey();
            int val = p.getValue();
            int point = s[1];
            if (vis.contains(point))
                continue;
            count += 1;
            cost += val;
            vis.add(point);
            getDistances(points, point);
        }
        return cost;
    }
}