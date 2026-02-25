class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        如果 n 是 3 的幂，那么它可以一直被 3 整除。
        不断除以 3，最后一定会变成 1。
        while (n % 3 == 0) {
            n /= 3;
        }
        
        return n == 1;
    }
}
