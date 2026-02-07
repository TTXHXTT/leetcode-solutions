class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int res = 0;
        for(int x : nums){
            sum+=x;
            //修复负数
            int rem = sum % k;
            if (rem < 0) rem += k; 
            //这里累加是因为出现三次就代表被三次整处
            //例如1，2，3  1-2一次 2-3一次 1-2-3一次
            res+=map.getOrDefault(rem,0 );
            map.put(rem,map.getOrDefault(rem,0)+1);
        }

        return res;
    }
}
