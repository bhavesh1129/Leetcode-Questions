class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] newArr = new int[2];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    newArr[k++] = i;
                    newArr[k] = j;
                }
            }
        }
        return newArr; 
    }
}
