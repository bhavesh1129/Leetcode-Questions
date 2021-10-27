class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] newArr = new int[2];
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                newArr[0] = start + 1;
                newArr[1] = end + 1;
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return newArr;
    }
}
