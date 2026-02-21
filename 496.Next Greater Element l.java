class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // 存每个元素的下一个更大元素
        HashMap<Integer, Integer> map = new HashMap<>();

        // 单调递减栈
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {

            // 如果当前数大于栈顶，说明找到了栈顶的下一个最大值
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        // 剩下没有更大值的默认 -1
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // 构造答案
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
