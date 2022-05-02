class Solution {
    public int[] sortArrayByParity(int[] arr) {
        if (arr.length == 1)
            return arr;

        int[] newArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[k++] = arr[i];
            } else {
                newArr[arr.length + k - i - 1] = arr[i];
            }
        }
        return newArr;
    }
}