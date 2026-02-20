class Solution {
    public int longestPalindrome(String s) {

        // 用 ASCII 数组统计每个字符出现次数
        // 因为题目说包含大小写字母，所以 128 足够
        int[] count = new int[128];

        // 统计每个字符的出现次数
        for (char x : s.toCharArray()) {
            count[x]++;
        }

        int length = 0;       // 最终回文长度
        boolean hasOdd = false; // 是否存在奇数个字符

        // 遍历所有字符的频率
        for (int c : count) {

            // 如果出现次数是偶数
            // 可以全部用于构造回文
            if (c % 2 == 0) {
                length += c;
            } else {
                // 如果是奇数
                // 只能用 c - 1（保证成对）
                length += c - 1;

                // 记录存在奇数
                // 最后可以在中间放一个
                hasOdd = true;
            }
        }

        // 如果存在奇数
        // 可以在回文中心放一个字符
        if (hasOdd) {
            length += 1;
        }

        return length;
    }
}
