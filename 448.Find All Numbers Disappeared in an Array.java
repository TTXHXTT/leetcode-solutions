class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        // 第一遍：标记出现过的数字
        //将出现过的数对应下标的值改为负数
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            nums[index]=-Math.abs(nums[index]);
        }

        
        // 第二遍：找没出现的数字(不为负数的)
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=0){
                res.add(i+1);
            }
        }

        
        return res;
    }
}
