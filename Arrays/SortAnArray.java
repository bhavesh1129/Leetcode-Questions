class Solution {
    public int[] sortArray(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        int[] mergedArr = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mergedArr[k++] = left[i++];
            }else{
                mergedArr[k++] = right[j++];
            }
        }
        while(i < left.length){
            mergedArr[k++] = left[i++];
        }
        while(j < right.length){
            mergedArr[k++] = right[j++];
        }
        
        return mergedArr;
    }
}
