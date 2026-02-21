class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char x:s.toCharArray()){

            // 如果栈不为空 且 栈顶等于当前字符            
            if(!stack.isEmpty()&&stack.peek().equals(x)){
                stack.pop();
                continue;
            }

            stack.push(x);
        }
        
        // 把栈里的字符拼接成字符串
        StringBuilder ans = new StringBuilder();
        for(char c:stack){
            ans.append(c);
        }
        return ans.toString();
    }
}
