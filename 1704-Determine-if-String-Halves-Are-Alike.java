//Solution 1
 class Solution {
    public boolean halvesAreAlike(String s) {
        int i = 0, count1 = 0, count2 = 0;
        int mid = s.length() / 2, j = s.length() / 2;

        while(i < mid){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' ||s.charAt(i) == 'U'){
                    count1++;
            }
            i++;
        }

        while(j <= s.length() - 1){
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' ||s.charAt(j) == 'o' ||
                s.charAt(j) == 'u' || s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' ||
                s.charAt(j) == 'O' ||s.charAt(j) == 'U'){
                    count2++;
            }
            j++;
        }
        return count1 == count2;
    }
    
    
    //Solution 2
    public boolean halvesAreAlike(String s) {
        var v = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int a = 0, b = 0;
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (v.contains(s.charAt(i))) 
                a +=  1;
            if(v.contains(s.charAt(j)))
                b +=  1;
        }
        return a == b;
    }
}   
