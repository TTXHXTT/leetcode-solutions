class Solution {
    public boolean checkInclusion(String s1, String s2) {

I use a fixed-size sliding window.

First, I count the frequency of characters in s1.
Then I move a window over s2
and keep the character counts of the current window.

If the window becomes larger than s1,
I remove the leftmost character.

When the window size is equal to s1.length(),
I compare the two frequency arrays.
If they are the same, I return true.

Otherwise, after the loop, I return false.

Time is O(n), space is O(1).
        
        //s2如果长度不够直接判负
        if(s1.length()>s2.length()) return false;
        //创建s1的对比数组
        int[] need  =new int[26];
        for(char x : s1.toCharArray()){
            need[x-'a']++;
        }
        
        //创建窗口的对比数组
        int[] win = new int[26];
        int left = 0;
        for(int right=0;right<s2.length();right++){
           //加入对比数组
            win[s2.charAt(right)-'a']++;
            //判断窗口长度是否超过s1
            if(right-left+1>s1.length()){
                win[s2.charAt(left)-'a']--;
                left++;
            }
            //判断是否相等，相等则进行对比
            if(right-left+1==s1.length()){
                if (Arrays.equals(win, need)) {
                    return true;
                }
            }
        }
        return false;
    }
}
