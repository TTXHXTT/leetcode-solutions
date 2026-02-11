class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        // 从最后一位开始处理
        for(int i=n-1;i>=0;i--){
            // 当前位 +1
            digits[i]++;
            // 没产生进位，直接返回
            if(digits[i]<10)  return digits;
            // 产生进位：当前位变 0，继续往左
            digits[i]=0;
        }
        
        // 如果能走到这里，说明原数组全是 9，比如 [9,9,9]
        // 结果需要多一位： [1,0,0,0]
        int[] res = new int[n+1];
        res[0]=1;
        return res;
    }
}
