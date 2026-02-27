
//Let me explain my approach.




class Solution {
    public int[] twoSum(int[] nums, int target) {
        //创建一个新的HashMap

        --For this  problem,
        --I use a HashMap to store previously seen numbers and their indices.
        --As I go through the array. I check if the number I need is already in the map.
        --If yes, I return the index.
        --If not, I put the current number and its index into the map.   
        --If no solution is found, I return an empty array.
        --Because HashMap gives O(1) lookup, it helps reduce time complexity from O(n²) to O(n).            
        --Time complexity is O(n) because we scan the array once.
        --Space complexity is O(n) for the HashMap.
            
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


