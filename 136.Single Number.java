class Solution {
    public int singleNumber(int[] nums) {
        
        // 用来保存最终结果
        // 初始化为 0，因为：
        // 任何数和 0 异或都等于它本身（a ^ 0 = a）
        int result = 0;
        
        // 遍历数组
        for (int num : nums) {
            
            // 异或运算：
            // 1️相同的数异或会变成 0（a ^ a = 0）
            // 2️异或满足交换律、结合律
            // 所以所有出现两次的数字都会互相抵消
            
            result ^= num;
        }
        
        // 最后剩下的就是只出现一次的那个数
        return result;
    }
}
