class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> inter = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                inter.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] result = new int[inter.size()];
        for (int k = 0; k < inter.size(); k++) {
            result[k] = inter.get(k);
        }
        return result;
    }
}
