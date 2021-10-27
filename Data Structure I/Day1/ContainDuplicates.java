class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
       if(set.size() == arr.length){
           return false;
       }
        return true;
    }
}
