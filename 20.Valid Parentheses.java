class Solution {
    public boolean isValid(String s) {
        
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
