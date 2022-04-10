class Solution {
    
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("+")){
                int val = st.pop();
                int sum = val + st.peek();
                st.push(val);
                st.push(sum);
            }else if(ops[i].equals("D")){
                int val = st.peek();
                st.push(2 * val);
            }else if(ops[i].equals("C")){
                st.pop();
            }else {
                st.push(Integer.valueOf(ops[i]));
            }
        }
        int sum = 0;
        for(int i : st){
            sum += i;
        }
        return sum;
    }
}