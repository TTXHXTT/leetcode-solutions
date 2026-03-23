class Solution {

I use binary search with recursion.

Each time, I check the middle element.
If it equals the target, I return the index.

If the target is smaller, I search the left half.
Otherwise, I search the right half.

If the range becomes invalid, I return -1.

Time is O(log n), space is O(log n).
    
    public int search(int[] nums, int target) {
        return s(target,0,nums.length-1,nums);

    }
    public int s(int target,int i,int j,int[] nums){
        int mid = (i+j)/2;
        //递归终止条件
        if(i>j) return -1;
        
        if(nums[mid]==target) return mid;

        if(target<nums[mid]){
            j=mid-1;
            return s(target,i,j,nums);
        }else{
            i=mid+1;
            return s(target,i,j,nums);
        }


    }
}
