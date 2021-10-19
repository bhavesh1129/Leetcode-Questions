class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for(int i: map.keySet()){
            if(map.get(i) > 1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
