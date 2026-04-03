class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

I use an array to count characters in the magazine.

Then I go through the ransom note.
If a character is not available, I return false.
Otherwise, I decrease the count.

If all characters match, I return true.

Time is O(n), space is O(1).
        
        if (ransomNote == null || magazine == null) return false;
        
        // 只含小写字母，使用长度为26的数组存频次
        int[] count = new int[26];

        // 统计 magazine 中每个字母的次数
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            count[c-'a']++;
        }

        // 尝试用 magazine 的字母去满足 ransomNote
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(count[c-'a']==0){
                return false;// 没有足够的该字母
            }
            count[c-'a']--;// 用掉一个
        }
        return true;
    }
}
