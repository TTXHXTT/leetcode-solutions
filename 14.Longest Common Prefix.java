class Solution {
    public String longestCommonPrefix(String[] strs) {

I use the first string as a reference.

I go through each character
and compare it with the same position
in all other strings.

If there is a mismatch,
I return the prefix so far.

If all match,
I return the whole first string.

Time is O(nm), space is O(1).
        
        if(strs==null||strs.length==0) return "";
        
        // 以第一个字符串作为基准
        String first = strs[0];

        // 从第一个字符串的第 0 个字符开始遍历
        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);

            // 用这个字符去和其他字符串的同一位置比较
            for(int j=1;j<strs.length;j++){
                // 情况 1：某个字符串长度不够了
                // 情况 2：字符不相等
                if(i>=strs[j].length()||strs[j].charAt(i)!=c){
                    // 返回 [0, i) 之间的公共前缀
                    return first.substring(0,i);
                }
            }
        }
        // 如果整个 first 都没被截断，说明它本身就是公共前缀
        return first;
    }
}
