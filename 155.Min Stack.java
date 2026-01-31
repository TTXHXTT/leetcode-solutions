class MinStack {
    //建立s栈存放数据，ms栈顶永远存放最小值
    Stack<Integer> s=new Stack<>() , ms = new Stack<>();



    public void push(int val) {
        s.push(val);
        //如果新值小于ms栈顶，push新值val入ms
        if(ms.isEmpty()||val<ms.peek()){
            ms.push(val);
        //反之再次压入最小值
        }else{
            ms.push(ms.peek());
        }
    }
    
    public void pop() {
        s.pop();
        ms.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
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
