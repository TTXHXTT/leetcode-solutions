class Solution {

I use binary search.

If I find the target, I return its index.

If not, when the range becomes invalid,
I return i as the insert position.

Time is O(log n), space is O(log n).

    
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
