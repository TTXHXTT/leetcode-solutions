class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //存入空前缀，例如在第一组pre-k=0时不遗漏
        map.put(0,1);
        int count=0;
        //记录前缀和 = 从第 0 个数开始，一直加到当前位置的“累计账本”
        //pre[i] = nums[0] + ... + nums[i]
        //nums[i] + ... + nums[r] = pre[r] - pre[i-1]
        //nums[2] + nums[3] = pre[3] - pre[1]
        //所有若想知道k有没有出现过，只需用现在的sum减去k看看曾经有没有sum相等
        int pre=0;
        for(int x:nums){
            pre+=x;
            //若出现过则计入
            count+=map.getOrDefault(pre-k,0);
            //将每个累加计入map
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
