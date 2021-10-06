class Solution {
    public int hammingDistance(int x, int y) {
        int diff = x ^ y;
        return count1(diff);
    }
    public int count1(int n){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
