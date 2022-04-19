class Solution {
    public int maxDistance(int[] A, int[] B) {
        int res = 0, j = -1;
        for (int i = 0; i < A.length; i++) {
            while (j + 1 < B.length && A[i] <= B[j + 1]){
                j++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    }
}