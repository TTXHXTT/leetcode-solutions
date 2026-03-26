class Solution {
    public int minSubArrayLen(int target, int[] nums) {

I use a sliding window.

I move the right pointer to expand the window
and keep track of the current sum.

When the sum becomes greater than or equal to the target,
I try to shrink the window from the left
and update the minimum length.

At the end, if I never find a valid window, I return 0.
Otherwise, I return the minimum length.

Time is O(n), space is O(1).
        
        
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
