class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

I go through each attack.


For each one, I coumpute how much time it adds.

If the next attack happens before the current poison ends,
I only count the gap.
Otherwise, I count the full duration.

Finally, I add the last attack.

Time is O(n), space is O(1).

        int res = 0;
        if(timeSeries==null||timeSeries.length==0) return res;

        for(int i=0;i<timeSeries.length-1;i++){
            // 当前攻击对总中毒时间的贡献：
            // 如果下一次攻击出现在持续时间以内，则需要取小，也就是这次与下一次的间隔
            res+=Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        
        // 加上最后一次攻击的完整持续时间
        total += duration;        
        
        return res;
    }
}
