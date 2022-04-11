class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i : arr2) {
            tree.add(i);
        }
        for (int i = 0; i < arr1.length; i++) {
            int leftValue = arr1[i] - d;
            int rightValue = arr1[i] + d;
            Set<Integer> set = tree.subSet(leftValue, rightValue + 1);
            if (set.isEmpty()){
                count += 1;
            }
        }
        return count;
    }
}