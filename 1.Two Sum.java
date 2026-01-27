class Solution {
    public int[] twoSum(int[] nums, int target) {

        //创建一个新的HashMap
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){

            //判断在HashMap中用没有与target-nums[i]相同的值
            if(hashtable.containsKey(target - nums[i])){
                //返回队两个下标
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            // 把当前数存入哈希表
            hashtable.put(nums[i], i);
        }
        return new int[0]; // 理论上不会执行到这里
    }

}
