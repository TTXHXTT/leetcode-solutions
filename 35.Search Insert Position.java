class Solution {
    public int searchInsert(int[] nums, int target) {
             return s(target,0,nums.length-1,nums);

    }
    public int s(int target,int i,int j,int[] nums){
        int mid = (i+j)/2;
        //递归终止条件
        if(i>j) return i;
        
        if(nums[mid]==target) return mid;

        if(target<=nums[mid]){
            j=mid-1;
            return s(target,i,j,nums);
        }else{
            i=mid+1;
            return s(target,i,j,nums);
        }


    }    
    

}
