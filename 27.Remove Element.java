class Solution {
    public int removeElement(int[] nums, int val) {

        For this problem,I use a pointer called index.
        It represents the position where we place valid elements.
        Then I go through the array once. For each element, I check if it is not equal to val.
        If it is a valid number,I copy it to position index,
        and then move index forward.

        At the end, index represents the new length of the array.
        So I return index.   

        Time complexity is O(n), because we go through the array once.
        Space complexity is O(1), because we do it in-place.
        
        int index=0;
        for(int i=0;i<nums.length;i++){
            //指针index指向最后结果的数组中的索引值
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
