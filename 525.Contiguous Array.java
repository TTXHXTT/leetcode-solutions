class Solution {
    public int findMaxLength(int[] nums) {

I use prefix sum and a HashMap.

I treat 0 as -1 and 1 as +1.
So if the same prefix sum appears again,
the subarray between them has equal numbers of 0s and 1s.

The map stores the first index of each prefix sum.
When I see the same sum again,
I calculate the length and update the answer.

Time is O(n), space is O(n).
        
        HashMap<Integer,Integer> map = new HashMap<>();
        //设置初始空前缀，确保在nums[-1]时出现过为sum为0的情况以便对比
        map.put(0,-1);
        int res = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            //如此定义后，子数组 [l..r] 中 0 和 1 的数量相等 => Sr​=Sl−1​
            sum+=(nums[i]==0) ? -1 : 1 ;
            //若出现存最大值
            if(map.containsKey(sum)){
                res = Math.max(i - map.get(sum), res);
            //若没有则记录以后对比    
            }else{
                map.put(sum,i);
            }
        }
        return res;
    }
}
