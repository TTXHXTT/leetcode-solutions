class Solution {
    public int lengthOfLastWord(String s) {

I scan the string from right to left.

First, I skip spaces.
Then I find the last word.

The length is the distance between two pointers.

Time is O(n), space is O(1).
        
        int n=s.length();
        int i = s.length()-1;
       
        // 跳过字符串末尾的所有空格
        while(i>=0&&s.charAt(i)==' ') i--;
        
        //j 记录最后一个单词的“末尾位置”
        int j=i;
       
        //继续往前扫描，直到遇到空格
        while(i>=0&&s.charAt(i)!=' ') i--;
        
        // substring 左闭右开
        // 单词区间是 (i+1) 到 j（包含 j）
        // 所以写成 substring(i+1, j+1)
        String res=s.substring(i+1,j+1);
        
        
        return res.length();
        
    }
}Q
