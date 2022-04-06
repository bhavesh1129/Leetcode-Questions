class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer, Long> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0l) + 1l);
        }
        System.out.println(map);
        long ans = 0l;
        for (int i : map.keySet()) {
            for (int j : map.keySet()) {
                int k = target - i - j;
                if (map.containsKey(k)) {
                    long freq1 = map.get(i);
                    long freq2 = map.get(j);
                    long freq3 = map.get(k);
                    if (i == j && j == k) {
                        ans += ((freq1) * (freq2 - 1) * (freq3 - 2)) / 6;
                    }
                    else if (i == j && i != k) {
                        ans += ((freq1) * (freq2 - 1)) / 2 * freq3;
                    }
                    else if (i < j && j < k) {
                        ans += freq1 * freq2 * freq3;
                    }
                }
                ans = ans % 1000000007;
            }
        }
        return (int) ans;
    }
}
