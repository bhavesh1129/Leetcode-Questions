class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(new StringBuffer(word).reverse().toString()+ " ");
        }
        return sb.toString().trim();
    }
}
