public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length(); // 字符串总长度

        // 枚举可能的“重复子串长度”
        // 子串长度最大只可能到 n/2 ，因为最小要重复 2 次
        for (int len = 1; len <= n / 2; len++) {

            // 如果 n 不能被 len 整除
            // 说明不可能由长度为 len 的子串重复构成
            if (n % len != 0) continue;

            // 取前 len 个字符作为候选子串
            String sub = s.substring(0, len);

            // 用 StringBuilder 拼接重复子串
            StringBuilder sb = new StringBuilder();

            // 需要重复多少次
            int times = n / len;

            // 拼接 times 次
            for (int i = 0; i < times; i++) {
                sb.append(sub);
            }

            // 如果拼接结果等于原字符串
            // 说明找到了重复模式
            if (sb.toString().equals(s)) {
                return true;
            }
        }

        // 如果所有可能长度都试过
        // 仍然没有匹配，说明不是重复子串构成
        return false;
    }
}
