class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        For this problem, I use two HashSets.
        One set stores the numbers from the first array, and the other set stores the intersection result.        
        First, I go through the first array and add each number into the first set.
        
        Then I go through the second array.For each number, I check if it exists in the first set.
        If it does, I add it to the second set.
        
        After that, I create a new int arrayand copy all elements from the second set into it.
        
        Finally, I return the result.
        
        The time complexity is O(n + m),
        and the space complexity is O(n).
        
        //hashset自动去重
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> seen2 = new HashSet<>();
        
        for(int x:nums1)seen.add(x);
        for(int x:nums2){
            if (seen.contains(x)) seen2.add(x);
        }

        int i=0;
        int[] res=new int[seen2.size()];
        for(int x:seen2){
            res[i++]=x;
        }
        return res;
    }

}
