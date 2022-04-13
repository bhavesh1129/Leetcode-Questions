class Solution {
    public int mySqrt(int x) {
        int res = 0;
        int start = 1, end = x;
        if(x == 0){
            return 0;
        }
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid <= x / mid) {
                res = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return res;
    }
}