class Solution {
    public int thirdMax(int[] nums) {

I use a TreeSet to keep elements in sorted order.

As I go through the array, I add each number.
If the size exceeds 3, I remove the smallest one.

This way, the set always keeps the top 3 largest elements.

If there are fewer than 3 distinct numbers,
I return the maximum.
Otherwise, I return the third maximum.

Time is O(n), space is O(1).
        
        TreeSet<Integer> set = new TreeSet<>();

        for(int x:nums){
            // TreeSet 自动去重且有序
            set.add(x);
            // 超过 3 个则移除当前最小（保持只保留 3 个最大值）
            if(set.size()>3) set.pollFirst();
        }
        // 如果不同元素少于 3 个，返回最大值
        if(set.size()<3) return set.last();
        // 否则直接返回当前集合中的最小值（即第 3 大）
        return set.first();
    }
}
