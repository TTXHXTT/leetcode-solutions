class Solution {
    public int removeDuplicates(int[] nums) {

I use a pointer to track the position of unique elements.

I go through the array.
If the current element is different from the last unique element,
I move it forward.

At the end, I return the pointer position.
            
        int  j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
