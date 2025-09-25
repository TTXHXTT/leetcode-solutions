// LC #1 Two Sum
// Problem: Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//
// Approach: HashMap to store seen numbers
// Complexity: Time O(n), Space O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
