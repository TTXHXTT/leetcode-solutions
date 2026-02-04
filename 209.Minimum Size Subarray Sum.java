class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;

        // 最终答案，初始化为一个不可能的大值
        int minLen = Integer.MAX_VALUE;

        int left=0;
        int sum = 0;

        for(int right=0;right<n;right++){

            //加入总和
            sum+=nums[right];

            while(sum>=target){
                //说明此时满足大于目标条件，存入答案
                minLen = Math.min(minLen,right-left+1);
                //收敛左侧窗口
                sum-=nums[left];
                left++;
            }
        }
        //仍为最大值说明未发生改变，返回0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
