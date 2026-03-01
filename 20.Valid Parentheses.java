class Solution {
    public boolean isValid(String s) {

        I use a stack to keep track of opening brackets.(括号)
        I also use a HashMap to store matching bracket pairs.
        The map stores closing brackets as keys and opening brackets as values.
        Then I go through the string character by character.
        If the character is an opening bracket, I push it onto the stack.

            If it’s a closing bracket, I check two things:
                First, if the stack is empty.
                Second, if the top of the stack matches the expected opening bracket.
                If either fails, I return false.
            
        At the end, if the stack is empty, 
        it means all brackets are matched correctly.

        Time complexity is O(n), because we go through the string once.
        Space complexity is O(n), because in the worst case we store all opening brackets in the stack.
            
            
        
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();

        //将对应放入hashmap中
        //先放右侧括号是因为在hash方法get时，要根据左括号情况提取右括号是什么来对比
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        //遍历s字符串
        for(char x : s.toCharArray()){
            //判断如果为左括号，则入栈
            if(map.containsValue(x)){
                st.push(x);
            //判断如果为右括号，判断栈顶是否为对应的左括号，是否为空栈
            }else if(st.isEmpty()||map.get(x)!=st.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }
}
