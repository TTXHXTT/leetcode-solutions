class Solution {
    public int majorityElement(int[] nums) {

I use a HashMap to count the frequency of each number.

As I go through the array,
I update the count.

If any number appears more than n/2 times,
I return it immediately.

Time is O(n), space is O(n).
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>nums.length/2) return nums[i];
        }

        return 0;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        // 1️⃣ 先对数组进行排序
        // 排序后，相同的元素会排在一起
        Arrays.sort(nums);
        // 2️⃣ 因为多数元素出现次数 > n/2
        // 排序后它一定出现在数组中间位置
        // 直接返回中间元素即可
        return nums[nums.length / 2];
    }
}
