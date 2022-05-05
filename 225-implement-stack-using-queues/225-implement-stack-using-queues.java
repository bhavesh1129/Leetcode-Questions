class MyStack {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;
    
    public MyStack() {
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();
    }
   
    public void push(int x) {
        mainQ.add(x);
    }
    
    public int pop() {
        if(mainQ.size() == 0){
          System.out.println("Stack underflow");
          return -1;
      }else{
          while(mainQ.size() > 1){
              helperQ.add(mainQ.remove());
          }
          int val = mainQ.remove();
          while(helperQ.size() > 0){
              mainQ.add(helperQ.remove());
          }
          return val;
      }
    }
    
    public int top() {
        if(mainQ.size() == 0){
          System.out.println("Stack underflow");
          return -1;
      }else{
          while(mainQ.size() > 1){
              helperQ.add(mainQ.remove());
          }
          int val = mainQ.remove();
            helperQ.add(val);
          while(helperQ.size() > 0){
              mainQ.add(helperQ.remove());
          }
          return val;
      }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(mainQ.size() == 0)
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */