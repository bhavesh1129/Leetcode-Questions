class Solution {
    public int pivotIndex(int[] arr) {
        int total = 0;
        for(int i: arr){
            total += i;//2
        }
        
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            
            if(sum * 2 == total + arr[i]){
                return i;
            }
        }
        return -1;
    }
}