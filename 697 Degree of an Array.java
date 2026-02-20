class Solution {
    public int findShortestSubArray(int[] nums) {

        // 统计频率
        HashMap<Integer, Integer> map = new HashMap<>();

        // 记录第一次出现位置
        HashMap<Integer, Integer> firstIdx = new HashMap<>();

        // 记录最后一次出现位置
        HashMap<Integer, Integer> lastIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // 更新频率
            map.put(num, map.getOrDefault(num, 0) + 1);

            // 只记录第一次出现的位置
            if (!firstIdx.containsKey(num)) {
                firstIdx.put(num, i);
            }

            // 每次都更新最后一次出现的位置
            lastIdx.put(num, i);
        }

        // 求 degree（最大频率）
        int degree = 0;
        for (int freq : map.values()) {
            degree = Math.max(degree, freq);
        }

        // 初始化为最大可能长度
        int minLength = nums.length;

        // 找所有达到 degree 的元素
        for (int num : map.keySet()) {

            if (map.get(num) == degree) {

                int length =
                        lastIdx.get(num)
                        - firstIdx.get(num)
                        + 1;

                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }
}
