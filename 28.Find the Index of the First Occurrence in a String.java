class Solution {
    public int strStr(String haystack, String needle) {

I use a brute force approach.

I try every starting position in the haystack.
For each position,
I compare characters one by one with the needle.

If all characters match, I return the index.
Otherwise, I continue.

Time is O(nm), space is O(1).
        
        if(needle.length()==0) return 0;
        
        
        // 起点 i 最多到 n - m（否则剩余长度不够匹配）
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            // 尝试从 i 开始匹配 needle
            while(j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            // 如果 j 走到了 m，说明 needle 全匹配成功
            if(j==needle.length()){
                return i;
            }

        }

        return -1;
    }
}
