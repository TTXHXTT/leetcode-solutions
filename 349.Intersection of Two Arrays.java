class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
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
