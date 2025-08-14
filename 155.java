class MinStack {
    Stack<int[]> stack;

    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new int[]{val, val});
        }else{
            int mn=stack.peek()[1];     // if stack is not empty we are fetching minimum value
            mn=Math.min(mn, val); // updating min value
            stack.push(new int[]{val, mn});   // if 0 th index reverse the order that is {mn, val}
        }
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek()[0];
        
    }
    
    public int getMin() {
        return stack.peek()[1];
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
