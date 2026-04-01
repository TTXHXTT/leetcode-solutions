class Solution {
    public int[] plusOne(int[] digits) {

I start from the last digit
and add one.

If there is no carry, I return immediately.
If there is a carry, I set it to zero
and continue to the next digit.

If all digits are 9,
I create a new array with an extra digit.

Time is O(n), space is O(1).
        
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
