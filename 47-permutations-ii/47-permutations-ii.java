class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, new ArrayList<>(), new boolean[nums.length]);
        return list;
    }

    public void backtrack(
        int[] nums, List<List<Integer>> list, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]))
                    continue;
                tempList.add(nums[i]);
                used[i] = true;
                backtrack(nums, list, tempList, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}