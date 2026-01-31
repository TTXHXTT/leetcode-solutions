class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(char x:s.toCharArray()){
            //'#'执行退格
            if(x=='#'){
                //确保退格时栈内有数据
                if(!st1.isEmpty()) st1.pop();
            }else{
                st1.push(x);
            }            
        }
        for(char x:t.toCharArray()){
            if(x=='#'){
                if(!st2.isEmpty()) st2.pop();
            }else{
                st2.push(x);
            }
        }       
        return st1.equals(st2);
    }
}
