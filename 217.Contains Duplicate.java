class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        第一步：先说整体思路
        For this problem I use a HashSet to store the number we have seen.
        I loop through the array.
        For each number, I check if it is already in the set.
        If yes, I return true. If it’s not in the set, I add it to the set.
        If we finish the loop and never find duplicates, we return false.
        Time complexity is O(n),because we only go through the array once.
        Space complexity is O(n).

            
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
