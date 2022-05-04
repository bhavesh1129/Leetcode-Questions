class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(k - num) == true) {
                int freq1 = map.get(k - num);
                if (freq1 == 1) {
                    map.remove(k - num);
                } else {
                    map.put(k - num, freq1 - 1);
                }
                if (map.containsKey(num) == true) {
                    int freq2 = map.get(num);
                    if (freq2 == 1) {
                        map.remove(num);
                    } else {
                        map.put(num, freq2 - 1);
                    }
                    count += 1;
                }
            }
        }
        return count;
    }
}