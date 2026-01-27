class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen= new HashSet<>();
        
        //从 nums 数组里一个一个拿出数字
        for(int num:nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
