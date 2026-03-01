class Solution {
    public boolean backspaceCompare(String s, String t) {

        I use two stacks for two String.
        First, I go through string s.
            If the character is '#', it means backspace.
            So I remove the top character from the stack, if the stack is not empty.
            Otherwise, I push the character onto the stack.
        I apply the same logic to string t.

        Finally, I compare the two stacks.
            If they are equal, it means they are the same.

        Time complexity is O(n + m), where n and m are the lengths of the two strings.
        Space complexity is O(n + m), because we may store all characters in the stacks.
            
        
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
