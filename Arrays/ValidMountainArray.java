class Solution {
    public boolean validMountainArray(int[] arr) {
        int size = arr.length;
        int i = 0;

        while (i + 1 < size && arr[i] < arr[i+1]){
            i++;
        }

        if (i == 0 || i == size-1){
            return false;
        }

        while (i+1 < size && arr[i] > arr[i+1]){
            i++;
        }

        return i == size-1;
    }
}
