class Solution {
    public int findLHS(int[] nums) {

        // 用 HashMap 统计每个数字出现的次数
        // key: 数字
        // value: 该数字出现的频率
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            // 如果 x 已经存在，就 +1
            // 如果不存在，默认值是 0
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxLength = 0; // 记录最长和谐子序列长度

        // 遍历所有不同的数字
        for (int x : map.keySet()) {

            // 如果存在 x+1
            // 说明可以组成一个 max-min=1 的子序列
            if (map.containsKey(x + 1)) {

                // 子序列长度 = freq[x] + freq[x+1]
                int length = map.get(x) + map.get(x + 1);

                // 更新最大值
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
