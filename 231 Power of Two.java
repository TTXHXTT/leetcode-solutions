class Solution {
    public boolean isPowerOfTwo(int n) {
        为什么一定是 0？
            因为 2 的幂：
            只有一个 1
            n-1 会把那个 1 清掉
            两个数不会有相同的 1 位
            所以 & 之后一定是 0
        return n>0 && (n & (n-1)) ==0;
    }
}
