class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hashtable.containsKey(target - nums[i])){
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            // 把当前数存入哈希表
            hashtable.put(nums[i], i);
        }
        return new int[0]; // 理论上不会执行到这里
    }
}