class Solution {
    public void moveZeroes(int[] nums) {

I use a pointer to track the position of non-zero elements.

I go through the array.
If the number is not zero, I move it forward.

After that, I fill the remaining positions with zeros.

Time is O(n), space is O(1).
        
        //真正结果时的下标
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        //补全所有的0
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
