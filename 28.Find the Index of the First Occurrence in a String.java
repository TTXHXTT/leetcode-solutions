class Solution {
    public int strStr(String haystack, String needle) {
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
