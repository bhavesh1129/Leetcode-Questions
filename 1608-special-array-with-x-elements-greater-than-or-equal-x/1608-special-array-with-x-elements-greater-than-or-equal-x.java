class Solution {
    public int specialArray(int[] arr) {
        int ans = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (check(arr, i) == i){
                ans = i;
            }
        }
        return ans;
    }
    public int check(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target){
                count++;
            }
        }
        return count;
    }
}