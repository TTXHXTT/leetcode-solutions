class Solution {
    public int firstUniqChar(String s) {

        For this problem, I use a HashMap to store each character 
        and how many times it appears in the string.
        
        First, I go through the string once and count the frequency of each character.
        Then I go through the string again.
        For each character, I check its count in the map.
        If the count is equal to one, I return its index.
        
        If I finish the loop and don’t find any character with count one, I return -1.
        
        The time complexity is O(n) because we go through the string twice.
        The space complexity is O(n) because we store character counts in the map.
        
        Map<Character, Integer> freq = new HashMap<>();
        
      //遍历s,把s加入hash表中，value为重复个数
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
      //判断第一个value为1的输出其index
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;        
    }
}
