class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0, index = -1;
        String ans = "";
        boolean flag = false;
        for(i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                index = i;
                flag = true;
                break;
            }
        }
        if(!flag){
            return word;
        }
        int j = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        while(j <= index){
            sb.append(word.charAt(j++));
        }
        String revStr = sb.reverse().toString();
        res.append(revStr);
        for(int k = i + 1; k < word.length(); k++){
            res.append(word.charAt(k));
        }
        return res.toString();
    }
}